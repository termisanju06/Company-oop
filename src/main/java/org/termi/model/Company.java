package org.termi.model;

import java.util.Arrays;
import java.util.Objects;

public class Company {
    private String name;
    private String cif;
    private Department[] department;

    public Company(String name, String cif, Department[] department) {
        this.name = name;
        this.cif = cif;
        this.department = department;
    }
    public void showInfoEmpresa(){
        System.out.println("Nombre " + name + " cif " + cif);
        for (int i = 0; i < department.length; i++) {
            System.out.println(department[i]);
        }
    }

    public Department findDepartamentoName(String name){
        for (var departamento: department){
            if (departamento.getName().equals(name)){
                return departamento;
            }
        }
        return null;
    }

    public boolean hasDepartment(String name){
        for (var departamento: department){
            if (departamento.getName().equals(name)){
                return true;
            }
        }
        return false;
    }

    public boolean hasEmpleadoNif(String nif){
        for (var departamento: department){
            if (departamento.hasEmpleadoNif(nif)){
                return true;
            }
        }
        return false;
    }

    public void showInfoDepartamentoEmpresa(String name){
        findDepartamentoName(name).showInfoDepartamento();
    }

    public void showEmpleadosDepartamento(String name){
        for (var departamento: department){
            if (departamento.getName().equals(name)){
                departamento.showEmpleados();
            }
        }
    }

    public void showInfoEmpleadoEmpresaNif(String nif, String name){
        findDepartamentoName(name).findEmpleadoNif(nif).showInfoeEmpleado();
    }



    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public Department[] getDepartment() {
        return department;
    }

    public void setDepartment(Department[] department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(name, company.name) && Objects.equals(cif, company.cif) && Objects.deepEquals(department, company.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cif, Arrays.hashCode(department));
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "name='" + name + '\'' +
                ", cif='" + cif + '\'' +
                ", departamentos=" + Arrays.toString(department) +
                '}';
    }
}
