import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;

        double a = -4, b = 4;

        System.out.print("Informe o número de divisões (n): ");
        n = in.nextInt();

        if (n > 0) {
            
            double resultado = somaDeRiemann(a, b, n);
            System.out.printf("A aproximaao da área pelo método de Riemann é: %.5f cm²%n", resultado);
        } else {
            System.out.println("O número de divisões deve ser positivo.");
        }

        in.close();
    }

    
    public static double somaDeRiemann(double a, double b, int n) {
        double soma = 0.0;
        double deltaX = (b - a) / n;  

      
        for (int i = 0; i < n; i++) {
            double x_i = a + i * deltaX;  
            soma += funcao(x_i) * deltaX;  
        }

        return soma;
    }

    
    public static double funcao(double x) {
        return 2 * Math.sqrt(16 - Math.pow(x, 2));  // f(x) = 2 * sqrt(16 - x^2)
    }
}
