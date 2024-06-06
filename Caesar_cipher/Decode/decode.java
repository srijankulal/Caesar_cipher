package Decode;

public class decode {
    public String de(String text, int n) {
        char set[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S',
                'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            char[] txt = text.toCharArray();
            char ch = txt[i];
            if (Character.isAlphabetic(ch)) {
                for (int j = 0; j < set.length; j++) {
                    if (Character.toUpperCase(ch) == set[j]) {
                        result[i] = (Character.isUpperCase(ch)) ? set[((j - n + 26) % 26)]
                                : Character.toLowerCase(set[((j - n + 26) % 26)]);
                    }

                }
            } else {
                result[i] = ch;
            }

        }
        return new String(result);

    }
}