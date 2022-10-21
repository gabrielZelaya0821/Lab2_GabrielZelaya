package lab2p1_gabrielzelaya;
import java.util.Scanner;

public class Lab2P1_GabrielZelaya {

    public static void main(String[] args) {
        int menu;
        Scanner input = new Scanner(System.in);
        System.out.println("(1) Índice Académico (2) ¡Ok Bommer! (3) ¡Gotta Know Them All! (4) Salir");
        menu = input.nextInt();
        while (menu != 4) {
            if (menu == 1){
                System.out.println("ingrese dos números enteros positivos:");
                int a = input.nextInt();
                System.out.print("");
                int b = input.nextInt();
                int mcd;
                while (a != b) {
                   while (a > b) {
                        a -= b;
                    }
                   while (a < b) {
                        b -= a;
                    }
               }
                mcd = a;
                System.out.println("El mcd es: " + mcd);
                System.out.println("(1) Índice Académico (2) ¡Ok Bommer! (3) ¡Gotta Know Them All! (4) Salir");
                menu = input.nextInt();
            } else if (menu == 2){ 
                System.out.println("Ingrese su año de nacimiento:"); 
                int año = input.nextInt();
                if (año >= 2013) {
                    System.out.println("Usted pertenece a la generación 'Gen Alpha' ");
                } else if (año > 1994) {
                    System.out.println("Usted pertenece a la generación 'Gen Z' ");
                } else if (año > 1985) {
                    System.out.println("Usted pertenece a la generación 'Millenials' ");
                } else if (año > 1979) {
                    System.out.println("Usted pertenece a la generación 'Xennials' ");
                } else if (año > 1964) {
                    System.out.println("Usted pertenece a la generación 'Gen X' ");
                }else {
                    System.out.println("Usted pertenece a la generación 'Baby Boomer Gen' ");
                }
                System.out.println("(1) Índice Académico (2) ¡Ok Bommer! (3) ¡Gotta Know Them All! (4) Salir");
                menu = input.nextInt();
            } else {
                System.out.println("Tipos de Pokemón: Fairy, Fighting, Steel, Psychic");
                System.out.println("Ingrese su tipo de atacante:");
                input.nextLine();
                String atacante = input.nextLine();
                System.out.print("");
                System.out.println("Ingrese su tipo de defensor:");
                String defensor = input.nextLine();
                System.out.print("");
                if (atacante.equals("Fairy") && defensor.equals("Fairy")){
                    System.out.println("El tipo Fairy es neutral contra el tipo Fairy");
                } else if (atacante.equals("Fairy") && defensor.equals("Fighting")){
                    System.out.println("El tipo Fairy es super eficaz contra el tipo Fighting");
                } else if (atacante.equals("Fairy") && defensor.equals("Steel")){
                    System.out.println("El tipo Fairy es debil contra el tipo Steel");
                } else if (atacante.equals("Fairy") &&  defensor.equals("Psychic")) {
                    System.out.println("El tipo Fairy es neutral contra el tipo Psychic");
                } else if (atacante.equals("Steel") && defensor.equals("Fairy")) {
                    System.out.println("El tipo Steel es super eficaz contra el tipo Fairy");
                } else if (atacante.equals("Steel") && defensor.equals("Fighting")) {
                    System.out.println("El tipo Steel es neutral contra el tipo Fighting");
                } else if (atacante.equals("Steel") && defensor.equals("Psychic")) {
                    System.out.println("El tipo Steel es neutral contra el tipo Psychic");
                } else if (atacante.equals("Steel") && defensor.equals("Steel")) {
                    System.out.println("El tipo Steel es neutro contra el tipo Steel");
                } else if (atacante.equals("Fighting") && defensor.equals("Fairy")) {
                    System.out.println("El tipo Fighting es debil contra el tipo Fairy");
                } else if (atacante.equals("Fighting") && defensor.equals("Fighting")) {
                    System.out.println("El tipo Fighting es neutro contra el tipo Fighting");
                } else if (atacante.equals("Fighting") && defensor.equals("Psychic")) {
                    System.out.println("El tipo Fighting es debil contra el tipo Psychic");
                } else if (atacante.equals("Fighting") && defensor.equals("Steel")) {
                    System.out.println("El tipo Fighting es super eficaz contra el tipo Steel");
                } else if (atacante.equals("Psychic") && defensor.equals("Fairy")) {
                    System.out.println("El tipo Psychic es neutral contra el tipo Fairy");
                } else if (atacante.equals("Psychic") && defensor.equals("Fighting")) {
                    System.out.println("El tipo Psychic es super eficaz contra el tipo Fighting");
                } else if (atacante.equals("Psychic") && defensor.equals("Steel")) {
                    System.out.println("El tipo Psychic es debil contra el tipo Steel");
                } else if (atacante.equals("Psychich") && defensor.equals("Psychic")) {
                    System.out.println("El tipo Psychic es debil contra el tipo Psychic0");
                }
                System.out.println("(1) Índice Académico (2) ¡Ok Bommer! (3) ¡Gotta Know Them All! (4) Salir");
                menu = input.nextInt();
            }
        } System.out.println("Salir");
    } // main
} // class
