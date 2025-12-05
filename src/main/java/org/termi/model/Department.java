package org.termi.model;

import java.util.Arrays;
import java.util.Objects;

public class Department {
    private String name;
    private int presupuesto;
    private Employes[] employes;

    public Department(String name, int presupuesto, Employes[] employes) {
        this.name = name;
        this.presupuesto = presupuesto;
        this.employes = employes;
    }

    public void showInfoDepartamento(){
        System.out.println("Nombre " + name + " presupuesto " + presupuesto);
        for (int i = 0; i < employes.length; i++) {
            System.out.println(employes[i]);
        }
    }

    public Employes findEmpleadoNif(String nif){
        for (var empleado: employes){
            if (empleado.getNif().equals(nif)){
                return empleado;
            }
        }
        return null;
    }

    public boolean hasEmpleadoNif(String nif){
        for (var empleado: employes){
            if (empleado.getNif().equals(nif)){
                return true;
            }
        }
        return false;
    }

    public void showEmpleados(){
        for (var empleados: employes){
            empleados.showInfoeEmpleado();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Employes[] getEmployes() {
        return employes;
    }

    public void setEmployes(Employes[] employes) {
        this.employes = employes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(name, that.name) && Objects.equals(presupuesto, that.presupuesto) && Objects.deepEquals(employes, that.employes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, presupuesto, Arrays.hashCode(employes));
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "name='" + name + '\'' +
                ", presupuesto='" + presupuesto + '\'' +
                ", Empleado=" + Arrays.toString(employes) +
                '}';
    }
}

