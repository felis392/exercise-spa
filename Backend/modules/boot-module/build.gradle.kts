plugins {
	id("war")
  id("org.springframework.boot")
}

dependencies {
  implementation(project(":core-module"))

  implementation(kotlin("stdlib-jdk8"))
  implementation(kotlin("reflect"))
	implementation("org.springframework.boot:spring-boot-starter-web")

	providedRuntime("org.springframework.boot:spring-boot-starter-tomcat")

  testImplementation("org.junit.jupiter:junit-jupiter:5.7.0")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<War> {
  enabled = true
  archiveName = "ledger#api.war"
}
