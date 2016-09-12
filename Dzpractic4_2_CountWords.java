package practic.practic4;

public class Dzpractic4_2_CountWords {
    public static void main(String[] args) {
        System.out.println(count("Property Value/Return Value\n" +
                "true if the specified regions in the two String objects match according to the value of the ignoreCase flag;"+
                " false if the specified regions do not match or if offset1, offset 2, or count are invalid."));
    }

    public static boolean isLetter(char c){
        return (c>='a' && c<='z') || (c>='A' && c<='Z');
    }

    public static int count(String input) {
        int count=0;
        boolean flag = false;
        if (input.length() == 0) return 0;

        for (int i = 0; i < input.length(); i++) {
            if (isLetter(input.charAt(i))) {
                flag = true;
            } else if (flag){
                count++;
                flag = false;
            }
        }
        if (flag) {
            count++;
        }
        return count;
    }
}
