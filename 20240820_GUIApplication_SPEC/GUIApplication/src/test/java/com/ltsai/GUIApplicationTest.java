package com.ltsai;

import org.junit.jupiter.api.Test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GUIApplicationTest {

    @Test
    public void testFilesAreIdentical() throws IOException {
        String expectedFilePath = "F:\\碩班\\111-2\\軟工\\20240820-practice\\20240820_GUIApplication_SPEC\\GUIApplication\\sampleOutput";
        String actualFilePath = "F:\\碩班\\111-2\\軟工\\20240820-practice\\20240820_GUIApplication_SPEC\\GUIApplication\\src\\test\\outputs\\output1";

        try (BufferedReader brExpected = new BufferedReader(new FileReader(expectedFilePath));
             BufferedReader brActual = new BufferedReader(new FileReader(actualFilePath))) {

            String line1, line2;
            int lineNumber = 1;

            while ((line1 = brExpected.readLine()) != null && (line2 = brActual.readLine()) != null) {
                assertEquals(line1, line2, "Files differ at line " + lineNumber);
                lineNumber++;
            }

            // Check if one file has more lines than the other
            assertEquals(brExpected.readLine(), brActual.readLine(), "Files differ in length");

        }
    }
}
