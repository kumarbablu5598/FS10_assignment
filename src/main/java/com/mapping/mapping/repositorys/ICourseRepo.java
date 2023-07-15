package com.mapping.mapping.repositorys;

import com.mapping.mapping.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICourseRepo extends JpaRepository<Course,Integer> {
}
