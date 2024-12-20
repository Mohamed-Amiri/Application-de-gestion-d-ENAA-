import java.util.ArrayList;

public class Classe {
    private String name;
    private Formateurs formateurs; // Assuming Formateurs is another class
    private ArrayList<Apprenants> apr; // Assuming Apprenants is another class

    // Constructor
    public Classe(ArrayList<Apprenants> apr, Formateurs formateurs, String name) {
        this.apr = apr;
        this.formateurs = formateurs;
        this.name = name;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Formateurs getFormateurs() {
        return formateurs;
    }

    public void setFormateurs(Formateurs formateurs) {
        this.formateurs = formateurs;
    }

    public ArrayList<Apprenants> getApr() {
        return apr;
    }

    public void setApr(ArrayList<Apprenants> apr) {
        this.apr = apr;
    }

    // Add a single apprenant to the class
    public void addApprenant(Apprenants apprenant) {
        if (apr == null) {
            apr = new ArrayList<>();
        }
        apr.add(apprenant);
    }

    // Remove a single apprenant by object
    public void removeApprenant(Apprenants apprenant) {
        if (apr != null) {
            apr.remove(apprenant);
        }
    }

    // Override toString for a readable representation of the class
    @Override
    public String toString() {
        return "Classe{" +
                "name='" + name + '\'' +
                ", formateurs=" + formateurs +
                ", apprenants=" + apr +
                '}';
    }
}
