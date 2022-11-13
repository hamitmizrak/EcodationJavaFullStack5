package javase;


public class _19_Formatter {

    public static void main(String[] args) {
        // NOT:
        // + sağa kaydırır
        // - verirsek sola kaydırıyor.
        String str="java öğreniyorum";
        int decimal=44;
        float point=14.53f;
        System.out.printf("%s  %d  %f ",str,decimal,point);
        System.out.println();
        System.out.printf("%40s  %d  %f ",str,decimal,point);
        System.out.println();
        System.out.printf("%40s  %10d  %f ",str,decimal,point);
        System.out.println();
        System.out.printf("%40s  %10d  %4.2f ",str,decimal,point);



    }

}
