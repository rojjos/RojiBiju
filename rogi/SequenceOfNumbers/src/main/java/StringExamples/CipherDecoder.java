package StringExamples;

/**
 * Created by rogi on 2/12/16.
 */

public class CipherDecoder {

    String s = "9 14,5,22,5,18 19,1,23 1 16,21,18,16,12,5 3,15,23";

    public String cipherDecoderDisplay(String decoder_Stg) {
        String decodedString = "";
        String cValue ="";

        for (int i = 0; i < decoder_Stg.length(); i++) {
            if (((i < decoder_Stg.length()  && deco der_Stg.charAt(i) != ' ') && decoder_Stg.charAt(i) != ',') &&
                    Integer.parseInt("" + decoder_Stg.charAt(i)) > 0 && Integer.parseInt("" + decoder_Stg.charAt(i)) < 10) {

                cValue = "" + decoder_Stg.charAt(i) + "";

                if (i < decoder_Stg.length() - 1 && (decoder_Stg.charAt(i + 1) != ' ')
                        && (decoder_Stg.charAt(i + 1) != ',')) {
                    cValue += "" + decoder_Stg.charAt(i + 1) + "";
                    i++;
                }
                decodedString += (char) (Integer.parseInt(cValue) + 96);

            } else if (i < decoder_Stg.length()  && decoder_Stg.charAt(i) == ' ') {
                decodedString += " ";
            } else if (i < decoder_Stg.length()  && decoder_Stg.charAt(i) == ',') {
//                i++;
            }
        }
        return decodedString;
    }

    public static void main(String[] args) {
        CipherDecoder cipherDecoder = new CipherDecoder();
        System.out.println(cipherDecoder.cipherDecoderDisplay(cipherDecoder.s));
    }

}
/*

    public String cipherDecoderDisplay(String decoder_Stg){
        String decodedString ="";

       for (int i = 0; i < decoder_Stg.length()-1; i++){
         if ((int)(decoder_Stg.charAt(i)) > 0 && (int)(decoder_Stg.charAt(i)) < 27
                 && decoder_Stg.charAt(i+1) != ' '){
             decodedString += (char)(decoder_Stg.toLowerCase().charAt(i)+97) +" ";
         } else if ((decoder_Stg.charAt(i+1)) == ' ' ||
                    (decoder_Stg.charAt(i+1))==',') {
             decodedString += (char)(decoder_Stg.toLowerCase().charAt(i)+97) +" ";
         }
         /*  if(decoder_Stg.charAt(i)==' '){
           decodedString += (char)decoder_Stg.charAt(i);
        }else if ()
}
        return decodedString;
        }


        */