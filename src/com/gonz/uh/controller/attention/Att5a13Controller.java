package com.gonz.uh.controller.attention;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

public class Att5a13Controller implements Initializable {

	@FXML
	private RadioButton radButt_1A,
						radButt_1B,
						radButt_1C;
	@FXML
	private Button butt_Back, butt_Continue;
	
	private AttMenuController menuController;
	
	public Att5a13Controller(AttMenuController menuController) {
		this.menuController = menuController;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
	
	@FXML
	public void previousPage(ActionEvent actionEvent) {
		this.menuController.goto12(actionEvent);
	}
	
	@FXML
	public void nextPage(ActionEvent actionEvent) {
		this.menuController.goto14(actionEvent);
	}
	

}
