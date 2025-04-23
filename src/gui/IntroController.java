package gui;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

public class IntroController {
	
	@FXML
	private Button btStart;
	
	@FXML
	private TextArea txtAreaIntro;
	
	
	@FXML
	private AnchorPane newPane;
	
	public void initialize() {
		txtAreaIntro.setText("Welcome to Bosana Brothers. I made this game to practice my coding skills. "
				+ "In the next screen, you'll be able to roll for your attributes. There are three: Fighting, Health and Luck. "
				+ "Fighting determines how good you are in combat, and ranges from 7 to 12. Health is the amount of physical damage you can	sustain before collapsing, and ranges from 14 to 24. "
				+ "And finally, Luck is used to check how you can get out of bad situations, and ranges from 7 to 12. "
				+ "The game is supposed to be finished in only one run; so make sure you're ok with your stats. "
				+ "Good Luck!");
		
	}
	
		public void onBtStart() throws IOException {
		AnchorPane pane = FXMLLoader.load(getClass().getResource("/gui/CharacterCreationView.fxml"));
		newPane.getChildren().setAll(pane);
		
	}
	

}
