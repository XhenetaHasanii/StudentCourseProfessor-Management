package com.project.springboot.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>
{

    <S extends Student> S saveAndFlush(Student student);

    @Override
    Optional<Student> findById(Long id);
}
