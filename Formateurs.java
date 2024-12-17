public class Formateurs extends Personne {
   private String  spécialité ;
   private int salair ;
   private Classe classe ;

    public Formateurs(int id, String firsName, String lastName, String email, String spécialité, int salair, Classe classe) {
        super(id, firsName, lastName, email);
        this.spécialité = spécialité;
        this.salair = salair;
        this.classe = classe;
    }

    public void setSpécialité(String spécialité) {
        this.spécialité = spécialité;
    }

    public String getSpécialité() {
        return spécialité;
    }



    public void setSalair(int salair) {
        this.salair = salair;
    }

    public int getSalair() {
        return salair;
    }
}


