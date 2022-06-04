package ru.netology.javacore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;


public class TodosTests {
    Todos sut;

    @BeforeEach
    public void init() {
        sut = new Todos();
    }

    @Test
    public void testTodos_add() {
        String task1 = "Поставить задачи";
        String task2 = "Написать диплом";
        String expected = "Написать диплом Поставить задачи";

        sut.addTask(task1);
        sut.addTask(task2);
        String result = sut.getAllTasks();

        assertThat(result, equalTo(expected));
    }

    @Test
    public void testTodos_remove() {
        String task1 = "Поставить задачи";
        String task2 = "Написать диплом";
        String expected = "Написать диплом";

        sut.addTask(task1);
        sut.addTask(task2);
        sut.removeTask("Поставить задачи");
        String result = sut.getAllTasks();

        assertThat(result, equalTo(expected));
    }

    @Test
    public void testTodos_getAllTasks() {
        String task1 = "Проснуться";
        String task2 = "Встать";
        String task3 = "Заправить кровать";
        String expected = "Встать Заправить кровать Проснуться";

        sut.addTask(task1);
        sut.addTask(task2);
        sut.addTask(task3);
        String result = sut.getAllTasks();

        assertThat(result, equalTo(expected));
    }
}