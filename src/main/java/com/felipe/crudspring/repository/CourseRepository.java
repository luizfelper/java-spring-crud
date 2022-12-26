package com.felipe.crudspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.felipe.crudspring.model.Curso;

@Repository
public interface CourseRepository extends JpaRepository<Curso, Long> {

}
