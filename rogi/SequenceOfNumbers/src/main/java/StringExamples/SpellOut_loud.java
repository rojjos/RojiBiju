package StringExamples;

/**
 * Created by rogi on 2/11/16.
 */
public class SpellOut_loud {
    String stringToSpellOut = "I never saw a purple cow ";

    public String spellOutDisplay(String spellOutStg){
        String spelledItOut ="";

        String spellOutStg11 = spellOutStg.toUpperCase();

        for( int i = 0; i < spellOutStg11.length()-1; i++) {

                if (Character.isLetter(spellOutStg11.charAt(i)) && (spellOutStg11.charAt(i+1)!=' ')){
                    spelledItOut += spellOutStg11.charAt(i)+"-";}

                else if (spellOutStg11.charAt(i+1)==' '){
                    spelledItOut += spellOutStg11.charAt(i) +" ";}
            }

        return spelledItOut;
    }

    public static void main(String[] args) {
        SpellOut_loud spellOut = new SpellOut_loud();
        System.out.println(spellOut.spellOutDisplay(spellOut.stringToSpellOut));
    }

}
