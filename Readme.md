<p align='right'>
	<small>Sunil Samuel<br>
		web_github@sunilsamuel.com<br>
		http://www.sunilsamuel.com
	</small>
</p>

# JBoss EAP 8 Multi-Module EAR Project 💻

For reference see [EAP-8-Log4J](https://github.com/sunil-samuel/EAP-8-Log4J)

This project is a demonstration of a multi-module Maven project structured to deploy two Web Applications (WARs) within a single Enterprise Application Archive (EAR) on Red Hat JBoss EAP 8.

It serves as a practical example for migrating applications to the Jakarta EE 10 environment, showcasing advanced configurations for classloading, dependency management, and logging.

## Project Structure 🌴

The following is the project directory structure:

```sh
. parent
├── app-ear
│   ├── pom.xml
│   └── src
│       └── main
│           └── application
│               └── META-INF
│                   └── jboss-deployment-structure.xml
├── legacy-log4j-war
│   ├── pom.xml
│   └── src
│       └── main
│           ├── java
│           │   └── com.sunilsamuel.eap8.legacy.LegacyServlet.java
│           ├── resources
│           │   └── log4j.xml
│           └── webapp
│               └── WEB-INF
│                   └── web.xml
├── modern-log4j2-war
│   ├── pom.xml
│   └── src
│       └── main
│           ├── java
│           │   └── com.sunilsamuel.eap8.modern.ModernServlet.java
│           ├── resources
│           │   └── log4j2.xml
│           └── webapp
│               └── WEB-INF
│                   └── web.xml
└── pom.xml
```

* Access the log4j (legacy) http://localhost:8080/legacy/hello
* Access the log4j2 (modern) http://localhost:8080/modern/hello