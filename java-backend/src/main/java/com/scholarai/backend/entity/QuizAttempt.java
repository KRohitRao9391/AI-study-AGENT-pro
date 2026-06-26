package com.scholarai.backend.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "quiz_attempts")
public class QuizAttempt {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "quiz_id", nullable = false)
    private Long quizId;

    @Lob
    @Column(columnDefinition = "TEXT", nullable = false)
    private String userAnswers;

    @Column(nullable = false)
    private int score;

    @Column(name = "total_questions", nullable = false)
    private int totalQuestions;

    @Column(nullable = false)
    private String evaluation;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getQuizId() { return quizId; }
    public void setQuizId(Long quizId) { this.quizId = quizId; }

    public String getUserAnswers() { return userAnswers; }
    public void setUserAnswers(String userAnswers) { this.userAnswers = userAnswers; }

    public int getScore() { return score; }
    public void setScore(int score) { this.score = score; }

    public int getTotalQuestions() { return totalQuestions; }
    public void setTotalQuestions(int totalQuestions) { this.totalQuestions = totalQuestions; }

    public String getEvaluation() { return evaluation; }
    public void setEvaluation(String evaluation) { this.evaluation = evaluation; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}

