
public class PepperoniDecorator extends PizzaDecorator 
{
	public PepperoniDecorator(PizzaInt decoratedPizza)
	{
		super(decoratedPizza);
	}
	
	@Override
	public void makePizza()
	{
		decoratedPizza.makePizza();
		setPepperoni(decoratedPizza);
	}
	
	private void setPepperoni(PizzaInt decoratedPizza)
	{
		System.out.println("Pepperoni Pizza!");
	}
}
