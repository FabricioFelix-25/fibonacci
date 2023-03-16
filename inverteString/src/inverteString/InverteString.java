package inverteString;
import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite uma palavra ou frase: ");
        String texto = scanner.nextLine();
        String textoInvertido = "";
        
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido += texto.charAt(i);
        }
        
        System.out.println("Texto invertido: " + textoInvertido);
    }
}