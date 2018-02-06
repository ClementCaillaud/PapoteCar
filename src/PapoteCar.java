public class PapoteCar 
{

	public static void main(String[] args) 
	{	
		Ville v1 = new Ville("Nantes");
		Ville v2 = new Ville("Le Mans");
		Ville v3 = new Ville("Paris");
		Ville v4 = new Ville("Lille");
		
		Voiture voitureA = new Voiture("Clément", 3);
		
		Passager p1 = new Passager("Toto");
		Passager p2 = new Passager("Tata");
		Passager p3 = new Passager("Titi");
		
		Voyage voyage1 = new Voyage(p1, v1, v3);
		Voyage voyage2 = new Voyage(p2, v3, v4);
		Voyage voyage3 = new Voyage(p3, v2, v4);
		
		Trajet t = new Trajet(v1, v4, voitureA);
		
		t.ajouter_etape(v2);
		t.ajouter_etape(v3);
		t.ajouter_voyage(voyage1);
		t.ajouter_voyage(voyage2);
		t.ajouter_voyage(voyage3);
		//test_trajet_1(t, voitureA);
		System.out.println(voitureA);
		t.derouler_trajet();
		
	}
	
	private static void test_trajet_1(Trajet trajet, Voiture voiture)
	{
		trajet.afficher_itineraire();
		System.out.println("Nombre d'étapes : "+trajet.nombre_etapes());
		System.out.println(voiture);
		trajet.afficher_passagers();
	}

}
