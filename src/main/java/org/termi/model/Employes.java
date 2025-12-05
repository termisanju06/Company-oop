package org.termi.model;

import java.util.Objects;

public class Employes {
    private String name;
    private String surname;
    private String nif;
    private String position;

    public Employes(String name, String surname, String nif, String position) {
        this.name = name;
        this.surname = surname;
        this.nif = nif;
        this.position = position;
    }

    public void showInfoeEmpleado(){
        System.out.println("nombre " + name + " apellido " + surname);
        System.out.println("nif " + nif + " puesto " + position);
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

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employes employes = (Employes) o;
        return Objects.equals(name, employes.name) && Objects.equals(surname, employes.surname) && Objects.equals(nif, employes.nif) && Objects.equals(position, employes.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, nif, position);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nif='" + nif + '\'' +
                ", puesto='" + position + '\'' +
                '}';
    }
}
