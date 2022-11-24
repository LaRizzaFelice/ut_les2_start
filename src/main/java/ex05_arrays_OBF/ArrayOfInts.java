package ex05_arrays_OBF;

public class ArrayOfInts {

    public int sumOfArray(int[] array) {
        if (array == null) return 0;
        int sum = 0;
        for (int i : array)
            sum += array[i];
        return sum;
    }

    public int sumOfEvenNumbers(int[] array) {

//        if (array == null) return 0;
//        int getal = 0;
//
//        for (int element : array)
//            if (element % 2 == 0) getal += element;
//        return getal;
//    }

        int[] even = extractEvenNumbers(array);
        return sumOfArray(even);
    }

    private int[] extractEvenNumbers(int[] array){
        return array;
    }

}
