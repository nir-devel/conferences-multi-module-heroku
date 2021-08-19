package org.nir.conferences.admin.sessions;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.nir.conferences.common.entity.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
//IN order to not role back the transection!!SB by default role back the insertion of a record!!
@Rollback(false)
public class SessionRepositoryTests
{
	@Autowired private SessionRepository sessionRepository;
	
	@Test
	@DisplayName("When list all Sessions")
	public void testListAllSessions()
	{
		List<Session> sessions = this.sessionRepository.findAll();
		
		sessions.forEach(s -> System.out.println(s.getSession_name()));
		
	}
	
	
	@Test
	@DisplayName("When getting a session by it")
	public void testFindById()
	{
		//GIVEN
		Long id = 91l;
		
		//WHEN
		Session session = this.sessionRepository.findById(id).get();
		
		//THEN
		assertThat(session).isNotNull();
		assertThat(session.getSession_id()).isEqualTo(id);
		assertThat(session.getSession_name()).isEqualTo("Personal Kanban");
		
		
		System.out.println(">>testFindById():SUCCESS! The session is : \n" + session);
		
	}

}
