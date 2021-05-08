import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
  repositories {
      mavenCentral()
  }
}

plugins {
  id("org.springframework.boot") version "2.4.5" apply false
  id("io.spring.dependency-management") version "1.0.11.RELEASE" apply false
  id("org.jetbrains.kotlin.jvm") version "1.4.32" apply false
  id("org.jetbrains.kotlin.plugin.spring") version "1.4.32" apply false
}

allprojects {
  group = "felis392.exercise"
  version = "0.0.1"

  tasks.withType<JavaCompile> {
    sourceCompatibility = "1.8"
    targetCompatibility = "1.8"
  }

  tasks.withType<KotlinCompile> {
    kotlinOptions {
      freeCompilerArgs = listOf("-Xjsr305=strict")
      jvmTarget = "1.8"
    }
  }

  tasks.withType<Test> {
    useJUnitPlatform()
  }
}

subprojects {
  repositories {
    mavenCentral()
  }

  apply {
    plugin("org.springframework.boot")
    plugin("io.spring.dependency-management")
    plugin("org.jetbrains.kotlin.jvm")
    plugin("org.jetbrains.kotlin.plugin.spring")
  }
}
