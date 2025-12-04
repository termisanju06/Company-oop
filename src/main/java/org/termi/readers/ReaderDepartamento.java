package org.termi.readers;

import org.termi.model.Departamento;
import org.termi.model.Empleado;

import java.util.Scanner;

public class ReaderDepartamento {
    private final Scanner scanner;
    private final ReaderEmpleado readerEmpleado;

    public ReaderDepartamento(Scanner scanner, ReaderEmpleado readerEmpleado) {
        this.scanner = scanner;
        this.readerEmpleado = readerEmpleado;
    }
    public Departamento read(){
        System.out.println("Dame tu nombre de departamento");
        String name = scanner.nextLine();

        System.out.println("Dame tu presupuesto de departamento");
        int presupuesto = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Dime cuantos empleados hay");
        int a = scanner.nextInt();
        scanner.nextLine();
        Empleado[] empleados = new Empleado[a];

        for (int i = 0; i < a; i++) {
            empleados[i] = readerEmpleado.read();
        }

        return new Departamento(name,presupuesto,empleados);
    }
}

