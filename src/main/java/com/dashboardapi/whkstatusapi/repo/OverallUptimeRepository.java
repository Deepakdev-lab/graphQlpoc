package com.dashboardapi.whkstatusapi.repo;

import com.dashboardapi.whkstatusapi.entities.OverallUptime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OverallUptimeRepository extends JpaRepository<OverallUptime, Long> {
    List<OverallUptime> findByOrgId(Long orgId);
}
