package org.termi.readers;

import org.termi.model.Department;
import org.termi.model.Company;

import java.util.Scanner;

public class ReaderCompany {
    private final Scanner scanner;
    private final ReaderDepartment readerDepartment;

    public ReaderCompany(Scanner scanner, ReaderDepartment readerDepartment) {
        this.scanner = scanner;
        this.readerDepartment = readerDepartment;
    }
    public Company read(){
        System.out.println("Dame tu nombre de empresa");
        String name = scanner.nextLine();

        System.out.println("Dame tu cif de empresa");
        String cif = scanner.nextLine();

        System.out.println("Cuantos departamentos tiene la empresa");
        int a = scanner.nextInt();
        scanner.nextLine();
        Department[] departments = new Department[a];

        for (int i = 0; i < a; i++) {
            departments[i] = readerDepartment.read();
        }

        return new Company(name,cif, departments);
    }
}
