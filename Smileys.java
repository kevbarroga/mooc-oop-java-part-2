public class Smileys {
    private final String smiley = ":)";

    public static void main(String[] args) {
        printWithSmileys("*");
        printWithSmileys("**");
        printWithSmileys("***");
        printWithSmileys("****");
    }

    private static void printSmileyRow(int len) {
        for (int i = 0; i < len; i++) {
            System.out.print(this.smiley);
        }
        System.out.println();
    }

    private static void printWithSmileys(String characterString) {
        int strLen = characterString.length();

        if ((strLen+1) % 0) {
            printSmileyRow(strLen+1);
            System.out.println(smiley+" "+characterString+" "+smiley)
            printSmileyRow(strLen+1);
        } else {
            printSmileyRow(strLen+2);
            System.out.println(smiley+" "+characterString+"  "+smiley)
            printSmileyRow(strLen+2);
        }
    }
}