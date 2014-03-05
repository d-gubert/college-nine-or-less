
package nineless;

/**
 *
 * @author Douglas Gubert <douglas.gubert@gmail.com>
 */
public class NineLess {

	public static void main(String[] args) {
		firstSolution();
	}

	public static void firstSolution () {
		long answer = 0;
		for (long seed = 999999999999L; seed >= 100000000000L; seed--) {
			if ((seed % 999999999) == 0) System.out.println(seed+" "+answer);
			boolean valid = true;
			String num = String.valueOf(seed);
			for (int i = 0; i < 10; i++) {
				String[] nums = num.substring(i, i+3).split("");
				if (Integer.valueOf(nums[1]) + Integer.valueOf(nums[2]) + Integer.valueOf(nums[3]) > 9) {
//					System.out.println("FALSE!!!!:::" + seed);
					valid = false;
					break;
				}
			}
			if (valid) {
				System.out.println(num);
				answer++;
			}
		}
		System.out.println(answer);
	}

}
