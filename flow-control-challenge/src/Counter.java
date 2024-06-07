import java.util.Scanner;

public class Counter {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parameterOne = scan.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parameterTwo = scan.nextInt();

        scan.close();

        try {
            //chamando o método contendo a lógica de contagem
            count(parameterOne, parameterTwo);

        } catch (InvalidParametersException exception) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(exception.getMessage());
        }

    }

    /**
     * @param parameterOne
     * @param parameterTwo
     * @throws InvalidParametersException
     */
    static void count(int parameterOne, int parameterTwo) throws InvalidParametersException {
        // validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parameterOne > parameterTwo) {
            throw new InvalidParametersException("A primeira entrada deve ser menor que a segunda");
        }

        int count = parameterTwo - parameterOne;
        // realizar o for para imprimir os números com base na variável contagem
        for (int i = 0; i < count; i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        }

    }
}
