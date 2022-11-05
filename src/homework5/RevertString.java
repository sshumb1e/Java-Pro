package homework5;

public class RevertString {

    public static void main(String[] args) {
//   Revert and replace v.1
       String sentence = "ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом";
       for (String word: sentence.split("Z")) {
           System.out.print(new StringBuffer(word).reverse() + " ");
       }

        System.out.println("\n" + revertSentence());
    }


//    Revert and replace v.2
    private static String revertSentence() {
        String sentence1 = "ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом";
        String changedSentence = sentence1.replace("Z", " ");
        StringBuffer string = new StringBuffer(changedSentence);
        StringBuffer newSb = new StringBuffer();
        String[] strs = string.reverse().toString().split(" ");
        for (int i = strs.length - 1; i >= 0; i--) {
            newSb.append(strs[i]).append(" ");
        }
        return newSb.toString();
    }
}
