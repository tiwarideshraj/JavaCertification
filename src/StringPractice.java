import java.util.Locale;

public class StringPractice {

    public static String deleteAll(String sentance ,String word) {
        System.out.println("old String :"+sentance);
        String newString= sentance.replaceAll(word,"");
        System.out.println("new String :"+newString);
        return newString;
    }

    public static String upperLowerCase(String sentance ) {
        String upperCase= sentance.toLowerCase();
        String lowerCase= sentance.toUpperCase(Locale.ROOT);
        System.out.println("new String :"+upperCase);
        System.out.println("new String :"+lowerCase);
        return upperCase;
    }

    public static int countWord(String source ,String searchWord) {
        source=source.toLowerCase();
        searchWord=searchWord.toLowerCase();
        int index = 0,count=0;
        while (index !=-1){
            index= source.indexOf(searchWord ,index);
            if (index!=-1){
                count++;
            }
            if (index==-1){
                break;
            }
            if (index<source.length()-1)
                index++;
        }
        /*int noOfWord=source.indexOf(searchWord);
        System.out.println(noOfWord);
        int noOfWord1=source.indexOf(searchWord,noOfWord+1);
        //noOfWord1=source.lastIndexOf(searchWord);
        System.out.println(noOfWord1);*/
        System.out.println(searchWord+" is reapeted "+count+" times");
        return count;
    }
}
