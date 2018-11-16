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

public class MenuItems extends MenuBar {
	/* Menu Items */ 	
	public MenuBar menuBar() {
		MenuBar menuBar = new MenuBar();
		
		return menuBar; 
	}
	
	public static void config() {
		Menu fileMenu = new Menu("File");		
		fileMenu.getItems().addAll(
	            new MenuItem("New File..."),
	            new MenuItem("Open file..."),
	            new MenuItem("Save file"));
	    fileMenu.setId("#fileMenu");
	}
	
	/* Menu Items */ 
	private void fileItem() {
		
	}
	
	private void logItem() {
		
	}
	
	private void windowItem() {
		
	}
	
	private void helpItem() {
		
	}
}
