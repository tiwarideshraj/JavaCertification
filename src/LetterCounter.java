import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LetterCounter {
    Map<String, Integer> CountLetter (String sentence) {
        Map<String, Integer> letterMap = new HashMap();
        for(int i = 0; i < sentence.length(); i++)
        {
            Character c = sentence.charAt(i);
            if(letterMap.containsKey(c.toString()))
            {
                int count = letterMap.get(c.toString());
                count++;
                letterMap.put(c.toString(),count);
            }
            else
            {
                letterMap.put(c.toString(),1);
            }
        }
     return letterMap;
    }

    public void printTheLetterCounts(Map <String,Integer> m)    {
        Collection<Map.Entry<String,Integer>> entrySet = m.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,Integer> entry=iterator.next();
            System.out.println(entry.getKey()+" \t : "+entry.getValue());
        }
    }
    public static void main(String []args)
    {
        LetterCounter counter = new LetterCounter();
        Map<String,Integer> letterMap = counter.CountLetter("Java, is the most most used object oriented language");
        counter.printTheLetterCounts(letterMap);
    }
}