import java.util.ArrayList;

public class Cartes {
		//Déclaration de la variable de la classe « Cartes »
        protected ArrayList<Carte> carte;	

//Les  Constructeurs
        
        
/********************************************************/
/*      Constructeur par defaut de 52 carte du jeu      */
/********************************************************/  
//C’est le constructeur pas défaut de la classe « Cartes ».
public  Cartes(){
		ArrayList<Carte> carteJeu = new ArrayList<Carte>();
		Carte c = new Carte();
		this.carte = carteJeu;
       // Creation des cartes qui se trouvent dans le jeux

   		for(int j = 0; j <4; j++){
   			c = new Carte();
   			c = new Carte("A",j);
   			this.carte.add(c);
   			for (int i=2;i<11;i++){
        		c = new Carte(java.lang.String.valueOf(i),j);
        		this.carte.add(c);
        	}
   			c = new Carte("V",j);
        	this.carte.add(c);
        	c = new Carte("D",j);
        	this.carte.add(c);
        	c = new Carte("R",j);
        	this.carte.add(c);
	     }
}
//C’est un constructeur pas initialisation de la classe « Cartes », en copiant les éléments d’une liste<Carte>
public Cartes(ArrayList<Carte> cartes){
		this.carte = cartes;
	}


//Les  méthodes 


public int size(){
		return this.carte.size();	
   } 
/**********************************************/
/*     les Getters de l’objet « Carte »       */
/**********************************************/  
// Affichage de l'element  "i" d'une lise "Jeu" dans cette classe
public Carte getCarte(int i){
	   return this.carte.get(i);
   } 
public String getValeurCarte(int i){
	   return this.carte.get(i).getCarte();
   }
// Affichage des elements d'une lise "Jeu" dans une autre classe
public ArrayList<Carte> get(){
	ArrayList<Carte> carte = new ArrayList<Carte>();
			for (int i=0;i<this.carte.size();i++){
	       	carte.add(this.carte.get(i));	
	       }
			return carte;
		}

}
