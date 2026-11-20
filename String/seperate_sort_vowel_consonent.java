import java.util.Arrays;
public class seperate_sort_vowel_consonent {
    public static void main(String[] args) {
        String s1="International";
        StringBuilder sb=new StringBuilder();
       String vowel=s1.replaceAll("(?i)[^aeiou]","");
       String conso=s1.replaceAll("(?i)[aeiou]","");
       char v[]=vowel.toCharArray();
       char c[]=conso.toCharArray();
       Arrays.sort(v);
       Arrays.sort(c);
       sb.append(c);
       sb.append(v);
       System.out.println(sb);
       //System.out.println(vo);
       //System.out.println(conso);
       
    }
}
