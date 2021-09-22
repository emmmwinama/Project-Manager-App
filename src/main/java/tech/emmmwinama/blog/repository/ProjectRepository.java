package tech.emmmwinama.blog.repository;

import org.springframework.data.repository.CrudRepository;
import tech.emmmwinama.blog.entities.Project;

import java.util.List;

public interface ProjectRepository extends CrudRepository<Project, Long> {
    @Override
    public List<Project> findAll();
}
