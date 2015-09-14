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
		
		SIP = "2301920";
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
		
	}
	
	
	public static Patient loadPatientData(String sip) {
		
		Patient patient = new Patient(sip);
		patient.setClinicHistoryNumber("632015");
		patient.setName("Ortega Castillo, Gonzalo");
		patient.setAge("57");
		patient.setAddress("C/Paterna, 3, L'Eliana (Valencia)");
		patient.setGender("Hombre");
		return patient;
		
	}
	
}
