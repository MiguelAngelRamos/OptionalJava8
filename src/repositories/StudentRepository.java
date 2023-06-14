package repositories;

import java.util.Optional;

import entitys.Student;

public class StudentRepository {
  
  private Student student;

  public StudentRepository(Student student) {
    this.student = student;
  }

  public Optional<Student> findStudent() {
    return Optional.ofNullable(student);
  }
  
}
