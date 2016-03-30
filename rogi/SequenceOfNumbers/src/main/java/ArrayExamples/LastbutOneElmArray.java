package ArrayExamples;

/**
 * Created by rogi on 2/10/16.
 */
public class LastbutOneElmArray extends AStringArray{

    public String lastButOneElement(String[] lastButOneArr) {
        String lastButOneElm = "";
        for (int i = 0;i<=lastButOneArr.length-1;i++){
            if (lastButOneArr.length-1 ==i){
                lastButOneElm = lastButOneArr[i-1];
            }
        }
        return lastButOneElm;
    }
}
