import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ReverterString {
//    5) Escreva um programa que inverta os caracteres de um string.
//
//    IMPORTANTE:
//
//    a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser
//    previamente definida no código;
//
//    b) Evite usar funções prontas, como, por exemplo, reverse;
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String entrada = ler.next();
        String invertido = "";
        for (int i = entrada.length() -1; i >= 0; i--) {
            invertido = invertido + entrada.charAt(i);
        }
        System.out.println("Palavra inserida foi: " + entrada + " , sua inversão é: " + invertido);
    }
}
