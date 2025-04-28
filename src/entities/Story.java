package entities;

import gui.CharacterCreationController;


public class Story extends CharacterCreationController {
	
	
	
	private String stText;
	
	
	public Story() {
		
	}
	
	public Story(String stText) {
		this.stText = stText;
	}
	

	public String getStText() {
		return stText;
	}

	public void setStText(String stText) {
		this.stText = stText;
	}
	

	
	
	
	
	

}
