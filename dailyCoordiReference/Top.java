package dailyCoordiReference;

import java.util.*;

// Clothes 클래스 상속 
public class Top extends Clothes {
	
	public String temp1() {
		String[] top1 = {"폴라티", "긴팔티", "후드티", "맨투맨"};
		shuppleArray(top1);
		return randomClothes;
	}
	public String temp2() {
		String[] top2 = {"긴팔티", "후드티", "맨투맨"};
		shuppleArray(top2);
		return randomClothes;
	}
	public String temp3() {
		String[] top3 = {"블라우스/셔츠", "긴팔티"};
		shuppleArray(top3);
		return randomClothes;
	}
	public String temp4() {
		String[] top4 = {"반팔티", "반팔셔츠"};
		shuppleArray(top4);
		return randomClothes;
	}
	public String temp5() {
		String[] top5 = {"반팔티", "나시티"};
		shuppleArray(top5);
		return randomClothes;
	}
}
