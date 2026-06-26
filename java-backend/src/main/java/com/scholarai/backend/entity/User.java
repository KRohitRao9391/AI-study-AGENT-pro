package com.scholarai.backend.entity;

import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;

    @JsonIgnore
    @Column(nullable = false)
    private String password;

    @Column(name = "full_name", nullable = false)
    private String fullName;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(name = "xp")
    private int xp = 0;

    private int level = 1;

    @Column
    private String badges = "[]";

    private int streak = 0;

    @Column(name = "last_activity_at")
    private LocalDateTime lastActivityAt;

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public int getXp() { return xp; }
    public void setXp(int xp) { this.xp = xp; }

    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }

    public String getBadges() { return badges; }
    public void setBadges(String badges) { this.badges = badges; }

    public int getStreak() { return streak; }
    public void setStreak(int streak) { this.streak = streak; }

    public LocalDateTime getLastActivityAt() { return lastActivityAt; }
    public void setLastActivityAt(LocalDateTime lastActivityAt) { this.lastActivityAt = lastActivityAt; }
}

