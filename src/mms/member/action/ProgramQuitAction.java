package mms.member.action;

import java.util.Scanner;

public class ProgramQuitAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		return;
	}
	
	public void execute() throws Exception {
		System.out.println("���α׷� ����");
		System.exit(0);
	}
	

}
