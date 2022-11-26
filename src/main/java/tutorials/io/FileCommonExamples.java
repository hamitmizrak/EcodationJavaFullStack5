package tutorials.io;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

//Absolute Path:sabittir
//Relative Path:dinamiktir.

//@Log4j2
public class FileCommonExamples {

    FileDataClass fileDataClass;
    private static File file;

    //roles defaullta verilmezse USER olsun
    // 1-)ADMIN(X+,W+,R+)  2-)WRITER(X-,W+,R+)  3-)USER(X-, W- ,R+) x=execute w=write r=read
    private static int MY_ROLES;

    //static
    static {
        MY_ROLES=1;
    }

    //constructor (form.txt defaultta oluşturulsun
    public FileCommonExamples() throws HamitMizrakException {
        fileDataClass=new FileDataClass();
        String myFilePath=fileDataClass.getPath().concat("form.txt");
        file=new File(myFilePath);
        try {
            if(file.createNewFile()){
                System.out.println(myFilePath+" oluşturuldu");
            }else{
                System.out.println(myFilePath+" Zaten  oluşturulmuş");
            }
        }catch (IOException ioException) {
            throw new HamitMizrakException(" Dosya okurken hata meydana geldi " + ioException);
        } catch (Exception exception) {
            throw new HamitMizrakException(" Dosya okurken hata meydana geldi " + exception);
        }
    }


    //DATE
    private  String nowDate() {
        Locale locale = new Locale("tr", "TR");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy  HH:mm:ss", locale);
        Date date = new Date();
        String str = simpleDateFormat.format(date);
        return str;
    }

