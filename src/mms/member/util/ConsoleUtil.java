package mms.member.util;

import java.util.Scanner;

import mms.member.vo.Member;

public class ConsoleUtil {
	static int id = 1;
	// Member�� ������ִ� ����
	public Member getNewMember(Scanner sc) {
		// ȸ�� �Է� ��� �ۼ�
		System.out.println("����� ȸ�� ������ �Է��ϼ���");
		
		System.out.print("�̸� : ");
		String name = sc.next();
		
		System.out.print("�ּ� : ");
		String addr = sc.next();
		
		System.out.print("���� : ");
		String nation = sc.next();
		
		System.out.print("�̸��� : ");
		String email = sc.next();

		System.out.print("���� : ");
		int age = sc.nextInt();
		
		
		
		Member newMember = new Member(id++,name, addr, nation, email, age);
		
		return newMember;
	}
	public int getMemberId(Scanner sc) {
		// ȸ�� �Է� ��� �ۼ�
		System.out.println("ȸ�� ��ü�� ��ȸ�Ͻ÷��� 0��, Ư�� ȸ���� ��ȸ�Ͻ÷��� id�� �Է����ּ���");
		System.out.print(">>");
		
		return sc.nextInt();
		
	}
}
