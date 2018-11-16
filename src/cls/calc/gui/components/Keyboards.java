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
//	public enum Keyboard_Type_Standard_Num {
//		ONE("1", '\30'), TWO("2", '\32'), THREE("3", '\33'), FOUR("4", '\34'), FIVE("5", '\35'), 
//		SIX("6", '\36'), SEVEN("7", '\37'), EIGHT("8", '\38'),NINE("9", '\39'), ZERO("0", '\30'),
//		TIMES("*", '\2A'), DIVIDED("/", '\2F'), PLUS("+", '\2B'), MINUS("-", '\2D'), PERCENT("%", '\25'), CHANGE("*-1", '\15');
//		
//		private String ASCII;
//		private char HEXIDEC; 
//		
//		private Keyboard_Type_Standard_Num(byte ASCII, char HEXIDEC) {
//			this.ASCII = ASCII;
//			this.HEXIDEC = HEXIDEX;      
//		}
//	}
	
	public enum Keyboard_Type_Standard_Alpha {
		A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z
	}
	
	public enum Keyboard_Type_Greek_Alpha {
		Δ, Θ, Ξ, Π, Σ, Υ, Φ, Ψ, Ω	
	} 
}
