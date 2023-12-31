package com.project.springboot.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(StudentDTO studentDTO) {

        Student student = Student.
                build(0L,
                        studentDTO.getFirstName(),
                        studentDTO.getLastName(),
                        studentDTO.getAge(),
                        studentDTO.getEmail(),
                        studentDTO.getMobile(),
                        studentDTO.getCourses()
                        );
        return studentRepository.save(student);

    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> getStudentById(Long id) {
      return studentRepository.findById(id);
    }
}


