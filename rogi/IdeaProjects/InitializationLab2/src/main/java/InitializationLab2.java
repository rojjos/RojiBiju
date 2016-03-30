import java.util.Objects;

/**
 * Created by rogi on 1/27/16.
 */
public class InitializationLab2 {


    enum RainBowColor {
        Violet, Indigo, Blue, Green, Yellow, Orange, Red
    }

    class ColorfulThing {
         RainBowColor rnbclr;

         ColorfulThing(RainBowColor rnbclr) {
            this.rnbclr = rnbclr;
         }

          public RainBowColor getColor() {
                return this.rnbclr;
              }

/*  public boolean equals(ColorfulThing c) {
    return rnbclr.equals(c.getColor());
  }

  public boolean equals(RainBowColor r) {
    return rnbclr.equals(r);
  }
*/
    }

    class ThingContainer {
          ColorfulThing[] clrfulThing;
          int containerSize;
          int currentPosition;

          ThingContainer(int arraySize) {
                clrfulThing = new ColorfulThing[arraySize];
                containerSize = arraySize;
                currentPosition = -1;
              }

          ThingContainer(ColorfulThing[] cThing) {
                containerSize = cThing.length; 
                clrfulThing = new ColorfulThing[containerSize];
                for(int i = 0; i < containerSize ; i++)
                {
                        clrfulThing[i] =   cThing[i];
                    }
                currentPosition = -1;
              }

          public void add(ColorfulThing cThing) {
                if (currentPosition < containerSize - 1) {
                      this.clrfulThing[++currentPosition] = cThing;
                    } else {
                      System.out.println("Contanier full " + cThing.getColor() + " could not be added");
                      System.out.println();
                    }
              }

          public ColorfulThing pop() {

                ColorfulThing cThing = null;

                if (currentPosition >= 0) {
                      cThing = this.clrfulThing[currentPosition];
                      this.clrfulThing[currentPosition--] = null;
                    } else {
                      System.out.println("Contanier empty");
                    }
                return cThing;
              }

          public ColorfulThing remove(RainBowColor rClr) {

                ColorfulThing cThing = null;

                for (int i = 0; i <= currentPosition; i++) {
                       if ((clrfulThing[i] != null) && (clrfulThing[i].getColor().equals(rClr))) {
                          //if ((clrfulThing[i] != null) && (clrfulThing[i].equals(rClr))) {

                            cThing = this.clrfulThing[i];
                            this.clrfulThing[i] = null;
                            break;
                          }
                    }
                return cThing;
              }

          public ColorfulThing remove(ColorfulThing cThing) {

                ColorfulThing clrThing = null;

                for (int i = 0; i <= currentPosition; i++) {
                      if ((clrfulThing[i] != null) && clrfulThing[i].getColor().equals(cThing.getColor())) {
//      if ((clrfulThing[i] != null) && clrfulThing[i].equals(cThing.getColor())) {
                            clrThing = this.clrfulThing[i];
                            this.clrfulThing[i] = null;
                            break;
                          }
                    }
                return clrThing;
              }

          public void printThings() {
                System.out.println("Total color count: " + (currentPosition + 1));
                for (int i = 0; i <= currentPosition; i++) {
                      System.out.println(clrfulThing[i].getColor());
                    }
                System.out.println();
              }
    }

    // below is the code that consumes above classes:
    public class IntializationLab2 {
          public static void main(String[] args) {
                ThingContainer tc = new ThingContainer(3);

                tc.printThings();

                ColorfulThing cft = new ColorfulThing(RainBowColor.Red);
                tc.add(cft);
                tc.printThings();

                cft = new ColorfulThing(RainBowColor.Green);
                tc.add(cft);

                cft = new ColorfulThing(RainBowColor.Yellow);
                tc.add(cft);
                tc.printThings();

                cft = new ColorfulThing(RainBowColor.Blue);
                tc.add(cft);
                tc.printThings();

                cft = tc.pop();
                System.out.println("Popped color: " + cft.getColor());

                cft = new ColorfulThing(RainBowColor.Blue);
                tc.add(cft);
                tc.printThings();

                cft = tc.pop();
                System.out.println("Popped color: " + cft.getColor());

                cft = tc.pop();
                System.out.println("Popped color: " + cft.getColor());

                cft = tc.pop();
                System.out.println("Popped color: " + cft.getColor());

                tc.printThings();

                tc.add(new ColorfulThing(RainBowColor.Blue));
                tc.add(new ColorfulThing(RainBowColor.Green));
                tc.add(new ColorfulThing(RainBowColor.Indigo));
                tc.add(new ColorfulThing(RainBowColor.Orange));
                tc.printThings();

                tc.add(new ColorfulThing(RainBowColor.Red));
                tc.add(new ColorfulThing(RainBowColor.Violete));
                tc.add(new ColorfulThing(RainBowColor.Yellow));
                tc.add(new ColorfulThing(RainBowColor.Blue));
                tc.add(new ColorfulThing(RainBowColor.Green));
                tc.add(new ColorfulThing(RainBowColor.Indigo));
                tc.printThings();

                //cft = tc.remove(RainBowColor.Blue);
                cft = tc.remove(new ColorfulThing(RainBowColor.Blue));
                System.out.println("Removed color: " + cft.getColor());

                //cft = tc.remove(RainBowColor.Indigo);
                cft = tc.remove(new ColorfulThing(RainBowColor.Indigo));
                System.out.println("Removed color: " + cft.getColor());

                cft = tc.remove(new ColorfulThing(RainBowColor.Green));
                System.out.println("Removed color: " + cft.getColor());

             }
    }

}
