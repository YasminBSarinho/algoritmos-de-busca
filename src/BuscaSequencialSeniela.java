public class BuscaSequencialSeniela implements Busca{
    public int buscar(int[] array, int item){
        array[array.length - 1] = item;
        int i = 0;
        while(array[i] != item){
            i++;
            System.out.println(i);
            array[array.length - 1] = 0;
            if(i == array.length - 1){
                System.out.println("nao esta no array");
                return -1;
            }
        }
        System.out.println("esta na posição: " + i);
        return i;
    }
}
