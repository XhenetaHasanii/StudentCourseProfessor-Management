package com.project.springboot.student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
@Service
public class StudentService
{
    private final StudentRepository studentRepository;
    @Autowired
    StudentService (StudentRepository studentRepository)
    {
        this.studentRepository=studentRepository;
    }
    public void addStudent(Student student){
        studentRepository.save(student);
    }

    public List<Student> getAllStudents()
    {
        return studentRepository.findAll();
    }
    public Optional<Student> getStudentById(Long id)
    {
      return studentRepository.findById(id);
    }
}


