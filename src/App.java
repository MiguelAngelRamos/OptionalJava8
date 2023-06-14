import java.util.Optional;

import entitys.Student;
import repositories.StudentRepository;

public class App {
    public static void main(String[] args) throws Exception {
        
        Student james = new Student("James Gosling");

        StudentRepository repository = new StudentRepository(james);
        
        Optional<Student> optionalStudent = repository.findStudent();

        if(optionalStudent.isPresent()) {
            System.out.println("El estudiante encontrado es: " + optionalStudent.get().getName());
        } else {
            System.out.println("No se encontro el estudiante");
        }

        repository =  new StudentRepository(null);
        optionalStudent = repository.findStudent();

        if(optionalStudent.isPresent()) {
            System.out.println("El estudiante encontrado es: " + optionalStudent.get().getName());
        } else {
            System.out.println("No se encontro el estudiante");
        }
    

    }
}