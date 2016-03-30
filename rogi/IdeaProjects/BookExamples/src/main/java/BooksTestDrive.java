/**
 * Created by rogi on 1/17/16.
 */
public class BooksTestDrive {
    public static void main(String[] args){

        Books[] myBooks = new Books[3];
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        int x =0;
        myBooks[0].title = "The Grapes of Java";
        myBooks[1].title = "The Java Gastsby";
        myBooks[2].title = "The Java CookBook";

        myBooks[0].author = "Bob";
        myBooks[1].author = "Sue";
        myBooks[2].author = "Ian";

        while (x< myBooks.length){
            System.out.print(myBooks[x].title + " by ");
            System.out.println(myBooks[x].author);
            x = x+1;
        }

    }

}
