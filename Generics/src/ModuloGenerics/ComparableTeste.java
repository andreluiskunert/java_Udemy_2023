package ModuloGenerics;

import java.util.TreeSet;

public class ComparableTeste {
  public static void main(String[] args) {
	TreeSet<Integer> nums = new TreeSet<>();
	nums.add(10);
	nums.add(9);
	nums.add(8);
	nums.add(7);
	nums.add(6);
	nums.add(5);
	nums.add(4);
	nums.add(3);
	nums.add(2);
	nums.add(1);
	nums.add(0);
 for(Integer n: nums) {
	 System.out.println(n);
 }

	
}
}
