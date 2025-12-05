package org.termi.apps;


import org.termi.model.Empresa;
import org.termi.readers.ReaderEmpresa;

import java.util.Scanner;

public class CompanyApp {
    private final ReaderEmpresa readerEmpresa;

    public CompanyApp(ReaderEmpresa readerEmpresa) {

        this.readerEmpresa = readerEmpresa;

    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        Empresa empresa = readerEmpresa.read();


        int a = 0;
        do {
            menu();
            a = scanner.nextInt();
            scanner.nextLine();
            if (a == 1) {
                System.out.println("Dame el nombre de un departamento");
                String name = scanner.nextLine();

                if (empresa.hasDepartment(name)) {
                    empresa.showInfoDepartamentoEmpresa(name);
                } else {
                    System.out.println("El nombre no coincide o no existe");
                }
            }
            if (a == 2) {
                System.out.println("Dame el nombre de un departamento");
                String name = scanner.nextLine();

                if (empresa.hasDepartment(name)) {
                    empresa.showEmpleadosDepartamento();
                } else if (name == null) {
                    System.out.println("El nombre no coincide o no existe");
                } else {
                    System.out.println("Error inesperado");
                }
            }
            if (a == 3) {
                System.out.println("Dame el nombre de un departamento");
                String name = scanner.nextLine();

                if (empresa.findDepartamentoName(name).getName().equals(name)) {
                    System.out.println("Dame el nif de un empleado en ese departamento");
                    String nif = scanner.nextLine();

                    if (empresa.hasDepartment(name) && empresa.hasEmpleadoNif(nif)) {
                        empresa.showInfoEmpleadoEmpresaNif(nif, name);
                    } else if (nif == null) {
                        System.out.println("El nombre no coincide o no se encuentra el empleado de departamento");
                    } else {
                        System.out.println("Error inesperado");
                    }

                } else if (name == null) {
                    System.out.println("El nombre de departamento no coincide o no existe");
                } else {
                    System.out.println("Error inesperado");
                }
            }

        } while (a != 4);

    }

    private static void menu() {
        System.out.println("Dime un número del 1 al 4");
        System.out.println("1. Mostrar datos de un departamento");
        System.out.println("2. Mostrar empleados de un departamento");
        System.out.println("3. Mostrar un empleado concreto a traves de su departamento y nif");
        System.out.println("4. Adios");
    }

}
