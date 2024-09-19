package com.ltsai;

import javax.print.Doc;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filepath = "F:\\碩班\\111-2\\軟工\\20240820-practice\\20240918_PowerfulDocumentViewer_Factory\\PowerfulDocumentViewer\\sampleInput";
        try {
            List<Document> list = new ArrayList<>();
            DocumentCreator drawingDocumentCreator = new DrawingDocumentCreator();
            DocumentCreator textDocumentCreator = new TextDocumentCreator();
            
            List<String> lines = Files.readAllLines(Paths.get(filepath));
            for (String line : lines) {
                switch (line) {
                    case "Draw":
                        list.add(createDocument(drawingDocumentCreator));
                        break;
                    case "Text":
                        list.add(createDocument(textDocumentCreator));
                        break;
                    case "Present":
                        for (Document doc : list) {
                            doc.present();
                        }
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error.");
        }
    }

    public static Document createDocument(DocumentCreator documentCreator) {
        Document doc = null;
        doc = documentCreator.createDocument();
        return doc;
    }
}