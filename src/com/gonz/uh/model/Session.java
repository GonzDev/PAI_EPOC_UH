package com.gonz.uh.model;

import java.io.IOException;

import com.gonz.uh.controller.MainController;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Session extends Application {	
	
	private static String SIP;
	
	public static void main(String[] args) {
		
		SIP = "03651700";
		Application.launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws IOException {
		
		Patient patient = loadPatientData(SIP);
		MainController mwc = new MainController(patient);
		
		FXMLLoader fxmlLoader = new FXMLLoader();		
		fxmlLoader.setLocation(this.getClass().getResource("/com/gonz/uh/view/MainWindow.fxml"));
		
		
		fxmlLoader.setController(mwc);
		
		BorderPane root = (BorderPane) fxmlLoader.load();		
		Scene scene = new Scene(root, 1000, 900);
		
		primaryStage.setTitle("EPOC Urgencias Hospitalarias");	
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setFullScreen(true);
		
	}
	
	
	public static Patient loadPatientData(String sip) {
		
		Patient patient = new Patient(sip);
		patient.setDni("48412089X");
		patient.setName("Gonzalo Ortega Castillo");
		patient.setAge("21");
		patient.setGender(Patient.MALE);
		patient.setAddress("C/Paterna, 3, L'Eliana (Valencia)");
		patient.setPhoneNumber("637 27 91 24");
		patient.setImageURL(null);
		return patient;
		
	}
	
}
