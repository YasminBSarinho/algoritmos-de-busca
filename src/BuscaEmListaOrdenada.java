public class BuscaEmListaOrdenada implements Busca{
    @Override
    public int buscar(int[] array, int item) {
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] >= item) {
                if (array[i] == item) {
                    System.out.println(i);
                    return i;
                } else {
                    System.out.println("Valor nao encontrado, proximo valor e maior que o valor buscado");
                    return -1;
                }
            }
        }
        System.out.println("Todo o array foi percorrido e o valor nao foi encontrado");
        return -1;
    }
}
