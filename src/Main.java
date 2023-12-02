import java.util.Scanner;
public class Main{
    public static void main (String[] args){
        String[] palabras = {"encebollado","fritada","guatita"};
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
            System.out.println("Intentos restantes: " + (6 - intentos));
            System.out.print("Ingresa una letra: ");
            char letra = scanner.next().charAt(0);

            boolean letraAdivinada = false;
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) == letra) {
                    palabraAdivinada[i] = letra;
                    letraAdivinada = true;
                }
            }
        }
    }
}