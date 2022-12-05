public class specialcount {
    public static void main(String[] args) {

        String str = "aa a234bc@ sad$hsagd^";
        String s = str.replaceAll("[!@#$%^&*]", "");
        int count = str.length() - s.length();
        System.out.println(count);

    }
}