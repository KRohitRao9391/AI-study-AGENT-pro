package com.scholarai.backend.entity;

import jakarta.persistence.*;
import com.scholarai.backend.entity.StudyPlan;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "plan_tasks")
public class PlanTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "plan_id", nullable = false)
    private Long planId;

    @Column(nullable = false)
    private String topic;

    private String content;

    @Column(name = "week_number", nullable = false)
    private int weekNumber;

    @Column(name = "day_number", nullable = false)
    private int dayNumber;

    @Column(nullable = false)
    private boolean completed = false;

    @Column(name = "completed_at")
    private LocalDateTime completedAt;

    @Lob
    @Column(columnDefinition = "TEXT")
    private String resources = "[]";

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public StudyPlan getPlan() { return plan; }
    public void setPlan(StudyPlan plan) { this.plan = plan; }

    public String getTopic() { return topic; }
    public void setTopic(String topic) { this.topic = topic; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public int getWeekNumber() { return weekNumber; }
    public void setWeekNumber(int weekNumber) { this.weekNumber = weekNumber; }

    public int getDayNumber() { return dayNumber; }
    public void setDayNumber(int dayNumber) { this.dayNumber = dayNumber; }

    public boolean isCompleted() { return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }

    public LocalDateTime getCompletedAt() { return completedAt; }
    public void setCompletedAt(LocalDateTime completedAt) { this.completedAt = completedAt; }

    public String getResources() { return resources; }
    public void setResources(String resources) { this.resources = resources; }
}

