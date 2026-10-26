import java.util.HashMap;
import java.util.Scanner;

public class EvidencijaPolaznikaHashMap {
    private HashMap<String, Polaznik> polaznici = new HashMap<>();

    public void EvidencijaPolaznikaHashSet() {
    }

    public void unesiPolaznika(Scanner scanner) {
        System.out.println("Unesi ime:");
        String ime = scanner.nextLine();

        System.out.println("Unesi prezime:");
        String prezime = scanner.nextLine();

        System.out.println("Unesi email:");
        String email = scanner.nextLine();

        if (this.polaznici.get(email) != null) {
            System.out.println("Polaznik s tim emailom vec postoji");
            return;
        }

        this.polaznici.put(email, new Polaznik(ime, prezime, email));
    }

    public void ispisiPolaznike() {
        for (Polaznik polaznik : this.polaznici.values()) {
            System.out.println(polaznik);
        }
    }

    public Polaznik pretraziPolaznikePoEmailu(String email) {
        return this.polaznici.get(email);
    }
}
