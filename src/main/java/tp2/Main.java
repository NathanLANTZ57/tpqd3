package tp2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UtilisateurTab utilisateurTab = null;
        
        System.out.println("Veuillez entrer votre adresse email:");
        while (utilisateurTab == null) {
            String email = scanner.nextLine();
            try {
                utilisateurTab = new UtilisateurTab(email);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                System.out.println("Veuillez entrer une adresse email valide:");
            }
        }

        System.out.println("Veuillez entrer la taille du tableau (maximum 50):");
        int n;
        do {
            n = scanner.nextInt();
        } while (n > 50 || n <= 0);

        System.out.println("****DEBUT PROGRAMME****");
        for (int i = 0; i < n; i++) {
            System.out.println("Veuillez entrer un nombre:");
            int number = scanner.nextInt();
            utilisateurTab.addNumber(number);
        }

        System.out.println("Les éléments du tableau sont : ");
        for (int number : utilisateurTab.getTab()) {
            System.out.println(number);
        }

        int sum = utilisateurTab.getSum();
        System.out.println("La somme des éléments est égale à " + sum);

        utilisateurTab.sortTab();
        System.out.println("Les éléments du tableau après tri sont : ");
        for (int number : utilisateurTab.getTab()) {
            System.out.println(number);
        }

        double median = utilisateurTab.getMedian();
        System.out.println("La médiane des éléments est égale à " + median);

        System.out.println("****FIN PROGRAMME****");
    }
}
