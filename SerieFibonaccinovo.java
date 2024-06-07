public class SerieFibonaccinovo {
    public static void main(String[] args) {
        int termoAtual = 0;
        int proximoTermo = 1;

        System.out.println("Série de Fibonacci até que o valor seja maior que 500:");

        // Loop para gerar e exibir a série de Fibonacci até que o valor seja maior que 500
        while (termoAtual <= 500) {
            System.out.print(termoAtual + " ");

            int temp = termoAtual + proximoTermo;
            termoAtual = proximoTermo;
            proximoTermo = temp;
        }
    }
}

