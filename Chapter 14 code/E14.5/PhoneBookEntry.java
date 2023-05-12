public class PhoneBookEntry implements Comparable {

	private String name;
	private String number;

	public PhoneBookEntry(String name)
	{
		this.name = name;
	}

	public PhoneBookEntry(String name, String number)
	{
		this.name = name;
		this.number = number;
	}

	public String getName()
	{
		return name;
	}

	public String getNumber()
	{
		return number;
	}
	
	public int compareTo(Object o)
	{
		PhoneBookEntry entry = (PhoneBookEntry)o;
		return name.compareToIgnoreCase(entry.getName());
	}

}
