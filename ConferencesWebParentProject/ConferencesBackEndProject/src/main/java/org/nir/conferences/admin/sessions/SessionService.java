package org.nir.conferences.admin.sessions;

import java.util.List;

import org.nir.conferences.common.entity.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SessionService 
{
	@Autowired private SessionRepository sessionRepository; 
	
	
	public List<Session> listAll()
	{
		return this.sessionRepository.findAll();
	}


	
	public Session getSession(Long sessionId) 
	{
		return this.sessionRepository.findById(sessionId).get();
	}

}
