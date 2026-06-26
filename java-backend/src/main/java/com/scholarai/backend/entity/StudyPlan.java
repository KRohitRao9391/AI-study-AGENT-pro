package com.scholarai.backend.entity;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "study_plans")
public class StudyPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(name = "syllabus_text", nullable = false)
    private String syllabusText;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String generatedPlan;

    @Lob
    @Column(name = "weak_topics", columnDefinition = "TEXT")
    private String weakTopics = "[]";

    @Column(name = "completion_percentage")
    private int completionPercentage = 0;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    // tasks loaded separately

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getSyllabusText() { return syllabusText; }
    public void setSyllabusText(String syllabusText) { this.syllabusText = syllabusText; }

    public String getGeneratedPlan() { return generatedPlan; }
    public void setGeneratedPlan(String generatedPlan) { this.generatedPlan = generatedPlan; }

    public String getWeakTopics() { return weakTopics; }
    public void setWeakTopics(String weakTopics) { this.weakTopics = weakTopics; }

    public int getCompletionPercentage() { return completionPercentage; }
    public void setCompletionPercentage(int completionPercentage) { this.completionPercentage = completionPercentage; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

}

