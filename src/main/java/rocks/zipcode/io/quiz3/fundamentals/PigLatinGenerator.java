package rocks.zipcode.io.quiz3.fundamentals;


import static rocks.zipcode.io.quiz3.fundamentals.VowelUtils.isVowel;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        StringBuilder pigString = new StringBuilder();
        if(isVowel(str.charAt(0))){
            pigString.append(str).append("way");
        }else if(!isVowel(str.charAt(0))){
            pigString.append(str.substring(1,str.length())).append(str.charAt(0)).append("ay");
        }
        return pigString.toString();
    }
}
