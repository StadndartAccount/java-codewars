public class Solution {

    public static Object[] longestRepetition(String s) {
        int maxLength = 0;
        String maxChar = "";

        if (s.length() < 1) return new Object[]{maxChar, maxLength};

        int counter = 0;
        String currentChar = s.substring(0, 1);

        for(int i = 0; i < s.length(); i++) {
            String tempChar = s.substring(i, i + 1);
            if(currentChar.equals(tempChar)) {
                counter++;
            } else {
                counter = 1;
                currentChar = tempChar;
            }

            if( maxLength < counter ) {
                maxChar = currentChar;
                maxLength = counter;
            }
        }

        return new Object[]{maxChar, maxLength};
    }
}