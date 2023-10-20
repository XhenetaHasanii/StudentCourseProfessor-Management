package com.project.springboot.professor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;
import java.util.Optional;

@SpringBootTest
class ProfessorRepositoryTest {
 private final ProfessorRepository underTest;
  @Autowired
    ProfessorRepositoryTest(ProfessorRepository underTest) {
        this.underTest=underTest;
    }
    @Test
   void checkIfProfessorExistsById()
    {
       //given
        Professor professor=new Professor(1L,"Professor","Oliver","","oliver@gmail.com");
        underTest.save(professor);
       //when
       Optional<Professor> optionalProfessor=underTest.getProfessorById(professor.getId());
       //then
       assertThat(optionalProfessor).isPresent();

   }
}