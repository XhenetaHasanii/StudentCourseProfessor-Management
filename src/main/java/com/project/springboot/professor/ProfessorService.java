package com.project.springboot.professor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {
    private ProfessorRepository professorRepository;
    @Autowired
    ProfessorService(ProfessorRepository professorRepository){
      this.professorRepository=professorRepository;
  }
}
