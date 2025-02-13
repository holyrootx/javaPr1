package mms.member.action;

import java.util.Scanner;

public class ProgramQuitAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		return;
	}
	
	public void execute() throws Exception {
		System.out.println("프로그램 종료");
		System.exit(0);
	}
	

}
