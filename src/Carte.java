
public class Carte {

	// Déclaration de la variable carte de la classe « Cartes » 
    private String carte;
	private int type; 	


/***********************************************************/
/*   Constructeur par défaut  de l’objet « carte »         */
/* Ce constructeur va créer éléments de l’objet  « Carte » */
/***********************************************************/  
public Carte(){
		this.carte = null;
		this.type = 0;
		}


/**************************************************************/
/*    Constructeur par initialisation de l’objet « carte »    */
/*  C’est le constructeur pas défaut de la classe « Carte ».  */
/*                    Les  méthodes                           */
/**************************************************************/  
//Ce constructeur va créer éléments de l’objet  « Carte »
//carte  = s et type =i
//C’est un constructeur pas initialisation de la classe « Carte ».
public Carte(String s, int i){
// s doit être enre 2 et 10 ou une lettre parmis A, V, D ou R
		this.carte = s;	
		this.type = i%4;
	}	

/*************************************************/
/*     les Getters de l’objet « Carte »          */
/*  Ces méthode son pour modifier les valeurs    */
/*             de l’objet « Carte »              */
/*************************************************/  
public void setCarte(String s){
	// s doit être enre 2 et 10 ou une lettre parmis A, V, D ou R
		this.carte = s;		
	}
	
	public void setTypeCarte(int i){
		this.type = i%4;
	}	
/*************************************************/
/*     les Getters de l’objet « Carte »          */
/*   Cette méthode renvoie les éléments d’un     */
/* objet « Cartes » sous forme d’une ArrayListe  */
/*************************************************/  
public String getCarte(){
		return this.carte;		
	}
public String getTypeCarte(){
		return  typeCarte(this.type);		
	}	
/**********************************************************/
/*           les couleurs de l’objet « Carte »            */
/*    Un algorithme qui revoie à l’écrant les quatre      */
/*           couleurs possible de la carte                */
/**********************************************************/  
private String typeCarte(int i){
		String type = null;
		switch(i){
		    case 0:
		    	type = "coeur";		
				break;
		    case 1:
		    	type = " trefle";		
				break;
		    case 2:
		    	type = "carreau";		
				break;
		    case 3:
		    	type = "pique";		
				break;
			}
		return type;
       }	
}
