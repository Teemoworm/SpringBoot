package com.example.SpringBoot.Controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot.DTO.MemberDTO;

@RestController
@RequestMapping("/post-api")
public class PostAPI {

	// http://localhost:8080/post-api/member
	//body 값 
	//	{
	//	  "name" : "hong",
	//	  "email" : "123@abc.com",
	//	  "organization" : "organization"
	//	}
	@PostMapping("/member")
	public String postMember(@RequestBody Map<String, Object> postData) {
		StringBuilder sb = new StringBuilder();

		postData.entrySet().forEach(map -> {
			sb.append(map.getKey() + ":" + map.getValue() + "\n");
		});
		return sb.toString();
	}

	// DTO 사용
	// http://localhost:8080/post-api/member2
	//get에서는 @RequestBody가 없었지만 post에서는 없으면 출력불가
	//위 body값 입력
	@PostMapping("/member2")
	public String postMemberDTO(@RequestBody MemberDTO memberDTO) {
		return memberDTO.toString();
	}
}
