package entities;

import interfaces.IGestion;

import java.util.*;

public class SocieteArrayList implements IGestion<Employee> {
    private ArrayList<Employee> employees;

    public SocieteArrayList() {
        employees = new ArrayList<>();
    }

    public void ajouterEmploye(Employee employee){
        employees.add(employee);
    }
    public boolean rechercherEmploye(String nom){
        for (Employee employee : employees) {
            if (employee.getName().equals(nom)){
                return true;
            }
        }
        return false;
    }
    public boolean rechercherEmploye(Employee employee){
        for (Employee e : employees) {
            if(e.equals(employee)){
                return true;
            }
        }
        return false;
    }
    public void supprimerEmploye(Employee employee){
        employees.remove(employee);
    }
    public void displayEmploye(){
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public void trierEmployeParId() {
        Collections.sort(employees, Comparator.comparingInt(Employee::getId));
    }
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getDepartment().compareTo(e2.getDepartment());
            }
        });
    }



}