package org.nir.conferences.admin.speakers;


import org.nir.conferences.common.entity.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
