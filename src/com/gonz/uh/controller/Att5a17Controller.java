package com.gonz.uh.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;

public class Att5a17Controller implements Initializable {
	
	@FXML
	private CheckBox checkBox_1,
					checkBox_2,
					checkBox_3,
					checkBox_4,
					checkBox_5,
					checkBox_5A,
					checkBox_5B,
					checkBox_5C,
					checkBox_6,
					checkBox_7;
	
	@FXML
	private Button butt_Back, butt_Continue;

	private MainController mainController;

	public Att5a17Controller(MainController mainController) {
		this.mainController = mainController;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}
	
	@FXML
	public void previousPage(ActionEvent actionEvent) {
		mainController.goto16(actionEvent);
	}
	
	@FXML
	public void nextPage(ActionEvent actionEvent) {
		mainController.goto2(actionEvent);
	}

}
