
public class SausageDecorator extends PizzaDecorator 
{
	public SausageDecorator(PizzaInt decoratedPizza)
	{
		super(decoratedPizza);
	}
	
	@Override
	public void makePizza()
	{
		decoratedPizza.makePizza();
		setSausage(decoratedPizza);
	}
	
	private void setSausage(PizzaInt decoratedPizza)
	{
		System.out.println("Sausage Pizza!");
	}
}
