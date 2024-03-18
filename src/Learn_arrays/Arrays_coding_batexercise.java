package Learn_arrays;

import java.util.HashMap;
import java.util.Map;

public class Arrays_coding_batexercise {

	public static void main(String[] args) {

	}

	private int n11;
	private int n21;

	public boolean firstLast6(int[] nums) {
		if (nums[0] == 6 || (nums[nums.length - 1]) == 6) {
			return true;
		} else {
			return false;
		}
	}

	public boolean commonEnd(int[] a, int[] b) {
		if (a.length >= 1 && b.length > 1 && a[0] == a[a.length - 1] && b[0] == b[b.length - 1]) {
			return true;
		} else {
			return false;
		}
	}
		public boolean stringE(String str) {
			if (str.length() > 1 && str.substring(1, 4).equals("e")) {
				  return true;
			  }
			  else {
				  return false;
			  }


	}

	public int sum3(int[] nums) {
		int sum = 0;
		for (int total : nums) {
			sum = sum + total;
		}
		return sum;

	}

	public int[] reverse3(int[] nums) {

		return new int[] { nums[2], nums[1], nums[0] };

		}

		public int[] rotateLeft3(int[] nums) {
			return new int[] { nums[1], nums[2], nums[0] };

		}

		public int[] maxEnd3(int[] nums) {
			if (nums[0] > nums[2]) {
				return new int[] { nums[0], nums[0], nums[0] };
			}
			if (nums[2] > nums[0]) {
				return new int[] { nums[2], nums[2], nums[2] };
			} else {
				return new int[] { nums[0], nums[1], nums[2] };
			}

		}

		public int[] sum2(int[] nums) {
			  if(nums.length>=3|| nums.length==2) {
				  return new int[] {nums[0]+nums[1]};
			  }
				else {
					return new int[] { nums[0] };
			  }

			  
		}

		public int[] makeLast(int[] nums) {
			int len = 2 * nums.length;
			int[] nums1 = new int[len];
			nums1[len - 1] = nums[nums.length - 1];

			return nums1;
     }

