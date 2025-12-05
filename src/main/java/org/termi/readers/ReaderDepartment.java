package org.termi.readers;

import org.termi.model.Department;
import org.termi.model.Employes;

import java.util.Scanner;

public class ReaderDepartment {
    private final Scanner scanner;
    private final ReaderEmployes readerEmployes;

    public ReaderDepartment(Scanner scanner, ReaderEmployes readerEmployes) {
        this.scanner = scanner;
        this.readerEmployes = readerEmployes;
    }
    public Department read(){
        System.out.println("Dame tu nombre de departamento");
        String name = scanner.nextLine();

        System.out.println("Dame tu presupuesto de departamento");
        int presupuesto = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Dime cuantos empleados hay");
        int a = scanner.nextInt();
        scanner.nextLine();
        Employes[] employes = new Employes[a];

        for (int i = 0; i < a; i++) {
            employes[i] = readerEmployes.read();
        }

        return new Department(name,presupuesto, employes);
    }
}

