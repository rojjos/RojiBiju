package ProductInventory;

import java.util.AbstractList;
import java.util.ArrayList;

/**
 * Created by rogi on 2/4/16.
 */
public class InventoryManager {


    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();

        Product soap= new Product();
        //
        soap.setId("soap");
        soap.setQty(25.45f);
        soap.setPrice(25.76767f);
        products.add(soap);

        Product pen= new Product();
        pen.setId("pen");
        pen.setQty(25.45f);
        pen.setPrice(12.76767f);
        products.add(pen);

        Product pencil= new Product();
        pencil.setId("Pencil");
        pencil.setQty(25.45f);
       pencil.setPrice(45.76767f);
        //adding to the array
        products.add(pencil);

        Inventory inventory = new Inventory();

            float value = inventory.sumOfInventoryProd(products);

            //System.out.println(products.get(0).getId());
            //System.out.println(products.);
            System.out.printf("$"+"%.2f",value);
        }
        }



