import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Digite o limite do cartão: ");
        double limit = read.nextDouble();
        CreditCard card = new CreditCard(limit);

        int exit = 1;
        while (exit != 0) {
            System.out.println("Digite a descrição da compra:");
            String description = read.next();

            System.out.println("Digite o valor da compra:");
            double price = read.nextDouble();

            Shopping shopping = new Shopping(description, price);
            boolean purchaseMade = card.purchase(shopping);

            if (purchaseMade) {
                System.out.println("Compra realizada!");
                System.out.println("Digite 0 para sair ou 1 para continuar.");
                exit = read.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
                exit = 0;
            }
        }

        System.out.println("************************************");
        System.out.println("Compras Realizadas:\n");
        Collections.sort(card.getShopping());
        for (Shopping c : card.getShopping()) {
            System.out.println(c.getDescription() + " - " + c.getPrice());
        }
        System.out.println("************************************");

        System.out.println("\nSaldo do cartão: " + card.getBalance());

    }
}
