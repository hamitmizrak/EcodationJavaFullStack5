package javase;

public class _04_String {

    public static void main(String[] args) {
        String value="javase JavaME JAvase ";
        System.out.println(value.length());
        System.out.println(value.trim().length());
        System.out.println(value.startsWith("javase"));
        System.out.println(value.endsWith(" "));
        System.out.println(value.toLowerCase());
        System.out.println(value.toUpperCase());
        System.out.println(value.charAt(0));
        System.out.println(value.indexOf("javase"));
        value=value.replace(value,"javase JavaME JAvase javaEE ");
        System.out.println(value);
        value=value.concat("sonuna ekler");
        System.out.println(value);
        System.out.println(value.contains("JavaME"));
        System.out.println(value.isEmpty());
        System.out.println(value.equals("javase JavaME JAvase javaEE sonuna ekler"));

        System.out.println( value.substring(2));
        if(value.length()>3){
            System.out.println( value.substring(0,3)); //0<=X<=3-1
        }

        //ödev isim ve soyiminizi yukarıdaki örneklere benzeterek yapalım.

    }
}
