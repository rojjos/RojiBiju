/**
 * Created by rogi on 1/16/16.
 */
public class DrumKitTestDrive {

    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.playSnare();
        d.snare =false;

        if (d.snare == true){
            d.playSnare();
        }

        d.playTopHat();
    }
}
