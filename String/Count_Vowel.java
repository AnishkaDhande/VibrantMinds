public class Count_Vowel {
    public static void main(String[] args) {
        int count=0;
        String s1="International";
        for(int i=0;i<s1.length();i++)
        {
            char c=s1.charAt(i);
            if(c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='O'||c=='o'||c=='U'||c=='u')
                count++;
        }
        System.out.println(count);
    }
}
