package com.project.springboot.professor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/professor/v1/")
public class ProfessorController {
  private  ProfessorService professorService;
  @Autowired
  ProfessorController(ProfessorService professorService)
  {
      this.professorService=professorService;
  }

}