		public int[] fix23(int[] nums) {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 2 && nums[i + 1] == 3) {
					nums[i + 1] = 0;

				}

			}
			return nums;
		}

		public int start1(int[] a, int[] b) {
			int count = 0;
			if (a.length > 0 && a[0] == 1) {
				count++;
			}
			if (b.length > 0 && b[0] == 1) {
				count++;
			}
			return count;
		}

		public int[] biggerTwo(int[] a, int[] b) {
			if (a[0] + a[1] > b[0] + b[1]) {
				return new int[] { a[0], a[1] };
			} else if (b[0] + b[1] > a[0] + a[1]) {
				return new int[] { b[0], b[1] };
			} else {
				return new int[] { a[0], a[1] };
			}

		}

		public int[] makeMiddle(int[] nums) {
			int[] array = new int[2];
			for (int i = 0; i < nums.length; i++) {
				if (nums.length >= 2) {
					nums[1] = array[0];
					nums[2] = array[1];

				}
				return new int[] { array[0], array[1] };
			}
			return nums;
		}

		public int[] makeMiddl(int[] nums) {
			return new int[] { nums[nums.length / 2 - 1], nums[nums.length / 2] };

		}

		public int[] swapEnds(int[] nums) {
			int[] array = new int[nums.length];

			if (nums.length > 1) {
				nums = array;
				nums[0] = array[nums.length - 1];
				nums[nums.length - 1] = array[0];
				return array;
			}
			else {
				return nums;
			}

		}

		public int[] midThree(int[] nums) {
			int len = nums.length;
			if (len > 3) {
				return new int[] { nums[len / 3], nums[len / 3 + 1], nums[len / 3 + 2] };
			} else {
				return nums;
			}
		}

		public int maxTriple(int[] nums) {
			int maximum = Integer.MIN_VALUE;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] > maximum) {
					maximum = nums[i];
				}

			}
			return maximum;
		}

		public int[] frontPiece(int[] nums) {
			if (nums.length >= 3) {
				return new int[] { nums[0], nums[1] };
			} else {
				return nums;
			}
		}

		public boolean unlucky1(int[] nums) {
			if (nums.length >= 2 && nums[0] == 1 && nums[1] == 3
					|| nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3) {
				return true;
			}
			for (int i = 0; i < nums.length; i++) {
				if (nums.length >= 3 && nums[i] == 1 && nums[i + 1] == 3) {
					return true;
				}
			}
			return false;
			}

			public boolean arrayFront9(int[] nums) {
				for (int i = 0; i < nums.length; i++) {
					if (nums.length >= 1 && nums[i] == 9) {
						return true;
					}
				}
				return false;
			}

			public int stringMatch(String a, String b) {
				int count = 0;
				if (a.length() >= 2 && b.length() >= 2) {
				for (int i = 0; i < a.length() - 1 && i < b.length() - 1; i++) {

					if (a.substring(i, i + 2).equals(b.substring(i, i + 2)))
						count++;
				}
			}

				return count;
			}

			public String stringX(String str) {

				String temp = "";

				for (int i = 0; i < str.length(); i++) {
					if (!(i > 0 && i < str.length() - 1 && str.charAt(i) == 'x')) {
						temp += str.charAt(i);

				}

			}
			return str;

		}

		public int array667(int[] nums) {
			int count = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 6) {
					if (nums[i + 1] == 6 || nums[i + 1] == 7)
					return count++;
				}
			}
			return count;

		}

		public String stringYak(String str) {
			String temp = "";
			for (int i = 0; i < str.length(); i++) {
				if (!(str.length() >= 3 && str.substring(i, i + 3).equals("yak"))) {
					temp = temp + str;
				}
			}
			return str;

		}

		public boolean noTriples(int[] nums) {

			for (int i = 0; i < nums.length - 2; i++) {
				if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) {
					return false;

				}
			}
			return true;

		}

		public boolean has271(int[] nums) {

			for (int i = 0; i < nums.length; i++) {
				int x = nums[i];
				if (nums[i + 1] == x + 5 && Math.abs(nums[i + 2] - (x - 5)) <= 2) {
					return true;
				}
			}
			return false;

		}

		public String stringBits(String str) {
			String str1 = " ";
			for (int i = 0; i < str.length(); i = i + 2) {
				str1 = str.charAt(i) + str1;
			}
			return str1;

		}

		public int countEvens(int[] nums) {
			int count = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] / 2 == 0 || nums[i] == 0) {
					count++;
				}
			}

			return count;
		}

		public int bigDiff(int[] nums) {
			int n1 = nums[0];
			int n2 = nums[0];

			for (int i = 0; i < nums.length; i++) {
				n1 = Math.max(nums[0], nums[i]);
				n2 = Math.min(nums[0], nums[i]);


			}
			
			return (n1 - n2);
		}

		public int centeredAverage(int[] nums) {
			int n1 = nums[0];
			int n2 = nums[0];
			for (int i = 0; i < nums.length; i++) {
				n1 = Math.max(nums[0], nums[i]);
				n2 = Math.min(nums[0], nums[i]);

			}
			return (n1 + n2) / 2;
		}

		public int sum13(int[] nums) {
			int sum = 0;
			for (int i = 0; i < nums.length; i++) {
				if(nums[i]==13) {
					i++;
				}
				else {
					sum=sum+nums[i];
					i++;
				}
			}
			return sum;
		}

		public int sum67(int[] nums) {

			int sum = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 6 && nums[i + 1] == 7) {
					i++;
				}
				else {
					sum = sum + nums[i];
				}

			}
			return sum;

		}

		public boolean has22(int[] nums) {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 2 && nums[i + 1] == 2) {
					return true;
				}
			}
			return false;

		}

		public boolean lucky13(int[] nums) {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 1 || nums[i] == 3) {
					return false;
				}
			}
			return true;

		}

		public boolean sum28(int[] nums) {
			int sum = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 2) {
					sum = sum + nums[i];
					if (sum == 8) {
						return true;
					}

				}

			}

			return false;
		}
		public boolean more14(int[] nums) {
			int count1=0;int count4=0;
			for(int i=0;i<nums.length;i++) {
				if (nums[i] == 1) {
					count1++;
				
				}
				if (nums[i] == 4) {
					count4++;
						
						
						
				}
			}

			return (count1 > count4);

}

public int[] fizzArray(int n) {
	
	
	int [] fizzArray= new int[n];

	for (int i = 0; i < n; i++) {
		fizzArray[i] = i;

	}
	return fizzArray;

}

public boolean only14(int[] nums) {

	for (int i = 0; i < nums.length; i++) {
		if (nums[i] != 1 || nums[i] != 4) {
			return true;
		}
}
	return false;
}

public String[] fizzArray2(int n) {
	String[] fizzArray2 = new String[n];
	for (int i = 0; i < n; i++) {
		fizzArray2[i] = String.valueOf(i);
	}
	return fizzArray2;

}

public boolean no14(int[] nums) {
	for (int i = 0; i < nums.length; i++) {
		if (nums[i] == 1) {
			return true;
		} else if (nums[i] == 4) {
			return true;
		}
	}
	return false;

}

