import java.util.ArrayList;
import java.util.Collections;
//import java.util.*;
public class Jeu {
	//Déclaration de la variable de la classe « Jeu »
	private ArrayList<Carte> jeu;	


/********************************************************/
/*      Constructeur par defaut de 52 carte du jeu      */
/********************************************************/  
public Jeu() {
	this.jeu  = new ArrayList<Carte>();
	Cartes carte = new Cartes();
	System.out.println("nombre d'elements " + this.jeu.size() );
for (int i =0; i<carte.size(); i++){
			this.jeu.add(carte.getCarte(i));
		}
		melange();
		System.out.println("Ce jeu contient " + this.jeu.size() +" cartes");
	}
public Jeu(int n) {
	Cartes c1 = new Cartes();
	ArrayList<Carte> c2 = new ArrayList<Carte>();
	for(int i = 0 ; i<n;i++){
			c2.addAll(c1.get());
		}
	c1 = new Cartes(c2);
	this.jeu = c1.get();
	melange();
	System.out.println("Ce jeu contient " + this.jeu.size() +" cartes");

	}
		//Les  méthodes 
public int size(){
		return this.jeu.size();	
   } 


/**********************************************/
/*     les Getters de l’objet « Carte »       */
/**********************************************/  
// Affichage de l'element  "i" d'une lise "Jeu" dans cette classe
public Carte getCarte(int i){
	return this.jeu.get(i);
   } 
// Affichage de la valeur de l'element  "i" d'une lise "Jeu" dans cette classe	
public String getValeurCarte(int i){
	return this.jeu.get(i).getCarte();
   }
// Affichage des elements d'une lise "Jeu" dans une autre classe
public ArrayList<Carte> get(){
	ArrayList<Carte> carte = new ArrayList<Carte>();
	for (int i=0;i<this.jeu.size();i++){
	       carte.add(this.jeu.get(i));	
	   }
	return carte;
   }

   
/*********************************************************/
/*               Methode pour supprimer                  */
/*                  une carte d'un jeu                   */
/*********************************************************/  
public void remove(int i) {
	this.jeu.remove(i);	
   }
/*********************************************************/
/*              Methode pour melanger                    */
/*                les cartes d'un jeu                    */
/*********************************************************/  
//   En utilisant les Collections.
public void melange(){  	
	Collections.shuffle(this.jeu);
	}
}
