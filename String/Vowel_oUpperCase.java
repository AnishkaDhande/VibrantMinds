public class Vowel_oUpperCase {
    public static void main(String[] args) {
        String s1="hello i am java developer";
        StringBuilder sb=new StringBuilder();
        String s2="AEIOUaeiou";
        for(int i=0;i<s1.length();i++)
        {
            char c=s1.charAt(i);
            if(s2.contains(String.valueOf(c)))
               sb.append( Character.toUpperCase(c));
            else
                sb.append(c);
        }
        System.out.println(sb);
    }
}
