
public class NameClassReporter extends SimpleName implements FullNameInterface
{	
	@Override
	public void setFirstName(String f)
	{
		this.name = FirstName(f);
	}
	
	@Override
	public void setLastName(String l)
	{
		this.name = LastName(l);
	}
	
	@Override
	public String getFirstName()
	{
		return FirstName(name);
	}
	
	@Override
	public String getLastName()
	{
		return LastName(name);
	}
	
	public String FirstName(String f)
	{
		String []name = f.split(" ");
		String f_name = name[0];
		return f_name;
	}
	
	public String LastName(String l)
	{
		String []name = l.split(" ");
		String l_name = name[1];
		return l_name;
	}

}
