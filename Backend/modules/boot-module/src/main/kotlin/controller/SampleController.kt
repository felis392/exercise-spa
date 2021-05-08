package com.example.demo.api.controller

import com.example.demo.core.Sample
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController(private val sample: Sample) {

  @GetMapping("sample")
  fun get(): String {
    return sample.getName()
  }

  @GetMapping("{path}")
  fun echo(@PathVariable("path") path: String): String
  = path
}
