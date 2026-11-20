public class Count_Digits {
    public static void main(String[] args) {
        String s1="Welcome to 2026";
        String n=s1.replaceAll("[^0-9]", "");
        System.out.println(n.length());
    }
}

