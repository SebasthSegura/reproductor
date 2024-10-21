package com.aluracursos.reproducir.modelos;

public class Podcast extends Audio{
    private String interviewer;
    private String description;

    public String getInterviewer() {
        return interviewer;
    }

    public void setInterviewer(String interviewer) {
        this.interviewer = interviewer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public int getClasification() {
        if (getTotalReproductions() >= 2000) {
            return 9;
        } else {
            return 2;
        }
    }
}
