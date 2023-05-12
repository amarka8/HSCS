import java.util.*;

public class RandomUtil {

	public static String getName()
	{
		Random random = new Random();
		String[] firstNames = getFirstNames();
		String[] lastNames = getLastNames();
		return  lastNames[random.nextInt(10)] + " " + firstNames[random.nextInt(10)];
	}

	public static String getPhoneNumber()
	{
		Random random = new Random();
		Integer firstDigit = new Integer(random.nextInt(9) + 1);
		return
			getRandomNumberAsString() +
			getRandomNumberAsString() +
			getRandomNumberAsString() +
			"-" +
			getRandomNumberAsString() +
			getRandomNumberAsString() +
			getRandomNumberAsString() +
			getRandomNumberAsString();
	}

	private static String getRandomNumberAsString()
	{
		Random random = new Random();
		Integer i = new Integer(random.nextInt(10));
		return i.toString();
	}

	private static String[] getFirstNames()
	{
		String[] names = new String[10];
		names[0] = "Andy";
		names[1] = "Bob";
		names[2] = "Carl";
		names[3] = "Dave";
		names[4] = "Ed";
		names[5] = "Amy";
		names[6] = "Britney";
		names[7] = "Cindy";
		names[8] = "Diane";
		names[9] = "Eve";
		return names;
	}

	private static String[] getLastNames()
	{
		String[] names = new String[10];
		names[0] = "Anderson";
		names[1] = "Brown";
		names[2] = "Clark";
		names[3] = "Davis";
		names[4] = "Evans";
		names[5] = "Foster";
		names[6] = "Garcia";
		names[7] = "Hall";
		names[8] = "Ingle";
		names[9] = "Jones";
		return names;
	}

}