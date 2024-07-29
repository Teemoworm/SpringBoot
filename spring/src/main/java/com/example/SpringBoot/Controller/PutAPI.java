package com.example.SpringBoot.Controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot.DTO.MemberDTO;

@RestController
@RequestMapping("/put-api")
public class PutAPI {
	//PutAPI
	//기본적인 조작법은 PostAPI와 동일
	//해당 리소스가 존재하면 갱신하고, 리소스가 없으 경우에는 새로 생성해주는 API
	//업데이트를 위한 메소드
	
	//Body값
	// http://localhost:8080/put-api/member
	//	{
	//		"name" : "hong",
	//		"email" : "123@abc.com",
	//		"organization" : "organization"
	//	}
	
	@PutMapping("/member")
	public String putMember(@RequestBody Map<String, Object> putData) {
		StringBuilder sb = new StringBuilder();

		putData.entrySet().forEach(map -> {
			sb.append(map.getKey() + ":" + map.getValue() + "\n");
		});
		return sb.toString();
	}
	// http://localhost:8080/put-api/member1
	//입력된 String으로 출력
	@PutMapping("/member1")
	public String putMemberDto1(@RequestBody MemberDTO memberDTO) {
		return memberDTO.toString();
		//toString으로 가공한 String memberDTO의 출력값
		//MemberDTO [name=hong, email=123@abc.com, organization=organization]
	}
	// http://localhost:8080/put-api/member2
	//MemberDTO 를 직접 출력
	@PutMapping("/member2")
	public MemberDTO putMemberDto2(@RequestBody MemberDTO memberDTO) {
		return memberDTO;
		//가공하지 않은 DTO 값의 출력값
		//	{
		//		"name": "hong",
		//		"email": "123@abc.com",
		//		"organization": "organization"
		//	}
		//가공되지 않은 값을 더 좋아함
	}
	
	//ResponseEntity
		//Spring Framework에서 제공하는 클래스 중 HttpEntity라는 클래스를 상속받아 사용하는 클래스
		//사용자의 HttpRequest(출력되는 http)에 대한 응답 데이터(200(응답 성공),404(경로를 찾을 수 없음)같은 status)를 포함
		//이런 status등을 상세하게 직접 구분하기 위해 쓸 수 있음
		//포함하는 클래스
		//-HttpStatus
		//-HttpHeaders
		//-HttpBody
		//
	// http://localhost:8080/put-api/member3
	@PutMapping("/member3")
	public ResponseEntity<MemberDTO> putMemberDto3(@RequestBody MemberDTO memberDTO) {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(memberDTO);
		//ACCEPTED 사용으로 코드값 202로 츨력됨
	}
	
}
