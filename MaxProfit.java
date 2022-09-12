
public class MaxProfit {

	public static void main(String[] args) {
		int[] testArray = { 897, 265, 201, 86, 56, 657, 273, 25, 843, 625, 641, 332, 509, 463, 496, 97, 779, 241, 970,
				665, 87, 765, 276 };
		
		// expected output: 945
		System.out.println(optimizedMaxProfit(testArray));
	}

	/*
	 * My original solution fails on LeetCode for large input arrays O(n^2)
	 */
	public static int maxProfit(int[] prices) {

		int maxDiff = 0;

		for (int i = 0; i < prices.length; i++) {
			int buy = prices[i];
			for (int j = i + 1; j < prices.length; j++) {
				int sell = prices[j];
				maxDiff = sell - buy > maxDiff ? sell - buy : maxDiff;
			}
		}
		return maxDiff;
	}

	/*
	 * Here's a linear approach
	 */
	public static int optimizedMaxProfit(int[] prices) {

		int buy = prices[0];
		int profit = 0;

		for (int i = 1; i < prices.length; i++) {

			if (prices[i] < buy) {
				buy = prices[i];
				continue;
			}

			profit = Math.max(prices[i] - buy, profit);

		}

		return profit;
	}
}
