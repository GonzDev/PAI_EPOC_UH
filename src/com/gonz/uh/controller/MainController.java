package com.gonz.uh.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.gonz.uh.controller.attention.AttMenuController;
import com.gonz.uh.model.Patient;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MainController implements Initializable {
	
	private final int ATTENTION = 1;
	private final int ANALYTIC = 2;
	private final int EVOLUTION = 3;
	private final int RESOLUTION = 4;
	private final int REPORT = 5;
	
	private int section;
	
	private Patient patient;
	
	@FXML
	private BorderPane root;
	@FXML
	private VBox vbox_LeftPane;
	
	@FXML
	private Button button_Top1;
	@FXML
	private Button button_Top2;
	@FXML
	private Button button_Top3;
	@FXML
	private Button button_Top4;
	@FXML
	private Button button_Top5;

	@FXML
	private Label label_SIP;
	@FXML
	private Label label_NHC;
	@FXML
	private Label label_Name;
	@FXML
	private Label label_Age;
	@FXML
	private Label label_Gender;
	@FXML
	private Label label_Address;
	@FXML
	private ImageView imageView_Pacient;
	
	private VBox attMenu;
	
	private AttMenuController attController;
	
	public MainController(Patient patient) {		
		
		this.patient = patient;
		this.section = 0;
		
	}
	
	public BorderPane getRoot() {
		return root;
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {		
		
		FXMLLoader loader = null;
		try {
			long before = System.currentTimeMillis();
			
			showPatientInfo();
			vbox_LeftPane.getChildren().add(new VBox());
			
			loader = new FXMLLoader(this.getClass().getResource("/com/gonz/uh/view/attention/AttMenu.fxml"));
			attController = new AttMenuController(this);
			loader.setController(attController);
			attMenu = (VBox) loader.load();
			
			long after = System.currentTimeMillis();
			System.out.println("Tiempo de carga: " + (after-before));			
		} catch (IOException e) {
			e.printStackTrace();
		}			
		
	}	
	
	private void showPatientInfo() {
		
		label_Name.setText(patient.getName());
		label_Address.setText(patient.getAddress());
		label_Age.setText(patient.getAge());
		label_Gender.setText(patient.getGender());
		label_SIP.setText("SIP: " + patient.getSIP());
		label_NHC.setText("NHC: " + patient.getClinicHistoy());		
		
		
		Image image = new Image(getClass().getResourceAsStream("/icon/gnome_person.png"));
		imageView_Pacient.setImage(image);
		
	}
	
	@FXML
	public void gotoAttention() {
		if (section != ATTENTION) {
			vbox_LeftPane.getChildren().remove(1);
			vbox_LeftPane.getChildren().add(1, attMenu);
			section = ATTENTION;
			attController.showCurrentPage();
		}
	}
	
	@FXML
	public void gotoAnalytic() {
		if (section != ANALYTIC) {
			vbox_LeftPane.getChildren().remove(1);
			vbox_LeftPane.getChildren().add(new VBox());
			section = ANALYTIC;
			root.setCenter(null);
		}
	}
	
	@FXML
	public void gotoEvolution() {
		if (section != EVOLUTION) {
			vbox_LeftPane.getChildren().remove(1);
			vbox_LeftPane.getChildren().add(new VBox());
			section = EVOLUTION;
			root.setCenter(null);
		}
	}
	
	@FXML
	public void gotoResolution() {
		if (section != RESOLUTION) {
			vbox_LeftPane.getChildren().remove(1);
			vbox_LeftPane.getChildren().add(new VBox());
			section = RESOLUTION;
			root.setCenter(null);
		}
	}
	
	@FXML
	public void gotoReport() {
		if (section != REPORT) {
			vbox_LeftPane.getChildren().remove(1);
			vbox_LeftPane.getChildren().add(new VBox());
			section = REPORT;
			root.setCenter(null);
		}
	}


}
