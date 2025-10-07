package com.sunilsamuel.eap8.modern;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebServlet("/hello")
public class ModernServlet extends HttpServlet {
	private static final long serialVersionUID = -2562471966876245632L;
	private static final Logger log = LogManager.getLogger(ModernServlet.class);

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		log.info("ModernServlet (Log4j2) handling request...");
		resp.setContentType("text/plain");
		resp.getWriter().println("Modern Log4j2 WAR says hello. Check server console / logs for a Log4j2 message.");
	}
}
