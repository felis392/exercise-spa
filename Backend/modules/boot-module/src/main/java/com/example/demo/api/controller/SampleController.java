package com.example.demo.api.controller;

import com.example.demo.core.Sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("sample")
@RestController
public class SampleController {

  @Autowired
  private Sample sample;

  @GetMapping
  String get() {
    return sample.getName();
  }
}
