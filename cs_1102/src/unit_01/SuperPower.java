package unit_01;

import javax.swing.JOptionPane;

public class SuperPower {

    public static void main(String[] args) {
        //System.out.println("SUPER POWERS TO THE RESCUE!");
        //JOptionPane.showMessageDialog(null,"SUPER POWERS TO THE RESCUE!");
        /*
        * The first argument is used to associate the dialog box with a particular window. Your program has no other window, so you use "null" (nothing).
        * The second argument is the String that you want the dialog box to display.
        */

        String power = JOptionPane.showInputDialog("What is your super power?");
        //showInputDialog = function that returns a string input by the user

        power = power.toUpperCase();
        //toUpperCase = function that returns an all-upper-case translation of the String "power"

        JOptionPane.showMessageDialog(null,power+" TO THE RESCUE!");
        //the second argument to "showMessageDialog" is now a String expression
        //String operator "+" to concatenate
    }
}

