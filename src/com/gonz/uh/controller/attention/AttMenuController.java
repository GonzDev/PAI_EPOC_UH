package com.gonz.uh.controller.attention;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.gonz.uh.controller.MainController;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class AttMenuController implements Initializable {
	
	private final String PATH = "/com/gonz/uh/view/attention/";
	
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
	private Button button2;
	@FXML
	private Button button3;
	@FXML
	private Button button4;

	private int currPageIndex;
	private AnchorPane currPage;
	
	private ArrayList<Button> buttons;
	
	private AnchorPane pane5a11;
	private AnchorPane pane5a12;
	private AnchorPane pane5a13;
	private AnchorPane pane5a14;
	private AnchorPane pane5a15;
	private AnchorPane pane5a16;
	private AnchorPane pane5a17;
	private AnchorPane pane5a2;
	private AnchorPane pane5a3;
	private AnchorPane pane5a4;
	
	private Att5a11Controller pane5a11Controller;
	private Att5a12Controller pane5a12Controller;
	private Att5a13Controller pane5a13Controller;
	private Att5a14Controller pane5a14Controller;
	private Att5a15Controller pane5a15Controller;
	private Att5a16Controller pane5a16Controller;
	private Att5a17Controller pane5a17Controller;
	private Att5a2Controller pane5a2Controller;
	private Att5a3Controller pane5a3Controller;
	private Att5a4Controller pane5a4Controller;
		
	public AttMenuController(MainController main) {		
		this.currPageIndex = 0;
		this.buttons = new ArrayList<>();
		this.root = main.getRoot();
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {		
		
		FXMLLoader loader = null;
		try {
			
			loader = new FXMLLoader(this.getClass().getResource(PATH+"5a-1.1.fxml"));
			pane5a11Controller = new Att5a11Controller(this);
			loader.setController(pane5a11Controller);
			pane5a11 = (AnchorPane) loader.load();
			
			loader = new FXMLLoader(this.getClass().getResource(PATH+"5a-1.2.fxml"));
			pane5a12Controller = new Att5a12Controller(this);
			loader.setController(pane5a12Controller);			
			pane5a12 = (AnchorPane) loader.load();
			
			loader = new FXMLLoader(this.getClass().getResource(PATH+"5a-1.3.fxml"));
			pane5a13Controller = new Att5a13Controller(this);
			loader.setController(pane5a13Controller);	
			pane5a13 = (AnchorPane) loader.load();
			
			loader = new FXMLLoader(this.getClass().getResource(PATH+"5a-1.4.fxml"));
			pane5a14Controller = new Att5a14Controller(this);
			loader.setController(pane5a14Controller);
			pane5a14 = (AnchorPane) loader.load();
			
			loader = new FXMLLoader(this.getClass().getResource(PATH+"5a-1.5.fxml"));
			pane5a15Controller = new Att5a15Controller(this);
			loader.setController(pane5a15Controller);
			pane5a15 = (AnchorPane) loader.load();
			
			loader = new FXMLLoader(this.getClass().getResource(PATH+"5a-1.6.fxml"));
			pane5a16Controller = new Att5a16Controller(this);
			loader.setController(pane5a16Controller);
			pane5a16 = (AnchorPane) loader.load();
			
			loader = new FXMLLoader(this.getClass().getResource(PATH+"5a-1.7.fxml"));
			pane5a17Controller = new Att5a17Controller(this);
			loader.setController(pane5a17Controller);
			pane5a17 = (AnchorPane) loader.load();
			
			loader = new FXMLLoader(this.getClass().getResource(PATH+"5a-2.fxml"));
			pane5a2Controller = new Att5a2Controller(this);
			loader.setController(pane5a2Controller);
			pane5a2 = (AnchorPane) loader.load();
			
			loader = new FXMLLoader(this.getClass().getResource(PATH+"5a-3.fxml"));
			pane5a3Controller = new Att5a3Controller(this);
			loader.setController(pane5a3Controller);
			pane5a3 = (AnchorPane) loader.load();
			
			loader = new FXMLLoader(this.getClass().getResource(PATH+"5a-4.fxml"));
			pane5a4Controller = new Att5a4Controller(this);
			loader.setController(pane5a4Controller);
			pane5a4 = (AnchorPane) loader.load();
			
			buttons.add(null);
			buttons.add(button1_1);
			buttons.add(button1_2);
			buttons.add(button1_3);
			buttons.add(button1_4);
			buttons.add(button1_5);
			buttons.add(button1_6);
			buttons.add(button1_7);
			buttons.add(button2);
			buttons.add(button3);
			buttons.add(button4);
						
		} catch (IOException e) {
			e.printStackTrace();
		}	
		
	}
	
	public void showCurrentPage() {
		if (currPage != null)
			root.setCenter(currPage);
	}

	@FXML
	public void goto11(ActionEvent actionEvent) {
		updateStyle(1);
		root.setCenter(pane5a11);
		currPage = pane5a11;
	}
	
	@FXML
	public void goto12(ActionEvent actionEvent) {
		updateStyle(2);
		root.setCenter(pane5a12);
		currPage = pane5a12;
	}
	
	@FXML
	public void goto13(ActionEvent actionEvent) {
		updateStyle(3);
		root.setCenter(pane5a13);
		currPage = pane5a13;
	}
	
	@FXML
	public void goto14(ActionEvent actionEvent) {
		updateStyle(4);
		root.setCenter(pane5a14);
		currPage = pane5a14;
	}
	
	@FXML
	public void goto15(ActionEvent actionEvent) {
		updateStyle(5);
		root.setCenter(pane5a15);
		currPage = pane5a15;
	}
	
	@FXML
	public void goto16(ActionEvent actionEvent) {
		updateStyle(6);
		root.setCenter(pane5a16);
		currPage = pane5a16;
	}
	
	@FXML
	public void goto17(ActionEvent actionEvent) {
		updateStyle(7);
		root.setCenter(pane5a17);
		currPage = pane5a17;
	}
	
	@FXML
	public void goto2(ActionEvent actionEvent) {
		updateStyle(8);
		button1.setExpanded(false);
		root.setCenter(pane5a2);
		currPage = pane5a2;
	}
	
	@FXML
	public void goto3(ActionEvent actionEvent) {
		updateStyle(9);
		button1.setExpanded(false);
		root.setCenter(pane5a3);
		currPage = pane5a3;
	}
	
	@FXML
	public void goto4(ActionEvent actionEvent) {
		updateStyle(10);
		button1.setExpanded(false);
		root.setCenter(pane5a4);
		currPage = pane5a4;
	}
	
	private void updateStyle(int index) {
		ObservableList<String> styles;
		
		if(currPageIndex == 0)
			currPageIndex = index;
		else {
			styles = buttons.get(currPageIndex).getStyleClass();
			if (styles.contains("button_2"))
				styles.remove("button_2");
			if (!styles.contains("button_1"))
				styles.add("button_1");
		}
		
		currPageIndex = index;
		styles = buttons.get(currPageIndex).getStyleClass();
		if (styles.contains("button_1"))
			styles.remove("button_1");
		if (!styles.contains("button_2"))
			styles.add("button_2");
		
		styles = button1.getStyleClass();
		if (currPageIndex < 8) {
			if (styles.contains("left-titled-pane1"))
				styles.remove("left-titled-pane1");
			if (!styles.contains("left-titled-pane2"))
				styles.add("left-titled-pane2");
		} else {
			if (styles.contains("left-titled-pane2"))
				styles.remove("left-titled-pane2");
			if (!styles.contains("left-titled-pane1"))
				styles.add("left-titled-pane1");
		}	
	}
}
