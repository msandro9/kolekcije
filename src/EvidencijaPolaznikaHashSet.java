import java.util.HashSet;
import java.util.Scanner;

public class EvidencijaPolaznikaHashSet {
    private HashSet<Polaznik> polaznici = new HashSet<>();

    public EvidencijaPolaznikaHashSet() {
    }

    public void unesiPolaznika(Scanner scanner) {
        System.out.println("Unesi ime:");
        String ime = scanner.nextLine();

        System.out.println("Unesi prezime:");
        String prezime = scanner.nextLine();

        System.out.println("Unesi email:");
        String email = scanner.nextLine();

        for (Polaznik polaznik : this.polaznici) {
            if (polaznik.getEmail().equals(email)) {
                System.out.println("Polaznik s tim emailom vec postoji");
                return;
            }
        }

        this.polaznici.add(new Polaznik(ime, prezime, email));
    }

    public void ispisiPolaznike() {
        for (Polaznik polaznik : this.polaznici) {
            System.out.println(polaznik);
        }
    }

    public Polaznik pretraziPolaznikePoEmailu(String email) {
        for (Polaznik polaznik : this.polaznici) {
            if (polaznik.getEmail().equals(email)) {
                return polaznik;
            }
        }

        return null;
    }
}
