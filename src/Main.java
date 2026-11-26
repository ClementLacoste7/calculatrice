import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        System.out.println("Choisis un nombre");
        double nombre = lecteur.nextDouble();
        System.out.println("Choisis un opérateur parmi +, -, * et /");
        String operateur = lecteur.next();
        double deuxiemeNombre = 0;
        double resultat = 0;
        if (operateur.equals("+") || operateur.equals("-") || operateur.equals("/") || operateur.equals("*")) {
            System.out.println("Choisis un deuxième nombre");
            deuxiemeNombre = lecteur.nextDouble();
            if (deuxiemeNombre == 0 && operateur.equals("/")) {
                System.out.println("Une division par 0 est impossible");
            } else {
                if (operateur.equals("+")) {
                    resultat = nombre + deuxiemeNombre;
                } else if (operateur.equals("-")) {
                    resultat = nombre - deuxiemeNombre;
                } else if (operateur.equals("*")) {
                    resultat = nombre * deuxiemeNombre;
                } else {
                    resultat = nombre / deuxiemeNombre;
                }
                System.out.println(resultat);
            }
        } else {
            System.out.println("Tu n'as pas saisi un opérateur autorisé");
        }
    }
}