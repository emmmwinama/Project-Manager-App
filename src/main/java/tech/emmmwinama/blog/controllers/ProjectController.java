package tech.emmmwinama.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tech.emmmwinama.blog.entities.Project;
import tech.emmmwinama.blog.repository.ProjectRepository;

@Controller
@RequestMapping("/projects")
public class ProjectController {
    @Autowired
    ProjectRepository prorep;

    @RequestMapping("/new")
    public String displayProjectForm(Model model){
        Project aProject = new Project();
        model.addAttribute("project", aProject);
        return "new-project";
    }

    @PostMapping("/save")
    public String createProject(Project project, Model model){
        prorep.save(project);

        //user redirection to prevent duplicate submissions
        return "redirect:/projects/new";
    }
}
