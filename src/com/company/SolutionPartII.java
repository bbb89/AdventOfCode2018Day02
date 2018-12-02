package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolutionPartII {

    private String input;
    private List<String> ids;
    private int twiceCounter;
    private int threeCounter;

    public SolutionPartII(String input) {
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

    public String getCommonLetters() {
        for (String box1 : ids) {
            for (String box2 : ids) {
                if (box1 == box2) continue;
                StringBuilder sameLetters = new StringBuilder();

                for (int i = 0; i < box1.length(); i++) {
                    if (box1.charAt(i) == box2.charAt(i)) {
                        sameLetters.append(box1.charAt(i));
                    }

                    if (sameLetters.length() < i) {
                        break;
                    }

                    if (sameLetters.length() == box1.length() - 1) {
                        return sameLetters.toString();
                    }
                }
            }
        }

        return null;
    }
}
