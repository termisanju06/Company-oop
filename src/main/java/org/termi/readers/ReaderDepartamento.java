package org.termi.readers;

import org.termi.model.Departamento;
import org.termi.model.Empleado;

import java.util.Scanner;

public class ReaderDepartamento {
    private final Scanner sc;
    private final ReaderEmpleado readerEmpleado;

    public ReaderDepartamento(Scanner sc, ReaderEmpleado readerEmpleado) {
        this.sc = sc;
        this.readerEmpleado = readerEmpleado;
    }
    public Departamento read(){
        System.out.println("Dame tu nombre de departamento");
        String name = sc.nextLine();

        System.out.println("Dame tu presupuesto de departamento");
        int presupuesto = sc.nextInt();
        sc.nextLine();

        System.out.println("Dime cuantos empleados hay");
        int a = sc.nextInt();
        sc.nextLine();
        Empleado[] empleados = new Empleado[a];

        for (int i = 0; i < a; i++) {
            empleados[i] = readerEmpleado.read();
        }

        return new Departamento(name,presupuesto,empleados);
    }
}

