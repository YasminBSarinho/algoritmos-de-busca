import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = {30, 20, 7, 6, 4, 12, 14, 90};
        int[] arrayOrdenada = {4, 6, 7, 12, 14, 20, 30, 90};

        Scanner scanner = new Scanner(System.in);
        System.out.println("item para buscar: ");
        int item = scanner.nextInt();

        Busca busca = new BuscaBinaria();
        busca.buscar(arrayOrdenada, item);

    }
}

