package com.ltsai;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    static TextConverter converter;

    public static void main(String[] args) {
        String filePath = "F:\\碩班\\111-2\\軟工\\20240820-practice\\20240903_RTFConverter\\RTFConverter\\sampleInput";
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            for (String line : lines) {
                switch (line) {
                    case "TeX":
                    case "TextWidget":
                        converter = setTextConverter(line);
                        break;
                    default:
                        TextFormat textFormat = convert(line);
                        System.out.println(textFormat.getContent());
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static TextConverter setTextConverter(String textConverter) throws Exception {
        switch (textConverter) {
            case "TeX":
                return new TeXConverter();
            case "TextWidget":
                return new TextWidgetConverter();
            default:
                throw new Exception("No Converter");
        }
    }

    public static TextFormat convert(String content) throws Exception {
        for (char c : content.toCharArray()) {
            switch (c) {
                case 'C':
                    converter.convertCharacter();
                    break;
                case 'F':
                    converter.convertFontChange();
                    break;
                case 'P':
                    converter.convertParagraph();
                    break;
                default:
                    throw new Exception("Convert Error");
            }
        }
        return converter.getConvertedTextFormat();
    }
}