import java.util.Arrays;

public class TestArrayTri {

	public static void main(String[] args) {
		
		int[] array={1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		int[] arraybis= array.clone();
		
		for(int i=0;i<array.length;i++){
			int min = array[i];
			int indmin = i;
			for(int j=i+1;j<array.length;j++){
				if(array[j]<min){
					min = array[j];
					indmin = j;
				}
			}
			array[indmin]=array[i];
			array[i]=min;
		}
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
		Arrays.sort(arraybis);
		for(int i=0;i<array.length;i++){
			System.out.print(arraybis[i]+" ");
		}
		
		
	}
}
