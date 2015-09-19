package br.andre.inatel.task.model;

/**
 * Created by aluno on 19/09/2015.
 */
public class Task {

    private Long id;
    private Boolean done = false;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public Task() {

    }

    public Task(String description) {
        this.description = description;
    }




}
