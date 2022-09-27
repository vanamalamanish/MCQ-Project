package com.cts.questions.openFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(url = "http://localhost:8081/auth",name="auth-service")
public interface AuthFeignConfig {

	@GetMapping("/validate")
	public ResponseEntity<Boolean> validate(@RequestHeader(name = "Authorization") String token1);
}
