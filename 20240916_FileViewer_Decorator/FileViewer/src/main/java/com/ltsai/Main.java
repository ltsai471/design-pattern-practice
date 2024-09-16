package com.ltsai;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String filepath = "F:\\碩班\\111-2\\軟工\\20240820-practice\\20240916_FileViewer_Decorator\\FileViewer\\sampleInput";
        try {
            List<String> lines = Files.readAllLines(Paths.get(filepath));

            Map<String, VisualComponent> map = new HashMap<>();
            for (String line : lines) {
                String[] inputs = line.split(" ");
                if (map.containsKey(inputs[0])) {
                    if ("add".equals(inputs[1])) {
                        for (int paramIdx = 2; paramIdx < inputs.length; paramIdx++) {
                            if ("scrollBar".equals(inputs[paramIdx])) {
                                VisualComponent component = new ScrollBar(map.get(inputs[0]));
                                map.put(inputs[0], component);
                            }else if ("thickBlackBorder".equals(inputs[paramIdx])){
                                VisualComponent component = new Border(map.get(inputs[0]));
                                map.put(inputs[0], component);
                            }
                        }
                    } else if ("display".equals(inputs[1])) {
                        map.get(inputs[0]).display();
                        System.out.println();
                    }
                } else {
                    VisualComponent textView = new TextView(inputs[1]);
                    map.put(inputs[0], textView);
                }
            }
        } catch (Exception e) {
            System.out.println("Error.");
        }
    }
}