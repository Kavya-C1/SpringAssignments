package com.voya.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Performer {
	@Autowired
	@Qualifier("keyboard")
	private IInstrument iInstrument;
	
	@Autowired
	@Qualifier("voilin")
	private IInstrument guitar;
	
	@Autowired
	@Qualifier("guitar")
	private IInstrument instrument;

	



	public void playMusic(String choice, String song) {
		if (choice.equals("v")) {
			instrument.play(song);
		}
		if (choice.equals("k")) {
			guitar.play(song);
		}
		if (choice.equals("g")) {
			iInstrument.play(song);
		}
	}
}
