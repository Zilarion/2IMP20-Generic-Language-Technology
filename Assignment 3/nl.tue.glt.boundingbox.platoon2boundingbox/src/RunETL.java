import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.etl.EtlModule;

public class RunETL {		
	public static void main(String[] args) throws Exception {
		// Create etl module
		EtlModule module = new EtlModule();
		module.parse(new File("templates/platoon2boundingbox.etl").getAbsoluteFile());
	    
		if (!module.getParseProblems().isEmpty()) {
			System.out.println("Syntax errors found. Exiting.");
			return;
		}

		// Load the models
		for (IModel model : getModels()) {
			module.getContext().getModelRepository().addModel(model);
		}
		
		// ... and execute
		module.execute();
		module.getContext().getModelRepository().dispose();
		System.out.println("Done!");
	}

	public static List<IModel> getModels() throws Exception {
		List<IModel> models = new ArrayList<IModel>();
		models.add(createEmfModel("Platoon", "My.platoon", "platoon.ecore", true, false));
		models.add(createEmfModel("BoundingBox", "Empty.boundingbox", "BoundingBox.ecore", false, true));
		return models;
	}
	
	protected static EmfModel createEmfModel(String name, String model, 
			String metamodel, boolean readOnLoad, boolean storeOnDisposal) 
					throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI,
				getFileURI(metamodel).toString());
		properties.put(EmfModel.PROPERTY_MODEL_URI, 
				getFileURI(model).toString());
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, 
				storeOnDisposal + "");
		emfModel.load(properties, (IRelativePathResolver) null);
		return emfModel;
	}
	
	protected static URI getFileURI(String fileName) throws URISyntaxException {
		URI binUri = RunETL.class.getResource(fileName).toURI();
		URI uri = null;
		
		if (binUri.toString().indexOf("bin") > -1) {
			uri = new URI(binUri.toString().replaceAll("bin", "resources"));
		}
		else {
			uri = binUri;
		}
		
		return uri;
	}
}