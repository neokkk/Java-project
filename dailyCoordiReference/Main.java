package dailyCoordiReference;

import java.util.*;

public class Main {
	
	// 메세지 출력 함수 
	static void printMessage(String text, String result){
	System.out.println("오늘의 추천 " + text + "는? " + result + " (입)니다.");
	}

	public static void main(String[] args) {
		
		String userName;
		double scanTemp;
		boolean tOf = true;
		
		System.out.println("이름을 입력해주세요.");
		// 사용자의 이름 입력받기
		Scanner scan = new Scanner(System.in);
		userName = scan.nextLine();
		
		System.out.println(userName + "님 안녕하세요. 오늘 기온은 몇 °C인가요?");
		// 오늘 기온 받기 
		scanTemp = scan.nextDouble();
		
		System.out.println("감사합니다. " + scanTemp + "°C 에 맞는 옷을 추천해 드릴게요!");
		
		// 반복될 부분 
		while(tOf) {
			
			System.out.println("\n**********************");
			System.out.println("1. 아우터");
			System.out.println("2. 상의");
			System.out.println("3. 하의");
			System.out.println("0. 종료");
			
			int userMenu;
			
			// 메뉴 정보 받기 
			try { 
				userMenu = scan.nextInt();
            } catch(Exception e) {
                System.out.println("0 ~ 3 까지의 숫자를 입력해주세요");
                continue;
            }
			
			// 인스턴스 생성하기
			Outer outer = new Outer();
			Top top = new Top();
			Bottom bottom = new Bottom();
			
			// 값 저장용 변수 
			String tmp;
			
			switch(userMenu) {
				// 아우터 선택 
				case 1 : 
					if (scanTemp < 5) { // 5°C 미만일 경우 
						tmp = outer.temp1();
						printMessage("아우터", tmp);
					} else if (scanTemp >= 5 && scanTemp < 12) { // 5 ~ 12°C일 경우 
						tmp = outer.temp2();
						printMessage("아우터", tmp);
					} else if (scanTemp >= 12 && scanTemp < 19) { // 12 ~ 19°C일 경우 
						tmp = outer.temp3();
						printMessage("아우터", tmp);
					} else if (scanTemp >= 19 && scanTemp < 25) { // 19 ~ 25°C일 경우 
						tmp = outer.temp4();
						printMessage("아우터", tmp);
					} else if (scanTemp >= 25) { // 25°C 이상일 경우 
						tmp = outer.temp5();
						printMessage("아우터", tmp);
					}
				break;
					
				// 상의 선택 
				case 2 : 
					if (scanTemp < 5) { // 5°C 미만일 경우 
						tmp = top.temp1();
						printMessage("상의", tmp);
					} else if (scanTemp >= 5 && scanTemp < 12) { // 5 ~ 12°C일 경우 
						tmp = top.temp2();
						printMessage("상의", tmp);
					} else if (scanTemp >= 12 && scanTemp < 19) { // 12 ~ 19°C일 경우 
						tmp = top.temp3();
						printMessage("상의", tmp);
					} else if (scanTemp >= 19 && scanTemp < 25) { // 19 ~ 25°C일 경우 
						tmp = top.temp4();
						printMessage("상의", tmp);
					} else if (scanTemp >= 25) { // 25°C 이상일 경우 
						tmp = top.temp5();
						printMessage("상의", tmp);
					}
				break;
					
				// 하의 선택 
				case 3 :
					if (scanTemp < 5) { // 5°C 미만일 경우 
						tmp = bottom.temp1();
						printMessage("하의", tmp);
					} else if (scanTemp >= 5 && scanTemp < 12) { // 5 ~ 12°C일 경우 
						tmp = bottom.temp2();
						printMessage("하의", tmp);
					} else if (scanTemp >= 12 && scanTemp < 19) { // 12 ~ 19°C일 경우 
						tmp = bottom.temp3();
						printMessage("하의", tmp);
					} else if (scanTemp >= 19 && scanTemp < 25) { // 19 ~ 25°C일 경우 
						tmp = bottom.temp4();
						printMessage("하의", tmp);
					} else if (scanTemp >= 25) { // 25°C 이상일 경우 
						tmp = bottom.temp5();
						printMessage("하의", tmp);
					}
				break;
				
				// 프로그램 종료 
				case 0 :
					System.out.println("프로그램을 종료합니다.");
					tOf = false;
					break;
					
				default :
					System.out.println("0 ~ 3 까지의 숫자를 입력해주세요.");
					break;
			} // switch end 
		} // while end
	} 

}