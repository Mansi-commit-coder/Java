import java.util.*;
public class pattern6 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the row : \n");
        System.out.print("Enter the column : ");

        int row = sc.nextInt();
		int col = sc.nextInt();
		for (int i = 1; i <=row; i++) {
			for (int j = 1; j <= col; j++) 
				if((i==1 || i==col) || (j==1 || j==col))
					System.out.print("*");
				else
					System.out.print(" ");
			
			System.out.println();
        }
    }
    
}
