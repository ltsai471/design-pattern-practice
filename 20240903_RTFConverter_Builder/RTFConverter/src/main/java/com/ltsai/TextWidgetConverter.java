package com.ltsai;

public class TextWidgetConverter implements TextConverter {
    TextFormat textFormat = new TextWidget();

    @Override
    public void convertCharacter() {
        textFormat.setContent(textFormat.getContent() + "<Char>");
    }

    @Override
    public void convertFontChange() {
        textFormat.setContent(textFormat.getContent() + "<Font>");
    }

    @Override
    public void convertParagraph() {
        textFormat.setContent(textFormat.getContent() + "<Paragraph>");
    }

    @Override
    public TextFormat getConvertedTextFormat() {
        textFormat.getContent();
        return textFormat;
    }
}
