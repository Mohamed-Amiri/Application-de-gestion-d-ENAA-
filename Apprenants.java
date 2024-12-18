import java.util.ArrayList;

public class Apprenants  extends Personne{
   Classe classe ;
private ArrayList<Double> notes;

public Apprenants(int id , String firsName,String lastName, String  email,  Classe classe, Double notes){
    super(id, firsName, lastName, email);
    this.classe = classe;
    this.notes =notes ;


}

    public Classe getClasse() {
        return classe;
    }

    public ArrayList<Double> getNotes() {
        return notes;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public void setNotes(ArrayList<Double> notes) {
        this.notes = notes;
    }

}
