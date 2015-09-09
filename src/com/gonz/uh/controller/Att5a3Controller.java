package com.gonz.uh.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

public class Att5a3Controller implements Initializable {

	@FXML
	private RadioButton radButt_1A, 
						radButt_1B, 
						radButt_1C,
						radButt_1D,
						radButt_1E,
						radButt_1F,
						radButt_1G,
						radButt_1H;
	@FXML
	private RadioButton radButt_2A, 
						radButt_2B, 
						radButt_2C;
	@FXML
	private Button butt_Back, butt_Continue;

	private MainController mainController;

	public Att5a3Controller(MainController mainController) {
		this.mainController = mainController;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	
	}
	
	@FXML
	public void previousPage(ActionEvent actionEvent) {
		mainController.goto2(actionEvent);
	}
	
	@FXML
	public void nextPage(ActionEvent actionEvent) {
	}

}
