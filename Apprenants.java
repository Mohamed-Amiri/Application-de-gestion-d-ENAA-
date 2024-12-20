import java.util.ArrayList;
import java.util.*;

public class Apprenants extends Personne {
    private Classe classe;
    private ArrayList<Double> notes=new ArrayList<>();

    // Constructor
    public Apprenants(int id, String firstName, String lastName, String email, Classe classe, ArrayList<Double> notes) {
        super(id, firstName, lastName, email);
        this.classe = classe;
        this.notes = notes;
    }

    // Getter for Classe
    public Classe getClasse() {
        return classe;
    }

    // Setter for Classe
    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    // Getter for Notes
    public ArrayList<Double> getNotes() {
        return notes;
    }

    // Setter for Notes
    public void setNotes(ArrayList<Double> notes) {
        this.notes = notes;
    }

    // Method to add a note to the notes list
    public void addNote(double note) {
        if (notes == null) {
            notes = new ArrayList<>();
        }
        notes.add(note);
    }

    // Method to calculate average grade
    public double calculateAverage() {
        if (notes == null || notes.isEmpty()) {
            return 0.0;
        }
        double sum = 0.0;
        for (double note : notes) {
            sum += note;
        }
        return sum / notes.size();
    }

    // Overriding abstract method from Personne class
    @Override
    public void displayRole() {
        System.out.println("Role: Apprenant");
    }

    // Overriding toString method for better object representation
    @Override
    public String toString() {
        return "Apprenants{" +
                "id=" + getId() +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", classe=" + (classe != null ? classe.getName() : "No Class") +
                ", notes=" + notes +
                '}';
    }
    public  Apprenants ajouterApprenant(Classe classe) {
        Scanner scanner = new Scanner(System.in);

        // Input details for the new apprenant
        System.out.println("Enter Apprenant ID:");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline

        System.out.println("Enter First Name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter Last Name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter Email:");
        String email = scanner.nextLine();

//        ArrayList<Double> notes = new ArrayList<>();
        while (true) {
            System.out.println("Enter a note (or type -1 to stop):");
            double note = scanner.nextDouble();
            if (note == -1) break;
            notes.add(note);
        }

        // Create and return the new apprenant
        return new Apprenants(id, firstName, lastName, email, classe, notes);
    }

    public void modifierApprenant(int id,String firstName, String lastName, String email) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);

        System.out.println("Apprenant details have been updated:");

    }

}

