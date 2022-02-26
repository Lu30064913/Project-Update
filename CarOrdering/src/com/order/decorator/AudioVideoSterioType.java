package com.order.decorator;

public class AudioVideoSterioType extends CarDecorator {

	public AudioVideoSterioType() {
		super();
	}

	public void purchasePlan() {
		installAudioVideoSterioType();
	}

	public void installAudioVideoSterioType() {
		System.out.println(" -----------------------------------------------------------");
		System.out.println("|        Thanks for choosing Audio and Video type           |");
		System.out.println("|       Branded Audio and Video Sterio has installed        |");
		System.out.println(" -----------------------------------------------------------");
	}

}
