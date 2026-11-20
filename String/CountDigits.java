public class CountDigits {
    public static void main(String[] args) {
        String s1="Welcome to 20262";
        
        int count =0;
        for(int i=0;i<s1.length();i++)
        {
           if(Character.isDigit(s1.charAt(i)))
            count++;
        }
        System.out.println(count);
    }
}
