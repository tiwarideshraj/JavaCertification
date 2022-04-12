public class StringPractice {

    public static int countWord(String source ,String searchWord) {
        int noOfWord=0;
        for (int i=0;i<source.length();i++)
            noOfWord=source.indexOf(searchWord);
        System.out.println(noOfWord);
        int noOfWord1=source.lastIndexOf(searchWord);
        System.out.println(noOfWord1);
        return noOfWord;
    }
    public static String deleteAll(String sentance ,String word) {
        System.out.println("old String :"+sentance);
        String newString= sentance.replaceAll(word,"");
        System.out.println("new String :"+newString);
        return newString;
    }
}
