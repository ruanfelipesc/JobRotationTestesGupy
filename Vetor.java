public class Vetor {
    /**
     * 3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa,
     * na linguagem que desejar, que calcule e retorne:
     * 	• O menor valor de faturamento ocorrido em um dia do mês;
     * 	• O maior valor de faturamento ocorrido em um dia do mês;
     * 	• Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
     * IMPORTANTE:
     * 	a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
     * 	b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser
     * 	ignorados no cálculo da média;
     *
     */
    public static void main(String[] args) {
        double[] vetor = {22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258,
                         46251.174, 11191.4722, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448,
                         18419.2614, 0.0, 0.0, 35240.1826, 43829.1667, 18235.6852, 4355.0662, 13327.1025,
                          0.0, 0.0, 25681.8318, 1718.1221,13220.495, 8414.61 };
        double menor = vetor[0];
        for(int i = 0;i<vetor.length;i++)
        {
            if (menor > vetor[i]) {
                menor = vetor[i];
            }

        }
        System.out.println("O menor valor de faturamento ocorrido em um dia do mês foi: " + menor);
        double maior = 0.0;
        for(int i = 0;i<vetor.length;i++)
        {
            if (maior < vetor[i]) {
                maior = vetor[i];
            }

        }
        System.out.println("O menor valor de faturamento ocorrido em um dia do mês foi: " + maior);

        int somaMesesComFaturamento = 0;
        for(int i = 0; i<vetor.length; i++) {
            if(vetor[i] > 0.0) {
                somaMesesComFaturamento = somaMesesComFaturamento + 1;
            }
        }
        double somaMesesFaturamento = 0.0;
        for(int i = 0; i<vetor.length; i++) {
            if(vetor[i] > 0.0) {
                somaMesesFaturamento = somaMesesFaturamento + 1;
            }
        }
        double mediaMensal = (somaMesesFaturamento/somaMesesComFaturamento);
        int somaMesesSuperiores = 0;
        for(int i = 0; i<vetor.length; i++) {
            if(vetor[i] > mediaMensal) {
                somaMesesSuperiores = somaMesesSuperiores + 1;
            }
        }
        System.out.println("Número de dias no mês em que o valor de faturamento" +
                " diário foi superior à média mensal foi: " + somaMesesSuperiores);
    }

}
