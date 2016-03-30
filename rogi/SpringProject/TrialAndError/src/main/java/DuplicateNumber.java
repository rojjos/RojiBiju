import java.util.ArrayList;
import java.util.List;

/**
 * Created by rogi on 3/17/16.
 */
public class DuplicateNumber {

        public int findDuplicateNumber(List<Integer> numbers){

            int highestNumber = numbers.size() - 1;
            int total = getSum(numbers);
            int duplicate = total - (highestNumber*(highestNumber+1)/2);
            return duplicate;
        }

        public int getSum(List<Integer> numbers){

            int sum = 0;
            for(int num:numbers){
                sum += num;
            }
            return sum;
        }

        public static void main(String a[]){
            List<Integer> numbers = new ArrayList<Integer>();
            for(int i=1;i<11;i++){
                numbers.add(i);
            }
            //add duplicate number into the list


            DuplicateNumber dn = new DuplicateNumber();
            numbers.add(11);
            System.out.println("Duplicate Number: "+dn.findDuplicateNumber(numbers));
        }
    }
