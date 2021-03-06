package cls.calc.main;
/**
 * CLS Custom Scientific Calculator
 * Main.java
 * --------------------------------
 * Created by Lance T. Walker on 11/15/2018
 * Copyright � 2018 CodeLife Productions. All rights reserved.
 */

import java.awt.Button;
/* Imports */
import java.io.IOException;

import javafx.application.Application;
import javafx.application.Platform;
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
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

// local packages
import cls.calc.gui.components.MenuItems; 
import cls.calc.sys.*;	
import cls.calc.service.*;

abstract interface ApplicationDelegate { // JFX Delegate 
	/* Application ENV Variables */ 
	static boolean DEV_MODE = true; // Controls Debug Interface
	/* Application Events */ 
	void applicationDidOpen();		// Application Event: open 
	void applicationDidDealoc(); 	// Application Event: memory deallocated
	void applicationWillClose();	// Application Event: will close 
	void applicationDidClose();		// Application Event: closed 
}

public class Main extends Application implements ApplicationDelegate { // Main 
	/* Application Properties */ 
	private Stage primaryStage;				// 
	private AnchorPane anchorPane;			// 
	MenuBar menuBar = new MenuBar(); 		// 

	/* Functions: Application RunCycle */
	public static void main(String args[]) { launch(args); }
	
	// JFX Application Overrides 
	@Override public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		primaryStage.setResizable(false);
		
		// construct interface: 
		constructInterface(); 
		System.out.println("CLS Calculator: Start Application");
	}
	
	@Override public void stop() {
		System.out.println("CLS Calculator: Stop Application"); 
	}
	
	 public void handleApplicationNotification(PreloaderNotification info) {
		 System.out.println("handleApplicationNotification");
	 }
	
	/* Functions: Constructors */	
	public void constructInterface() {
		try {
			FXMLLoader loader = new FXMLLoader(Main.class.getResource("../gui/fxml/MainView.fxml"));
			anchorPane = (AnchorPane) loader.load();
			
			// JFX: ViewController
			ViewController controller = loader.getController();
			controller.setMain(this);
			
			// Top Menu Pane: (jfx: Application Controls)
			BorderPane ctlMenu = new BorderPane();
			MenuItems tS = new MenuItems(); 
			this.menuBar = tS.dist_menubar(); 
			ctlMenu.setTop(this.menuBar); 			
			
			// Target: scene 
			Scene scene = new Scene(anchorPane);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/* Application Delegate Handlers */ 
	@Override public void applicationDidOpen() {	// Application Event: did open 
		System.out.println("applicationDidOpen");
	}

	@Override public void applicationDidDealoc() {	// Application Event: memory deallocated 
		System.out.println("applicationDidDealoc");
	}

	@Override public void applicationWillClose() {	// Application Event: will close
		System.out.println("applicationWillClose");
	}

	@Override public void applicationDidClose() {	// Application Event: did close
		System.out.println("applicationDidClose");
	}
	
	/* */ 
}