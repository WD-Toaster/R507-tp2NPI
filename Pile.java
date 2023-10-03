import java.util.ArrayList;

public class Pile
{
	private ArrayList<Integer> pile;
	
	public Pile ()
	{
		this.pile = new ArrayList<Integer>();
	}
	
	public add(int c)
	{
		this.pile.add(c);
	}

	public int remove()
	{
		if (this.pile.size() == 0)
		{
			System.out.println("Pile is empty");
			return null;
		}
		return this.pile.remove(0);
	}
}
