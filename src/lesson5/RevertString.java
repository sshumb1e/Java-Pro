package lesson5;

public class RevertString {

    public static void main(String[] args) {
        String sentence = "ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом";
        System.out.println(revertSentence(sentence));
    }

    private static String revertSentence(String sentence) {
        String changedSentence = sentence.replace("Z", " ");
        StringBuffer string = new StringBuffer(changedSentence);
        StringBuffer newSb = new StringBuffer();
        String [] strs = string.reverse().toString().split(" ");
        for (int i = strs.length - 1;i >= 0; i--){
            newSb.append(strs[i]).append(" ");
        }
        return newSb.toString();
    }
}
