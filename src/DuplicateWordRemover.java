import java.util.*;

public class DuplicateWordRemover {

    public static void main(String[] args) {
        DuplicateWordRemover remover = new DuplicateWordRemover();
        String result = remover.removeDuplicateLetters("Collections is the most important item in Java development");
        System.out.println(result);

        Set<Integer> a = new HashSet<Integer>();
        a.addAll(Arrays.asList(new Integer[] { 1, 3, 5, 7, 9 }));

        Set<Integer> b = new HashSet<Integer>();
        b.addAll(Arrays.asList(new Integer[] { 0, 2, 4, 6, 8 }));

        System.out.println("Set a: " + a);
        System.out.println("Set b: " + b);

        System.out.println("Merged Set: " + mergeSet(a, b));

        remover.Removeduplicates();
    }

    //find duplicates variable
    public String removeDuplicateLetters(String s) {
        StringBuilder output = new StringBuilder();
        Set<Character> characterSet = new HashSet<>();
        for (Character c : s.toCharArray()) {
            if (!characterSet.contains(c) || c.equals(' ')) {
                characterSet.add(c);
                output.append(c);
            }
        }
        return output.toString();
    }

    //merge list
    public static <T> Set<T> mergeSet(Set<T> a, Set<T> b)
    {
        Set<T> mergedSet = new HashSet<T>();
        mergedSet.addAll(a);
        mergedSet.addAll(b);

        return mergedSet;
    }

    // remove Duplicates
   public void Removeduplicates(){
    List<Integer> list1 = new ArrayList<Integer>();
      list1.add(100);
      list1.add(200);
      list1.add(300);
      list1.add(400);
      list1.add(400);
      list1.add(500);
      list1.add(600);
      list1.add(600);
      list1.add(700);
      list1.add(400);
      list1.add(500);
    HashSet<Integer>set = new HashSet<Integer>(list1);
    List<Integer>list2 = new ArrayList<Integer>(set);
      System.out.println("List after removing duplicate elements:");
      for (Object ob: list2)
            System.out.println(ob);
}
}
