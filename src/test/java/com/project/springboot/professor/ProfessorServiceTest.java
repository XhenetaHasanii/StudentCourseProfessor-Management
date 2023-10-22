package com.project.springboot.professor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.verify;

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
    @Disabled
    void addProfessor() {
    }
    @Test
    void getAllProfessors() {
        underTest.getAllProfessors();
        verify(professorRepository).findAll();
    }

    @Test
    @Disabled
    void getProfessorById() {
    }
}