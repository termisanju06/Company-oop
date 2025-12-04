package org.termi.readers;

import org.termi.model.Empleado;

import java.util.Scanner;

public class ReaderEmpleado {
    private final Scanner sc;
    private final ReaderEmpleado readerEmpleado;

    public ReaderEmpleado(Scanner sc, ReaderEmpleado readerEmpleado) {
        this.sc = sc;
        this.readerEmpleado = readerEmpleado;
    }

    public Empleado read() {
        System.out.println("Dame tu nombre empleado");
        String name = sc.nextLine();

        System.out.println("Dame tu apellido empleado");
        String surname = sc.nextLine();

        System.out.println("Dime tu nif empleado");
        String nif = sc.nextLine();

        System.out.println("Dime tu puesto empleado");
        String puesto = sc.nextLine();


        return new Empleado(name, surname, nif, puesto);
    }
}
