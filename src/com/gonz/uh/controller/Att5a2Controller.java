package com.gonz.uh.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;

public class Att5a2Controller implements Initializable {
	
	@FXML
	private RadioButton radButt_1AY, radButt_1AN,
						radButt_1BY, radButt_1BN,
						radButt_1CY, radButt_1CN,
						radButt_1DY, radButt_1DN;
	@FXML
	private RadioButton	radButt_2AY, radButt_2AN,
						radButt_2BY, radButt_2BN,
						radButt_2CY, radButt_2CN,
						radButt_2DY, radButt_2DN,
						radButt_2EY, radButt_2EN,
						radButt_2FY, radButt_2FN,
						radButt_2GY, radButt_GFN,
						radButt_2HY, radButt_HFN,
						radButt_2IY, radButt_2IN;
	@FXML
	private RadioButton	radButt_3AY, radButt_3AN,
						radButt_3BY, radButt_3BN,
						radButt_3CY, radButt_3CN;
	@FXML
	private RadioButton	radButt_4AY, radButt_4AN;
	
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
