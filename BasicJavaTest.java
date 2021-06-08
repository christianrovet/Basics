public class BasicJavaTest {
    public static void main(String[] args){
        BasicJava algos = new BasicJava();
        algos.print255();
        algos.printOdds255();
        algos.printSum();
        //for simplicity i will reuse this same array for all fitting algos
        int[] array = {1, 3, 5, 7, 9, 13};
        algos.iterateArray(array);
        algos.findMax(array);
        algos.findAverage(array);
        algos.PrintArrOdd();
        algos.greaterThanY(array, 3);
        //platform asks for specfic array
        int [] array_2 = {1,5,10,-2};
        algos.squareValues(array_2);
        //remade after tampering with the square value method
        int [] array_3 = {1,5,10,-2};
        algos.removeNegatives(array_3);
        //remad after removing negatives
        int [] array_4 = {1,5,10,-2};
        algos.maxMinAvg(array_4);
        algos.shiftingValues(array_4);
    }
}