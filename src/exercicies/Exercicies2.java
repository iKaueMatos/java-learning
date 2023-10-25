package exercicies;

// Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
// números 4, 5 e 6. A soma das duas médias. A média das médias.

public class Exercicies2 {
    public static void main(String[] args) {
        int[] numbers1 = {8, 9, 7};
        int[] numbers2 = {4, 5, 6};

        double average1 = calculateAverage(numbers1);
        double average2 = calculateAverage(numbers2);

        double sumOfAverages = average1 + average2;
        double averageOfAverages = (average1 + average2) / 2;

        System.out.println("Média dos números 8, 9 e 7: " + average1);
        System.out.println("Média dos números 4, 5 e 6: " + average2);
        System.out.println("Soma das duas médias: " + sumOfAverages);
        System.out.println("Média das médias: " + averageOfAverages);
    }

    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }
}

