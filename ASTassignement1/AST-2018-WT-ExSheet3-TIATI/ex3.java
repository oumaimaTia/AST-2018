public class Exercice3 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   // Création de la matrice :
        int[][] matrice = new int[100][6];
        for(int i = 0; i < 100; i++){
            matrice[i] = new int[6];
        }
 
        // Remplissage : 
        for(int i = 0; i < 100; i++){
        	matrice[i][0] = 2 * i;
        	matrice[i][1] = (int) Math.pow(i, 0.5);
        	matrice[i][2] = (int) Math.pow(10, i);
        	matrice[i][3] = (int) Math.pow(i, 3);
        	if(i==0)
        		matrice[i][4] = 0;
        	else 
        	matrice[i][4] = (int) Math.pow(2, 1/i);
        	matrice[i][5] = (int) Math.exp(i);
            
        }
        for(int i = 0; i < 100; i++){
        	for(int j = 0; j < 6; j++){
        		System.out.println(i+" "+j+" : "+matrice[i][j]);
        	}
        }
 

	}

}
