package org.termi.model;

import java.util.Objects;

public class Empleado {
    private String name;
    private String surname;
    private String nif;
    private String puesto;

    public Empleado(String name, String surname, String nif, String puesto) {
        this.name = name;
        this.surname = surname;
        this.nif = nif;
        this.puesto = puesto;
    }

    public void showInfoeEmpleado(){
        System.out.println("nombre " + name + " apellido " + surname);
        System.out.println("nif " + nif + " puesto " + puesto);
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

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(name, empleado.name) && Objects.equals(surname, empleado.surname) && Objects.equals(nif, empleado.nif) && Objects.equals(puesto, empleado.puesto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, nif, puesto);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nif='" + nif + '\'' +
                ", puesto='" + puesto + '\'' +
                '}';
    }
}
