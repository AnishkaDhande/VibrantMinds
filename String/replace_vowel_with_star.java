public class replace_vowel_with_star {
    public static void main(String[] args) {
        String s1="International";
       s1= s1.replaceAll("(?i)[aeiou]","*");
        System.out.println(s1);
    }
}
