package mypack.StudentCrudOperation.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import mypack.StudentCrudOperation.Entity.Student;
import mypack.StudentCrudOperation.Service.StudentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	// StudentController.java
	
	
	    @Autowired
	    private StudentService studentService;

	    @GetMapping("/get/student")
	    public List<Student> getAllStudents() {
	        return studentService.getAllStudents();
	    }

	    @GetMapping("/{id}")
	    public Optional<Student> getStudentById(@PathVariable Long id) {
	        return studentService.getStudentById(id);
	    }

	    @PostMapping("/save/student")
	    public Student createStudent(@RequestBody Student student) {
	        return studentService.createStudent(student);
	    }

	    @PutMapping("/put/{id}")
	    public Student updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
	        return studentService.updateStudent(id, updatedStudent);
	    }

	    @DeleteMapping("/delete/{id}")
	    public void deleteStudent(@PathVariable Long id) {
	        studentService.deleteStudent(id);
	    }
	}


