package com.jrm.springcloud.client

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class EchoController {
  @GetMapping("/{echo}")
  fun echo(@PathVariable("echo") echo: String): String {
    return "Hello $echo"
  }
}