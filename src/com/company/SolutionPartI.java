package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionPartI {

    private String input;
    private List<String> ids;
    private int twiceCounter;
    private int threeCounter;

    public SolutionPartI(String input) {
        this.input = input;
        this.ids = getIds(input);
    }

    private List<String> getIds(String input) {
        Scanner scanner = new Scanner(input);
        List<String> ids = new ArrayList<>();

        while (scanner.hasNextLine()) {
            ids.add(scanner.nextLine());
        }

        return ids;
    }

    public int getChecksum() {
        for (String box : ids) {
            int[] letters = new int[26];

            for (char letter : box.toCharArray()) {
                if (letter >= 'a' && letter <= 'z') {
                    letters[getIndex(letter)]++;
                }
            }

            if (isRepeted(letters, 2)) {
                twiceCounter++;
            }
            if (isRepeted(letters, 3)) {
                threeCounter++;
            }
        }

        return twiceCounter * threeCounter;
    }

    private int getIndex(char letter) {
        return letter - 'a';
    }

    private boolean isRepeted(int[] letters, int times) {
        for (int i : letters) {
            if (i == times) return true;
        }

        return false;
    }

}
