package tutorials.oop;

public class MainClass {
    public static void main(String[] args) {
        StudentDto studentDto=new StudentDto();
        studentDto.setId(1L);
        studentDto.setUsername("kullanıcı adı");
        studentDto.setSurname("soyadı adı");
        System.out.println("Soyad: "+ studentDto.getSurname());
        System.out.println(studentDto);
        System.out.println("******************************************************************************************");
        //2.class
        StudentDto2 studentDto2=StudentDto2.builder().id(1L).username("kullanıcı adı").surname("soyadı adı").build();
        System.out.println(studentDto2);
    }
}
