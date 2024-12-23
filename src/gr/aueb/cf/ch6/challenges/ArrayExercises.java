package gr.aueb.cf.ch6.challenges;


public class ArrayExercises {

public static void main(String[] args) {
    int[] arr = {8, 2, 25, 5, 10, 6};

    //Search for target
    int target = 30;
    int result = linearSearch(arr, target);

    if (result != -1) {
        System.out.println("Το στοιχείο βρέθηκε στη θέση: " + result);
    } else {
        System.out.println("Το στοιχείο δεν βρέθηκε.");
    }

    //Filtering of even numbers
    int[] arrEven = getEvens(arr);
    System.out.print("The evens are: ");
    for (int el : arrEven){
        System.out.print(el + " ");
    }

    System.out.println();

    //Mapping of array x2
    int[] doubledArr = mapToDouble(arr);
    System.out.print("The doubled version of arr is: ");
    for (int el : doubledArr){
        System.out.print(el + " ");
    }
    System.out.println();

    //Checking if at least one positive exists
    boolean positiveInArr = anyPositive(arr);
    if (positiveInArr) {
        System.out.println("There is at least one positive");
    } else {
        System.out.println("No positive detected");
    }

    //Checking if all elements are positive
    boolean allPositive = allArePositive(arr);
    if (allPositive) {
        System.out.println("All are positive");
    } else {
        System.out.println("No positive detected");
    }


}

public static int linearSearch(int[] array, int target) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == target) {
            return i; // Επιστροφή της θέσης του στοιχείου
        }
    }
    return -1; // Επιστροφή -1 αν το στοιχείο δε βρεθεί
}

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

public static int[] mapToDouble(int[] arr){
    int[] mappedArr = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
        mappedArr[i] = arr[i] * 2;
    }
    return mappedArr;
}

public static boolean anyPositive(int[] arr){
    boolean positiveExists = false;

    for (int el : arr){
        if (el > 0) {
            positiveExists = true;
            break;
        }
    }

    return positiveExists;
}

public static boolean allArePositive(int[] arr){
    int count = 0;

    for (int el : arr){
        if (el > 0) count++;
    }
    return count == arr.length;
}

}
