package com.scholarai.backend.repository;

import com.scholarai.backend.entity.PlanTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PlanTaskRepository extends JpaRepository<PlanTask, Long> {
    List<PlanTask> findByPlanIdOrderByWeekNumberAscDayNumberAsc(Long planId);
}

