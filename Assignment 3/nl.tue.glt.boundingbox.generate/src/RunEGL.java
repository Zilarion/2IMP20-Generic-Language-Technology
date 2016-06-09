import java.io.File;

import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EgxModule;
import org.eclipse.epsilon.emc.emf.EmfModel;

public class RunEGL {
	private static final String MOF2_URI = "http://www.eclipse.org/emf/2002/Ecore";
		
	public static void main(String[] args) throws Exception {
		// Parse generate.egx
		EgxModule module = new EgxModule(new EglFileGeneratingTemplateFactory());
		module.parse(new File("templates/generate.egx").getAbsoluteFile());
	    
		if (!module.getParseProblems().isEmpty()) {
			System.out.println("Syntax errors found. Exiting.");
			return;
		}
		
		// Load the model document
		EmfModel model = new EmfModel();
		model.setMetamodelFile("models/BoundingBox.ecore");
		model.setModelFile("models/My.boundingbox");
		model.setName("BB");
		model.load();
		
		// Make the document visible to the EGX program
		module.getContext().getModelRepository().addModel(model);
		// ... and execute
		module.execute();
	}
}