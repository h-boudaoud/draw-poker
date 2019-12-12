
public class Carte {

	// D�claration de la variable carte de la classe � Cartes � 
    private String carte;
	private int type; 	


/***********************************************************/
/*   Constructeur par d�faut  de l�objet � carte �         */
/* Ce constructeur va cr�er �l�ments de l�objet  � Carte � */
/***********************************************************/  
public Carte(){
		this.carte = null;
		this.type = 0;
		}


/**************************************************************/
/*    Constructeur par initialisation de l�objet � carte �    */
/*  C�est le constructeur pas d�faut de la classe � Carte �.  */
/*                    Les  m�thodes                           */
/**************************************************************/  
//Ce constructeur va cr�er �l�ments de l�objet  � Carte �
//carte  = s et type =i
//C�est un constructeur pas initialisation de la classe � Carte �.
public Carte(String s, int i){
// s doit �tre enre 2 et 10 ou une lettre parmis A, V, D ou R
		this.carte = s;	
		this.type = i%4;
	}	

/*************************************************/
/*     les Getters de l�objet � Carte �          */
/*  Ces m�thode son pour modifier les valeurs    */
/*             de l�objet � Carte �              */
/*************************************************/  
public void setCarte(String s){
	// s doit �tre enre 2 et 10 ou une lettre parmis A, V, D ou R
		this.carte = s;		
	}
	
	public void setTypeCarte(int i){
		this.type = i%4;
	}	
/*************************************************/
/*     les Getters de l�objet � Carte �          */
/*   Cette m�thode renvoie les �l�ments d�un     */
/* objet � Cartes � sous forme d�une ArrayListe  */
/*************************************************/  
public String getCarte(){
		return this.carte;		
	}
public String getTypeCarte(){
		return  typeCarte(this.type);		
	}	
/**********************************************************/
/*           les couleurs de l�objet � Carte �            */
/*    Un algorithme qui revoie � l��crant les quatre      */
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
