package com.project.springboot.professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
