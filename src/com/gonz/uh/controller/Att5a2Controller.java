package com.gonz.uh.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class Att5a2Controller implements Initializable {
	
	@FXML
	private Button butt_Back, butt_Continue;

	private MainController mainController;

	public Att5a2Controller(MainController mainController) {
		this.mainController = mainController;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}
	
	@FXML
	public void previousPage(ActionEvent actionEvent) {
		mainController.goto17(actionEvent);
	}
	
	@FXML
	public void nextPage(ActionEvent actionEvent) {
		mainController.goto3(actionEvent);

	}

}