    //userData
    private  String userData() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen birşeyler yazınız");
        String data = klavye.nextLine();
        return "[" + nowDate() + "] " + data;
    }

    //userScanner
    private  File userScanner(){
        allFiles();
        System.out.println("Lütfen dosya ismini yazınız");
        Scanner klavye = new Scanner(System.in);
        String specialUserPath= klavye.nextLine().concat(".txt");
        String path = FileStaticData.FILE_PATH+specialUserPath;
        file=new File(path);
        return file;
    }

    //CREATE(1)
    private  void fileCreateData() throws HamitMizrakException {
        file=userScanner();
        try {
            if(file.createNewFile()){
                System.out.println(file.getAbsolutePath().toString()+" oluşturuldu");
            }else{
                System.out.println(file.getAbsolutePath().toString()+" Zaten  oluşturulmuş");
            }
        }catch (IOException ioException) {
            throw new HamitMizrakException(" Dosya okurken hata meydana geldi " + ioException);
        } catch (Exception exception) {
            throw new HamitMizrakException(" Dosya okurken hata meydana geldi " + exception);
        }
    }

    //All files(3)
    private static void allFiles(){
        for(File temp: new File(FileStaticData.FILE_PATH).listFiles()){
            System.out.println(temp.getName());
        }
    }

    //DELETE(2)
    private  void fileDeleteData() throws HamitMizrakException {
        file=userScanner();
        try {
            if(file.exists()){
                file.delete();
                System.out.println("Dosyanız silindi");
            }else{
                System.out.println("Dosya Silinmedi");
            }
        } catch (Exception exception) {
            throw new HamitMizrakException(" Dosya okurken hata meydana geldi " + exception);
        }
    }

    // fileInformation(3)
    private  void fileInformation() {
        file=userScanner();
        System.out.println("Toplam karakter sayısı: "+file.length());
        System.out.println("Toplam GB : "+file.getTotalSpace());
        System.out.println("Kullanabilir GB : "+file.getUsableSpace());
        System.out.println("Absolute path : "+file.getAbsolutePath());
        System.out.println("Değiştirilme Tarihi: : "+ new Date(file.lastModified()));
    }

    private boolean isLogin(){
        //db
        //username: root
        //password: root
        String username,password;
        String dbUsername="root",dbPassword="root";
        Scanner klavye=new Scanner(System.in);
        System.out.println("Lütfen username giriniz");
        username=klavye.nextLine();
        System.out.println("Lütfen password giriniz");
        password=klavye.nextLine();
        if(username.equals(dbUsername) && password.equals(dbPassword))
            return true;
        else
            return false;
    }
    //Roles (4)
    private  int changeRoles() throws HamitMizrakException {
        System.out.println("1-)ADMIN(D+,W+,R+)\n2-)WRITER(D-,W+,R+)\n3-)USER(D-, W- ,R+) d=delete w=write r=read");
        Scanner klavye=new Scanner(System.in);
        if(MY_ROLES==1){
            System.out.println("Rolünüz: "+ERoles.ADMIN.getValue().toString());
        }else if(MY_ROLES==2){
            System.out.println("Rolünüz: "+ERoles.WRITER.getValue().toString());
        }else if(MY_ROLES==3){
            System.out.println("Rolünüzü değiştiremezsiniz: ");
            System.out.println("Devam etmek için herhangi bir tuşa basınız");
            klavye.nextLine();
            chooiseFile();
        }else{
            System.out.println("Yetkilendirme dışı");
        }

        int roles= klavye.nextInt();
        MY_ROLES=roles;

        if(MY_ROLES==1){
            System.out.println("Rolünüz artık "+ERoles.ADMIN.getValue().toString()+" oldu");
        }else if(MY_ROLES==2){
            System.out.println("Rolünüz artık "+ERoles.WRITER.getValue().toString()+" oldu");
        }else if(MY_ROLES==3){
            System.out.println("Rolünüz artık "+ERoles.USER.getValue().toString()+" oldu");
        }else{
            System.out.println("Yetkilendirme dışı");
        }
        return roles;
    }


    //WRİTER(6)
    private  void fileWriterData() throws HamitMizrakException {
        String path=userScanner().getAbsolutePath().toString();
        System.out.println(path);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            String result = userData();
            bufferedWriter.write("\n" + result);
            bufferedWriter.flush();
        } catch (IOException ioException) {
            throw new HamitMizrakException(" Dosya yazarken hata meydana geldi " + ioException);
        } catch (Exception exception) {
            throw new HamitMizrakException(" Dosya yazarken hata meydana geldi " + exception);
        }
    }

    //READER(7)
    private  void fileReaderData() throws HamitMizrakException {
        String path=userScanner().getAbsolutePath().toString();
        System.out.println(path);
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            StringBuilder stringBuilder = new StringBuilder();
            String rows = "";
            while ((rows = bufferedReader.readLine()) != null) {
                stringBuilder.append(rows).append("\n");
            }
            String dataToString = stringBuilder.toString();
            System.out.println(dataToString);
        } catch (IOException ioException) {
            throw new HamitMizrakException(" Dosya okurken hata meydana geldi " + ioException);
        } catch (Exception exception) {
            throw new HamitMizrakException(" Dosya okurken hata meydana geldi " + exception);
        }
    }

    //Logout(8)
    private static void logout(){
        System.out.println("ÇIKIŞ");
        System.exit(0);
    }

    //chooiseFile
    public  void chooiseFile() throws HamitMizrakException {
        Scanner klavye = new Scanner(System.in);
        // 1-)ADMIN(X+,W+,R+)  2-)WRITER(X-,W+,R+)  3-)USER(X-, W- ,R+) x=execute w=write r=read
        //for(;;){}
        while (true) {
            System.out.println("\nLütfen bir seçim yapınız\n1-)Dosya Oluştur\n2-)Dosya Sil\n3-)Dosya Bilgileri\n4-)Rol değiştir\n5-)Rolünüz\n6-)Bütün Dosyalar\n7-)Yazma\n8-)okuma\n9-)Çıkış");
            int chooise = klavye.nextInt();
            switch (chooise) {
                case 1:
                    if(MY_ROLES==1 || MY_ROLES==2 ){
                        System.out.println("Dosya oluşturma yetkiniz bulunuyor");
                        fileCreateData();
                    }else{
                        System.out.println("Dosya oluşturma yetkiniz bulunmuyor değiştirmelisiniz");
                        changeRoles();
                    }
                    break;

                case 2:
                    if(MY_ROLES==1 ){
                        System.out.println("Dosya silme yetkiniz bulunuyor");
                        fileDeleteData();
                    }else{
                        System.out.println("Dosya silme yetkiniz bulunmuyor değiştirmelisiniz");
                        changeRoles();
                    }
                    break;

                case 3:
                    System.out.println("Dosya Bilgileri");
                    fileInformation();
                    break;

                case 4:
                    System.out.println("Rol Değiştir");
                    if(MY_ROLES==1)
                        changeRoles();
                    else if(isLogin())
                      changeRoles();
                    else
                        System.out.println("Rol değiştirmek için login olmalısınız");
                    break;

                case 5:
                    if(MY_ROLES==1){
                        System.out.println("Rolünüz: "+ERoles.ADMIN.getValue().toString());
                    }else if(MY_ROLES==2){
                        System.out.println("Rolünüz: "+ERoles.WRITER.getValue().toString());
                    }else if(MY_ROLES==3){
                        System.out.println("Rolünüz: "+ERoles.USER.getValue().toString());
                    }else{
                        System.out.println("Yetkilendirme dışı");
                    }
                    break;

                case 6:
                    System.out.println("Bütün Dosyalar");
                    allFiles();
                    break;

                case 7:
                    System.out.println("YAZMAK");
                    fileWriterData();
                    break;

                case 8:
                    System.out.println("OKUMAK");
                    fileReaderData();
                    break;

                case 9:
                    logout();
                    break;

                default:
                    System.out.println("Sadece belirtilen alanı seçiniz");
                    break;
            }
        }
    }
    
    public static void main(String[] args) throws HamitMizrakException {
        FileCommonExamples fileCommonExamples=new FileCommonExamples();
        fileCommonExamples.chooiseFile();
    }
}
