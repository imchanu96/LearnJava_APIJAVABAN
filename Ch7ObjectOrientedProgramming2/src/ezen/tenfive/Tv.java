package ezen.tenfive;

public class Tv {

	String color;
	boolean power = false;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		channel++;
	}

	void channelDown() {
		channel--;
	}

}
