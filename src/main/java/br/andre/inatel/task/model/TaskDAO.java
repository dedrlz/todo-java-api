package br.andre.inatel.task.model;

import java.util.ArrayList;

/**
 * Created by aluno on 19/09/2015.
 */
public class TaskDAO {
    private ArrayList<Task> tasks;

    public TaskDAO() {
        tasks=new ArrayList<Task>();
        tasks.add(new Task("Learn REST API"));
        tasks.add(new Task("Learn GRADLE"));
        tasks.add(new Task("Learn Groovy"));
        tasks.add(new Task("Learn Grails"));
        tasks.add(new Task("Learn AngularJS"));
    }

    public ArrayList<Task> list() {
        return tasks;
    }

    public void create(Task task) {
        task.setId(22l);
        tasks.add(task);
    }
}
