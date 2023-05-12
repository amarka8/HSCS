
public class PhoneBookEntry implements Comparable<PhoneBookEntry> {

	private String name;
	private String number;

	public PhoneBookEntry(String name, String number)
	{
		this.name = name;
		this.number = number;
	}
	public PhoneBookEntry(String name)
	{
		this.name = name;
		this.number= "9015698570";
	}
	public String getName()
	{
		return name;
	}

	public String getNumber()
	{
		return number;
	}

public int compareTo(PhoneBookEntry pbe1) {
	if(this.getName().compareTo(pbe1.getName())<0){
		return -1;
	}
	else if (this.getName().compareTo(pbe1.getName())==0){
		return 0;
	}
	else{
		return 1;
	}
}
}
