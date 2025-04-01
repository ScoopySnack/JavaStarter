package gr.aueb.cf.ch6_arrays;



public class ArraysAsCollections {

    public static void main(String[] args) {

    }

    /**
     * Filters the even numbers from an array
     * @param arr the starting array
     * @return a new array with yhe even numbers of arr
     */
    public static int[] getEvens(int[] arr){
        int count = 0;

        for (int el : arr){
            if (el % 2 == 0) count++;
        }
        int[] evens = new int[count];

        int pivot = 0;
        for (int el : arr){
            if (el % 2 == 0) evens[pivot++] = el;
        }
        return evens;
    }

    /**
     * Mapping
     * Returns a new array with the same length of arr that includes
     * the numbers of arr multiplied with 2.
     * @param arr the starting array
     * @return    a new array with doubled elements
     */
    public static int[] mapToDouble(int[] arr){
        int[] mappedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mappedArr[i] = arr[i] * 2;
        }
        return mappedArr;
    }

    //Reducing
    public static int sum(int[] arr){
        int sum = 0;

//        for (int i = 0; i < arr.length - 1; i++) {
//            sum += arr[i];
//        }
        for (int el : arr){
            sum += el;
        }

        return sum;
    }

    public static double average(int[] arr){
        return (double) sum(arr)/arr.length;
    }

    public static boolean anyEven(int[] arr){
        boolean isAnyEven = false;

        for (int el : arr){
            if (el % 2 == 0){
                isAnyEven = true;
                break;
            }
        }
        return isAnyEven;
    }

    public static boolean moreThanTwoEvens(int[] arr){
        int count = 0;

        for (int el : arr){
            if (el % 2 == 0) count++;
        }

//      return getEvens(arr).length >  2;
        return count > 2;
    }

    public static boolean moreThanTwoConsecutive(int[] arr){
        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i + 1] - 1 && arr[i] == arr[i+2] - 2){
                count++;
                break;
            }
        }
        return count >= 1 ;
    }

    public static boolean moreThanTwoWithTheSameEnding(int[] arr){
        int[] endings = new int[10];
        boolean isSameEnding = false;

        for (int num : arr){
            endings[num % 10]++;
        }

        for (int count : endings){
            if (count >= 3){
                isSameEnding = true;
                break;
            }
        }

        return isSameEnding;
    }

    public static boolean allAreEven(int[] arr){
//        return getEvens(arr).length == arr.length;

        boolean allEven = false;
        int count = 0;

        for (int el : arr){
            if (el % 2 == 0) count++;
        }
        return count == arr.length;
    }
}
