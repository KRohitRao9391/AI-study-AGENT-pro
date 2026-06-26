package com.scholarai.backend.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "flashcards")
public class Flashcard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "plan_id", nullable = false)
    private Long planId;

    @Column(nullable = false)
    private String question;

    @Column(nullable = false)
    private String answer;

    @Column(name = "last_reviewed_at")
    private LocalDateTime lastReviewedAt;

    @Column(name = "mastery_level")
    private int masteryLevel = 0;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getPlanId() { return planId; }
    public void setPlanId(Long planId) { this.planId = planId; }

    public String getQuestion() { return question; }
    public void setQuestion(String question) { this.question = question; }

    public String getAnswer() { return answer; }
    public void setAnswer(String answer) { this.answer = answer; }

    public LocalDateTime getLastReviewedAt() { return lastReviewedAt; }
    public void setLastReviewedAt(LocalDateTime lastReviewedAt) { this.lastReviewedAt = lastReviewedAt; }

    public int getMasteryLevel() { return masteryLevel; }
    public void setMasteryLevel(int masteryLevel) { this.masteryLevel = masteryLevel; }
}

