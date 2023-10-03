public class Calculatrice
{
	private Pile	pile;
	private int		resultat;

	public Calculatrice()
	{
		this.pile = new Pile();
	}

	public void add(int c)
	{
		this.pile.add(c);
	}

	public void operation(char c)
	{
		if (c == '=')
		{
			System.out.println(this.pile.get());
			return;
		}

		int a = this.pile.remove();
		int b = this.pile.remove();
		if (a == -1 || b == -1)
		{
			System.out.println("Not enough elements in pile");
			return;
		}
		switch (c)
		{
			case '+':
				this.resultat = a + b;
				break;
			case '-':
				this.resultat = a - b;
				break;
			case '*':
				this.resultat = a * b;
				break;
			case '/':
				this.resultat = a / b;
				break;
			default:
				System.out.println("Unknown operation");
				return;
		}
		this.pile.add(this.resultat);
	}
}
