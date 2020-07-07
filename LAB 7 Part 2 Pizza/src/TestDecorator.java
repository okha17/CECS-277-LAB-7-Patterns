
public class TestDecorator
{
	public static void main (String args[])
	{
		PizzaInt pizza = new Pizza();
		PizzaInt xtracheese = new ExtraCheeseDecorator(new Pizza());
		PizzaInt sausagepepperonipizza = new SausageDecorator(new PepperoniDecorator(new Pizza()));
		PizzaInt xtrachzsausagepepperoni = new ExtraCheeseDecorator(new SausageDecorator(new PepperoniDecorator (new Pizza())));
		
		pizza.makePizza();
		xtracheese.makePizza();
		sausagepepperonipizza.makePizza();
		xtrachzsausagepepperoni.makePizza();
		
		//string[]name = random.split(" ");
		//fName = name [0];
	}
}
