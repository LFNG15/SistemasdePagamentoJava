import java.util.Scanner;

interface MetododePagamento {
    void processarPagamento(double valor);
}

class Pix implements MetododePagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento via PIX no valor de R$" + valor);
    }
}

class CartaoCredito implements MetododePagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento via Cartão de Crédito no valor de R$" + valor);
    }
}

class CartaoDebito implements MetododePagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento via Cartão de Débito no valor de R$" + valor);
    }
}

class Boleto implements MetododePagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento via Boleto no valor de R$" + valor);
    }
}

class ServicoDePagamento {
    public void realizarPagamento(MetododePagamento metodoDePagamento, double valor) {
        metodoDePagamento.processarPagamento(valor);
    }
}

public class Sistemacompleto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione o método de pagamento: ");
        System.out.println("1 - PIX");
        System.out.println("2 - Cartão de Crédito");
        System.out.println("3 - Cartão de  Débito");
        System.out.println("4 - Boleto");

        int escolha = scanner.nextInt();

        MetododePagamento metododePagamento = null;
        switch (escolha) {
            case 1:
                metododePagamento = new Pix();
                break;
            case 2:
                metododePagamento = new CartaoCredito();
                break;
            case 3:
                metododePagamento = new CartaoDebito();
                break;
            case 4:
                metododePagamento = new Boleto();
                break;
            default:
                System.out.println("Opção inválida");
        }

        if (metododePagamento != null) {
            ServicoDePagamento servicoDePagamento = new ServicoDePagamento();
        }
        scanner.close();
    }
}

