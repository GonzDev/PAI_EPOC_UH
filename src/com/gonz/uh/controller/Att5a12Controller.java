package com.gonz.uh.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;

public class Att5a12Controller implements Initializable {

	@FXML
	private RadioButton radButt_1A, radButt_1B,
						radButt_1C, radButt_1D;
	@FXML
	private RadioButton radButt_2Y, radButt_2N;
	@FXML
	private RadioButton radButt_3Y, radButt_3N;
	@FXML
	private RadioButton radButt_4Y, radButt_4N;
	@FXML
	private RadioButton radButt_5Y, radButt_5N;
	@FXML
	private TextArea textArea_1, 
					 textArea_2, 
					 textArea_3; 
	@FXML
	private Button butt_Back, butt_Continue;
	
	private MainController mainController;

	
	public Att5a12Controller(MainController mainController) {
		this.mainController = mainController;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}

	@FXML
	public void previousPage(ActionEvent actionEvent) {
		this.mainController.goto11(actionEvent);
	}
	
	@FXML
	public void nextPage(ActionEvent actionEvent) {
		this.mainController.goto13(actionEvent);
	}
	
}
