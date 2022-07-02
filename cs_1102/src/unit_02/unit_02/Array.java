package unit_02;

import java.util.Arrays;

public class Array {

    // find if it is an array and if it is, returns true or false
    public static boolean isItemInArray(String item, String[] items) {
        for (String i : items) {
            if (i.toLowerCase().equals(item)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // declare an array
        int[] nums;

        // declare and allocate an array
        double[] otherNums = new double[5];

        // declaring, allocating, and initializing an array
        String[] availablePets = {"cat", "dog", "fish"};
        String[] unavailablePets = {"bird", "rabbit", "hamster", "gerbil"};

        int indexOfAvailablePet = 2; // index of fish
        int indexOfUnavailablePet = 0; // index of bird

        String availablePet = availablePets[indexOfAvailablePet]; // fish
        String unavailablePet = unavailablePets[indexOfUnavailablePet]; // bird

        availablePets[indexOfAvailablePet] = unavailablePet;
        unavailablePets[indexOfUnavailablePet] = availablePet;

        System.out.println(Arrays.toString(availablePets));
        System.out.println(Arrays.toString(unavailablePets));
    }
}
