package entities;

public class Employee {
    private int id ;
    private String name ;
    private String surname ;
    private String department ;
    private String grade;
    public Employee() {}
    public Employee(int id, String name, String surname, String department, String grade) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.grade = grade;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return this.name.equals(employee.getName()) && this.id == employee.getId();
    }


    @Override
    public String toString() {
        return "Employe{id=" + id + ", nom='" + name + "', prenom='" + surname + "', nomDepartement='" + department + "', grade=" + grade + '}';
    }
}