public boolean either24(int[] nums) {
    boolean h1=false; boolean h2= false;
	for(int i=0;i<nums.length;i++) {
		if(nums[i]==4 && nums[i+1]==4) {
			h1= true;
		}
		if(nums[i]==2 && nums[i+1]==2) {
			h2= true;
	}
  }
	return (!h1 && !h2);

  }

	public boolean isEverywhere(int[] nums, int val) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				return true;
			}

		}
		return false;

	}

	public int matchUp(int[] nums1, int[] nums2) {
		int count = 0;
		for (int i = 0; i < nums1.length && i < nums2.length; i++) {
			if ((nums1[i] - nums2[i] <= Math.abs(2)) && nums1[i] != nums2[i])
				count++;
			}

		return count;

	}

	public boolean haveThree(int[] nums) {

		int threes = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3) {
				threes++;
			}
		}
		if (threes != 3) {
			return false;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3 && nums[i + 1] == 3) {
				return false;
			}
		}
		return true;
	}

	public boolean twoTwo(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) {
				count++;
			}
		}
		if (count != 2) {
			return false;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2 && nums[i + 1] == 2) {
				return true;
			}
		}
		return false;
	}

	public boolean tripleUp(int[] nums) {

		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i + 1] == nums[i] + 1 && nums[i + 2] == nums[i] + 2) {
				return true;
			}
		}
		return false;

	}

	public int[] fizzArray3(int start, int end) {
		int[] array1 = new int[end - start];
		for (int i = start; i < end; i++) {
			array1[i - start] = i;
		  }
			return array1;
	}

	public int[] shiftLeft(int[] nums) {

		if (nums.length < 2) {
			return nums;
		}
		int first = nums[0];

//		int[] array1 = new int[nums.length];

		for (int i = 1; i < nums.length; i++)
			nums[i - 1] = nums[i];
			first = nums[nums.length - 1];

			return nums;


	}

	public int[] pre4(int[] nums) {
		
		int[] array1 = new int[0];
		for (int i = 0; i < nums.length; i++) {

			
			
			if (nums[i] == 4 && nums.length - 1 > 1)
				return new int[i - 1];
			else if (nums.length == 1 && nums[i] == 4)
				return new int[0];
		}

		return nums;
	}

	public Map<String, String> mapBully(Map<String, String> map) {

		if (map.containsKey("a")) {
			map.put("b", map.get("a"));
			map.put("a", "");
		}
		return map;

	}

	public Map<String, String> mapShare(Map<String, String> map) {
		if (map.containsKey("a")) {
			map.put("b", map.get("a"));
		}
		if (map.containsKey("c")) {
			map.remove("c");
		}
		return map;
	}

	public Map<String, String> mapAB(Map<String, String> map) {
		if(map.containsKey("a")&& map.containsKey("b")) {
			map.put("ab", map.get("a") + map.get("b"));
		}
		return map;
		  
	}

	public Map<String, String> topping1(Map<String, String> map) {
		if (map.containsKey("ice cream")) {
			map.put("ice cream", "cherry");
		}
			map.put("bread","butter");
		
		return map;
	}
	public Map<String, String> topping2(Map<String, String> map) {
		  if(map.containsKey("ice cream")) {
				map.put("yoghurt", map.get("icecream"));
		  }
			if (map.containsKey("spinach")) {
		  map.put("spinach", "nuts");
			}

			return map;
		}

		public Map<String, String> topping3(Map<String, String> map) {
			if (map.containsKey("potato")) {
				map.put("fries", map.get("potato"));
			}
			if (map.containsKey("salad")) {
				map.put("spinach", map.get("spinach"));
			}
			return map;
		}

		public Map<String, String> mapAB2(Map<String, String> map) {

			if (map.containsKey("a") && map.containsKey("b")) {
				if (map.get("a") == map.get("b")) {
					map.remove("a");
					map.remove("b");
				}
			}

			return map;

		}

		public Map<String, String> mapAB3(Map<String, String> map) {

			if (map.containsKey("a") && !map.containsKey("b")) {
				map.put("b", map.get("a"));

			}
			if (map.containsKey("b") && !map.containsKey("a")) {

				map.put("a", map.get("b"));
			}
			return map;
		}

		public Map<String, String> mapAB4(Map<String, String> map) {

			if (map.containsKey("a") && map.containsKey("b")) {
				int x = map.get("a").length();
				int y = map.get("b").length();
				if (x > y) {
					map.put("c", map.get("a"));
				} else if (y > x) {
					map.put("c", map.get("b"));
				}

				else {
					map.put("a", "");
					map.put("b", "");
				}

			}
			return map;
		}

		public Map<String, Integer> word0(String[] strings) {
			Map<String, Integer> map = new HashMap<>();

			for (String s : strings) {
				map.put(s, 0);
			}
			return map;
		}

		public Map<String, Integer> wordLen(String[] strings) {
			Map<String, Integer> map = new HashMap<>();

			for (String s : strings) {
				map.put(s, s.length());

			}
			return map;
		}

		public Map<String, String> pairs(String[] strings) {
			Map<String, String> map = new HashMap<>();
			for (int i = 0; i < strings.length; i++) {
				String temp = strings[i];
				String first = String.valueOf(temp.charAt(0));
				String last = String.valueOf(temp.charAt(temp.length() - 1));
				map.put(first, last);
			}
			return map;
		}

		public Map<String, Integer> wordCount(String[] strings) {

			Map<String, Integer> map = new HashMap<>();


			for (int i = 0; i < strings.length; i++) {
				if (map.containsKey(strings[i])) {
					map.put(strings[i], map.get(strings[i]));
				} else {
					map.put(strings[i], 1);
				}
			}
			
			return map;
		}

		public Map<String, Boolean> wordMultiple(String[] strings) {
			Map<String, Boolean> map = new HashMap<>();
			for (int i = 2; i < strings.length - 2; i++) {
				if (map.containsKey(strings[i])) {
					boolean b1 = map.get(strings) == true;

				} else {
					boolean b1 = map.get(strings) == false;
				}
			}
			return map;
			}




	}


