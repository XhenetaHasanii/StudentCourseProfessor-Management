package com.project.springboot.professor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="api/v1/professor")
public class ProfessorController {
  private final ProfessorService professorService;
  @Autowired
  ProfessorController(ProfessorService professorService)
  {
      this.professorService=professorService;
  }
  @PostMapping
  public void createProfessor(@RequestBody Professor professor){
    professorService.addProfessor(professor);
  }
  @GetMapping("getAllProfessor/professors")
  public List<Professor> getAllProfessores()
  {
   return professorService.getAllProfessores();
  }
  @GetMapping("/getProfessor/{id}")
  public Optional<Professor> getProfessorById(@PathVariable("id") Long id)
  {
    return professorService.getProfessorById(id);
  }

}
