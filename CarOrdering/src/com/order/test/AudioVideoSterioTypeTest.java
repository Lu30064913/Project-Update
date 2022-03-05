package com.order.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.order.decorator.AudioVideoSterioType;

public class AudioVideoSterioTypeTest 
{
	
	    @Test
	    public void purchasePlanTest() {
	    	AudioVideoSterioType gps = new AudioVideoSterioType();
	        gps.purchasePlan();
	       assertNotNull(gps);
	    }

	    @Test
	    public void installAudioVideoSterioTypeTest() {
	    	AudioVideoSterioType gps = new AudioVideoSterioType();
	        gps.installAudioVideoSterioType();
	       assertNotNull(gps);
	    }
	
}
