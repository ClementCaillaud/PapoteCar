
public class Trajet 
{
	private String villeDepart;
	private String villeArrivee;
	
	public Trajet(String villeDepart, String villeArrivee)
	{
		this.villeDepart = villeDepart;
		this.villeArrivee = villeArrivee;
	}
	
	//Affiche les infos relatives � ce trajet
	public void print_infos()
	{
		System.out.println("Trajet de "+this.villeDepart+" � "+this.villeArrivee);
	}
	
	//Change la ville de d�part
	public void set_ville_depart(String ville)
	{
		this.villeDepart = ville;
	}
	
	//Change la ville d'arriv�e
	public void set_ville_arrivee(String ville)
	{
		this.villeArrivee = ville;
	}
	
	//Retourne la ville de d�part
	public String get_ville_depart()
	{
		return this.villeDepart;
	}
	
	//Retourne la ville de d�part
	public String get_ville_arrivee()
	{
		return this.villeArrivee;
	}
}
