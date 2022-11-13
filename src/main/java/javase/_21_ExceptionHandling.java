package javase;


import java.io.IOException;

public class _21_ExceptionHandling {

    public static void main(String[] args) throws ArithmeticException, IOException {

        int  vocabulary=0;
        try{
              vocabulary=44/0;
        }catch (ArithmeticException arithmeticException){
            //arithmeticException.printStackTrace();
            //throw new ArithmeticException("istisna meydana geldi burada dur "+arithmeticException);
            //throw new HamitMizrakException("benim yazdığım istisna burada dur");
            arithmeticException.toString();
            arithmeticException.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("database.close()");
        }

        System.out.println(vocabulary);
        System.out.println("son satır");
    }
}
