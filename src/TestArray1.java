
public class TestArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]);
			System.out.print(" ");
		}
		System.out.println("\n");
		for(int i=array.length-1;i>=0;i--){
			System.out.print(array[i]);
			System.out.print(" ");
		}
		
		System.out.println("\n");
		for(int i=array.length-1;i>=0;i--){
			if(array[i]>3){
				System.out.print(array[i]);
				System.out.print(" ");
			}	
		}
		
		System.out.println("\n");
		for(int i=array.length-1;i>=0;i--){
			if(array[i]%2==0){
				System.out.print(array[i]);
				System.out.print(" ");
			}	
		}
		System.out.println();
		System.out.println();
		int max = array[0];
		for(int i=array.length-1;i>=0;i--){
			if(array[i]>max){
				max = array[i];
			}	
		}		
		System.out.println("le maximum est "+max);

		System.out.println();
		System.out.println();
		int min = array[0];
		for(int i=array.length-1;i>=0;i--){
			if(array[i]<min){
				min = array[i];
			}	
		}		
		System.out.println("le minimum est "+min);
	}

}
