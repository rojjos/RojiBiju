/**
 * Created by rogi on 1/18/16.
 */
public class MathOperations {
    private int number;
    private String operationType;
    private int result;

    public boolean setNumber(int num) {
        this.number = num;
        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }

    public int getNumber() {
        return this.number;
    }

    public boolean setOperationType(String operationType) {
        this.operationType = operationType;
        if (operationType.equals("sum") || operationType.equals("product")) {
            return true;
        } else {
            return false;
        }
    }

    public String getOperationType() {
        return operationType;
    }

    public boolean performOperation() {
        if (operationType == "sum" || operationType == "Sum") {
            Sum();
            return true;
        }else if(operationType=="product"||operationType=="Product") {
            Product();
            return true;
        }else {
            return false;
        }
    }

    private void Sum() {
        result = 0;
        for (int i=1; i <= number; i++ ){
            result += i;
        }
    }

    private void Product() {
        result = 1;
        for (int i=2; i <= number; result *= i, i++);
    }

    public String getValidOperationType() {
        return "Sum or Product";
    }

    public int getResult() {
        return result;
    }
}
