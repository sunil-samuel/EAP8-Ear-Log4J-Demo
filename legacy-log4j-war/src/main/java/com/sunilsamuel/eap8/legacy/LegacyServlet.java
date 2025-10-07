package com.sunilsamuel.eap8.legacy;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.apache.log4j.Logger;

@WebServlet("/hello")
public class LegacyServlet extends HttpServlet {
	private static final long serialVersionUID = 1445914652371621266L;
	private static final Logger log = Logger.getLogger(LegacyServlet.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		log.info("LegacyServlet (Log4j 1.x) handling request...");
		resp.setContentType("text/plain");
		resp.getWriter()
				.println("Legacy Log4j 1.x WAR says hello. Check server console / logs for a Log4j 1.x message.");
	}
}
