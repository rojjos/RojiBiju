package DataValidatorPack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by rogi on 2/20/16.
 */

public class DataValidator {
    //boolean validUserName;
    /*public boolean isValidUsername(String userName){
        boolean validUserName = false;
        if (userName.length()>2 && (userName.length()<26)){
            Pattern p = Pattern.compile("[^a-z]+");
            Matcher m = p.matcher(userName);
            if(!m.find()){
                validUserName = true;
            }
        }
        return validUserName;
    }*/

    public boolean isValidUsername(String userName){
        if (userName.length() < 3 || (userName.length() > 25)){
            return false;
        }
        Pattern p = Pattern.compile("[^a-z]+");
        Matcher m = p.matcher(userName);
        return m.find();
       /* if(m.find()){
            return false;
        }
        return true;*/
    }

    public boolean isValidEnhancedUsername(String userName){
       // boolean validenhancedUsername =true;
        if (userName.length() < 3 || (userName.length() > 25)){
           return false;
        }

        Pattern p = Pattern.compile("[a-z][a-z0-9_]*");
        Matcher m = p.matcher(userName);
        return !(m.find());
        /*if(!m.find()){
            return false;
        }
        return true;*/
    }

    public static void main(String[] args) {
        DataValidator dataValidator = new DataValidator();
        String ss = "QQQ";
        System.out.println(ss + " " + ss.length() + " " + dataValidator.isValidUsername(ss));

        String ss1 = "qqqjhjuyuyuyuyyuyuyuyuyu";
        System.out.println(ss1 + " " + ss1.length() + " " + dataValidator.isValidUsername(ss1));

       /* String ss4 = "qqqjhjuyuyuyuyyuyu";
        System.out.println(ss4 + " " + ss4.length() + " " + dataValidator.isValidUsername(ss4));*/

        System.out.println("\nSecond method");
        String ss2 = "a265656gffgfgfg__fgfgfgfg";
        System.out.println(ss2 + " " + ss2.length() + " " + dataValidator.isValidEnhancedUsername(ss2));
    }

}
