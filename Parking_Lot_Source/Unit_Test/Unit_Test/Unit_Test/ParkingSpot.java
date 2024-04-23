public class ParkingSpot{
	
	int[] arr = new int[10];


	public int AllocateSpot(){
		int spot = 0;
		for (int i = 0; i < 10; i++){
			if(arr[i] == 0) {
				spot = i + 1;
				arr[i] = i + 1;
				break;
			}
		}
		return spot;
	}

	//spot information
	public int CountEmptySpots(){
		int checkspot = 0;
		for(int i = 0; i < 10; i++){
			if(arr[i] != 0){
				return 1;
			}
			else if(arr[i] == 0){
				checkspot++;
			}
		}
		return checkspot;
	}

	//spot information print enhance
	public void PrintSpotAvailability(){
		System.out.print("\nSpot status : ");
		for(int i = 0; i < 10; i++){
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}

	public void FreeSpot (int num){
		arr[num] = 0;
	}


}