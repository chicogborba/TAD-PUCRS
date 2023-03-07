import java.util.Scanner;
import java.util.Arrays;

public class Vetor {
  private int[] numbers;

  public void getInput() {
    Scanner input = new Scanner(System.in);
    System.out.println("Escolha o tamanho do vetor: ");
    int size = input.nextInt();
    numbers = new int[size];
    for (int i = 0; i < size; i++) {
      System.out.println("Selecione o " + (i + 1) + "º numero :");
      numbers[i] = input.nextInt();
    }
    input.close();
  }

  public void printVector() {
    System.out.print(Arrays.toString(numbers));
  }

  public int[] getBiggerNumberIndex() {
    int biggerNumber = numbers[0];
    int biggerNumberIndex = 0;

    for (int i = 0; i < numbers.length; i++) {
      if (i != 0) {
        biggerNumber = numbers[i];
        biggerNumberIndex = i;
      } else {
        if (numbers[i] > biggerNumber) {
          biggerNumber = numbers[i];
          biggerNumberIndex = i;
        }
      }
    }
    return new int[] { biggerNumber, biggerNumberIndex };
  }

  public void printBiggerNumberIndex() {
    int[] biggerNumberIndex = getBiggerNumberIndex();
    System.out.println("\nO maior numero é " + biggerNumberIndex[0] + " e está na posição " + biggerNumberIndex[1]);
  }

}
