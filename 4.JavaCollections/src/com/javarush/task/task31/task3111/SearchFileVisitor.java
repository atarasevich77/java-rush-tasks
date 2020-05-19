package com.javarush.task.task31.task3111;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

public class SearchFileVisitor extends SimpleFileVisitor<Path> {

    private  String partOfName = null;
    private String partOfContent = null;
    private int minSize =-1;
    private int maxSize =-1;
    private boolean[] flags = new boolean[4];
    private List<Path> foundFiles = new ArrayList<>();

    public void setPartOfName(String partOfName) {
        this.partOfName = partOfName;
        flags[0]=true;
    }

    public void setPartOfContent(String partOfContent) {
        this.partOfContent = partOfContent;
        flags[1]=true;
    }

    public void setMinSize(int minSize) {
        this.minSize = minSize;
        flags[2]=true;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
        flags[3]=true;
    }

    public List<Path> getFoundFiles() {
        return foundFiles;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        byte[] content = Files.readAllBytes(file);// размер файла: content.length
        boolean ressult=true;
        for (int i=0;i<flags.length;i++){
            if (flags[i]){
                switch (i){

                    case 0: {
                        ressult&=checkName(file);
                        break;
                    }
                    case 1: {
                        ressult&=checkContent(content);
                        break;
                    }
                    case 2: {
                        ressult&=checkSizeMIN(content.length);
                        break;
                    }
                    case 3: {
                        ressult&=checkSizeMAX(content.length);
                        break;
                    }
                }
            }
        }
        if (ressult){foundFiles.add(file);}

         /*if(checkName(file)||checkContent(content)||checkSize(content.length)){
            foundFiles.add(file);
        }*/
        return super.visitFile(file, attrs);
    }

    private boolean checkName(Path file){
        if (partOfName!=null){
            return file.getFileName().toString().contains(partOfName);
        }
        return false;
    }
    private boolean checkContent(byte[] content) {
        if (partOfContent!=null){
            return new String(content).contains(partOfContent);
        }
        return false;
    }
    private boolean checkSize(int length){
        if (maxSize!=-1&&minSize!=-1){
            if (minSize<length && length<maxSize){
                return true;
            }
        }
        return false;
    }
    private boolean checkSizeMAX(int length){
        if (maxSize!=-1&&length<maxSize){
            return true;
        }
        return false;
    }
    private boolean checkSizeMIN(int length){
        if (minSize!=-1&& length>minSize){
            return true;
        }
        return false;
    }
}
