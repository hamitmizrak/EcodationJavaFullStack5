package atm.sql;


/*import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

    //Global Excepiton handling yapmak için kullanıyoruz => @RestControllerAdvice
    @RestControllerAdvice*/
    public class CommonExceptionHandling {

/*        //Local Exception Handler
        //Eğer notfound hatası alırsak bu metot çalışsın
        //http://localhost:8080/handler/data?name=adi155
        @ExceptionHandler({HamitExceptionNotFoundException.class})
        public String notFound() {
            return "id yoktur 55";
        }

        //http://localhost:8080/handler/data?name=adi155
        //illegalArgumentException ==> Metotlara Geçersiz Argüman atamasında gerçekleşir.
        @ExceptionHandler({IllegalArgumentException.class})
        public String illegalArgument() {
            return "illegal exception yanlış parametre 55";
        }

        @ExceptionHandler({ArrayIndexOutOfBoundsException.class})
        public String arrayIndexOutOfBoundsException() {
            return "arrayIndexOutOfBoundsException 55";
        }

        @ExceptionHandler({NullPointerException.class})
        public String nullPointerException() {
            return "nullPointerException 55";
        }

        //kendi Spring error oluşturduğum için buna geerek kalmadı
    *//*@ExceptionHandler(BadCredentialsException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    ApiResult exceptionBHandlingBadCredentials(){
        ApiResult apiResult = new ApiResult(401, "/api/1.0/auth", "deneme unauthorized");
        //BasicErrorController
        return apiResult;
    }*//*
    }*/
}
