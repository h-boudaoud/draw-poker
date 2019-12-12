import java.util.ArrayList;

public class Figure {
// Déclaration des variables  de la classe « Figure »
        private int simple;
	private int paire;
	private int berlan;
	private int carre;
	

	//Les  Constructeurs
	
	
/********************************************************/
/*              Constructeur par defaut                 */
/********************************************************/  
	public Figure (){
		this.simple = 0;
		this.paire = 0;
		this.berlan = 0;
		this.carre = 0;
	}
/********************************************************/
/*           Constructeur par iniialisation             */
/********************************************************/
public Figure (MainJoueur l){
		doublon(l);
		if (this.paire==1 && this.simple==3){
			figurePaire(l);
		}
	}

	
	//Les  méthodes 
	
	
/**********************************************/
/*     les Setters de l’objet « Carte »        */
/**********************************************/  
public void setVide(int n){
		this.simple = n;
	}
public void setPaire(int n){
		this.paire = n;
	}
public void setBerlan(int n){
		this.berlan = n;
	}
public void setCarre(int n){
		this.carre = n;
	}
/**********************************************/
/*     les Getters de l’objet « Carte »        */
/**********************************************/  
public int getSimple(){
	return this.simple;
}
public int getPaire(){
	return this.paire;
}
public int getBerlan(){
	return this.berlan;
}public int getCarre(){
	return this.carre;
}
// le nombre de doublon dans une main
	private int doublon(String s,MainJoueur l){
		int compteur=0;
		ArrayList<String> l1 = new ArrayList<String>(l.getValeur());
		while(l1.contains(s)){
			compteur++;
			l1.remove(s);
		}
		return compteur;
	}
private int figurePaire(MainJoueur l1){
	int compteur=0;
	ArrayList<String> l = new ArrayList<String>();
	l.add("A");
	l.add("V");
	l.add("D");
	l.add("R");
	for (String a : l){
		if (doublon(a,l1)==2){
			compteur++;
		       break ;
		} 
	}
      if(compteur!=1){
		this.paire =0;
		this.simple += 2;	
	}
	return this.paire;
	}
public void doublon(MainJoueur l1){	
		int compteur[] = new int[l1.size()];
		ArrayList<String> l = new ArrayList<String>(l1.getValeur());
		String s;
		int i=0, a=0;
		do{
			s= l.get(0);
			compteur[i]= doublon(s,l1);
			do{
				l.remove(s);	
			}while(l.contains(s));
			i++;
		}while(l.size() !=0);
		
		for (int j=0 ; j<i ; j++){
			a = compteur[j];
			if (a == 3){
				this.berlan++;
			}
			else if(a == 4) {
				this.carre++;
			}
			else if(a ==2){
				this.paire ++;
			}
			else {
				this.simple ++;
			}
		}
	}
	
public int gainJeu(){
     int gain = 0;
     int a = getSimple()*0 + getPaire()*1 + getBerlan()*3 + getCarre()*5;
	switch(a){
	case 0:
		gain = 0;
		System.out.println(" Désolé vous avez perdu"); 
		break;
	case 1:
		gain = 2;
		System.out.println("Vou avez une paire");
		break;
	case 2:
		gain = 3;	
		System.out.println("Vou avez  deux paire(s)");
		break;
	case 3:
		gain = 5;	
		System.out.println("Vou avez un berlan");	
	      break;
	case 4:
		gain = 10;	
		System.out.println("Vou avez un berlan et une paire ");
		break;
	case 5:
		gain = 20;
		System.out.println("Vou avez un carre");		      break;
	}
	return gain;
	}
	
}