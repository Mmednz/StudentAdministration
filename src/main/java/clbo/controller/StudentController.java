package clbo.controller;

import clbo.model.entities.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by clbo on 06/09/2017.
 */

@Controller
public class StudentController {

    ArrayList<Student> students = new ArrayList<Student>();

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("stu", students);
        return "index";
    }

    @GetMapping("/create")
    public String create(Model model) {
        // add one student to arraylist.
        // Here it is hard coded. Later we will add this dynamically
        //String index = Integer.toString(students.size() + 1);

        model.addAttribute("student", new Student());
        return "create";
    }

    @PostMapping("/create")
    public String create(){

        return "create";
    }
}
