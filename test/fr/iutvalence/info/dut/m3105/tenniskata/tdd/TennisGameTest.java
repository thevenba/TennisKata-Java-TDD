package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	@Test
	public void testingNewTennisGameShouldReturnScoreLoveAll()
	{
		TennisGame currentGame = new TennisGame();
		Assert.assertEquals(TennisGame.LOVE_ALL,currentGame.getScore());
	}
	
	@Test
	public void testing15To0TennisGameShouldReturnScoreFifteenLove()
	{
		TennisGame currentGame2 = new TennisGame();
		currentGame2.addPointToServer();
		Assert.assertEquals(TennisGame.FIFTEEN_LOVE,currentGame2.getScore());
	}
	
	@Test
	public void testing0To15TennisGameSouldReturnScoreLoveFifteen()
	{
		TennisGame currentGame3 = new TennisGame();
		currentGame3.addPointToReceiver();
		Assert.assertEquals("love-fifteen",currentGame3.getScore());
	}
}
