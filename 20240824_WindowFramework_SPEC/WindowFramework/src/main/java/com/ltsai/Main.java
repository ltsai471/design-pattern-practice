package com.ltsai;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "F:\\碩班\\111-2\\軟工\\20240820-practice\\20240824_WindowFramework_SPEC\\WindowFramework\\sampleInput";
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            WindowImpl impl = new PMWindowImpl();
            IconWindow iconWin = new IconWindow(impl);
            TransientWindow transientWin = new TransientWindow(impl);
            for (String line : lines) {
                String[] inputs = line.split(" ");
                if (inputs.length == 3) {
                    switch (inputs[2]) {
                        case "XWindow":
                            impl = new XWindowImpl();
                            break;
                        case "PMWindow":
                            impl = new PMWindowImpl();
                            break;
                        default:
                            throw new Exception("Error");
                    }

                    switch (inputs[1]) {
                        case "IconWindow":
                            iconWin = new IconWindow(impl);
                            break;
                        case "TransientWindow":
                            transientWin = new TransientWindow(impl);
                            break;
                        default:
                            throw new Exception("Error");
                    }
                } else if (inputs.length == 1) {
                    switch (inputs[0]) {
                        case "drawBorder":
                            iconWin.drawBorder();
                            break;
                        case "drawCloseBox":
                            transientWin.drawCloseBox();
                            break;
                        default:
                            throw new Exception("Error");
                    }
                } else {
                    System.out.println("Error.");
                    throw new Exception("Error.");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}