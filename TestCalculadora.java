import java.util.Scanner;

public class TestCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        while (true) {
            System.out.println("digite um numero:");
            String linha = sc.nextLine();

            try {
                num = Integer.parseInt(linha);
                System.out.println("O número é: " + num);
                break;
            } catch (Exception e) {
                System.out.println("voce digitou uma palavra");
                
            }
        }
        sc.close();
    }
}