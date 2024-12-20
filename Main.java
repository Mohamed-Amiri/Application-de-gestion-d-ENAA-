import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n==== Menu principale ====");
            System.out.println("1 - Gestion Apprenants");
            System.out.println("2 - Gestion Formateurs");
            System.out.println("3 - Gestion Classe");
            System.out.println("4 - Quitter");
            System.out.print("Saisir votre choix: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    gestionApprenants();
                    break;
                case 2:
                    gestionFormateurs();
                    break;
                case 3:
                    gestionClasses();
                    break;
                case 4:
                    System.out.println("Au revoir!");
                    return;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    break;
            }
        }
    }

    public static void gestionApprenants() {
        Scanner ap = new Scanner(System.in);
        while (true) {
            System.out.println("\n==== Gestion Apprenants ====");
            System.out.println("1 - Ajouter Apprenant");
            System.out.println("2 - Associer Apprenant à une Classe");
            System.out.println("3 - Modifier Apprenant");
            System.out.println("4 - Supprimer Apprenant");
            System.out.println("5- Apprenants");
            System.out.println("6 - Retour au menu principal");
            System.out.print("Saisir votre choix: ");

            int choice = ap.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Ajouter un Apprenant.");
                    break;
                case 2:
                    System.out.println("Associer un Apprenant à une Classe.");
                    break;
                case 3:
                    System.out.println("Modifier un Apprenant.");
                    break;
                case 4:
                    System.out.println("Supprimer un Apprenant.");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    break;
            }
        }
    }

    public static void gestionFormateurs() {
        Formateurs 
        Scanner fr = new Scanner(System.in);
        while (true) {
            System.out.println("\n==== Gestion Formateurs ====");
            System.out.println("1 - Ajouter Formateur");
            System.out.println("2 - Associer Formateur à une Classe");
            System.out.println("3 - Modifier Formateur");
            System.out.println("4 - Supprimer Formateur");
            System.out.println("5 - Aficher Formateur");
            System.out.println("6 - Retour au menu principal");
            System.out.print("Saisir votre choix: ");

            int choice = fr.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Ajouter un Formateur.");

                    break;
                case 2:
                    System.out.println("Associer un Formateur à une Classe.");
                    break;
                case 3:
                    System.out.println("Modifier un Formateur.");
                    break;
                case 4:
                    System.out.println("Supprimer un Formateur.");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    break;
            }
        }
    }

    public static void gestionClasses() {
        Scanner cl = new Scanner(System.in);
        while (true) {
            System.out.println("\n==== Gestion Classes ====");
            System.out.println("1 - Créer une Classe");
            System.out.println("2 - Modifier une Classe");
            System.out.println("3 - Supprimer une Classe");
            System.out.println("4 - Aficher une Classe");
            System.out.println("4 - Retour au menu principal");
            System.out.print("Saisir votre choix: ");

            int choice = cl.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Créer une Classe.");
                    break;
                case 2:
                    System.out.println("Modifier une Classe.");
                    break;
                case 3:
                    System.out.println("Supprimer une Classe.");
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    break;
            }
        }
    }

}
