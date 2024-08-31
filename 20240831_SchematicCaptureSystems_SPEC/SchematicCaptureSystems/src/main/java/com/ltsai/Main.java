package com.ltsai;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        try {
            String filepath = "F:\\碩班\\111-2\\軟工\\20240820-practice\\20240831_SchematicCaptureSystems_SPEC\\SchematicCaptureSystems\\Sample0.in";
            List<String> lines = Files.readAllLines(Paths.get(filepath));
            List<Component> question = new ArrayList<>();
            Stack<Group> groups = new Stack<>();

            for (String line : lines) {
                switch (line.replaceAll(" ", "").replaceAll("\t", "")) {
                    case "<?xml version=\"1.0\"?>":
                    case "<Question>":
                    case "</Question>":
                        break;
                    case "<Line/>":
                        Component lineElement = new Line();
                        if (!groups.empty())
                            groups.peek().add(lineElement);
                        else
                            question.add(lineElement);
                        break;
                    case "<Text/>":
                        Component textElement = new Text();
                        if (!groups.empty())
                            groups.peek().add(textElement);
                        else
                            question.add(textElement);
                        break;
                    case "<Rectangle/>":
                        Component rectangleElement = new Rectangle();
                        if (!groups.empty())
                            groups.peek().add(rectangleElement);
                        else
                            question.add(rectangleElement);
                        break;
                    case "<Group/>":
                        Component groupElement = new Group();
                        if (!groups.empty())
                            groups.peek().add(groupElement);
                        else
                            question.add(groupElement);
                        break;
                    case "<Group>":
                        Group group = new Group();
                        if (!groups.empty())
                            groups.peek().add(group);
                        else
                            question.add(group);
                        groups.push(group);
                        break;
                    case "</Group>":
                        groups.pop();
                        break;
                    default:
                        break;

                }
            }

            for (Component c : question) {
                c.draw();
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Error.");
        }
    }
}