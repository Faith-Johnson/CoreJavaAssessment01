package com.codedifferently.assessment.corejava.part01;

public class PredicateUtilities {
    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 2
     */
    public Boolean isEven(Integer value) {
        if (int value % 2 = 0) {
            return true;
        }
        return null;
    }

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is not a multiple of 2
     */
    public Boolean isOdd(Integer value) {
        if ( int value % 2 != 0){
            return true;
        }
        return null;
    }
    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 3
     */
    public Boolean isMultipleOf3(Integer value) {
        if(int value%3 = 0){
            return true;
        }
        return null;
    }

    /**
     *
     * @param value - the value to be evaluated
     * @param multiple - the multiple to test `value` against
     * @return true if `value` is a multiple of `multiple`
     */
    public Boolean isMultipleOfN(Integer value, Integer multiple) {
        if (int value% multiple = 0){
            return true;
        }
        return null;
    }

    /**
     * @param string - the string to be evaluated
     * @return true if `string` starts with a capital letter
     */
    public Boolean startsWithCapitalLetter(String string) {
        char cht;
        for(int i=0; i < string.length(); i++){
            cht = string.charAt(0);
            if(Character.isUpperCase(0)){
                return true;
            }
        }
        return null;
    }
}
