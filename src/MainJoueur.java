import java.util.ArrayList;
public class MainJoueur {
// Déclaration des variables  de la classe « MainJoueur »
	private ArrayList<Carte> mainJ;
	private Jeu sabot;
    private int tailleMain = 5;	

	  
	  
                           //Les  Constructeurs
						   
						   
/********************************************************/
/*      Constructeur par defaut de 52 carte du jeu      */
/********************************************************/  
public MainJoueur() {
	this.sabot = new Jeu();
	this.mainJ = new ArrayList<Carte>();	
	for(int i=0; i<this.tailleMain; i++){
	      this.mainJ.add(this.sabot.getCarte(0));
		this.sabot.remove(0);
	}			
}
// constructeur par initialisaion à partire d'un objet "J	
public MainJoueur(Jeu s) {
	if (s.size() > 2* this.tailleMain){
	      this.sabot = s;
	}
	else {
		System.out.println("Je remelange le jeu");
		this.sabot = new Jeu();
	}
	this.mainJ = new ArrayList<Carte>();
	for(int i=0; i< this.tailleMain; i++){
	      this.mainJ.add(this.sabot.getCarte(0));
		this.sabot.remove(0);
	}
}


					//Les  méthodes 


public int size(){
		return this.mainJ.size();	
   } 
/**********************************************/
/*     les Getters de l’objet « Carte »       */
/**********************************************/  
// Afficher les éléments du sabot
public Jeu getSabot() {
	return this.sabot;
}
// Afficher les éléments de la main
public ArrayList<Carte> getMain(){
	ArrayList<Carte> carte = new ArrayList<Carte>();
	for (int i=0;i<this.mainJ.size();i++){
	      carte.add(this.mainJ.get(i));	
	 }
	 return carte;
 }	
public int indiceCarte(String s) { 
	ArrayList<String> l = new ArrayList<String>();
	int indice;
	l = getValeur();
	 if (l.contains(s)){
	      indice = l.indexOf(s);
	 }
	 else {
	       indice = -1;
	  }
	return indice;
}
// Changer une carte d'une main
public void changeCarte(String a) { 
	if (indiceCarte(a)>-1){
		this.mainJ.remove(indiceCarte(a));
		this.mainJ.add(this.sabot.getCarte(0));
		this.sabot.remove(0);
	}
	else {
		System.out.println(a +" n'est pas une carte de vore jeu");
	}
}
//Changer une list de cartes d'une main
public void changeCarte(ArrayList<Carte> l) {    
	for (Carte a : l){
		changeCarte(a.getCarte());
	}
}
public ArrayList<String> getValeur(){
	ArrayList<String> carte = new ArrayList<String>();
	String s;
	for (int i=0;i<this.mainJ.size();i++){
		s = this.mainJ.get(i).getCarte();
	       carte.add(s);
	}
	return carte;
}	
}