public class Joueur {
//Déclaration des variables  de la classe « Joueur »
	private int solde;
	private int mise;
	private String nom;
	private int miseMin = 10;
	private int soldeMax = 1000;	
	
	
//Les  Constructeurs


/********************************************************/
/*      Constructeur par defaut de 52 carte du jeu      */
/********************************************************/  
//constructeur par defaut	
	public Joueur(){
		this.nom = null;
		this.solde = 100;
		this.mise = 0;
		System.out.println( "Bonjour Mr ");
	}

	// constructeur par initialisaion de la variabe nom
	public Joueur(String S){
		this.nom = S;
		this.solde = 100;
		//on peu aussi initialiser la variable solde en utilisant une base de données pour sauvegader les variable nom et solde d'un joueur
		this.mise = 0;
		System.out.println( "Bonjour Mr "+ this.nom);
	}
	
	
	
//Les  méthodes 


/**********************************************/
/*     les Getters de l’objet «Joueur»        */
/**********************************************/  
	// Afficher la variable solde
public int getSolde(){
    	return this.solde;	
    }
public int getSoldeMax(){
    	return this.soldeMax;	
    }
	
	// Afficher la variable mise
public int getMise(){
    	return this.mise;	
    }
	
	
	// Afficher la variable miseMin
public int getMiseMin(){
    	return this.miseMin;	
    }
	
	// Afficher la variable nom
public String getNom(){
    	return this.nom;	
    }
/**********************************************/
/*     les Setters de l’objet « Joueur »      */
/**********************************************/  

	// Modifier la variable solde
	public void setSolde(int newSolde ){
    	this.solde = newSolde;	
    }
	
	// Modifier la variable nom
	public void setNom(String newNom){
    	this.nom = newNom;	
    }
	
	// Modifier la variable mise
	public void setMise(int newMise){
    	this.mise = newMise;	
    	this.solde -= newMise;
    }
	
public void affiche(){
	if (solde < this.miseMin){
	    System.out.println( "Vous n'avez plus de solde, vous ne pouvez plus jouer");
	}
	else {
         System.out.println( "Votre solde est de "+ this.solde );
	     System.out.println( "La mise doit être supérieur à " + this.miseMin);
		}
	}	
}