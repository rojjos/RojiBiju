/**
 * Created by rogi on 1/16/16.
 */
public class DVDPlayerTestDtrive {

    public static void main(String[] args) {
        DVDPlayer d =new DVDPlayer();
        d.canRecord = true;
        d.playDVD();

        if (d.canRecord == true){
            d.recordDVD();
        }
    }
}
