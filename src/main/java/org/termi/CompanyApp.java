package org.termi;

import org.termi.model.Empresa;
import org.termi.readers.ReaderDepartamento;
import org.termi.readers.ReaderEmpleado;
import org.termi.readers.ReaderEmpresa;

import java.util.Scanner;

public class CompanyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ReaderEmpleado readerEmpleado = new ReaderEmpleado(scanner);
        ReaderDepartamento readerDepartamento = new ReaderDepartamento(scanner,readerEmpleado);
        ReaderEmpresa readerEmpresa = new ReaderEmpresa(scanner,readerDepartamento);
        Empresa empresa = readerEmpresa.read();
        do {
            menu();
            int a = scanner.nextInt();
            scanner.nextLine();

        } while ();

    }


    public static void menu(){
        System.out.println("1. Nombre de departamento = mostrar sus datos");
        System.out.println("2. Nombre de departamento = mostrar sus empleados");
        System.out.println("3. Nombre de departamento + nif = mostrar datos del empleado del departamento indicado");
    }
}
