public  class BuscaSquencial implements Busca {

    public int buscar(int[] array, int item){
        for (int i = 0; i <= array.length - 1; i++){
            if (array[i] == item){
                System.out.println("esta na posição: " + i);
                return i;
            }
        }
        System.out.println("nao esta no array");
        return -1;
    }
}
