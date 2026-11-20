public class Count_Words {
    public static void main(String[] args) {
        String s1="  hello i am java developer  Anu   ";
        s1=s1.trim();
        s1=s1.replaceAll("\\s+"," ");
        String ar[]=s1.split(" ");
        int count=ar.length;
        System.out.println(count);

        }
}
