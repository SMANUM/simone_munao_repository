package com.ntt.springbootdemo.repository;

import com.ntt.springbootdemo.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}