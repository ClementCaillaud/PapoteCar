
public class Voyage 
{
	private Passager passager;
	private Ville depart;
	private Ville arrivee;
	
	public Voyage(Passager p, Ville d, Ville a)
	{
		this.passager = p;
		this.depart = d;
		this.arrivee = a;
	}
	
	public Passager get_passager()
	{
		return this.passager;
	}
	
	public Ville get_depart()
	{
		return this.depart;
	}
	
	public Ville get_arrivee()
	{
		return this.arrivee;
	}
}
