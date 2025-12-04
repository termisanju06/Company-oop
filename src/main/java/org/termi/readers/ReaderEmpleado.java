package org.termi.readers;

import org.termi.model.Empleado;

import java.util.Scanner;

public class ReaderEmpleado {
    private final Scanner scanner;
    private final ReaderEmpleado readerEmpleado;

    public ReaderEmpleado(Scanner scanner, ReaderEmpleado readerEmpleado) {
        this.scanner = scanner;
        this.readerEmpleado = readerEmpleado;
    }

    public Empleado read() {
        System.out.println("Dame tu nombre empleado");
        String name = scanner.nextLine();

        System.out.println("Dame tu apellido empleado");
        String surname = scanner.nextLine();

        System.out.println("Dime tu nif empleado");
        String nif = scanner.nextLine();

        System.out.println("Dime tu puesto empleado");
        String puesto = scanner.nextLine();


        return new Empleado(name, surname, nif, puesto);
    }
}
