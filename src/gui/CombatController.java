package gui;

import java.io.IOException;

import entities.Npc;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class CombatController extends ViewController {
	
	@FXML
	private Button btAttack;
	
	@FXML
	private Button btFinish;
	
	@FXML
	private Label lbPlayer;
	
	@FXML
	private Label lbNpc;
	
	@FXML
	private Label lbCurrentPlayer;
	
	@FXML
	private Label lbCurrentNpc;
	
	@FXML
	private AnchorPane newPane;
	
	Npc ara01 = new Npc("Aracockra", 7, 14, 2);
		
	
	public void initialize() {
		lbPlayer.setText(String.valueOf(char01.getHealth()) + "/" + String.valueOf(char01.getMaxHp()));
		lbNpc.setText(String.valueOf(ara01.getHealth()));
		
	}
	
	public void onBtAttack() {
		int playerAttack = char01.getFighting() + (int)(Math.random() * 6 + 1);
		int npcAttack = ara01.getFighting() + (int)(Math.random() * 6 + 1);
		lbCurrentNpc.setText(String.valueOf(npcAttack));
		lbCurrentPlayer.setText(String.valueOf(playerAttack));
		
		if (playerAttack > npcAttack) {
			ara01.setHealth(ara01.getHealth() - char01.getDmg());
			lbNpc.setText(String.valueOf(ara01.getHealth()));
			
		} else {
			char01.setHealth(char01.getHealth() - ara01.getDmg());
			lbPlayer.setText(String.valueOf(char01.getHealth()) + "/" + String.valueOf(char01.getMaxHp()));
		}
		
		if (ara01.getHealth() <= 0) {
			btAttack.setDisable(true);
		}
	}
	
	public void onBtFinish() throws IOException {
		if (ara01.getHealth() == 0) {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("/gui/FirstView.fxml"));
		newPane.getChildren().setAll(pane);
		} else { btFinish.setDisable(true); }
		
	}
	
	


}
