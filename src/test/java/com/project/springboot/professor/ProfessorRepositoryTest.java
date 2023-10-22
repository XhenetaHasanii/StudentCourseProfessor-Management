package com.project.springboot.professor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import static org.assertj.core.api.Assertions.*;
import java.util.Optional;
@DataJpaTest
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
   @Test
   void checkIfProfessorDoesNotExistsById()
   {
       //given
       Long id=1L;
       //when
       Optional<Professor> optionalProfessor=underTest.getProfessorById(id);
       //then
       assertThat(optionalProfessor).isEmpty();
   }
}