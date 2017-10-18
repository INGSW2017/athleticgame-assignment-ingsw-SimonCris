package it.unical.test;

import java.time.Instant;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {

	private static AthleticGame athleticGame;
	
	@BeforeClass 
	public static void inizialize() {
		
		athleticGame = new AthleticGame("Atletica");
		
	}
	
	@Test
	public void addArrivalSizeEqualsOne() {
		
		athleticGame.addArrival("Partecipante1", Instant.now());
		Assert.assertEquals(1, athleticGame.getArrivals().size());
		
	}
	
	@Before
	public void svuotaHashMap() {
		
		athleticGame.getArrivals().clear();
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void invalidPartecipiant() {
		
		athleticGame.getParecipiantTime("Partecipante1");
		
	}
	
}
