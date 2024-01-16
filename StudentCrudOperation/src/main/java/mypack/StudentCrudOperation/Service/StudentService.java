package mypack.StudentCrudOperation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mypack.StudentCrudOperation.Dao.StudentRepository;
import mypack.StudentCrudOperation.Entity.Student;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
	// StudentService.java
	
	
	    @Autowired
	    private StudentRepository studentRepository;

	    public List<Student> getAllStudents() {
	        return studentRepository.findAll();
	    }

	    public Optional<Student> getStudentById(Long id) {
	        return studentRepository.findById(id);
	    }

	    public Student createStudent(Student student) {
	        return studentRepository.save(student);
	    }

	    public Student updateStudent(Long id, Student updatedStudent) {
	        if (studentRepository.existsById(id)) {
	            updatedStudent.setId(id);
	            return studentRepository.save(updatedStudent);
	        }
	        return null; // Handle error - student not found
	    }

	    public void deleteStudent(Long id) {
	        studentRepository.deleteById(id);
	    }
}


