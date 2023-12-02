import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        String[] palabras = {"encebollado","fritada","guatita","hornado","encocado","ceviche"};
        String palabra = palabras[(int)(Math.random() * palabras.length)];
        char[] palabraAdivinada = new char[palabra.length()];
        boolean juegoTerminado = false;
        int intentos = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < palabraAdivinada.length; i++) {
            palabraAdivinada[i] = '_';
        }
        while (!juegoTerminado) {
            System.out.println("Palabra: " + String.valueOf(palabraAdivinada));
            System.out.println("Intentos restantes: " + (7 - intentos));
            System.out.println("La palabra se relaciona con platos tipicos del ecuador");
            System.out.print("Ingresa una letra: ");
            char letra = scanner.next().charAt(0);

            boolean letraAdivinada = false;
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    palabraAdivinada[i] = letra;
                    letraAdivinada = true;
                }
            }
            if (!letraAdivinada) {
                intentos++;
            }

            if (intentos >= 7) {
                System.out.println("¡Perdiste! La palabra era: " + palabra);
                juegoTerminado = true;
            } else if (String.valueOf(palabraAdivinada).equals(palabra)) {
                System.out.println("¡Ganaste! Has adivinado la palabra: " + palabra);
                juegoTerminado = true;
            }
        }
    }
}