package com.gonz.uh.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class Att5a16Controller implements Initializable {

	@FXML
	private RadioButton radButt_1Y, radButt_1N;
	@FXML
	private Label label_1A,
				  label_1B,
				  label_1C;	
	@FXML
	private TextField textField_1A,
					  textField_1B,
					  textField_1C;
	@FXML
	private RadioButton radButt_2Y, radButt_2N;
	@FXML
	private Label label_2A,
				  label_2B,
				  label_2C;	
	@FXML
	private TextField textField_2A,
					  textField_2B,
					  textField_2C;
	@FXML
	private CheckBox checkBox_3,
					 checkBox_4,
					 checkBox_5,
					 checkBox_6,
					 checkBox_7,
					 checkBox_8,
					 checkBox_9,
					 checkBox_10,
					 checkBox_11,
					 checkBox_12;
	@FXML
	private RadioButton radButt_13Y, radButt_13N;
	@FXML
	private Label label_13A;
	@FXML
	private TextField textField_13A;
	@FXML
	private RadioButton radButt_14Y, radButt_14N;
	@FXML
	private RadioButton radButt_14A, radButt_14B;
	@FXML
	private Button butt_Back, butt_Continue;

	private MainController mainController;

	public Att5a16Controller(MainController mainController) {
		this.mainController = mainController;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		label_1A.setDisable(true);
		label_1B.setDisable(true);
		label_1C.setDisable(true);
		textField_1A.setDisable(true);
		textField_1B.setDisable(true);
		textField_1C.setDisable(true);
		label_2A.setDisable(true);
		label_2B.setDisable(true);
		label_2C.setDisable(true);
		textField_2A.setDisable(true);
		textField_2B.setDisable(true);
		textField_2C.setDisable(true);
		label_13A.setDisable(true);
		textField_13A.setDisable(true);
		radButt_14A.setDisable(true);
		radButt_14B.setDisable(true);
	}
	
	@FXML
	public void enableGroup1(ActionEvent actionEvent) {
		Boolean bol = radButt_1Y.isSelected();
		label_1A.setDisable(!bol);
		label_1B.setDisable(!bol);
		label_1C.setDisable(!bol);
		textField_1A.setDisable(!bol);	textField_1A.setText("");
		textField_1B.setDisable(!bol);	textField_1B.setText("");
		textField_1C.setDisable(!bol);	textField_1C.setText("");
	}
	
	@FXML
	public void enableGroup2(ActionEvent actionEvent) {
		Boolean bol = radButt_2Y.isSelected();
		label_2A.setDisable(!bol);
		label_2B.setDisable(!bol);
		label_2C.setDisable(!bol);
		textField_2A.setDisable(!bol);	textField_2A.setText("");
		textField_2B.setDisable(!bol);	textField_2B.setText("");
		textField_2C.setDisable(!bol);	textField_2C.setText("");
	}
	
	@FXML
	public void enableGroup13(ActionEvent actionEvent) {
		Boolean bol = radButt_13Y.isSelected();
		label_13A.setDisable(!bol);
		textField_13A.setDisable(!bol);
		textField_13A.setText("");

	}
	
	@FXML
	public void enableGroup14(ActionEvent actionEvent) {
		Boolean bol = radButt_14Y.isSelected();
		radButt_14A.setDisable(!bol);	radButt_14A.setSelected(false);
		radButt_14B.setDisable(!bol);	radButt_14B.setSelected(false);
	}
	
	@FXML
	public void previousPage(ActionEvent actionEvent) {
		mainController.goto15(actionEvent);
	}
	
	@FXML
	public void nextPage(ActionEvent actionEvent) {
		mainController.goto17(actionEvent);
	}

}
