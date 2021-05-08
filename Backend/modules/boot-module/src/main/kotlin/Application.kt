package com.example.demo.api;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.runApplication

@SpringBootApplication
class LedgerApplication : SpringBootServletInitializer() {
	override protected fun configure(application: SpringApplicationBuilder): SpringApplicationBuilder {
		return application.sources(LedgerApplication::class.java);
	}
}

fun main(args: Array<String>) {
  runApplication<LedgerApplication>(*args)
}
