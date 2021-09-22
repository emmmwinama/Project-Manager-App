package tech.emmmwinama.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tech.emmmwinama.blog.entities.Employee;
import tech.emmmwinama.blog.repository.EmployeeRepository;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping("/new")
    public String displayEmployeeForm(Model model){
       Employee aEmployee = new Employee();
       model.addAttribute("employee", aEmployee);
        return "new-employee";
    }

    @PostMapping("/save")
    public String createEmployee(Employee employee, Model model){
        employeeRepository.save(employee);

        //user redirection to prevent duplicate submissions
        return "redirect:/employees/new";
    }
}