package gui;

import java.io.IOException;

import entities.Personagem;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class ViewController {
	static Personagem char01 = new Personagem();
	@FXML
	private Button btRoll;
	
	@FXML
	private Button btAccept;
	
	@FXML
	private Label lbFighting;
	
	@FXML
	private Label lbHealth;
	
	@FXML
	private Label lbLuck;
	
	@FXML
	private AnchorPane newPane;
	
		public void onBtAcceptAction() throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("/gui/SecondView.fxml"));
		newPane.getChildren().setAll(pane);
		
	}
	
	public void onBtRollAction() {
		char01.rollAttributes();
		String tempFight = String.valueOf(char01.getFighting());
		String tempHealth = String.valueOf(char01.getHealth());
		String tempLuck = String.valueOf(char01.getLuck());
		lbFighting.setText(tempFight);
		lbHealth.setText(tempHealth);
		lbLuck.setText(tempLuck);
	}

}
