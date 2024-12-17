public class Main {

    public static void main(String[] args){

    Apprenants ap = new Apprenants();
    Formateurs fr = new Formateurs();

    ap.setFirstname("mohamed");

    ap.setLastname("amiri");

    ap.setEmail("rafaelvaran@com");

    ap.setPhon_number("0619860251");

    System.out.println(ap.firstname);
    System.out.println(ap.lastname);
    System.out.println(ap.email);
    System.out.println(ap.phon_number);



    fr.setId(123456);
    fr.setFirsName("");
    fr.setLastName("");
    fr.setSpécialité("");
    fr.setEmail("");
    fr.setSalair(1234567);

        System.out.println(fr.getFirsName());
        System.out.println(fr.getLastName());
        System.out.println(fr.getEmail());
        System.out.println(fr.getSpécialité());
        System.out.println(fr.getSalair());







    }

}
