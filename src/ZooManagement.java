import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        int nbrCages = 20;
        String zooName = "my zoo";

        System.out.println(zooName + " comporte " + nbrCages + " cages");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        zooName = scanner.nextLine();

        System.out.print("Entrez le nombre de cages : ");
        while (!scanner.hasNextInt()) {
            System.out.println("Veuillez entrer un nombre valide pour le nombre de cages.");
            scanner.next();
        }
        nbrCages = scanner.nextInt();

        System.out.println(zooName + " comporte " + nbrCages + " cages");

        scanner.close();
    }
}
