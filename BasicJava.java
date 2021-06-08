import java.util.Arrays;
import java.util.ArrayList;

public class BasicJava {
    public void print255(){
        for (int i = 0; i<=255; i++){
            System.out.println(i);
        }
    }

    public void printOdds255(){
        for (int i= 1; i<=255; i+=2){
            System.out.println(i);
        }
    }

    public void printSum(){
        int sum = 0;
        for (int i=0; i<=255; i++){
            sum +=i;
            System.out.println("New number: " + i + " Sum: " + sum);
        }
    }

    public void iterateArray(int[] array) {
        for (int i=0;i<array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void findMax(int[] array){
        int max = array[0];
        for (int i=0; i<array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }
        System.out.println(max);
    }

    public void findAverage(int[] array) {
        int sum = 0;
        for (int i=0; i<array.length; i++){
            sum += array[i];
        }
        System.out.println(sum/array.length);
    }

    public void PrintArrOdd() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i=1;i<=255; i+=2){
            array.add(i);
        }
        System.out.println(array);
    }

    public void greaterThanY(int[] array, int y) {
        int count = 0;
        for (int i=0; i<array.length; i++) {
            if(array[i] > y) {
                count += 1;
            }
        }
        System.out.println(count);
    }

    public void squareValues(int[] array) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for (int i=0; i<array.length; i++){
            array[i] = array[i] * array[i];
            newArray.add(array[i]);
        }
        System.out.println(newArray);
    }

    public void removeNegatives(int[] array) {
        for (int i=0; i<array.length; i++) {
            if (array[i] < 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public void maxMinAvg(int[] array) {
        //would like to know how to print these two within a System.out.println and add a string!!!
        findMax(array);
        findAverage(array);
        int min = array[0];
        for (int i=0; i<array.length; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println(min);
    }

    public void shiftingValues(int[] array){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(int i=0; i<array.length; i++){
            if(i == array.length -1){
                newArray.add(0);
            }
            else{
                newArray.add(array[i+1]);
            }
        }
        System.out.println(newArray);
    }
}
