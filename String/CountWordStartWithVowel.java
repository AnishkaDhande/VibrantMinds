public class CountWordStartWithVowel {
    public static void main(String[] args) {
        String s1="hello i am java developer Anu";
        String a[]=s1.split(" ");
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            String temp=a[i];
            if(temp.startsWith("a")||temp.startsWith("A")||temp.startsWith("E")||temp.startsWith("e")||temp.startsWith("i")||temp.startsWith("I")||temp.startsWith("o")||temp.startsWith("O")||temp.startsWith("u")||temp.startsWith("U"))
            count++;
        }
        System.out.println("Total Number of words starts with vowel are "+count);
    }

}
