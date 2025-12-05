package org.termi;

import org.termi.readers.ReaderDepartamento;
import org.termi.readers.ReaderEmpleado;
import org.termi.readers.ReaderEmpresa;
import org.termi.apps.CompanyApp;

import java.util.Scanner;

public class CompanyAppMain {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            ReaderEmpleado readerEmpleado = new ReaderEmpleado(scanner);
            ReaderDepartamento readerDepartamento = new ReaderDepartamento(scanner, readerEmpleado);
            ReaderEmpresa readerEmpresa = new ReaderEmpresa(scanner, readerDepartamento);
            CompanyApp companyApp = new CompanyApp(readerEmpresa);

            companyApp.run();

        }

}
