package rocks.zipcode.io.quiz3.generics;

import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
       Integer count = 0;
       Integer positionOfOdd = 0;
       for(int i =0; i < array.length-1; i++){
           if( array[i]== array[i+1]) {
               count++;

           }
           if(count % 2 == 1){
                   positionOfOdd = i;
               }
           }

        return array[positionOfOdd];
    }

    public SomeType findEvenOccurringValue() {
        Integer count = 0;
        Integer positionOfEven = 0;
        for(int i =0; i < array.length-1; i++){
            if( array[i]== array[i+1]) {
                count++;

            }
            if(count % 2 == 0){
                positionOfEven = i;
            }
        }

        return array[positionOfEven];
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer count = 0;
        for(SomeType x : array){
            if(x == valueToEvaluate){
                count++;
            }
        }

        return count;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        return null;
    }
}
