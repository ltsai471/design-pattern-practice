package com.ltasi;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filepath = "F:\\碩班\\111-2\\軟工\\20240820-practice\\20240908_EmailHandler_SPEC\\EmailHandler\\Sample.in";
        try {
            Handler handler =
                    new SpamHandler(
                            new ComplaintHandler(
                                    new FanHandler(null)));
            List<String> lines = Files.readAllLines(Paths.get(filepath));
            for (String line : lines) {
                handler.handleMail(line);
            }
        } catch (Exception e) {
            System.out.println("Error.");
        }
    }
}