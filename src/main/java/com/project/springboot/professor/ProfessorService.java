package com.project.springboot.professor;

import com.project.springboot.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfessorService {
    private ProfessorRepository professorRepository;
    @Autowired
    ProfessorService(ProfessorRepository professorRepository){
      this.professorRepository=professorRepository;
  }

    public void addProfessor(Professor professor) {
        professorRepository.save(professor);
        System.out.println(professor);
    }

    public Optional<Professor> getProfessorById(Long id) {
       return professorRepository.findById(id);
    }
}
