public class Sum_Digits {
    public static void main(String[] args) {
        String s1="welcome to 2026";
        int sum=0;
        //String n=s1.replaceAll("[^0-9]","");
       
        for(int i=0;i<s1.length();i++)
        {
            char c=s1.charAt(i);
            if(Character.isDigit(c))
            sum=sum+Character.getNumericValue(c);
        }
        System.out.println(sum);
    }
}
