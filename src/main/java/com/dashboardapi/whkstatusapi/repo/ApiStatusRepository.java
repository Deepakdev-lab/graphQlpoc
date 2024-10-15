package com.dashboardapi.whkstatusapi.repo;

import com.dashboardapi.whkstatusapi.entities.ApiStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApiStatusRepository extends JpaRepository<ApiStatus, Long> {
    List<ApiStatus> findByOrgId(Long orgId);
}
