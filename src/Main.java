// Import scanner
import java.util.Scanner;

public class Main {

    // Instance main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Quel exercice ? Saisissez :
                1. Discriminant
                2. Parité d’un nombre
                3. Calcul d’extremum
                4. Égalité entre chaînes de caractères
                5. Factorielle
                6. Compte à rebous
                7. Valeurs de carrés
                8. Table de multiplication
                9. Division d’entiers
                10. Règle graduée
                11. Nombres premiers
                12. Minimum d'un tableau
                13. Maximum d'un tableau
                14. Somme d'un tableau
                15. Afficher les nombres paires
                16. Afficher les indices des nombres paires
                17. Inverser un tableau""");

        int numero = scanner.nextInt();
        // Ajouter break dans les switch pour eviter de tester plusieurs cas
        switch (numero) {
            case 1 :
                discriminant();
                break;
                
            case 2:
                parite();
                break;
            case 3 : {
                max();
                min();
            }
            case 4:
                egaliteStr();
                break;
            case 5:
                factorielle();
                break;
            case 6:
                countdown();
                break;
            case 7:
                carres();
                break;
            case 8:
                tableMultiplication();
                break;
            case 9:
                division();
                break;
            case 10:
                regle();
                break;
            case 11:
                nombrePremier();
                break;
            case 12:
                tableauMin();
                break;
            case 13 :
                tableauMax();
                break;
            case 14 :
                somme();
                break;
            case 15 :
                nombresPaires();
                break;
            case 16 :
                indicesPaires();
                break;
            case 17 :
                inverseTableau();
                break;
        }

    }

    /*----------------------------------------------------------------------------------*/

    // INSTANCES
    public static void discriminant() {
        // Discriminant
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quelle est la valeur de a : ");
        int a = scanner.nextInt();
        System.out.println("Quelle est la valeur de b : ");
        int b = scanner.nextInt();
        System.out.println("Quelle est la valeur de c : ");
        int c = scanner.nextInt();
        int delta = (int)Math.pow(b, 2.0) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Ce polynome n'a pas de racine reelle");
        }

        if (delta == 0) {
            double x0 = -1.0 * (float)b / 2.0 * (float)a;
            System.out.println("Ce polynome a une racine double : " + x0);
        } else {
            float x1 = (float)((double)(-1 * b) - Math.sqrt(delta) / 2.0 * (float)a);
            float x2 = (float)((double)(-1 * b) + Math.sqrt(delta) / 2.0 * (double)a);
            System.out.println("Ce polynome a deux racines racines : " + x1 + "et " + x2);
        }

    }

    public static void parite() {
        // Parité
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre : ");
        int nombre = scanner.nextInt();
        if (nombre % 2 == 0) {
            System.out.println("Le nombre " + nombre + " est pair ");
        } else {
            System.out.println("Le nombre " + nombre + " est impair");
        }

    }

    public static void max() {
        // Max
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un premier entier : ");
        int premierEntier = scanner.nextInt();
        System.out.println("Saisir un deuxieme entier : ");
        int deuxiemeEntier = scanner.nextInt();
        if (premierEntier > deuxiemeEntier) {
            System.out.println("Le maximum est " + premierEntier);
        }

        if (premierEntier < deuxiemeEntier) {
            System.out.println("Le maximum est " + deuxiemeEntier);
        } else {
            System.out.println("Les deux nombres sont égaux et le maximum est donc : " + premierEntier);
        }

    }

    public static void min() {
        // Min
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un premier entier : ");
        int premierEntier = scanner.nextInt();
        System.out.println("Saisir un deuxieme entier : ");
        int deuxiemeEntier = scanner.nextInt();
        if (premierEntier > deuxiemeEntier) {
            System.out.println("Le minimum est " + deuxiemeEntier);
        }

        if (premierEntier < deuxiemeEntier) {
            System.out.println("Le minimum est " + premierEntier);
        } else {
            System.out.println("Les deux nombres sont égaux et le minimum est donc : " + premierEntier);
        }

    }

    public static void egaliteStr() {
        // Egalité chaine
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir une premier chaine de caractère : ");
        String premierChaine = scanner.nextLine();
        System.out.println("Saisir une deuxieme chaine de caractère : ");
        String deuxiemeChaine = scanner.nextLine();
        // Test égalité chaine
        if (premierChaine.equals(deuxiemeChaine)) {
            System.out.println("Les deux chaines de caractères sont égales : " + premierChaine);
        } else {
            System.out.println("Les deux chaines de caractères sont différentes");
        }

    }

    public static void factorielle() {
        // Factorielle
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
        int factorielle = 1;

        for(int i = 1; i <= n; i++) {
            factorielle *= i;
        }

        System.out.println("Factorielle de " + n + " : " + factorielle);
    }

    public static void countdown() {
        // Compte à rebours
        for(int i = 10; i >= 0; i--) {
            if (i == 0) {
                System.out.println("" + i + " BOUM");
            } else {
                System.out.println(i);
            }
        }

    }

    public static void carres() {
        // Nombre au carré
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un nombre: ");
        int valeur = scanner.nextInt();
        int valeurCarre = valeur * valeur;
        System.out.println("" + valeur + "\t" + valeurCarre);
    }

    public static void tableMultiplication() {
        // Table de multiplication
        for(int i = 1; i <= 10; i++) {
            for(int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }

            System.out.print("\n");
        }

    }

    public static void division() {
        // Division
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir le numérateur : ");
        int num = scanner.nextInt();
        System.out.println("Saisir le dénomninateur : ");
        int den = scanner.nextInt();
        while (den == 0){
            System.out.println("Saisir le dénomninateur : ");
            den = scanner.nextInt();
        }
        System.out.println("La division est égale à : " + num / den);
    }

    public static void regle() {
        // Tracer une regle graduée
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir une valeur strictement postive : ");
        int valeur = scanner.nextInt();
        while (valeur < 0) {
            System.out.println("Saisir une valeur strictement postive : ");
            valeur = scanner.nextInt();
        }
        for(int i = 0; i<valeur; i++){
            if (i % 10 == 0) {
                System.out.print("|");
            }
            System.out.print("-");
        }
    }

    public static void nombrePremier() {
        // Test pour savoir si un nombre est premier
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir une valeur strictement positive : ");
        int nombre = scanner.nextInt();
        while (nombre > 0){
            System.out.println("Saisir une valeur strictement positive : ");
            nombre = scanner.nextInt();
        }
        // Critère erathostene
        int erathostene = (int)Math.sqrt(nombre);

        for(int i = 2; i <= erathostene; i++) {
            if (nombre % i == 0) {
                System.out.println("Le nombre n'est pas premier.");
                break;
            }
        }

        System.out.println("Le nombre est premier.");
    }

    public static int[] initialisationTableau() {
        // Initialisation tableau
        int[] tableau = new int[20];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier");
            int entier = scanner.nextInt();
            tableau[i] = entier;
        }
        return tableau;
    }

    public static void tableauMin() {
        // Min
        int [] tableau = initialisationTableau();
        int candidatMin = tableau[0];

        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] < candidatMin) {
                candidatMin = tableau[i];
            }
        }
        System.out.println("Le minimum est : " + candidatMin);
    }
    public static void tableauMax() {
        // Max
        int[] tableau = initialisationTableau();
        int candidatMax = tableau[0];

        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > candidatMax) {
                candidatMax = tableau[i];
            }

            System.out.println("Le maximum est : " + candidatMax);
        }
    }

    public static void somme() {
        // Somme (boucle for enhanced)
        int [] tableau = initialisationTableau();
        int somme = 0;
        for (int valeur : tableau) {
            somme += valeur;
        }
        System.out.println("La somme est : " + somme);
    }

    public static void nombresPaires() {
        // Afficher les nombres paires (boucle for enhanced)
        int [] tableau = initialisationTableau();
        for (int valeur : tableau) {
            if (valeur % 2 == 0) {
                System.out.print("" + valeur + "\t");
            }
        }
    }

    public static void indicesPaires(){
        // Afficher les indices des valeurs paires
        int [] tableau = initialisationTableau();
        for(int i = 0; i < tableau.length; i++) {
            if (tableau[i] % 2 == 0) {
                System.out.print("" + i + "\t");
            }
        }
    }

    public static void inverseTableau() {
        // Inversion tableau
        int [] tableau = initialisationTableau();
        for(int i = tableau.length - 1; i >= 0; i--) {
            System.out.print(tableau[i]+"\t");
        }

    }
}