import java.io.File;

import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EgxModule;
import org.eclipse.epsilon.emc.emf.EmfModel;

public class RunEGL {		
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
		model.setMetamodelFile("models/platoon.ecore");
		model.setModelFile("models/My.platoon");
		model.setName("PL");
		model.load();
		
		// Make the document visible to the EGX program
		module.getContext().getModelRepository().addModel(model);
		// ... and execute
		module.execute();
	}
}