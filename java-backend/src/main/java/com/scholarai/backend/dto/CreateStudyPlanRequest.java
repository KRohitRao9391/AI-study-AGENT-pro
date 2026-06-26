package com.scholarai.backend.dto;

import jakarta.validation.constraints.NotBlank;

public class CreateStudyPlanRequest {
    @NotBlank
    private String title;

    @NotBlank
    private String syllabusText;

    // Getters and Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getSyllabusText() { return syllabusText; }
    public void setSyllabusText(String syllabusText) { this.syllabusText = syllabusText; }
}

