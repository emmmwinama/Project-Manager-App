package tech.emmmwinama.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import tech.emmmwinama.blog.entities.Project;
import tech.emmmwinama.blog.repository.ProjectRepository;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    ProjectRepository projectRepository;

    @GetMapping("/")
    public  String displayHome(Model model){
        List<Project> projects = projectRepository.findAll();
        model.addAttribute("projects", projects);
        return "home";
    }
}
