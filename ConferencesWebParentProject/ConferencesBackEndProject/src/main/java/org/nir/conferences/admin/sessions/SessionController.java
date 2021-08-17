package org.nir.conferences.admin.sessions;

import java.util.List;

import org.nir.conferences.common.entity.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SessionController 
{
	@Autowired private SessionService sessionService;
	
	
	/*
	 * @GetMapping("/sessions") public String listAll(Model model) { List<Session>
	 * listSessions = this.sessionService.listAll();
	 * 
	 * model.addAttribute("listSessions", listSessions);
	 * 
	 * 
	 * return "/sessions/sessions";
	 * 
	 * }
	 */
}
