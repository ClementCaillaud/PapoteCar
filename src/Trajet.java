import java.util.ArrayList;

public class Trajet 
{
	private Ville villeDepart;//Ville de d�part du trajet
	private Ville villeArrivee;//Vile d'arriv�� du trajet
	private ArrayList<Ville> listeEtapes;//Liste des �tapes pr�vues
	private Voiture voiture;//Voiture utlis�e
	private ArrayList<Passager> listePassagers;//Passagers actuellement dans la voiture
	private ArrayList<Voyage> listeVoyages;//Voyages r�alis�s sur ce trajet
	
	public Trajet(Ville vDepart, Ville vArrivee, Voiture v)
	{
		this.villeDepart = vDepart;
		this.villeArrivee = vArrivee;
		this.listeEtapes = new ArrayList<Ville>();
		this.voiture = v;
		this.listePassagers = new ArrayList<Passager>();
		this.listeVoyages = new ArrayList<Voyage>();
	}
	
	//Fonction pour tester
	public void derouler_trajet()
	{
		Ville villeActuelle;
		Voyage voyageActuel;
		
		System.out.println("D�roulement du trajet");
		System.out.println("#####################");
		
		//Ville de d�part 
		villeActuelle = this.villeDepart;
		System.out.println("D�part : "+villeActuelle);

		for(int i=0; i<this.listeVoyages.size(); i++)
		{
			if(this.listeVoyages.get(i).get_depart().equals(villeActuelle))
			{
				ajouter_passager(this.listeVoyages.get(i).get_passager());
			}
		}
		
		afficher_places();
		afficher_passagers();
		
		//Chaque �tape
		for(int i=0; i<this.listeEtapes.size(); i++)
		{
			villeActuelle = this.listeEtapes.get(i);
			System.out.println("-- "+villeActuelle+" --");
			
			for(int j=0; j<this.listeVoyages.size(); j++)
			{
				voyageActuel = this.listeVoyages.get(j);
				
				if(voyageActuel.get_depart().equals(villeActuelle))
				{
					ajouter_passager(this.listeVoyages.get(j).get_passager());
				}
				
				if(voyageActuel.get_arrivee().equals(villeActuelle))
				{
					supprimer_passager(this.listeVoyages.get(j).get_passager());
				}
			}
			afficher_places();
			afficher_passagers();
			
		}
		//Ville arriv�e
		System.out.println("Arriv�e : "+this.villeArrivee);
	}
	
	//Ajouter une �tape au trajet
	public void ajouter_etape(Ville nomEtape)
	{
		this.listeEtapes.add(nomEtape);
	}
	
	//Enlever une �tape du trajet
	public void supprimer_etape(Ville nomEtape)
	{
		for(int i=0; i<this.listeEtapes.size(); i++)
		{
			if(this.listeEtapes.get(i).equals(nomEtape))
			{
				this.listeEtapes.remove(i);
			}
		}
	}
	
	//Ajouter un voyage au trajet
	public void ajouter_voyage(Voyage v)
	{
		this.listeVoyages.add(v);
	}
	
	//Supprimer un voyage du trajet
	public void supprimer_voyage(Voyage v)
	{
		for(int i=0; i<this.listeVoyages.size(); i++)
		{
			if(this.listeVoyages.get(i).equals(v))
			{
				this.listeVoyages.remove(i);
			}
		}
	}
	
	//Faire monter un passager
	public void ajouter_passager(Passager p)
	{
		this.listePassagers.add(p);
	}
	
	//Faire descendre un passager
	public void supprimer_passager(Passager p)
	{
		for(int i=0; i<this.listePassagers.size(); i++)
		{
			if(this.listePassagers.get(i).equals(p))
			{
				this.listePassagers.remove(i);
			}
		}
	}
	
	//Afficher la liste des passagrs actuellement dans la voiture
	public void afficher_passagers()
	{
		for(int i=0; i<this.listePassagers.size(); i++)
		{
			System.out.println("    "+this.listePassagers.get(i));
		}
	}
	
	//Afficher les places occup�es
	public void afficher_places()
	{
		System.out.println("Places r�serv�es : "+this.listePassagers.size()+" / "+this.voiture.get_nbPlacesMax());
	}
	
	//Afficher l'itin�raire du trajet
	public void afficher_itineraire()
	{
		System.out.println();
		System.out.print(this.villeDepart);
		
		for(int i=0; i<this.listeEtapes.size(); i++)
		{
			System.out.print(" -> " + listeEtapes.get(i));
		}
		
		System.out.println(" -> " + this.villeArrivee);
	}
	
	//Retourne le nombre d'�tapes
	public int nombre_etapes()
	{
		return this.listeEtapes.size();
	}
	
	/* GET / SET */
	
	public void set_villeDepart(String nomVille)
	{
		this.villeDepart.set_nom(nomVille);
	}
	
	public void set_villeArrivee(String nomVille)
	{
		this.villeDepart.set_nom(nomVille);
	}
	
	public void set_voiture(Voiture v)
	{
		this.voiture = v;
	}
	
	public Ville get_villeDepart()
	{
		return this.villeDepart;
	}
	
	public Ville get_villeArrivee()
	{
		return this.villeArrivee;
	}
	
	public Voiture get_voiture()
	{
		return this.voiture;
	}
	
}
