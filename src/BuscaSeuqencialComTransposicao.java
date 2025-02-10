public class BuscaSeuqencialComTransposicao implements Busca{
    public int buscar(int[] array, int item) {
        int i = 0;
        while (i < array.length) {
            if (array[i] == item) {
                array[i] = array[0];
                array[0] = item;

                for (i = 0; i < array.length; i++) {
                    System.out.println(array[i]);
                }
                return 0; // retorna 0 pois é a nova posição do eletemnto
            }
            i++;
        }
        return -1;
    }
}
