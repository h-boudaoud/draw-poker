
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DrawPoker {

	private static Scanner mise;
	private static Scanner entier;
	private static Scanner solde;

	public DrawPoker(){
	}


public static void main(String[] args) {

       System.out.println( "Bonjour Mr ");
    	System.out.println("quel est vore nom?");
    	@SuppressWarnings("resource")
    	String nom = new Scanner(System.in).nextLine();

	Joueur housni = new Joueur(nom);
	Solde(housni);    //pour modifier le solde
	housni.affiche();

	Jeu sabot =new Jeu(2);	
	Figure figure = new Figure();
	char rep ='O';
	int gain = 0;
	housni.getMiseMin();
// La partie commence
	while (housni.getMiseMin()<=housni.getSolde() && rep =='O'){
	System.out.println("Le sabot contient " +sabot.size() + " cartes");
	gain = 0;
	mise(housni);
	MainJoueur mainHousni = new MainJoueur(sabot);
// cette partie que pour le teste
/*	sabot = mainHousni.getSabot();
	System.out.println(" nombre de cartes qui reste dans le jeu =  " +mainHousni.getSabot().size());
	afficher(sabot.get());       
 */
	afficher(mainHousni.getMain());
	cartesChange(change(),mainHousni);
	figure = new Figure(mainHousni);
	gain = figure.gainJeu();
	System.out.println("Votre mise de " + housni.getMise() + "  est muliplier par " +gain);
	
	if (housni.getSolde() < housni.getMiseMin()){

		System.out.println("Il vous reste :" + housni.getSolde());
		System.out.println("Votre solde n'est pas suffissant pour rejouer");
		break;
	}

	System.out.println("Votre ancien solde sans la mise est de  " + (housni.getSolde()));
	housni.setSolde(housni.getSolde() + housni.getMise()*gain);
	System.out.println("Votre nouveau solde est de  " + housni.getSolde());
	sabot = mainHousni.getSabot();
	rep = rejouer();
	}

System.out.println("A bientôt");	
	}	


//Les  méthodes


public static int afficher(ArrayList<Carte> c){
    	 for(int i = 0; i <c.size(); i++){	
    		 System.out.print("|  " + c.get(i).getCarte() + " de "+c.get(i).getTypeCarte() +"   |"); 
       	if ((i+1)%13 ==0){
         	System.out.println(" ");
          	}
         }
    	 System.out.println(" ");
    	 return 0;
    }

public static int change(){

	System.out.println("Combien de cartes souhaitez vous changer?");
//	Scanner sn = new Scanner(System.in);
	int nbrCarte = -1;
	entier = new Scanner(System.in);
	
   	while (nbrCarte ==-1) {
		try {
			nbrCarte = entier.nextInt();
			if(nbrCarte<0 || nbrCarte>5){
				System.out.println(nbrCarte+" n'est pas un entier entre 1 et 5 \nrecomencez");
				nbrCarte =-1;
			}
		} catch (InputMismatchException e) {
			System.out.println("Choix invalide! (exception)\nrecomencez\n");
			System.out.println("Combien de cartes souhaitez vous changer?");
			entier.nextLine();
		}
	};
	    
	return nbrCarte;
}


public int size(MainJoueur mainJ){
		return mainJ.size();	
   } 
public static int mise(Joueur j){
	    	int newMise = 0;
	        if (j.getSolde()<20){
				System.out.println("\n ATTENTION, Votre solde est inferieur à "+ j.getMiseMin()*2);
	        	System.out.println("\nVous ne pouvez pas rejouer en cas de perte, car votre solde est égale à "+ j.getSolde() );
	        }

		    	System.out.println("Quelle es votre mise?");
   	    	    mise = new Scanner(System.in);
   	    	 while (newMise==0) {
		    	    try {
		    	    	newMise = mise.nextInt();
		    	    	 if(newMise<j.getMiseMin() || newMise>j.getSolde()){
			        			System.out.println("Votre mise doit être comprise entre"+ j.getMiseMin() + " et "+ j.getSolde());
			        			newMise = 0;
			        	 }else{
			        		 j.setMise(newMise);
			                   } 
		    	    	} catch (InputMismatchException e) {
		    	    		System.out.println("Choix invalide! (exception)\nrecomencez\n");
		        			System.out.println("Votre mise doit être comprise entre"+ j.getMiseMin() + " et "+ j.getSolde());
		    	    		System.out.println("Quelle es votre mise?");
		    	    		mise.nextLine();
		    	    	}
		    	     
	        	};
	        	
	        

			
	        return newMise;
	    	}
public static int Solde(Joueur j){
	    	int newsolde = 0;
			System.out.println("Pour jouer, votre Solde doit être comprise entre "+ j.getMiseMin() + " et "+ j.getSoldeMax() +"\n");
	    	System.out.println("Quelle somme souhaitez vous jouer aujourd'hui Mr " + j.getNom()+ "?");

	    	    solde = new Scanner(System.in);
	    	 while (newsolde == 0) {
	    	    try {
	    	    	newsolde = solde.nextInt();
	    	    	 if(newsolde<j.getMiseMin() || newsolde>j.getSoldeMax()){
		        			System.out.println("Votre solde doit être comprise entre"+ j.getMiseMin() + " et "+ j.getSoldeMax() +"\nrecomencez");
		        			newsolde = 0;
		        	 }else{
		        		 j.setSolde(newsolde);
		                   } 
	    	    	} catch (InputMismatchException e) {
	    	    		System.out.println("Choix invalide! (exception)\n");
	    	    		System.out.println("Quelle somme souhaitez vous jouer aujourd'hui Mr " + j.getNom()+ "?");
	    	    		solde.nextLine();
	    	    	}
	    	     
        	};
        	return 0;
}

public static ArrayList<Carte> cartesChange(int n, MainJoueur j){
	int i=1;
	if(n==0) {
				System.out.println("Vous ne souhaitez pas changer de cate alors");	
		    }
	else if(n==5){	
		    	System.out.println("Vous souhaitez changer toutes les cartes");
		    	j.changeCarte(j.getMain());
		    }
	else {
		    	System.out.println("Les cartes que vous souhaitez changer sont");	
		    	while(i<=n){
		        	System.out.println("La valeur de la carte  " + i + ": ");
		        	@SuppressWarnings("resource")
		        	String carte = new Scanner(System.in).nextLine();
		        	carte = carte.toUpperCase();
		        	if (j.indiceCarte(carte)>-1){
		        		j.changeCarte(carte); 
		        		i++; 
		    	        } 
		    	    else{ 
		    	        	System.out.println("La carte " + carte +" que vous souhaitez changer ne fait pas partie de votre jeu"); 
		    	        }
		    	}
		   }
	 	   afficher(j.getMain());
			return j.getMain();
	    }
	    
public static char rejouer(){
	    	char rep = 'O';
	    	do{
				System.out.println("voulez vous rejouez? (O/N)");
				String reponse = new Scanner(System.in).nextLine();
	        	reponse = reponse.toUpperCase();
	        	rep = reponse.charAt(0);
			}while(rep !='O' && rep !='N');
	    	return rep;
	    }
	    
}