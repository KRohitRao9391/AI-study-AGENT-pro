package com.scholarai.backend.entity;

import jakarta.persistence.*;
import com.scholarai.backend.entity.StudyPlan;
import java.time.LocalDateTime;

@Entity
@Table(name = "quizzes")
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "plan_id", nullable = false)
    private StudyPlan plan;

    @Column(nullable = false)
    private String topic;

    @Lob
    @Column(columnDefinition = "TEXT", nullable = false)
    private String questions;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public StudyPlan getPlan() { return plan; }
    public void setPlan(StudyPlan plan) { this.plan = plan; }

    public String getTopic() { return topic; }
    public void setTopic(String topic) { this.topic = topic; }

    public String getQuestions() { return questions; }
    public void setQuestions(String questions) { this.questions = questions; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}

