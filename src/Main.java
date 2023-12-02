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

    }
}