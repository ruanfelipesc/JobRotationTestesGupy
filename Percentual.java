public class Percentual {
    /**
     * 4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
     *
     * 	SP – R$67.836,43
     * 	RJ – R$36.678,66
     * 	MG – R$29.229,88
     * 	ES – R$27.165,48
     * 	Outros – R$19.849,53
     *
     * Escreva um programa na linguagem que desejar onde calcule o percentual de representação que
     * cada estado teve dentro do valor total mensal da distribuidora.
     *
     */
    public static void main(String[] args) {
       double[] vetor = {67836.43, 36678.66, 29229.88, 27165.48, 19849.53};
       double soma = 0.0;
       for(int i = 0; i < vetor.length; i++) {
           soma = soma + vetor[i];
       }
       System.out.println(soma);
       System.out.println("O percentual de representação do " +
                "Estado de São Paulo é de: " + ((67836.43 * 100)/soma) + "%");
       System.out.println("O percentual de representação do " +
                "Estado do Rio de Janeiro é de: " + ((36678.66 * 100)/soma) + "%");
       System.out.println("O percentual de representação do " +
                "Estado de Minas Gerais é de: " + ((29229.88 * 100)/soma) + "%");
       System.out.println("O percentual de representação do " +
                "Estado do Espirito Santos é de: " + ((27165.48 * 100)/soma) + "%");
        System.out.println("O percentual de representação do " +
                "de outros Estados é de: " + ((19849.53 * 100)/soma) + "%");
    }
}
