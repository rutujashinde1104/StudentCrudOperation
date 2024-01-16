package mypack.StudentCrudOperation.Dao;
import org.springframework.data.jpa.repository.JpaRepository;

import mypack.StudentCrudOperation.Entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	// StudentRepository.java
	

	

}
