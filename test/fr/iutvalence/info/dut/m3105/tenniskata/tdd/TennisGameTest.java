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
	
}
