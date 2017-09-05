package Photos.app;

import Photos.controller.ControllerBase;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * This class is used to launch the application and store data upon stop.
 * @author William Chen
 * @author Chijun Sha
 */
public class Photos extends Application {

	/**
	 * @param primaryStage Primary stage of application
	 * @throws Exception In case stage does not start
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		ControllerBase.start(primaryStage);
	}


	/**
	 * @param args Input command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}


	/**
	 * Stops the program and saves results
	 */
	@Override
	public void stop(){
        ControllerBase.storeModelToFile();
	}
}