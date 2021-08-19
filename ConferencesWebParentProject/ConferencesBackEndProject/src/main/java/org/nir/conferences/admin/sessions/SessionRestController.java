package org.nir.conferences.admin.sessions;

import java.util.List;

import org.nir.conferences.common.entity.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/sessions")
public class SessionRestController
{
	@Autowired private SessionService sessionService;
	
	
	@GetMapping("/")
	public List<Session> listSessions()
	{
		return this.sessionService.listAll();
	}

	@GetMapping("/{id}")
	public Session getSession(@PathVariable("id") Long sessionId)
	{
		return this.sessionService.getSession(sessionId);
	}
	
	
	
}
