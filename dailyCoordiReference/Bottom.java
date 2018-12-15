package dailyCoordiReference;

import java.util.*;

// Clothes 클래스 상속 
public class Bottom extends Clothes {
	
	String[] bottom1 = {"데님팬츠", "슬랙스", "면바지", "스키니", "일자팬츠", "멜빵바지"};
	String[] bottom3 = {"면반바지", "데님반바지"};
	
	public String temp1() {
		shuppleArray(bottom1);
		return randomClothes;
	}
	public String temp2() {
		shuppleArray(bottom1);
		return randomClothes;
	}
	public String temp3() {
		shuppleArray(bottom1);
		return randomClothes;
	}
	public String temp4() {
		shuppleArray(bottom3);
		return randomClothes;
	}
	public String temp5() {
		shuppleArray(bottom3);
		return randomClothes;
	}
}
