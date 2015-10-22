package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{

	public static final String LOVE_ALL = "love-all";
	public static final String FIFTEEN_LOVE = "fifteen-love";
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

	public void addPointToServer()
	{
		this.score = TennisGame.FIFTEEN_LOVE;
	}

	public void addPointToReceiver()
	{
		this.score = "love-fifteen";
	}

}
