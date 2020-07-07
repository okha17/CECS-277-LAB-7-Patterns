
public class Tester 
{
	public static void main(String args[])
	{
		RobotContext context = new RobotContext();
		State happy = new Happy();
		State bored = new Bored();
		
		context.setState(bored);
		context.life();
		context.setState(happy);
		context.life();
	}

}
