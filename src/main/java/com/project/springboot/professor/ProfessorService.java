package com.project.springboot.professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ProfessorService {
    private final ProfessorRepository professorRepository;
    @Autowired
    ProfessorService(ProfessorRepository professorRepository)
    {
      this.professorRepository=professorRepository;
   }
    public void addProfessor(Professor professor)
    {
        professorRepository.save(professor);
        System.out.println(professor);
    }
    public List<Professor> getAllProfessores()
    {
        return professorRepository.findAll();
    }
    public Optional<Professor> getProfessorById(Long id)
    {
       return professorRepository.findById(id);
    }
}
