package ArrayExamples;

/**
 * Created by rogi on 2/10/16.
 */
public class PackDuplicates {

    char[] letters ={'a','a','a','a','b','c','c','a','a','d','e','e','e','e'};

    public String  packDuplicateElements(char[] letterArray){
        String packdupElm="";
        //char fisrtElement = letterArray[0];
        for (int i=0; i < letterArray.length-1; i++){
            if (letterArray[i] == letterArray[i+1]){
                packdupElm += letterArray[i];
            }else
            { packdupElm += letterArray[i]+", ";}
        }

        return packdupElm;
    }
 /*  public static void main(String[] args) {

        PackDuplicates packDuplicates = new PackDuplicates();
        System.out.println(packDuplicates.packDuplicateElements(packDuplicates.letters));
    }*/
}

