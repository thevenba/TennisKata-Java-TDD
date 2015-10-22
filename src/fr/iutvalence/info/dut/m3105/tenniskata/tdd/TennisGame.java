package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{

	public static final String LOVE_ALL = "love-all";
	private String score;

	/**
	 * @param score
	 */
	public TennisGame()
	{
		this.score = TennisGame.LOVE_ALL;
	}

	public String getScore()
	{
		return this.score;
	}

	public void setScore(String string)
	{
		this.score = string;
		
	}

}
