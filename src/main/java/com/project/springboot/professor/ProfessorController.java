package com.project.springboot.professor;
import com.project.springboot.student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/professor")
public class ProfessorController {
  private  ProfessorService professorService;
  @Autowired
  ProfessorController(ProfessorService professorService)
  {
      this.professorService=professorService;
  }
  @PostMapping
  public void createProfessor(@RequestBody Professor professor){
    professorService.addProfessor(professor);
  }
  @GetMapping("/getProfessor/{id}")
  public Optional<Professor> getProfessorById(@PathVariable("id") Long id)
  {
    return professorService.getProfessorById(id);
  }

}
