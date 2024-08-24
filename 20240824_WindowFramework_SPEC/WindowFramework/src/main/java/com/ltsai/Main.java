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

            if (lines.get(0).startsWith("window")) {
                String[] inputs = lines.get(0).split(" ");
                WindowImpl impl = getWindowImpl(inputs[2]);
                Window win = getWindow(inputs[1], impl);
                doAction(lines.get(1), win);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static Window getWindow(String windowSubtype, WindowImpl impl) {
        Window win = null;
        switch (windowSubtype) {
            case "IconWindow":
                win = new IconWindow(impl);
                break;
            case "TransientWindow":
                win = new TransientWindow(impl);
                break;
            default:
                break;
        }
        return win;
    }

    private static WindowImpl getWindowImpl(String implementType) {
        WindowImpl impl = null;
        switch (implementType) {
            case "XWindow":
                impl = new XWindowImpl();
                break;
            case "PMWindow":
                impl = new PMWindowImpl();
                break;
            default:
                break;
        }
        return impl;
    }

    private static void doAction(String action, Window win) {
        switch (action) {
            case "drawBorder":
                ((IconWindow) win).drawBorder();
                break;
            case "drawCloseBox":
                ((TransientWindow) win).drawCloseBox();
                break;
            default:
                break;
        }
    }
}