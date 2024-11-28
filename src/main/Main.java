package main;

import entities.SocieteArrayList;
import entities.Employee;


public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employee employe1 = new Employee(1, "Dupont", "Jean", "Informatique", "a");
        Employee employe2 = new Employee(2, "Martin", "Pierre", "Ressources Humaines", "b");
        Employee employe3 = new Employee(3, "Lemoine", "Sophie", "Informatique", "f");

        societe.ajouterEmploye(employe1);
        societe.ajouterEmploye(employe2);
        societe.ajouterEmploye(employe3);

        System.out.println("Liste des employés :");
        societe.displayEmploye();

        System.out.println("\nRecherche employé avec le nom 'Dupont' : " + societe.rechercherEmploye("Dupont"));

        System.out.println("\nTrier les employés par ID :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\nTrier les employés par nom, département et grade :");
        societe.displayEmploye();

        societe.supprimerEmploye(employe2);
        System.out.println("\nAprès suppression de l'employé 'Martin' :");
        societe.displayEmploye();
    }
}