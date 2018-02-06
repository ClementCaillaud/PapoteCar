
public class Voiture 
{
	private String proprietaire;
	private int nbPlacesMax;
	
	public Voiture(String nomProprio, int nbPlaces)
	{
		this.proprietaire = nomProprio;
		this.nbPlacesMax = nbPlaces;
	}
	
	public void set_nbPlacesMax(int nbPlaces)
	{
		this.nbPlacesMax = nbPlaces;
	}
	
	public int get_nbPlacesMax()
	{
		return this.nbPlacesMax;
	}
	
	public String toString()
	{
		return "Conducteur : "+this.proprietaire+", Nombre de places : "+this.nbPlacesMax;
	}
}
