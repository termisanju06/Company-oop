package org.termi.apps;


import org.termi.model.Company;
import org.termi.readers.ReaderCompany;

import java.util.Scanner;

public class CompanyApp {
    private final ReaderCompany readerCompany;

    public CompanyApp(ReaderCompany readerCompany) {

        this.readerCompany = readerCompany;

    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        Company company = readerCompany.read();

        int a = 0;
        do {
            menu();
            a = scanner.nextInt();
            scanner.nextLine();
            if (a == 1) {
                opcion1(scanner, company);
            }
            if (a == 2) {
                opcion2(scanner, company);
            }
            if (a == 3) {
                opcion3(scanner, company);
            }
        } while (a != 4);

    }

    private static void opcion3(Scanner scanner, Company company) {
        System.out.println("Dame el nombre de un departamento");
        String name = scanner.nextLine();

        if (company.hasDepartment(name)) {
            System.out.println("Dame el nif de un empleado en ese departamento");
            String nif = scanner.nextLine();

            if (company.hasDepartment(name) && company.hasEmpleadoNif(nif)) {
                company.showInfoEmpleadoEmpresaNif(nif, name);
            } else if (nif == null) {
                System.out.println("El nombre no coincide o no se encuentra el empleado de departamento");
            } else {
                System.out.println("Error inesperado");
            }
        } else {
            System.out.println("Error inesperado");
        }
    }

    private static void opcion2(Scanner scanner, Company company) {
        System.out.println("Dame el nombre de un departamento");
        String name = scanner.nextLine();

        if (company.hasDepartment(name)) {
            company.showEmpleadosDepartamento(name);
        } else if (name == null) {
            System.out.println("El nombre no coincide o no existe");
        } else {
            System.out.println("Error inesperado");
        }
    }

    private static void opcion1(Scanner scanner, Company company) {
        System.out.println("Dame el nombre de un departamento");
        String name = scanner.nextLine();

        if (company.hasDepartment(name)) {
            company.showInfoDepartamentoEmpresa(name);
        } else {
            System.out.println("El nombre no coincide o no existe");
        }
    }

    private static void menu() {
        System.out.println("Dime un número del 1 al 4");
        System.out.println("1. Mostrar datos de un departamento");
        System.out.println("2. Mostrar empleados de un departamento");
        System.out.println("3. Mostrar un empleado concreto a traves de su departamento y nif");
        System.out.println("4. Adios");
    }

}
