package cls.calc.gui.components;
/**
 * CLS Custom Scientific Calculator
 * Keyboards.java
 * --------------------------------
 * Created by Lance T. Walker on 11/15/2018
 * Copyright © 2018 CodeLife Productions. All rights reserved.
 */

/* Imports */
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Keyboards {
	/* Keyboard Layouts */
	public enum Keyboard_Type_Standard_Num {
		ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, ZERO,
		TIMES, DIVIDED, PLUS, MINUS, PERCENT, CHANGE
	}
	
	public enum Keyboard_Type_Standard_Alpha {
		A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z
	}
	
	public enum Keyboard_Type_Greek_Alpha {
		Δ, Θ, Ξ, Π, Σ, Υ, Φ, Ψ, Ω	
	} 
}
