package com.ltsai;

public interface TextConverter {
    void convertCharacter();

    void convertFontChange();

    void convertParagraph();

    TextFormat getConvertedTextFormat();
}
