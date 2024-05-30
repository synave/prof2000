import java.util.Scanner;
import java.util.Random;

class Prof2000{

    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Est ce que l'IA à évaluer est une IA aléatoire ? oui/non");
	String reponse = sc.next();

	if(reponse.equalsIgnoreCase("oui")){
	    Random rand = new Random();
	    System.out.println("Hum... L'IA vaut un " + (rand.nextInt(5)+4) + "/20.");
	    System.out.println("Merci d'avoir utiliser prof2000.");
	    System.exit(0);
	}

	if(reponse.equalsIgnoreCase("non")){
	    System.out.println("Bah va l'évaluer toi même feignasse de fonctionnaire !");
	    System.exit(0);
	}

	System.out.println("Je ne comprends pas ta réponse.\nVa apprendre à lire et écrire espèce d'imbécile !");
	System.exit(0);
    }

}
