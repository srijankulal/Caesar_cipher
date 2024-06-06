package Encode;

public class encode {
    public String en(String text, int n) {
        char set[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
                'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };// Array with all alphabet with index from 0-25
        char[] result = new char[text.length()];// char array to store result
        for (int i = 0; i < text.length(); i++) {
            char[] txt = text.toCharArray();// convert String into char array because to compare each element with index
            char ch = txt[i];
            if (Character.isAlphabetic(ch)) {// Check if it is alphabet
                // ch = Character.toUpperCase(ch);//convert all char to one case
                for (int j = 0; j < set.length; j++) {
                    if (Character.toUpperCase(ch) == set[j]) {

                        result[i] = (Character.isUpperCase(ch)) ? set[(j + n) % 26]
                                : Character.toLowerCase(set[(j + n) % 26]);
                    }

                }
            } else {
                result[i] = ch;
            }

        }
        return new String(result);// convert char array back to string

    }
}