package ArrayExamples;

/**
 * Created by rogi on 2/10/16.
 */
public class ConsecutiveDuplicates {
    int[] nums = {1, 1, 3, 3, 3, 2, 2, 2, 1, 1, 1, 1, 4, 4, 4, 4};

    public String consecutiveDuplicateDisplay(int[] numberArray) {
        String consecutiveDupElement = "";
        for (int i = 0; i < numberArray.length - 1; i++) {
            if (numberArray[i] == numberArray[i + 1]) {
                consecutiveDupElement += numberArray[i] + "\n";
                for (; i < numberArray.length - 1; i++) {
                    if (numberArray[i + 1] != numberArray[i]) {
                        break;
                    }
                }
            }

        }
        return consecutiveDupElement;
    }

  /*  public static void main(String[] args) {
        ConsecutiveDuplicates consecutiveDuplicates = new ConsecutiveDuplicates();
        System.out.println(consecutiveDuplicates.consecutiveDuplicateDisplay(consecutiveDuplicates.nums));


    }*/
}