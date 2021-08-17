package org.nir.conferences.admin.sessions;

import java.util.List;

import org.nir.conferences.common.entity.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionRestController
{
	@Autowired private SessionService sessionService;
	
	
	@GetMapping("/api/v1/sessions")
	public List<Session> listSessions()
	{
		return this.sessionService.listAll();
	}

}
