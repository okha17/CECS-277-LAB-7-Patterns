
public class Tester 
{
	public static void main(String args[])
	{
		System.out.println("Adapter test");
		SimpleName simp = new NameClassReporter();
		testName(simp);
		
	}
	
	public static void testName(SimpleName simp)
	{
		simp.setName("Osman Khan");
		System.out.println("Full Name " + simp.getName());
		System.out.println("First name " + ((FullNameInterface)simp).getFirstName());
		System.out.println("Last name " + ((FullNameInterface)simp).getLastName());
		
	}

}
