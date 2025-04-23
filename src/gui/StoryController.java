package gui;

import entities.Story;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class StoryController {
		
	Story s01 = new Story("Um dia uma criança me parou, olhou-me nos meus olhos a sorrir");
	
	@FXML
	Label lbS01;
	
	@FXML
	TextArea txtArea;
	
	public void initialize() {
		confStory();
	}
	
	public void confStory() {
	txtArea.appendText(s01.getStText());
	}
	
	

	}


