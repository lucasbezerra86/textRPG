package gui;

import java.io.IOException;

import entities.GameData;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class CombatController extends GameData {
	
	
	

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
	public AnchorPane newPane;
	
		
	
	public void initialize() {
		lbPlayer.setText(String.valueOf(char01.getHealth()) + "/" + String.valueOf(char01.getMaxHp()));
		lbNpc.setText(String.valueOf(enemies[enemySetting].getHealth()));
		System.out.println(enemySetting);
		
	}
	
	public void onBtAttack() {
		int playerAttack = char01.getFighting() + (int)(Math.random() * 6 + 1);
		int npcAttack = (enemies[enemySetting].getFighting())+ (int)(Math.random() * 6 + 1);
		lbCurrentNpc.setText(String.valueOf(npcAttack));
		lbCurrentPlayer.setText(String.valueOf(playerAttack));
		
		if (playerAttack > npcAttack) {
			enemies[enemySetting].setHealth(enemies[enemySetting].getHealth() - char01.getDmg());
			lbNpc.setText(String.valueOf(enemies[enemySetting].getHealth()));
			
		} else {
			char01.setHealth(char01.getHealth() - enemies[enemySetting].getDmg());
			lbPlayer.setText(String.valueOf(char01.getHealth()) + "/" + String.valueOf(char01.getMaxHp()));
		}
		
		if (enemies[enemySetting].getHealth() <= 0) {
			btAttack.setDisable(true);
		}
	}
	
	public void onBtFinish() throws IOException {
		if (enemies[enemySetting].getHealth() > 0) {
			btFinish.setDisable(true);
		
		} else { switch (storyNumber) {
		case 1: AnchorPane pane = FXMLLoader.load(getClass().getResource("/gui/CharacterCreationView.fxml"));
				newPane.getChildren().setAll(pane);
		case 2: AnchorPane pane2 = FXMLLoader.load(getClass().getResource("/gui/CharacterCreationView.fxml"));
		newPane.getChildren().setAll(pane2);
		case 3: AnchorPane pane3 = FXMLLoader.load(getClass().getResource("/gui/CharacterCreationView.fxml"));
		newPane.getChildren().setAll(pane3);
		case 4: AnchorPane pane4 = FXMLLoader.load(getClass().getResource("/gui/CharacterCreationView.fxml"));
		newPane.getChildren().setAll(pane4);
		case 5: AnchorPane pane5 = FXMLLoader.load(getClass().getResource("/gui/CharacterCreationView.fxml"));
		newPane.getChildren().setAll(pane5);
		default: AnchorPane pane6 = FXMLLoader.load(getClass().getResource("/gui/CharacterCreationView.fxml"));
		newPane.getChildren().setAll(pane6);}
		}
		
		
	}
	
	


}
