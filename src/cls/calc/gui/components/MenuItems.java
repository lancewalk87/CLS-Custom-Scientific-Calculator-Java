package cls.calc.gui.components;
/**
 * CLS Custom Scientific Calculator
 * MenuItems.java
 * --------------------------------
 * Created by Lance T. Walker on 11/15/2018
 * Copyright © 2018 CodeLife Productions. All rights reserved.
 */

/* Imports */
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class MenuItems {
	/* MenuBar: Types */ 	
	static MenuBar menuBar = new MenuBar(); 
	
	public static MenuBar debug_menubar() {		/* Developer Tools */ 
		menuBar.getMenus().addAll(
				fileItem(),
				editItem(),
				logItem(),
				windowItem(),
				preferencesItem(),
				helpItem());
		System.out.println("cls.calc.gui.componets: debug_menubar()");
		return menuBar; 
	}
	
	public static MenuBar dist_menubar() {		/* Distribution Tools */ 
		menuBar.getMenus().addAll(
				fileItem(),
				editItem(),
				preferencesItem(),
				helpItem());	
		System.out.println("cls.calc.gui.componets: dist_menubar()");
		return menuBar; 
	}
	
	/* MenuBar: Items */ 
	private static Menu fileItem() {			// Add/Remove Existing Equations | Start/End Session 
		Menu m = new Menu("File");
		m.getItems().addAll(
	            new MenuItem("New File"),
	            new MenuItem("Open file"),
	            new MenuItem("Save file"));
	    m.setId("#fileMenu"); 
		return m; 
	}
	
	private static Menu editItem() { 			// Text Options
		Menu m = new Menu("Edit");
		m.getItems().addAll(
	            new MenuItem("Undo"),
	            new MenuItem("Redo"),
	            new MenuItem("Cut"),
	            new MenuItem("Copy"),
	            new MenuItem("Paste"));
	    m.setId("#editMenu"); 
		return m; 
	}
	
	private static Menu logItem() {			// View Session Logs 
		Menu m = new Menu("Log");
		m.getItems().addAll(
	            new MenuItem("Open Log"),
	            new MenuItem("Close Log"));
	    m.setId("#logMenu"); 
		return m; 
	}
	
	private static Menu windowItem() {			// Add/Remove UI Component in Editor 
		Menu m = new Menu("Window");
		m.getItems().addAll(
	            new MenuItem("New Tab"),
	            new MenuItem("Close Tab"),
	            new MenuItem("Close Window"));
	    m.setId("#windowMenu"); 
		return m; 
	}
	
	private static Menu preferencesItem() {	// User Preferences Menu 	
		Menu m = new Menu("Preferences");
		m.getItems().addAll(
	            new MenuItem("Theme Options"),
	            new MenuItem("Keyboards"),
	            new MenuItem("File Output"));
	    m.setId("#preferencesMenu"); 
		return m; 
	}
	
	private static Menu helpItem() {			// Application Help/Info 
		Menu m = new Menu("Help");
		m.getItems().addAll(
	            new MenuItem("About CLS Calculator"),
	            new MenuItem("Dev Connect Details")); 
	    m.setId("#helpMenu"); 
		return m; 
	}
}
