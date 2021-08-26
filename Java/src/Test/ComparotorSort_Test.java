package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ComparotorSort_Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> listNum= new ArrayList<Integer>();
		int num;
		do {
			 num = sc.nextInt();
			 listNum.add(num);
		} while (num!=0);
		Collections.sort(listNum, new Comparator<Integer>() {
			@Override
		    public int compare(Integer a, Integer b) {
		        return a>b?0:1;
		    }
		});
		for (int i = 0; i < listNum.size(); i++) {
			System.out.println(listNum.get(i));
		}
		
	}
}
