package cls.calc.main;
/**
 * CLS Custom Scientific Calculator
 * Main.java
 * --------------------------------
 * Created by Lance T. Walker on 11/15/2018
 * Copyright � 2018 CodeLife Productions. All rights reserved.
 */

/* Imports */
import java.io.IOException;

import javafx.application.Application;
import javafx.application.Preloader.PreloaderNotification;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

abstract interface ApplicationDelegate {
	/* Application Events */ 
	void applicationDidOpen();		// Application Event: open 
	void applicationDidDealoc(); 	// Application Event: memory deallocated
	void applicationWillClose();	// Application Event: will close 
	void applicationDidClose();		// Application Event: closed 
}

public class Main extends Application implements ApplicationDelegate {
	/* Application Properties */ 
	private Stage primaryStage;
	private AnchorPane anchorPane;
	MenuBar menuBar = new MenuBar();
	
	/* Functions: Application RunCycle */
	public static void main(String args[]) { launch(args); }

	// JFX Application Overrides 
	@Override public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		primaryStage.setResizable(false);
		
		// construct interface: 
		constructMainView(); 
		System.out.println("calc: Start Application");
	}
	
	@Override public void stop() {
		System.out.println("calc: Stop Application"); 
	}
	
	 public void handleApplicationNotification(PreloaderNotification info) {
		 System.out.println("handleApplicationNotification");
	 }
	
	/* Functions: Constructors */	
	public void constructMainView() {
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("/gui/fxml/MainView.fxml"));
			anchorPane = (AnchorPane) loader.load();
			
			ViewController controller = loader.getController();
			controller.setMain(this);
			
			Scene scene = new Scene(anchorPane);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* Application Delegate Handlers */ 
	@Override public void applicationDidOpen() {	// Application Event: did open 
		
	}

	@Override public void applicationDidDealoc() {	// Application Event: memory deallocated 
		
	}

	@Override public void applicationWillClose() {	// Application Event: will close
		
	}

	@Override public void applicationDidClose() {	// Application Event: did close
	
	}

}