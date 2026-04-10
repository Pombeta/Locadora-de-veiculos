import java.util.Scanner;

public class Locadora {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("BEM VINDO A LOCADORA");
        System.out.println("PARA PODERMOS PROSSEGUIR PRECISAMOS QUE VOCE RESPONDA ALGUMAS PERGUNTAS");
        System.out.println("=======================================");
        System.out.println("Digite o seu nome:");
        String nome = sc.nextLine();
        System.out.println("Me informe sua idade:");
        int idade = sc.nextInt();
     System.out.println("Me informe a sua renda:");
        double renda = sc.nextDouble();
        System.out.println("Podemos prosseguir com a simulação? S/N");
        sc.nextLine(); // limpa o ENTER
        String resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("S")) {
            String carro = "";
            double valor = 0;
            int km = 0;

            if (renda >= 1000 && renda < 2000) {
                carro = "Celta";
                valor = 1500;
                km = 50000;

            } else if (renda >= 2000 && renda < 3500) {
                carro = "Etios";
                valor = 2300;
                km = 35000;

            } else if (renda >= 3500 && renda < 5000) {
                carro = "HB20";
                valor = 3700;
                km = 15000;

            } else if (renda >= 5000) { //ultima variavel
                carro = "Civic";
                valor = 50000;
                km = 1000;

            } else {
                System.out.println("Infelizmente nossos serviços estão indisponíveis para você.");
            }
            if (!carro.isEmpty()) { // valor do resultado
                System.out.println("=== SUGESTÃO ===");
                System.out.println("Carro: " + carro);
                System.out.println("Valor: " + valor);
                System.out.println("Km: " + km);
            }
        } else {
            System.out.println("Simulação cancelada.");
        }
        sc.close();
    }
}