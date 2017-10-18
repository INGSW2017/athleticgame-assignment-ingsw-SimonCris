package it.unical.test;

import java.time.Instant;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnerTest {

	private static AthleticGame athleticGame;

	@BeforeClass
	public static void inizialize() {

		athleticGame = new AthleticGame("Baseball");

	}

	@After
	public void callReset() {

		athleticGame.reset();

	}

	@Before
	public void callStart() {

		athleticGame.start();

	}

	@Test
	public void getWinnerWorks1() {

		athleticGame.addArrival("Francesco", Instant.now().plusMillis(1000));
		athleticGame.addArrival("Luca", Instant.now().plusMillis(2000));
		athleticGame.addArrival("Pasquale", Instant.now().plusMillis(3000));
		athleticGame.addArrival("Gabriele", Instant.now().plusMillis(4000));

		Assert.assertEquals("Francesco", athleticGame.getWinner());

	}

	@Test
	public void getWinnerWorks2() {

		athleticGame.addArrival("Antonio", Instant.now().plusMillis(5001));
		athleticGame.addArrival("Vincenzo", Instant.now().plusMillis(5002));
		athleticGame.addArrival("Michele", Instant.now().plusMillis(5003));
		athleticGame.addArrival("Maurizio", Instant.now().plusMillis(5004));

		Assert.assertEquals("Antonio", athleticGame.getWinner());

	}

}
