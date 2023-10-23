package com.project.springboot.professor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;
import static org.assertj.core.api.Assertions.*;

class ProfessorServiceTest {
 private ProfessorService underTest;
 @Mock private ProfessorRepository professorRepository;
  private  AutoCloseable closeable;
    @BeforeEach
    void setUp() {
        this.closeable=MockitoAnnotations.openMocks(this);
        this.underTest =new ProfessorService(professorRepository);
    }
    @AfterEach
    void tearDown() throws Exception {
        closeable.close();
    }
    @Test
    void addProfessor() {
        //given
        Professor professor=new Professor(1L,"Professor","Oliver","","oliver@gmail.com");
        //when
        professorRepository.save(professor);
        //then
        ArgumentCaptor<Professor> capturedProfessor=ArgumentCaptor
                .forClass(Professor.class);
        verify(professorRepository)
                .save(capturedProfessor.capture());
        Professor capturedProfessorValue=capturedProfessor.getValue();
        assertThat(capturedProfessorValue).isEqualTo(professor);
    }
    @Test
    void getAllProfessores() {
        underTest.getAllProfessores();
        verify(professorRepository).findAll();
    }

    @Test
    @Disabled
    void getProfessorById() {
    }
}