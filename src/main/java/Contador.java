public class Contador {
    private int parametroUm;
    private int parametroDois;

    public Contador(int parametroUm, int parametroDois) {
        this.parametroUm = parametroUm;
        this.parametroDois = parametroDois;
    }

    public void executar() throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int limite = parametroDois - parametroUm;
        for (int i = 1; i <= limite; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
