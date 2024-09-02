package com.ltsai;

public class TeXConverter implements TextConverter {
    TextFormat textFormat = new TextWidget();

    @Override
    public void convertCharacter() {
        textFormat.setContent(textFormat.getContent() + "c");
    }

    @Override
    public void convertFontChange() {
        textFormat.setContent(textFormat.getContent() + "_");
    }

    @Override
    public void convertParagraph() {
        textFormat.setContent(textFormat.getContent() + "|");
    }

    @Override
    public TextFormat getConvertedTextFormat() {
        textFormat.getContent();
        return textFormat;
    }
}
