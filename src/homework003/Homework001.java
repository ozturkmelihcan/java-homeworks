package homework003;

public class Homework001 {

	public static void main(String[] args) {
		// BİR DİZİDE 13 VAR İSE 13 VE BİR SONRAKİ ELEMANI TOPLAMA EKLEMEDEN SONUCU
		// BULAN PROGRAM.
		// int nums[] = {1 ,13,13,15,13,2,5,6,13,1}

		int nums[] = { 13, 13, 1, 13, 13, 2, 5, 13, 1, 13, 2, 2, 2, 2, 13, 13, 2, 2, 13, 2 };
		int toplam = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] != 13) {
				toplam += nums[i];

			} else if (nums[i] == 13) {

				if (nums[i] == nums[i + 1]) {
					i--;
				}
				i++;
			}

		}
		if (nums[nums.length - 2] != 13 && nums[nums.length - 1] != 13) {
			toplam += nums[nums.length - 1];
			
		}System.out.println(toplam);
	}
}
