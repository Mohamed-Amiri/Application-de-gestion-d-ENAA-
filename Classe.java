import java.util.ArrayList;

public class Classe {
    private String  name;
   Formateurs formateurs;
 ArrayList<Apprenants> apr ;



    public Classe(ArrayList<Apprenants> apr, Formateurs formateurs, String name) {
        this.apr = apr;
        this.formateurs = formateurs;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFormateurs(Formateurs formateurs) {
        this.formateurs = formateurs;

    }

    public Formateurs getFormateurs() {
        return formateurs;
    }

    public void setApr(ArrayList<Apprenants> apr) {
        this.apr = apr;
    }

    public ArrayList<Apprenants> getApr() {
        return apr;
    }
}
