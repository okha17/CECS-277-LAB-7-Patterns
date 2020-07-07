
public class RobotContext implements State
{
	private State rState;
	
	public void setState(State st)
	{
		this.rState = st;
	}
	
	public State getState()
	{
		return rState;
	}
	
	@Override
	public void life()
	{
		this.rState.life();
	}

}
