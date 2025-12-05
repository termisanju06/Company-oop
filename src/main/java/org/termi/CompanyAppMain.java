package org.termi;

import org.termi.readers.ReaderDepartment;
import org.termi.readers.ReaderEmployes;
import org.termi.readers.ReaderCompany;
import org.termi.apps.CompanyApp;

import java.util.Scanner;

public class CompanyAppMain {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            ReaderEmployes readerEmployes = new ReaderEmployes(scanner);
            ReaderDepartment readerDepartment = new ReaderDepartment(scanner, readerEmployes);
            ReaderCompany readerCompany = new ReaderCompany(scanner, readerDepartment);
            CompanyApp companyApp = new CompanyApp(readerCompany);

            companyApp.run();

        }

}
