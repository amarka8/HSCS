public class PhoneBook {

	protected PhoneBookEntry[] entries;

	public PhoneBook()
	{
		entries = new PhoneBookEntry[10];
		for (int i = 0; i < 10; i++)
		{
			entries[i] = getRandomEntry();
		}
		MergeSorter m = new MergeSorter(entries);
		m.sort();
	}

	private PhoneBookEntry getRandomEntry()
	{
		return new PhoneBookEntry(RandomUtil.getName(), RandomUtil.getPhoneNumber());
	}

	public String toString()
	{
		String r = "";
		for (PhoneBookEntry entry : entries)
		{
			r += entry.getName() + " " + entry.getNumber() + "\n";
		}
		return r;
	}

}
