package ProductInventory;

import java.util.ArrayList;

/**
 * Created by rogi on 2/4/16.
 */
public class Inventory{
    float  sum=0;
    float total=0;

    public float sumOfInventoryProd(ArrayList<Product> prod){

        for (int i=0; i<prod.size(); i++) {
           sum = prod.get(i).getPrice() * prod.get(i).getQty();
           total += sum;
            System.out.println("Sum is :$"+sum);
    }
        return total;
    }

}
