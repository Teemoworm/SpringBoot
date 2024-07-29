package com.example.SpringBoot.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delete-api")
public class DeleteAPI {
	//DeleteAPI
		//서버를 통해 리소스를 삭제 하기 위해 사용되는 API
		//일반적으로 @PathVariable을 통해 리소스 ID등을 받아 처리
		//ex)회원탈퇴 등
	
	// http://localhost:8080/delete-api/delete/String 값
	@DeleteMapping("/delete{variable}")
	public String DeleteVariable(@PathVariable String variable) {
		return variable;
	}
}
