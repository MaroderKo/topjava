package ru.javawebinar.topjava.repository.jdbc;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import ru.javawebinar.topjava.model.Meal;

import java.time.LocalDateTime;

import static org.junit.Assert.*;
@ContextConfiguration("classpath:spring/spring-app.xml")
@RunWith(SpringRunner.class)
public class JdbcMealRepositoryTest {

    @Autowired
    private JdbcMealRepository repository;

    @Before
    public void setUp() throws Exception {
        repository.save(new Meal(LocalDateTime.of(2020,1,3,15,0),"testnow",300),10);
        repository.save(new Meal(LocalDateTime.of(2020,1,3,15,5),"test",158),10);
    }

    @Test
    public void save() {
        Meal test = new Meal(LocalDateTime.of(2020,1,3,15,5),"test",158);
        assertNotNull(repository.save(test,10));

    }

    @Test
    public void delete() {
    }

    @Test
    public void get() {
    }

    @Test
    public void getAll() {
    }

    @Test
    public void getBetweenHalfOpen() {
    }
}