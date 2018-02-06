
public class Ville 
{
	private String nom;
	
	public Ville(String nomVille)
	{
		this.nom = nomVille;
	}
	
	public void set_nom(String nomVille)
	{
		this.nom = nomVille;
	}
	
	public String get_nom()
	{
		return this.nom;
	}
	
	public String toString()
	{
		return this.nom;
	}
}
