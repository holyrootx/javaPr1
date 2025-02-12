package mms.member.util;

import java.util.Scanner;

import mms.member.vo.Member;

public class ConsoleUtil {
	static int id = 1;
	// Member를 만들어주는 역할
	public Member getNewMember(Scanner sc) {
		// 회원 입력 기능 작성
		System.out.println("등록할 회원 정보를 입력하세요");
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("주소 : ");
		String addr = sc.next();
		
		System.out.print("국가 : ");
		String nation = sc.next();
		
		System.out.print("이메일 : ");
		String email = sc.next();

		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		
		
		Member newMember = new Member(id++,name, addr, nation, email, age);
		
		return newMember;
	}
	public int getMemberId(Scanner sc) {
		// 회원 입력 기능 작성
		System.out.println("회원 전체를 조회하시려면 0을, 특정 회원을 조회하시려면 id를 입력해주세요");
		System.out.print(">>");
		
		return sc.nextInt();
		
	}
}
