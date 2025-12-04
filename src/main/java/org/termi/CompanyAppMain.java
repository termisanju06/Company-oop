package org.termi;

import org.termi.model.Empresa;
import org.termi.readers.ReaderDepartamento;
import org.termi.readers.ReaderEmpleado;
import org.termi.readers.ReaderEmpresa;

import java.util.Scanner;

public class CompanyAppMain {
    public class CompanyApp {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            ReaderEmpleado readerEmpleado = new ReaderEmpleado(scanner);
            ReaderDepartamento readerDepartamento = new ReaderDepartamento(scanner, readerEmpleado);
            ReaderEmpresa readerEmpresa = new ReaderEmpresa(scanner, readerDepartamento);

            Empresa empresa = readerEmpresa.read();



        }
    }
}
