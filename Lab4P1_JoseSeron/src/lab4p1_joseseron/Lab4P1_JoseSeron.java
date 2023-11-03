package lab4p1_joseseron;

import java.util.Scanner;

public class Lab4P1_JoseSeron {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner stringInput = new Scanner(System.in);

        System.out.println("<<<<<<<<LABORATORIO #4>>>>>>>>");

        boolean bandera1 = true, bandera2 = true, bandera3 = true, bandera4 = true, bandera5 = true;
        String palabra1 = "";

        while (bandera1) {

            System.out.println("Ingrese una opcion");
            System.out.println("1--> Inversion Especial");
            System.out.println("2--> Balanza de Cadenas");
            System.out.println("3--> Cifrado de Mensajes");
            System.out.println("4--> Salir del programa :/");
            int opcion = input.nextInt();

            switch (opcion) {
                case 1:

                    String cadenaRes = "",
                     cadena = "",
                     cadenaAct = "";
                    while (bandera2) {

                        System.out.println("");
                        System.out.println("INVERSION ESPECIAL");

                        do {
                            System.out.println("Ingrese una cadena:");
                            cadena = stringInput.nextLine();
                            cadena = cadena += ' ';

                            if (cadena.length() < 5) {
                                System.out.println("La cadena debe ser mayor a 5 caracteres");
                                bandera5 = true;
                            } else if (cadena.length() > 5) {
                                bandera5 = false;
                            }

                        } while (bandera5);

                        for (int i = 0; i < cadena.length(); i++) {
                            char caracter = cadena.charAt(i);
                            if (caracter != ' ') {
                                cadenaAct += caracter;
                            } else if (caracter == ' ') {

                                int posFinal = cadenaAct.length() - 1;
                                for (int j = posFinal; j >= 0; j--) {

                                    char caracterInv = cadenaAct.charAt(j);
                                    cadenaRes += caracterInv;

                                }

                                cadenaRes += ' ';
                                cadenaAct = "";
                            }
                           

                        }
                        System.out.println("Cadena invertida: "+cadenaRes);

                        System.out.println(palabra1);

                        System.out.println("Desea continuar? (1-SI, 2-NO)");
                        int exit1 = input.nextInt();
                        if (exit1 == 2) {
                            bandera2 = false;
                        }

                    }
                    System.out.println("");
                    break;
                case 2:
                    while (bandera3) {
                        System.out.println("");
                        System.out.println("BALANZA DE CADENAS");
                        
                        System.out.println("Ingrese la cadena 1: ");
                        String cadena1 = stringInput.nextLine();
                        System.out.println("Ingrese la cadena 2: ");
                        String cadena2 = stringInput.nextLine();
                        System.out.println("Ingrese la cadena 3: ");
                        String cadena3 = stringInput.nextLine();
                        int suma1 = 0, suma2 = 0, suma3 = 0;
                        for (int i = 0; i < cadena1.length(); i++) {
                            int caracterAscii = cadena1.charAt(i);
                            suma1 = suma1 += caracterAscii;
                        }

                        for (int i = 0; i < cadena2.length(); i++) {
                            int caracterAscii = cadena2.charAt(i);
                            suma2 = suma2 += caracterAscii;
                        }

                        for (int i = 0; i < cadena3.length(); i++) {
                            int caracterAscii = cadena3.charAt(i);
                            suma3 = suma3 += caracterAscii;
                        }

                        System.out.println("Peso cadena 1: " + suma1);
                        System.out.println("Peso cadena 2: " + suma2);
                        System.out.println("Peso cadena 3: " + suma3);

                        if (suma1 > suma2 && suma1 > suma3) {
                            System.out.println("La cadena 1 es la mas pesada");
                        } else if (suma2 > suma1 && suma2 > suma3) {
                            System.out.println("La cadena 2 es la mas pesada");
                        } else if (suma3 > suma1 && suma3 > suma2) {
                            System.out.println("La cadena 3 es la mas pesada");
                        }

                        System.out.println("Desea continuar? (1-SI, 2-NO)");
                        int exit2 = input.nextInt();
                        if (exit2 == 2) {
                            bandera3 = false;
                        }

                    }
                    System.out.println("");
                    break;
                case 3:
                    while (bandera4) {
                        System.out.println("");
                        System.out.println("CIFRADO DE MENSAJES");
                        
           
                        System.out.println("Ingrese el mensaje que desea cifrar: ");
                        String cadenaCod = stringInput.nextLine();

                        do {
                            System.out.println("Ingrese el mensaje que desea cifrar: ");
                            cadenaCod = stringInput.nextLine();
                
                        } while (cadenaCod.length() == 0);
                        String cadenaFinal = "";

                        for (int i = 0; i < cadenaCod.length(); i++) {
                            char caracterAct = cadenaCod.charAt(i);
                            int caracterActAscii = caracterAct;
                            caracterActAscii = caracterActAscii +=2;
                            char caracterfinal = (char)caracterActAscii;
                            cadenaFinal = cadenaFinal+=caracterfinal;
                            
                        }
                        System.out.println("Cadena final: " + cadenaFinal);

                        System.out.println("Desea continuar? (1-SI, 2-NO)");
                        int exit3 = input.nextInt();
                        if (exit3 == 2) {
                            bandera4 = false;
                        }

                    }
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Saliendo del programa..........");
                    bandera1 = false;
                    break;

                default:
                    System.out.println("Ingresar una opcion valida");
            }

        }
    }
}
