package com.app.repository;

import com.app.model.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class StudentRepository {

    @PersistenceContext
    private EntityManager em;

    public List<Student> findAll() {
        return em.createQuery("from Student", Student.class).getResultList();
    }

    public void save(Student s) {
        em.persist(s);
    }
}