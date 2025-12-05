package org.termi.readers;

import org.termi.model.Employes;

import java.util.Scanner;

public class ReaderEmployes {
    private final Scanner scanner;


    public ReaderEmployes(Scanner scanner) {
        this.scanner = scanner;

    }

    public Employes read() {
        System.out.println("Dame tu nombre empleado");
        String name = scanner.nextLine();

        System.out.println("Dame tu apellido empleado");
        String surname = scanner.nextLine();

        System.out.println("Dime tu nif empleado");
        String nif = scanner.nextLine();

        System.out.println("Dime tu puesto empleado");
        String puesto = scanner.nextLine();


        return new Employes(name, surname, nif, puesto);
    }
}
