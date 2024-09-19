package com.ltsai;

public class TextDocumentCreator implements DocumentCreator{
    @Override
    public Document createDocument(){
        return new TextDocument();
    }
}
