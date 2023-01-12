package challenges;

public class SingleElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = { 4 ,1,2,1,2};

		for (int i = 0; i < nums.length; i++) {
			int x = 0;
			for (int j = 1; j < nums.length - 1; j++) {
				if (nums[i] == nums[j]) {
					x++;
				}

			}
			if (x == 0) {
				System.out.println(nums[i]);
			}

		}

	}

}
