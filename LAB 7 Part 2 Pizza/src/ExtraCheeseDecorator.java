
public class ExtraCheeseDecorator extends PizzaDecorator 
{
	public ExtraCheeseDecorator(PizzaInt decoratedPizza)
	{
		super(decoratedPizza);
	}
	
	@Override
	public void makePizza()
	{
		decoratedPizza.makePizza();
		setExtraCheese(decoratedPizza);
	}
	
	private void setExtraCheese(PizzaInt decoratedPizza)
	{
		System.out.println("Extra Cheese Pizza!");
	}
}
