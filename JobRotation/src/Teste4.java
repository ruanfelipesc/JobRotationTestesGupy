public class Teste4 {
//    4 - Dois veículos (um carro e um caminhão) saem respectivamente de cidades opostas pela mesma rodovia.
//    O carro de Ribeirão Preto em direção a Franca, a uma velocidade constante de 110 km/h e o caminhão de
//    Franca em direção a Ribeirão Preto a uma velocidade constante de 80 km/h. Quando eles se cruzarem na
//    rodovia, qual estará mais próximo a cidade de Ribeirão Preto?

//    IMPORTANTE:
//
//    a) Considerar a distância de 100km entre a cidade de Ribeirão Preto <-> Franca.
//    b) Considerar 2 pedágios como obstáculo e que o caminhão leva 5 minutos a mais para passar em
//    cada um deles e o carro possui tag de pedágio (Sem Parar)
//    c) Explique como chegou no resultado.
    public static void main(String[] args) {
        System.out.println("O caminhão e o carro estarão na mesma distância entre as cidades:" +
                "Chegua-se a esse resultando usando a equação horária do movimento => que calcula o espaço final" +
                "em relação ao tempo descolamento para encontrar a velocidade média no caso do caminhão somando 0,17h ao tempo decorrido" +
                "o que afeta em sua velocidade média de aproximadamente 70km/h, já para o carro é só elimnar as variáveis " +
                "econtrando seu tempo decorrido de 0,90h e o caminhão passando a ser de 1,42h." +
                "Iguala-se as equações horárias do moviemento para: equação do caminhão e equação do carro encontrando o " +
                "exato ponto em que se encontraram que foi Sf = 60,9km concluindo ser a mesma distãncia entre as cidades " +
                "dados seus respectivos referênciais ");
    }
}
