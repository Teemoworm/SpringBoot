package com.example.SpringBoot.DTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//@AllArgsConstructor 모든 변수를 파라미터로 같는 생성자 생성
//@NoArgsConstructor 파라미터가 없는 생성자 생성
public class MemberDTO {

	private String name;
	private String email;
	private String organization;
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getOrganization() {
//		return organization;
//	}
//	public void setOrganization(String organization) {
//		this.organization = organization;
//	}
//	@Override
//	public String toString() {
//		return "MemberDTO [name=" + name + ", email=" + email + ", organization=" + organization + "]";
//	}
	
	
}
