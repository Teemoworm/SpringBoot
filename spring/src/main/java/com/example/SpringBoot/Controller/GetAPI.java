package com.example.SpringBoot.Controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringBoot.DTO.MemberDTO;

@RestController
@RequestMapping("/get-api")
public class GetAPI {
	//http://localhost:8080/get-api/hello
	@GetMapping("/hello")
	public String hello() {
		return "Hello World!";
	}
	//http://localhost:8080/get-api/variable1/{String 값}
	@GetMapping("/variable1/{variable}")
	public String getVariable1(@PathVariable String variable) {
		return variable;	
	}
	//http://localhost:8080/get-api/variable2/{String 값}
	//@PathVariable("variable")가 있으면 변수가 달라도 적용됨
	@GetMapping("/variable2/{variable}")
	public String getVariable2(@PathVariable("variable") String var) {
		return var;	
	}
	//http://localhost:8080/get-api/request1?name=Stinrg값&email=String값&organization=String값
	//복수 형태로 전달할 경우 &를 사용함
	@GetMapping("/request1")
	public String getRequestParaml(
			@RequestParam String name,
			@RequestParam String email,
			@RequestParam String organization) {
		return name + " " + email + " " + organization;
	}
	//어떤 요청값이 들어올지 모를 경우
	//http://localhost:8080/get-api/request2?key1=value1&key2=value2&...
	@GetMapping("/request2")
	public String getRequestParam2(@RequestParam Map<String,String> param) {
		StringBuilder sb = new  StringBuilder();
		
		param.entrySet().forEach(map->{
			sb.append(map.getKey() +":"+map.getValue()+"\n");
		});
		
		return sb.toString();
	}
	//DTO 사용
	//http://localhost:8080/get-api/request3?name=Stinrg값&email=String값&organization=String값
	@GetMapping("/request3")
	public String getRequestParam3(MemberDTO memberDTO) {
		return memberDTO.toString();
	}
}
