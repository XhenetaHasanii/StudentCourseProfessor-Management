package com.project.springboot.professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProfessorRepository  extends JpaRepository<Professor,Long>
{
    Optional<Professor> getProfessorById(Long id);
}
