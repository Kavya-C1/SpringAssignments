package com.voya.auto;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("voilin")
public class Violin implements IInstrument {

	@Override
	public void play(String song) {
		// TODO Auto-generated method stub
		System.out.println("play music in violin " +song);
	}

}
