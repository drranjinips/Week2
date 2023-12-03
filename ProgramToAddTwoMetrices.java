package simple_programs;

public class ProgramToAddTwoMetrices {
//Beneath code defines a method that will do the printing of the matrix.
static void printMatrix(int M[][],
            int rowSize,
            int colSize)
{
for (int i = 0; i < rowSize; i++) {
for (int j = 0; j < colSize; j++)
System.out.print(M[i][j] + " ");

System.out.println();
}
}
//Beneath code defines a method that will do the addition of the matrix.
static int[][] add(int A[][], int B[][],
            int size)
{
int i, j;
int C[][] = new int[size][size];

for (i = 0; i < size; i++)
 for (j = 0; j < size; j++)
     C[i][j] = A[i][j] + B[i][j];

return C;
}
//
/*From here we will start the main method. Now we will enter the matrices A and B*/	
public static void main(String[] args) {
		int size = 4;
		 
        int A[][] = { { 1, 1, 1, 1 },
                      { 2, 2, 2, 2 },
                      { 3, 3, 3, 3 },
                      { 4, 4, 4, 4 } };
        // Print the matrices A
        System.out.println("\nMatrix A:");
      //Here we are calling the printMatrix method to print A and B
        printMatrix(A, size, size);
 
        int B[][] = { { 1, 1, 1, 1 },
                      { 2, 2, 2, 2 },
                      { 3, 3, 3, 3 },
                      { 4, 4, 4, 4 } };
        // Print the matrices B
        System.out.println("\nMatrix B:");
        printMatrix(B, size, size);
     // Function to add the two matrices
        // and store in matrix C
        int C[][] = add(A, B, size);
        
        // Print the result
        System.out.println("\nResultant Matrix:");
        printMatrix(C, size, size);
         
	}

}
