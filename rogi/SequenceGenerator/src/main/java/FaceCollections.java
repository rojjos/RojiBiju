import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by rogi on 2/8/16.
 */
public class FaceCollections {

    /* FaceCollections(){
        ArrayList<String> emojis;// = new ArrayList<String>(30);
    }*/

  /* ArrayList<String> emojis = new ArrayList<String>(Arrays.asList("ʘ‿ʘ","(⊙_☉)","ლ(=ↀωↀ=)ლ","V●ᴥ●V",
                "ʕ•̫͡•ʕ•̫͡•ʔ•̫͡•ʔ","( ⌒o⌒)人(⌒-⌒ )v","ฅ(⌯͒• ɪ •⌯͒)ฅ❣","(ﾉ◕ヮ◕)ﾉ*:・ﾟ✧","(ㆁᴗㆁ✿)",
                "｡◕‿◕｡","⸎ (@.@)!","ლ(`◉◞౪◟◉‵ლ)","Ƹ̵̡Ӝ̵̨̄Ʒ","（　ﾟДﾟ）","(｡◕‿◕｡)","⊂(◉‿◉)つ",
                "ಠ‿ಠ","٩(͡๏̯͡๏۶","ఠ_ఠ"," ٩(͡๏̯͡๏)۶","✌(◕‿-)✌",""));*/

    ArrayList<String> emojis;

    private void createEmoji(){

        emojis = new ArrayList<String>(Arrays.asList("ʘ‿ʘ","(⊙_☉)","ლ(=ↀωↀ=)ლ","V●ᴥ●V",
                "ʕ•̫͡•ʕ•̫͡•ʔ•̫͡•ʔ","( ⌒o⌒)人(⌒-⌒ )v","ฅ(⌯͒• ɪ •⌯͒)ฅ❣","(ﾉ◕ヮ◕)ﾉ*:・ﾟ✧","(ㆁᴗㆁ✿)",
                "｡◕‿◕｡","⸎ (@.@)!","ლ(`◉◞౪◟◉‵ლ)","Ƹ̵̡Ӝ̵̨̄Ʒ","（　ﾟДﾟ）","(｡◕‿◕｡)","⊂(◉‿◉)つ",
                "ಠ‿ಠ","٩(͡๏̯͡๏۶","ఠ_ఠ"," ٩(͡๏̯͡๏)۶","✌(◕‿-)✌"," ✿◕ ‿ ◕✿   ❀◕ ‿ ◕❀   ❁◕ ‿ ◕❁","✌⊂(✰‿✰)つ✌"));

    }


    public String getEmojis(int index){

        return emojis.get(index);
    }
    public void setEmojis()
    {
        createEmoji();

    }

    //public static void main(String[] args) {
      //  FaceCollections faceCollections = new FaceCollections();
    }


