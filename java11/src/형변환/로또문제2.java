package 형변환;

import java.util.HashSet;
import java.util.Random;

public class 로또문제2 {

	public static void main(String[] args) {
		Random random = new Random(42);
		HashSet lotto = new HashSet();
		System.out.println(lotto.size());
		
		for (int i = 0; i < 10; i++) {
			lotto.add(random.nextInt(10));
		}
		System.out.println(lotto.size());
		System.out.println(lotto);
	}

}
