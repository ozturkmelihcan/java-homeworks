package homework003;

public class Homework001 {

	public static void main(String[] args) {
		// BİR DİZİDE 13 VAR İSE 13 VE BİR SONRAKİ ELEMANI TOPLAMA EKLEMEDEN SONUCU
		// BULAN PROGRAM.
		// int nums[] = {1 ,13,13,15,13,2,5,6,13,1}

		int nums[] = { 1, 13, 13, 15, 13, 2,5,6,13, 5, 6, 13, 1, 13, 1,15 };
		
		int toplam = 0;
		
		
		for (int i = 0; i < nums.length; i++) {
				if(nums[i]==13) {
					i++;
					while(nums[i]==13) {
						i++;
					}
					
					
				}else
					toplam=toplam+nums[i];
			
			
			}
			System.out.println(toplam);
		}
		
	}


