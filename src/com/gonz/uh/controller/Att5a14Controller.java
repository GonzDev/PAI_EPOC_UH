package com.gonz.uh.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class Att5a14Controller implements Initializable {

	@FXML
	private CheckBox checkBox_1;
	@FXML
	private VBox vbox_1;
	@FXML
	private CheckBox checkBox_2;
	@FXML
	private TextField textField_2;
	@FXML
	private RadioButton radButt_2A,
						radButt_2B,
						radButt_2C;
	@FXML
	private TextField textField_2B;
	@FXML
	private CheckBox checkBox_3;
	@FXML
	private TextField textField_3;
	@FXML
	private CheckBox checkBox_4;
	@FXML
	private TextField textField_4;
	@FXML
	private CheckBox checkBox_5;
	@FXML
	private TextField textField_5;
	@FXML
	private CheckBox checkBox_6;
	@FXML
	private TextField textField_6;
	@FXML
	private CheckBox checkBox_7;
	@FXML
	private TextArea textArea_7;
	
	@FXML
	private Button butt_Back, butt_Continue;

	private MainController mainController;

	public Att5a14Controller(MainController mainController) {
		this.mainController = mainController;
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		textField_2.setVisible(false);
		textField_3.setVisible(false);
		textField_4.setVisible(false);
		textField_5.setVisible(false);
		textField_6.setVisible(false);
		textArea_7.setDisable(true);
		radButt_2A.setDisable(true);
		radButt_2B.setDisable(true);
		textField_2B.setVisible(false);
		radButt_2C.setDisable(true);
	}

	@FXML
	public void disableRest(ActionEvent actionEvent) {
		Boolean bol = checkBox_1.isSelected();
		vbox_1.setDisable(bol);
	}
	
	@FXML
	public void showTextField2(ActionEvent actionEvent) {
		Boolean bol = checkBox_2.isSelected();
		textField_2.setVisible(bol);
		textField_2.setText("");
		radButt_2A.setDisable(!bol);
		radButt_2B.setDisable(!bol);
		radButt_2C.setDisable(!bol);		
	}
	
	@FXML
	public void showTextField2B(ActionEvent actionEvent) {
		Boolean bol = radButt_2B.isSelected();
		textField_2B.setVisible(bol);
		textField_2B.setText("");
	}
	
	@FXML
	public void showTextField3(ActionEvent actionEvent) {
		Boolean bol = checkBox_3.isSelected();
		textField_3.setVisible(bol);
		textField_3.setText("");
	}
	
	@FXML
	public void showTextField4(ActionEvent actionEvent) {
		Boolean bol = checkBox_4.isSelected();
		textField_4.setVisible(bol);
		textField_4.setText("");
	}
	
	@FXML
	public void showTextField5(ActionEvent actionEvent) {
		Boolean bol = checkBox_5.isSelected();
		textField_5.setVisible(bol);
		textField_5.setText("");
	}
	
	@FXML
	public void showTextField6(ActionEvent actionEvent) {
		Boolean bol = checkBox_6.isSelected();
		textField_6.setVisible(bol);
		textField_6.setText("");
	}
	
	@FXML
	public void enableTextArea7(ActionEvent actionEvent) {
		Boolean bol = checkBox_7.isSelected();
		textArea_7.setDisable(!bol);
		textArea_7.setText("");
	}
	
	@FXML
	public void previousPage(ActionEvent actionEvent) {
		mainController.goto13(actionEvent);
	}
	
	@FXML
	public void nextPage(ActionEvent actionEvent) {
		mainController.goto15(actionEvent);
	}
	
}
