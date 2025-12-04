package org.termi.model;

import java.util.Arrays;
import java.util.Objects;

public class Departamento {
    private String name;
    private String presupuesto;
    private Empleado[] Empleado;

    public Departamento(String name, String presupuesto, Empleado[] empleado) {
        this.name = name;
        this.presupuesto = presupuesto;
        Empleado = empleado;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(String presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Empleado[] getEmpleado() {
        return Empleado;
    }

    public void setEmpleado(Empleado[] empleado) {
        Empleado = empleado;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Departamento that = (Departamento) o;
        return Objects.equals(name, that.name) && Objects.equals(presupuesto, that.presupuesto) && Objects.deepEquals(Empleado, that.Empleado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, presupuesto, Arrays.hashCode(Empleado));
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "name='" + name + '\'' +
                ", presupuesto='" + presupuesto + '\'' +
                ", Empleado=" + Arrays.toString(Empleado) +
                '}';
    }
}

