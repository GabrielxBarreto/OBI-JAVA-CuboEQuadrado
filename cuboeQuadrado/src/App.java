import java.util.Scanner;

public class App {
    static Scanner scan = new Scanner(System.in); 
    
    public static int calc(int a, int b){
        int qudCub = 0;
        for(int i = Math.min(a, b); i<=Math.max(a, b);i++){
            for (int j = Math.min(a, b); j <= Math.max(a, b); j++) {
                int valorQuadrado = (int)Math.pow(i, 2);
                if(valorQuadrado  ==  Math.pow(j,3)){
                    qudCub++;
                    
                }
            } 
        }
        return qudCub;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Cubo e quadrado - Fase 3, 2021");

        System.out.println("Digite o primeiro Número");

        int a = scan.nextInt();

        System.out.println("Digite o segundo Número");

        int b = scan.nextInt();
        
        System.out.println(calc(a,b));
        
        
    }
}
