package com.jrm.springcloud.client

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
  @GetMapping("/")
  fun hello(): String {
    return "Hello"
  }
}