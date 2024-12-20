import java.util.ArrayList;
import java.util.Scanner;

public class Formateurs extends Personne{
    private String Specialite;
    private Double Salaire; // Assuming Formateurs is another class
    private Classe classe; // Assuming Apprenants is another class
     ArrayList<Formateurs> f = new ArrayList<>();
    public Formateurs(int id, String firstName, String lastName, String email, String specialite, Double salaire, Classe classe) {
        super(id, firstName, lastName, email);
        Specialite = specialite;
        Salaire = salaire;
        this.classe = classe;
    }
// Constructor


    // Getters and Setters

    public String getSpecialite() {
        return Specialite;
    }

    public void setSpecialite(String specialite) {
        Specialite = specialite;
    }

    public Double getSalaire() {
        return Salaire;
    }

    public void setSalaire(Double salaire) {
        Salaire = salaire;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    @Override
    public void displayRole() {

    }

    @Override
    public String toString() {
        return "Formateurs{" +
                "Specialite='" + Specialite + '\'' +
                ", Salaire=" + Salaire +
                ", classe=" + classe +
                '}';
    }
    public void ajouterFormateur(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Formatuer ID:");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter First Name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter Last Name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter Email:");
        String email = scanner.nextLine();

        System.out.println("Enter Specialite:");
        String Specialite = scanner.nextLine();

        System.out.println("Enter Salaire:");
        Double Salaire = scanner.nextDouble();

        Formateurs formateur = new Formateurs(id,firstName, lastName, email,Specialite, Salaire,null);
        f.add(formateur);

    }
    public void modifierFormatuers(String firstName, String lastName, String email,String Specialite,Double Salaire) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setSpecialite(Specialite);
        setSalaire(Salaire);

        System.out.println("Formatuers details have been updated:");

    }

    public void supprimerFormateur() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuilllez saisir Id de formateur :");
        int id =sc.nextInt();
        for(Formateurs fr : f) {
            if(fr.getId()==id){
                System.out.println("Formateur " + fr.getFirstName() + " " + fr.getLastName() + " has been removed.");
                f.remove(fr);

             // Remove the formateur
        } else {
            System.out.println("No formateur is currently assigned to this class.");
        }
    }
    }

}
