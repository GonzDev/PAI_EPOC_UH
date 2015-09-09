package com.gonz.uh.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

public class Att5a4Controller implements Initializable {

	@FXML
	private CheckBox checkBox_1A,
					checkBox_1B,
					checkBox_2A,
					checkBox_2B,
					checkBox_3A,
					checkBox_4A,
					checkBox_4B;
	
	@FXML
	private Button butt_Back, butt_Continue;

	private MainController mainController;

	public Att5a4Controller(MainController mainController) {
		this.mainController = mainController;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		butt_Continue.setDisable(true);		
	}
	
	@FXML
	public void previousPage(ActionEvent actionEvent) {
		mainController.goto3(actionEvent);
	}
	
	@FXML
	public void nextPage(ActionEvent actionEvent) {
	}

}
