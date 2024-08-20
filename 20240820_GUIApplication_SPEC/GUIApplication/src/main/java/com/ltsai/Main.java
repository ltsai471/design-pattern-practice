package com.ltsai;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "F:\\碩班\\111-2\\軟工\\20240820-practice\\20240820_GUIApplication_SPEC\\GUIApplication\\sampleInput";
        GUIApplication app = new GUIApplication();
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (String line : lines) {
                String[] input = line.split(" ");
                if (input.length == 2) {
                    switch (input[0]) {
                        case "Window":
                            app.addWindows(input[1]);
                            break;
                        case "ScrollBar":
                            app.addSrollBar(input[1]);
                            break;
                        case "Button":
                            app.addButton(input[1]);
                            break;
                        default:
                            System.out.println("Error.");
                            break;
                    }
                } else if (input.length == 1) {
                    switch (input[0]) {
                        case "Present":
                            app.present();
                            break;
                        case "PM":
                        case "Motif":
                            app.switchStyle(input[0]);
                            break;
                        default:
                            System.out.println("Error.");
                            break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}