package com.company;

public class Main {

    public static void main(String[] args) {
        SolutionPartI solutionPartI = new SolutionPartI(Input.getInput());
        System.out.println("Checksum is " + solutionPartI.getChecksum());

        SolutionPartII solutionPartII = new SolutionPartII(Input.getInput());
        System.out.println("Common letters are " + solutionPartII.getCommonLetters());
    }
}
