import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean tentarNovamente = true;

        while (tentarNovamente) {
            try {
                System.out.println("Digite o primeiro parâmetro:");
                int parametroUm = scanner.nextInt();

                System.out.println("Digite o segundo parâmetro:");
                int parametroDois = scanner.nextInt();

                Contador contador = new Contador(parametroUm, parametroDois);
                contador.executar();

                tentarNovamente = false;

            } catch (ParametrosInvalidosException e) {
                System.out.println(e.getMessage());

                System.out.println("Deseja tentar novamente? (s/n)");
                scanner.nextLine();
                String resposta = scanner.nextLine();

                if (!resposta.equalsIgnoreCase("s")) {
                    tentarNovamente = false;
                }
            }
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}