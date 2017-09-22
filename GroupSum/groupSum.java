import java.util.Arrays;
import java.util.List;

public class groupSum {


	public static void main(String args[]){
		List<Integer> arr = Arrays.asList(2, 1, 4, 5, 3, 3);
		int N = 6;
		int K = 3;

		if(separate(arr,K))
		System.out.println("Partitions into equal sum is possible.\n");
		else
			System.out.println("Partitions into equal sum is not possible.\n");

		
	}
	
	public static boolean separate(List<Integer> arr, int k){
 
		int [] arr1 = arr.stream().mapToInt(Integer::intValue).toArray();
		if (isKPartitionPossible(arr1, arr1.length, k))
			return true;
		else
			return false;
	}

	private static boolean isKPartitionPossible(int[] arr, int N, int K) {
		if (K == 1)
			return true;
		if (N < K)
			return false;
		int sum = 0;
		for (int i = 0; i < N; i++)
			sum += arr[i];
		if (sum % K != 0)
			return false;
		int subset = sum / K;
		int[] subsetSum = new int[K];
		boolean[] taken = new boolean[N];
		for (int i = 0; i < K; i++)
			subsetSum[i] = 0;

		for (int i = 0; i < N; i++)
			taken[i] = false;

		subsetSum[0] = arr[N - 1];
		taken[N - 1] = true;
		if (subset < subsetSum[0])
			return false;
		return isKPartitionPossibleRec(arr, subsetSum, taken,
				subset, K, N, 0, N - 1);
	}

	private static boolean isKPartitionPossibleRec(int arr[], int subsetSum[], boolean taken[], int subset, int K, int N, int curIdx, int limitIdx) {
		if (subsetSum[curIdx] == subset)
		{
			if (curIdx == K - 2)
				return true;
			return isKPartitionPossibleRec(arr, subsetSum, taken, subset,
					K, N, curIdx + 1, N - 1);
		}
		for (int i = limitIdx; i >= 0; i--)
		{
			if (taken[i])
				continue;
			int tmp = subsetSum[curIdx] + arr[i];
			if (tmp <= subset)
			{
				taken[i] = true;
				subsetSum[curIdx] += arr[i];
				boolean nxt = isKPartitionPossibleRec(arr, subsetSum, taken,
						subset, K, N, curIdx, i - 1);

				taken[i] = false;
				subsetSum[curIdx] -= arr[i];
				if (nxt)
					return true;
			}
		}
		return false;
	}

}


//JUnit test cases

1. Null array
2. Array with one element