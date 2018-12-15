package dailyCoordiReference;

import java.util.*;

public abstract class Clothes {
	private String temp;
	public String randomClothes;
	
	// 문자 배열 섞기 
	protected void shuppleArray(String[] arr){
		List<String> Shupple = Arrays.asList(arr);
		randomClothes = Shupple.get(0).toString();
	}
	
	// temperature
	abstract public String temp1(); // ~ 5°C
	abstract public String temp2(); // 5 ~ 12°C
	abstract public String temp3(); // 12 ~ 19°C
	abstract public String temp4(); // 19 ~ 25°C
	abstract public String temp5(); // 25°C ~
}
