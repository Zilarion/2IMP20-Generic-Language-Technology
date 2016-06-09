import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.ModelRepository;
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

		// Load the model document
		EmfModel bbox = loadModel("models/Empty.boundingbox", "models/BoundingBox.ecore");
		EmfModel platoon = loadModel("models/My.platoon", "models/platoon.ecore");
		
		// Publish the models visible to the model repository
		final ModelRepository etlModelRepo = module.getContext().getModelRepository();
		etlModelRepo.addModel(platoon);
		etlModelRepo.addModel(bbox);
		
		// ... and execute
		module.execute();
	}
	
	private static EmfModel loadModel(String name, String metamodelPath) throws EolModelLoadingException {
	    EmfModel model = new EmfModel();
	    model.setName(name);
	    model.setMetamodelFile(metamodelPath);
	    model.setModelFile(name);
//	    model.setReadOnLoad(false);
//	    model.setStoredOnDisposal(false);
	    model.load();
	    return model;
	}
}