package com.scholarai.backend.controller;

import com.scholarai.backend.dto.CreateStudyPlanRequest;
import com.scholarai.backend.entity.StudyPlan;
import com.scholarai.backend.repository.StudyPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/plans")
public class PlansController {

    @Autowired
    private StudyPlanRepository studyPlanRepository;

    @GetMapping
    public List<StudyPlan> getPlans() {
        return studyPlanRepository.findAllByOrderByCreatedAtDesc();
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudyPlan> getPlan(@PathVariable Long id) {
        return studyPlanRepository.findById(id)
            .map(plan -> ResponseEntity.ok().body(plan))
            .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<StudyPlan> createPlan(@Valid @RequestBody CreateStudyPlanRequest request) {
        // Mock generated plan like TS version
        StudyPlan plan = new StudyPlan();
        plan.setTitle(request.getTitle());
        plan.setSyllabusText(request.getSyllabusText());
        plan.setGeneratedPlan("{\"weeks\":[{\"weekNumber\":1,\"days\":[...]}]}"); // Mock
        plan.setCompletionPercentage(0);
        StudyPlan saved = studyPlanRepository.save(plan);
        return ResponseEntity.status(201).body(saved);
    }
}

