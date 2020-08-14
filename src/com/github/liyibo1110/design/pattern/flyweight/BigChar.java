package com.github.liyibo1110.design.pattern.flyweight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {

    private char charName;

    private String fontData;

    public BigChar(char charName) {
        this.charName = charName;
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("big" + charName + ".txt"));
            String line;
            StringBuilder sb = new StringBuilder();
            while((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
            this.fontData = sb.toString();
        } catch (IOException e) {
            this.fontData = charName + "?";
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void print() {
        System.out.println(fontData);
    }
}
