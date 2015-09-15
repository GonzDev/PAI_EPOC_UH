package com.gonz.uh.controller.attention;

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

	private AttMenuController menuController;

	public Att5a4Controller(AttMenuController menuController) {
		this.menuController = menuController;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		butt_Continue.setDisable(true);		
	}
	
	@FXML
	public void previousPage(ActionEvent actionEvent) {
		menuController.goto3(actionEvent);
	}
	
	@FXML
	public void nextPage(ActionEvent actionEvent) {
	}

}
