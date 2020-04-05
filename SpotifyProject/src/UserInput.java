
/**
 * This class contains user input parameters and JavaFX graphic elements
 * @author johngriffin
 *
 */

public class UserInput {

	// instance variables
	int Energy;
	int Dance;
	int Live;
	int Length;
	int Acoustics;
	int Speech;
	
	// constructor
	public UserInput() {
		
	}

	// methods
	
	/*
	 * Method to generate JavaFX graphics for MainDisplay of graphic controls for user input. As user sets controls, the class instance variables will be set to their seelction.
	 */
	public userInputControls() {
		
	}
	
	
	public int getEnergy() {
		return Energy;
	}

	public void setEnergy(int energy) {
		Energy = energy;
	}

	public int getDance() {
		return Dance;
	}

	public void setDance(int dance) {
		Dance = dance;
	}

	public int getLive() {
		return Live;
	}

	public void setLive(int live) {
		Live = live;
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		Length = length;
	}

	public int getAcoustics() {
		return Acoustics;
	}

	public void setAcoustics(int acoustics) {
		Acoustics = acoustics;
	}

	public int getSpeech() {
		return Speech;
	}

	public void setSpeech(int speech) {
		Speech = speech;
	}
	
	
}
