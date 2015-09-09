package com.gonz.uh.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.gonz.uh.model.Patient;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class MainController implements Initializable {
	
	private Patient patient;
	
	@FXML
	private BorderPane root;
	@FXML
	private TitledPane button1;
	@FXML
	private Button button1_1;
	@FXML
	private Button button1_2;
	@FXML
	private Button button1_3;
	@FXML
	private Button button1_4;
	@FXML
	private Button button1_5;
	@FXML
	private Button button1_6;
	@FXML
	private Button button1_7;
	@FXML
	private Label label_DNI;
	@FXML
	private Label label_Name;
	@FXML
	private Label label_Age;
	@FXML
	private Label label_Gender;
	@FXML
	private Label label_Address;
	@FXML
	private Label label_Phone;
	@FXML
	private ImageView imageView_Photo;
	
	
	private AnchorPane pane5a11;
	private AnchorPane pane5a12;
	private AnchorPane pane5a13;
	private AnchorPane pane5a14;
	private AnchorPane pane5a15;
	private AnchorPane pane5a16;
	private AnchorPane pane5a17;
	private AnchorPane pane5a2;
	private AnchorPane pane5a3;
	
	private Att5a11Controller pane5a11Controller;
	private Att5a12Controller pane5a12Controller;
	private Att5a13Controller pane5a13Controller;
	private Att5a14Controller pane5a14Controller;
	private Att5a15Controller pane5a15Controller;
	private Att5a16Controller pane5a16Controller;
	private Att5a17Controller pane5a17Controller;
	private Att5a2Controller pane5a2Controller;
	private Att5a3Controller pane5a3Controller;
	
	public MainController(Patient patient) {		
		
		this.patient = patient;
		
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {		
		
		FXMLLoader loader = null;
		try {
			long before = System.currentTimeMillis();
			
			loader = new FXMLLoader(this.getClass().getResource("/com/gonz/uh/view/5a-1.1.fxml"));
			pane5a11Controller = new Att5a11Controller(this);
			loader.setController(pane5a11Controller);
			pane5a11 = (AnchorPane) loader.load();
			
			loader = new FXMLLoader(this.getClass().getResource("/com/gonz/uh/view/5a-1.2.fxml"));
			pane5a12Controller = new Att5a12Controller(this);
			loader.setController(pane5a12Controller);			
			pane5a12 = (AnchorPane) loader.load();
			
			loader = new FXMLLoader(this.getClass().getResource("/com/gonz/uh/view/5a-1.3.fxml"));
			pane5a13Controller = new Att5a13Controller(this);
			loader.setController(pane5a13Controller);	
			pane5a13 = (AnchorPane) loader.load();
			
			loader = new FXMLLoader(this.getClass().getResource("/com/gonz/uh/view/5a-1.4.fxml"));
			pane5a14Controller = new Att5a14Controller(this);
			loader.setController(pane5a14Controller);
			pane5a14 = (AnchorPane) loader.load();
			
			loader = new FXMLLoader(this.getClass().getResource("/com/gonz/uh/view/5a-1.5.fxml"));
			pane5a15Controller = new Att5a15Controller(this);
			loader.setController(pane5a15Controller);
			pane5a15 = (AnchorPane) loader.load();
			
			loader = new FXMLLoader(this.getClass().getResource("/com/gonz/uh/view/5a-1.6.fxml"));
			pane5a16Controller = new Att5a16Controller(this);
			loader.setController(pane5a16Controller);
			pane5a16 = (AnchorPane) loader.load();
			
			loader = new FXMLLoader(this.getClass().getResource("/com/gonz/uh/view/5a-1.7.fxml"));
			pane5a17Controller = new Att5a17Controller(this);
			loader.setController(pane5a17Controller);
			pane5a17 = (AnchorPane) loader.load();
			
			loader = new FXMLLoader(this.getClass().getResource("/com/gonz/uh/view/5a-2.fxml"));
			pane5a2Controller = new Att5a2Controller(this);
			loader.setController(pane5a2Controller);
			pane5a2 = (AnchorPane) loader.load();
			
			loader = new FXMLLoader(this.getClass().getResource("/com/gonz/uh/view/5a-3.fxml"));
			pane5a3Controller = new Att5a3Controller(this);
			loader.setController(pane5a3Controller);
			pane5a3 = (AnchorPane) loader.load();
			
			long after = System.currentTimeMillis();
			System.out.println("Tiempo de carga: " + (after-before));
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
		showPatientInfo();		
		
	}
	
	private void showPatientInfo() {
		
		label_Name.setText(patient.getName());
		label_DNI.setText(patient.getDni());
		label_Age.setText(patient.getAge());
		label_Gender.setText(patient.getGender());
		label_Address.setText(patient.getAddress());
		label_Phone.setText(patient.getPhoneNumber());
		
		File file = new File("assets/sample/samplePatient.jpg");
		Image image = new Image(file.toURI().toString());
		imageView_Photo.setImage(image);
		
	}
	
	@FXML
	public void goto11(ActionEvent actionEvent) {	
		root.setCenter(pane5a11);
	}
	
	@FXML
	public void goto12(ActionEvent actionEvent) {
		root.setCenter(pane5a12);
	}
	
	@FXML
	public void goto13(ActionEvent actionEvent) {
		root.setCenter(pane5a13);
	}
	
	@FXML
	public void goto14(ActionEvent actionEvent) {
		root.setCenter(pane5a14);
	}
	
	@FXML
	public void goto15(ActionEvent actionEvent) {
		root.setCenter(pane5a15);
	}
	
	@FXML
	public void goto16(ActionEvent actionEvent) {
		root.setCenter(pane5a16);
	}
	
	@FXML
	public void goto17(ActionEvent actionEvent) {
		root.setCenter(pane5a17);
	}
	
	@FXML
	public void goto2(ActionEvent actionEvent) {
		root.setCenter(pane5a2);
	}
	
	@FXML
	public void goto3(ActionEvent actionEvent) {
		root.setCenter(pane5a3);
	}


}
