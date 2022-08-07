package school.hei.hellowordapi.controller;


import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import school.hei.hellowordapi.Model.Student;
import school.hei.hellowordapi.Repository.StudentInterface;

import java.io.IOException;
import java.util.List;

@RestController
public class ControllerStudents {

    @GetMapping("/students")
    public ResponseEntity <List<Student>> getStudent() {
        StudentInterface client = StudentInterface.getInstance();
        client.connectDataBase();
        List<Student> out = client.findAll();
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(out);
    }

    @GetMapping("/students/{name}")
    public ResponseEntity <List<Student>> getIfNameLike(@PathVariable String name) {
        StudentInterface client = StudentInterface.getInstance();
        client.connectDataBase();
        List<Student> out = client.findWhereNameLike(name);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(out);
    }

    @DeleteMapping("/students/{idStudent}")
    public ResponseEntity deleteStudent(@PathVariable String idStudent) throws IOException {
        StudentInterface client = StudentInterface.getInstance();
        client.connectDataBase();
        client.deleteById(idStudent);
        return ResponseEntity.ok().body("{}");
    }
}

