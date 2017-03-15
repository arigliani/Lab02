package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */

import java.net.URL;
import java.util.*;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {

	// private List<String> parole=new LinkedList<String>();
	// private Map<String, Parola> mappaParole= new TreeMap<String, Parola>();
	private AlienDictionary ad = new AlienDictionary();

	@FXML // ResourceBundle that was given to the FXMLLoader
	private ResourceBundle resources;

	@FXML
	private TextField insertText;

	@FXML
	private Button btnTranslate;

	@FXML
	private TextArea txtResult;

	@FXML
	private Button btnReset;

	@FXML // This method is called by the FXMLLoader when initialization is
			// complete
	void initialize() {
		assert insertText != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
		assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
		assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
		assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";

	}

	@FXML
	void doTranslate(ActionEvent event) {

		if (insertText.getText().contains(" ")) {
			String[] arrayParole = new String[2];
			arrayParole = insertText.getText().split(" ");
			ad.addWord(arrayParole[0], arrayParole[1]);
			insertText.clear();
			
		} else {
			String traduzione = ad.translateWord(insertText.getText());
			insertText.clear();
		txtResult.setText(traduzione);

		}
	}

	@FXML
	void doReset(ActionEvent event) {
		txtResult.clear();
		

	}

}
