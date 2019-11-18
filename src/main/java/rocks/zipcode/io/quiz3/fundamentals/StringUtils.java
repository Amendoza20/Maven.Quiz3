package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char[] array = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
      array[indexToCapitalize] = Character.toUpperCase(array[indexToCapitalize]);
       for (char x : array){
           stringBuilder.append(x);
       }

      return stringBuilder.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        for (int i = 0; i < baseString.length(); i++){
            if(baseString.charAt(indexOfString) == characterToCheckFor){
                return true;
            }
        }

        return false;
    }

    public static String[] getAllSubStrings(String string) {
        List<String> subStrings = new ArrayList<>();
        for(int i = 0; i < string.length(); i++){
            for(int j =0; j <= string.length()-1; j++){
                subStrings.add(string.substring(i,j));

            }
        }


        return subStrings.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input){
        return null;
    }
}
