
public class TestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array={1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
		int moy = 0;
		for(int i=0;i<array.length;i++){
			moy += array[i]; 
		}
		System.out.println("La moyenne est: "+(moy/array.length));
		
		for(int i=0;i<array.length;i++){
			if(array[i]==15){
				System.out.println("L'indexe de l'entier 15 est "+i);
			}
		}
		
		int num;
		int doublon = 0;
		
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[j]==array[i]){
					doublon++;
					System.out.println(i+" "+j);
					break;				}
			}	
		}
		System.out.println("Le nombre de doublon est "+doublon);
		
		
	}

}
