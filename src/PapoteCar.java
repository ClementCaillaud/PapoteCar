import java.util.Hashtable;

public class PapoteCar 
{

	public static void main(String[] args) 
	{
		Hashtable<String, Trajet> tab_trajet = new Hashtable<String, Trajet>();//La liste des trajets, KEY-TRAJET
		EditeurTrajet et = new EditeurTrajet();//Cr�ation de l'�diteur de trajet
		
		//Acc�s � l'�diteur
		tab_trajet = et.start(tab_trajet);
		//Affichage du tableau de trajets
		System.out.println(tab_trajet);
	}

}
