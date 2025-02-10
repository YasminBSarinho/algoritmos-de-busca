public class BuscaBinaria implements Busca {
    @Override
    public int buscar(int[] array, int item) {

        int inicio = 0;
        int fim = array.length - 1;
        int tentativas = 0;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            tentativas++;
            if (array[meio] == item) {
                System.out.println("Elemento encontrado na posicao " + meio);
                return meio;
            }
            if (item > array[meio]) { //cointinua do lado direito do array
                System.out.println("Busca continua na direita ");
                inicio = meio + 1;
            }
            if (item < array[meio]) {
                System.out.println("Busca continua na esquerda ");
                fim = meio - 1;
            }

            System.out.println("tentativas: " + tentativas);
        }

        System.out.println("Elemento não encontrado.");
        return -1;
    }
}
