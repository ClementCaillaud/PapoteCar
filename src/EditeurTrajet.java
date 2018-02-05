import java.util.Hashtable;
import java.util.Scanner;

public class EditeurTrajet 
{
	Scanner sc;
	Hashtable<String, Trajet> tab_trajets;//Liste des trajets
	
	public EditeurTrajet()
	{
		this.sc = new Scanner(System.in);
	}
	
	//Ex�cution de l'�diteur, retourne le nouveau tableau de trajets
	public Hashtable<String, Trajet> start(Hashtable<String, Trajet> listeTrajets)
	{
		this.tab_trajets = listeTrajets;
		String input = null;
		
		//Acquisition de la commande de l'utilisateur
		do
		{
			System.out.println("Cr�er trajet : C - Modifier trajet : M - Supprimer trajet : S");
			input = this.sc.nextLine();
		}
		while(!check_input(input));
		
		return this.tab_trajets;
	}
	
	//V�rification de la commande entr�e
	private boolean check_input(String input)
	{
		input = input.toUpperCase();
		
		switch(input)
		{
			case "C" : creerTrajet();
				break;
			case "M" : modifierTrajet();
				break;
			case "S" : supprimerTrajet();
				break;
			default : System.out.println("Entr�e incorrecte ...");
				return false;
		}
		return true;
	}
	
	//Cr�ation d'un trajet
	private void creerTrajet()
	{
		Trajet nouveauTrajet = null;
		String key = null;
		
		//Acquisition des diff�rents param�tres
		String villeDepart = acquisition_ville("Ville de d�part : ");
		String villeArrivee = acquisition_ville("Ville d'arriv�e : ");
		
		//Cr�ation du trajet
		nouveauTrajet = new Trajet(villeDepart, villeArrivee );
		//Key basique pour l'instant
		key = villeDepart+"|"+villeArrivee;
		//Ajout du nouveau trajet � la liste des trajets
		this.tab_trajets.put(key, nouveauTrajet);
		
		//Affichage du trajet cr��
		this.tab_trajets.get(key).print_infos();
	}
	
	//Acquisition du nom de la ville
	private String acquisition_ville(String message)
	{
		String ville = null;
		
		do
		{
			System.out.println(message);
			ville = this.sc.nextLine();
		}while(ville.length() < 2);
		
		return ville;
	}
	
	//Modification d'un trajet
	private void modifierTrajet()
	{
		System.out.println("Modification trajet trajet");
	}
	
	//Suppression d'un trajet
	private void supprimerTrajet()
	{
		System.out.println("Suppression trajet");
	}
	
}
