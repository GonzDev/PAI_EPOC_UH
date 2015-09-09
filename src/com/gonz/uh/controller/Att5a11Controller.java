package com.gonz.uh.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class Att5a11Controller implements Initializable {

	@FXML
	private RadioButton radButt_1A, radButt_1B;
	@FXML
	private TextField textField_1;
	@FXML
	private Label label_1;		
	
	@FXML
	private RadioButton radButt_2Y, radButt_2N;
	@FXML
	private RadioButton radButt_30, 
						radButt_31, 
						radButt_32, 
						radButt_33, 
						radButt_34;
	@FXML
	private RadioButton radButt_4Y, radButt_4N;
	@FXML
	private RadioButton radButt_5Y, radButt_5N;
	@FXML
	private RadioButton radButt_6Y, radButt_6N;
	@FXML
	private RadioButton radButt_7Y, radButt_7N;
	@FXML
	private RadioButton radButt_8Y, radButt_8N;
	@FXML
	private RadioButton radButt_9Y, radButt_9N;
	@FXML
	private RadioButton radButt_10A, radButt_10B, 
						radButt_10C, radButt_10D, 
						radButt_10E, radButt_10F;
	@FXML
	private RadioButton radButt_11Y, radButt_11N;
	@FXML
	private RadioButton radButt_12Y, radButt_12N;
	@FXML
	private RadioButton radButt_13Y, radButt_13N;
	@FXML
	private RadioButton radButt_14Y, radButt_14N;
	@FXML
	private Button butt_Continue;
	
	private MainController mainController;
	
	public Att5a11Controller(MainController mainController) {
		this.mainController = mainController;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
	}
	
	@FXML
	public void showProgressive(ActionEvent actionEvent) {		
		boolean bol = radButt_1B.isSelected();
		textField_1.setVisible(bol);
		textField_1.setText("");
		label_1.setVisible(bol);
	}
	
	@FXML
	public void showDisneaDegree(ActionEvent actionEvent) {		
		boolean bol = !radButt_2Y.isSelected();
		radButt_30.setDisable(bol); radButt_30.setSelected(false);
		radButt_31.setDisable(bol); radButt_31.setSelected(false);
		radButt_32.setDisable(bol); radButt_32.setSelected(false);
		radButt_33.setDisable(bol); radButt_33.setSelected(false);
		radButt_34.setDisable(bol); radButt_34.setSelected(false);
	}

	@FXML
	public void nextPage(ActionEvent actionEvent) {
		this.mainController.goto12(actionEvent);
	}
	
}
