package dailyCoordiReference;

import java.util.*;

// Clothes 클래스 상속 
public class Outer extends Clothes {
	
	public String temp1() {
		String[] outer1 = {"롱패딩"};
		shuppleArray(outer1);
		return randomClothes;
	}
	public String temp2() {
		String[] outer2 = {"코트", "야상", "트러커", "후리스"};
		shuppleArray(outer2);
		return randomClothes;
	}
	public String temp3() {
		String[] outer3 = {"가디건", "라이더자켓", "후드집업", "트렌치코트", "청자켓"};
		shuppleArray(outer3);
		return randomClothes;
	}
	// 19°C ~ 경우 아우터 x 
	public String temp4() {
		String[] outer4 = {"너무 덥습"};
		shuppleArray(outer4);
		return randomClothes;
	}
	public String temp5() {
		String[] outer5 = {"너무 덥습"};
		shuppleArray(outer5);
		return randomClothes;
	}
}
