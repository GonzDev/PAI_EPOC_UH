package com.gonz.uh.controller.attention;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class Att5a15Controller implements Initializable {

	@FXML
	private RadioButton radButt_1A,
						radButt_1B,
						radButt_1C,
						radButt_1D,
						radButt_1F;
	@FXML
	private RadioButton radButt_2Y, radButt_2N;
	@FXML
	private RadioButton radButt_3A,
						radButt_3B,
						radButt_3C;
	@FXML
	private RadioButton radButt_4Y, radButt_4N;
	@FXML
	private RadioButton radButt_5A, 
						radButt_5B;
	@FXML
	private TextField textField_5A,
					  textField_5B;
	@FXML
	private Label label_5B;
	@FXML
	private RadioButton radButt_6Y, radButt_6N;
	@FXML
	private RadioButton radButt_7A,
						radButt_7B,
						radButt_7C,
						radButt_7D,
						radButt_7F;
	@FXML
	private Button butt_Back, butt_Continue;

	private AttMenuController menuController;

	public Att5a15Controller(AttMenuController menuController) {
		this.menuController = menuController;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		radButt_5A.setDisable(true);
		radButt_5B.setDisable(true);
		textField_5A.setVisible(false);
		textField_5B.setVisible(false);
		label_5B.setVisible(false);
		radButt_7A.setDisable(true);
		radButt_7B.setDisable(true);
		radButt_7C.setDisable(true);
		radButt_7D.setDisable(true);
		radButt_7F.setDisable(true);
	}
	
	@FXML
	public void enableGroup5(ActionEvent actionEvent) {
		Boolean bol = radButt_4Y.isSelected();
		radButt_5A.setDisable(!bol);
		radButt_5B.setDisable(!bol);
		radButt_5A.setSelected(false);
		radButt_5B.setSelected(false);
		textField_5A.setVisible(false);
		textField_5B.setVisible(false);
		textField_5A.setText("");
		textField_5B.setText("");
		label_5B.setVisible(false);
	}
	
	@FXML
	public void showTextField5A(ActionEvent actionEvent) {
		textField_5A.setVisible(true);
		textField_5A.setText("");
		textField_5B.setVisible(false);
		label_5B.setVisible(false);
	}
	
	@FXML
	public void showTextField5B(ActionEvent actionEvent) {
		textField_5B.setVisible(true);
		textField_5B.setText("");
		label_5B.setVisible(true);
		textField_5A.setVisible(false);
	}
	
	@FXML
	public void enableGroup7(ActionEvent actionEvent) {
		Boolean bol = radButt_6Y.isSelected();
		radButt_7A.setDisable(!bol);
		radButt_7B.setDisable(!bol);
		radButt_7C.setDisable(!bol);
		radButt_7D.setDisable(!bol);
		radButt_7F.setDisable(!bol);
	}
	
	@FXML
	public void previousPage(ActionEvent actionEvent) {
		menuController.goto14(actionEvent);
	}
	
	@FXML
	public void nextPage(ActionEvent actionEvent) {
		menuController.goto16(actionEvent);
	}
	

}
