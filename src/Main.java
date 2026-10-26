import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EvidencijaPolaznikaHashSet evidencija = new EvidencijaPolaznikaHashSet();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Unesi novog korisnika");
            System.out.println("2. Ispisi polaznike");
            System.out.println("3. Pretrazi polaznike po email adresi");
            System.out.println("4. Izlaz");
            System.out.println("Unesi odabir:");

            int odabir = Integer.parseInt(scanner.nextLine());

            switch (odabir) {
                case 1:
                    evidencija.unesiPolaznika(scanner);
                    break;

                case 2:
                    evidencija.ispisiPolaznike();
                    break;

                case 3:
                    System.out.println("Unesi email:");
                    Polaznik polaznik = evidencija.pretraziPolaznikePoEmailu(scanner.nextLine());

                    if (polaznik != null) {
                        System.out.println("Pronaden polaznik:");
                        System.out.println(polaznik);
                    } else {
                        System.out.println("Polaznik nije pronaden");
                    }
                    break;

                case 4:
                    return;

                default:
                    System.out.println("Pogresan unos");
            }

            System.out.println("--------------------------");
        }
    }
}
