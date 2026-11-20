public class replace_vowel_with_no_2 {
    public static void main(String[] args) {
        String s1="International";
        StringBuilder sb= new StringBuilder();
        String vowel=s1.replaceAll("(?i)[^aeiou]","");
        int count=vowel.length();
       // System.out.println(vowel.length());//6
        for(int i=0;i<s1.length();i++)
        {
            char p=s1.charAt(i);
            if(p=='A'||p=='a'||p=='E'||p=='e'||p=='I'||p=='i'||p=='O'||p=='o'||p=='U'||p=='u')
            {
                sb.append(count--);
            }else{
                sb.append(p);
            }
        }
        System.out.println(sb);
    }
}
