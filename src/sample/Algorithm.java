

package sample;

import java.util.Random;

public class Algorithm {

    private Integer [][] matrix;

    public Algorithm(int inputFromMainWindow){
        matrix = new Integer [inputFromMainWindow][inputFromMainWindow];
        fillMatrix();
    }

    public void runAlgorithm(){
        int sum=0;
        int lastNumber;
        for (int iteration=0; iteration<10; iteration++) {
            sum=0;
            for (int i = 0; i < matrix.length; i++) {
                sum = sum + matrix[i][(matrix.length) - 1];
                lastNumber = matrix[i][(matrix.length) - 1];
                for (int j=0; j<matrix[0].length; j++){
                    matrix[i][j] ++;
                }
            }
            // put in the bar chart the lastNumbers of all the matrix. Then clean and repeat for each iteration.
            //put in the line chart the value of sum for each iteration to see its evolution
        }
    }

    public void fillMatrix(){
        Random rand = new Random();
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                matrix[i][j] = rand.nextInt(30);
            }
        }
    }
}
