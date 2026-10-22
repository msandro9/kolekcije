import java.util.ArrayList;
import java.util.Scanner;

public class EvidencijaPolaznika {
    private ArrayList<Polaznik> polaznici = new ArrayList<>();

    public EvidencijaPolaznika() {
    }

    public void unesiPolaznika(Scanner scanner) {
        System.out.println("Unesi ime:");
        String ime = scanner.nextLine();

        System.out.println("Unesi prezime:");
        String prezime = scanner.nextLine();

        System.out.println("Unesi email:");
        String email = scanner.nextLine();

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
