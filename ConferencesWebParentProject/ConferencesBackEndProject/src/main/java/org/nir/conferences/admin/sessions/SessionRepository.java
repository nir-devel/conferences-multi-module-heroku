package org.nir.conferences.admin.sessions;

import org.nir.conferences.common.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
