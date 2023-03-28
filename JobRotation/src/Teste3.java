public class Teste3 {
//     3) Descubra a lógica e complete o próximo elemento:

//    a) 1, 3, 5, 7, ___
//    b) 2, 4, 8, 16, 32, 64, ____
//    c) 0, 1, 4, 9, 16, 25, 36, ____
//    d) 4, 16, 36, 64, ____
//    e) 1, 1, 2, 3, 5, 8, ____
//    f) 2,10, 12, 16, 17, 18, 19, ____
    public static void main(String[] args) {
        for(int i=1;i<=9;i=i+2){
            System.out.println(i);
        }
        System.out.println("a) 1,3,5,7,__9 é o próximo elemento");
        for(int i=2; i<=128; i=i*2){
            System.out.println(i);
        }
        System.out.println("b) 2,4,8,16,32,64,__128 é o próximo elemento");
        System.out.println("c) 0, 1, 4, 9, 16, 25, 36, ____49 é o próximo elemento");
        System.out.println("d) 4, 16, 36, 64, ___128 é o elemento");
        System.out.println("e) 1, 1, 2, 3, 5, 8, ____13 é o elemento");
        System.out.println("f) 2,10, 12, 16, 17, 18, 19, ____20 é o elemento");
    }

}
