package org.termi.model;

import java.util.Arrays;
import java.util.Objects;

public class Departamento {
    private String name;
    private int presupuesto;
    private Empleado[] empleados;

    public Departamento(String name, int presupuesto, Empleado[] empleados) {
        this.name = name;
        this.presupuesto = presupuesto;
        this.empleados = empleados;
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

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Departamento that = (Departamento) o;
        return Objects.equals(name, that.name) && Objects.equals(presupuesto, that.presupuesto) && Objects.deepEquals(empleados, that.empleados);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, presupuesto, Arrays.hashCode(empleados));
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "name='" + name + '\'' +
                ", presupuesto='" + presupuesto + '\'' +
                ", Empleado=" + Arrays.toString(empleados) +
                '}';
    }
}

