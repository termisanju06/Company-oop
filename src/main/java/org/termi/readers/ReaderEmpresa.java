package org.termi.readers;

import org.termi.model.Departamento;
import org.termi.model.Empresa;

import java.util.Scanner;

public class ReaderEmpresa {
    private final Scanner scanner;
    private final ReaderDepartamento readerDepartamento;

    public ReaderEmpresa(Scanner scanner, ReaderDepartamento readerDepartamento) {
        this.scanner = scanner;
        this.readerDepartamento = readerDepartamento;
    }
    public Empresa read(){
        System.out.println("Dame tu nombre de empresa");
        String name = scanner.nextLine();

        System.out.println("Dame tu cif de empresa");
        String cif = scanner.nextLine();

        System.out.println("Cuantos departamentos tiene la empresa");
        int a = scanner.nextInt();
        scanner.nextLine();
        Departamento[] departamentos = new Departamento[a];

        for (int i = 0; i < a; i++) {
            departamentos[i] = readerDepartamento.read();
        }

        return new Empresa(name,cif,departamentos);
    }
}
