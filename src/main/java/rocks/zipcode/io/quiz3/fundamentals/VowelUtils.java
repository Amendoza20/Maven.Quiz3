package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        for(int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'a'
                    || word.charAt(i) == 'e'
                    || word.charAt(i) == 'i'
                    || word.charAt(i) == 'o'
                    || word.charAt(i) == 'u'){
                return true;
            }
        }

        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        Integer positionOfVowel = 0;
        for(int i = 0; i < word.length(); i++){
            if(!isVowel(word.charAt(i))) {
                positionOfVowel++ ;
            }else{
                break;
            }
            if(positionOfVowel>= word.length()){
                return -1;
            }
        }

        return positionOfVowel;
    }


    public static Boolean startsWithVowel(String word) {
        if (word.charAt(0) == 'a'
                || word.charAt(0) == 'e'
                || word.charAt(0) == 'i'
                || word.charAt(0) == 'o'
                || word.charAt(0) == 'u'
                || word.charAt(0) == 'A'
                || word.charAt(0) == 'I'
                || word.charAt(0) == 'E'
                || word.charAt(0) == 'O'
                || word.charAt(0) == 'U') {
            return true;
        }
        return false;
    }

    public static Boolean isVowel(Character character) {
        if(character == 'a'
                || character == 'e'
                || character == 'i'
                || character == 'o'
                || character == 'u'
                || character == 'A'
                || character == 'I'
                || character == 'E'
                || character == 'O'
                || character == 'U'){
            return true;
        }

        return false;
    }
}
