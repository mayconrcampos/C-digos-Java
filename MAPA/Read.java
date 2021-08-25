package MAPA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Read {

    public static String readString() { // leitura de strings
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return reader.readLine();
        } catch (IOException e) {
            return "erro";
            //throw new RuntimeException("Erro ao ler do teclado");
        }
    }

    public static int readInt() { // leitura de valores do tipo int (inteiros)
        String str = readString();
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return -1;
            //throw new RuntimeException(str + " não é um int válido");
        }
    }

    public static double readDouble() { // leitura de valores do tipo double (ponto flutuante)
        String str = readString();
        try {
            return Double.parseDouble(str);
        } catch (Exception e) {
            return 0.0;
            //throw new RuntimeException(str + " não é um double válido");
        }
    }
}

