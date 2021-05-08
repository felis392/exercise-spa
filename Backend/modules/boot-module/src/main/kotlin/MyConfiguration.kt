package com.example.demo.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.core.Sample;
import com.example.demo.core.SampleImpl;

@Configuration
class MyConfiguration {
  @Bean
  fun sample(): Sample {
    return SampleImpl();
  }
}
