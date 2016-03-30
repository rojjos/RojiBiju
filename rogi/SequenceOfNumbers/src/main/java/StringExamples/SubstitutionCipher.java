package StringExamples;

/**
 * Created by rogi on 2/11/16.
 */
public class SubstitutionCipher {

        String s = "Hello World";

        public String cipherSubstitutionDisplay(String cipherSub) {
            String cipherValue = "";
            String cipherSubtoLowerCase = cipherSub.toLowerCase();

            for (int i = 0; i < cipherSubtoLowerCase.length()  ; i++) {
                if ((int) cipherSubtoLowerCase.charAt(i) > 96 && (int) cipherSubtoLowerCase.charAt(i) < 123) {
                    cipherValue += (int) cipherSubtoLowerCase.charAt(i) - 96;
                    if ((i < cipherSubtoLowerCase.length()-1)  &&  (cipherSubtoLowerCase.charAt(i + 1) != ' '))
                    {
                        cipherValue += ",";
                    }
                } else if (cipherSubtoLowerCase.charAt(i) == ' ') {
                    cipherValue += " ";
                }
            }
            return cipherValue;
        }

        public static void main(String[] args) {
            SubstitutionCipher substitutionCipher = new SubstitutionCipher();
            System.out.println(substitutionCipher.cipherSubstitutionDisplay(substitutionCipher.s));
        }

    }


