public class replace_vowel_with_no_1 {
    public static void main(String[] args) {
        String s1="International";
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            char c=s1.charAt(i);
            if(c=='A'||c=='a'||c=='e'||c=='E'||c=='I'||c=='i'||c=='o'||c=='O'||c=='U'||c=='u')
            {
                sb.append(++count);
            }else{
                sb.append(c);
            }
           
        }
        System.out.println(sb);
    }
}
