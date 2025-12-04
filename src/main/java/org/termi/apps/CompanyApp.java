package org.termi.apps;



import java.util.Scanner;

public class CompanyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        menu();
        int a = scanner.nextInt();
        scanner.nextLine();
        do {

        } while (a != 4);

    }


    public static void menu(){
        System.out.println("Dime un número del 1 al 4");
        System.out.println("1. Nombre de departamento = mostrar sus datos");
        System.out.println("2. Nombre de departamento = mostrar sus empleados");
        System.out.println("3. Nombre de departamento + nif = mostrar datos del empleado del departamento indicado");
        System.out.println("4. Adios");
    }
}
