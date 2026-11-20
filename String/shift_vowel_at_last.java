public class shift_vowel_at_last {
    public static void main(String[] args) {
        String s1="International";
        StringBuilder sb=new StringBuilder();
       sb.append(s1.replaceAll("(?i)[aeiou]",""));
       System.out.println(sb);
       sb.append(s1.replaceAll("(?i)[^aeiou]",""));
        System.out.println(sb);
    }
}
