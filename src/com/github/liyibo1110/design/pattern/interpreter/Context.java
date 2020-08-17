package com.github.liyibo1110.design.pattern.interpreter;

import java.util.StringTokenizer;

public class Context {

    /**
     * 默认就是空格字符
     */
    private StringTokenizer tokenizer;

    private String currentToken;

    public Context(String text) {
        tokenizer = new StringTokenizer(text);
        nextToken();
    }

    public String nextToken() {

        if(tokenizer.hasMoreElements()) {
            currentToken = tokenizer.nextToken();
        }else {
            currentToken = null;
        }
        return currentToken;
    }

    public String getCurrentToken() {
        return currentToken;
    }

    public void skipToken(String token) throws ParseException {

        // 重要的验证点
        if(!token.equals(currentToken)) {
            throw new ParseException("Warning: " + token + " is expected, but " + currentToken + " is found.");
        }
        nextToken();
    }

    public int currentNumber() throws ParseException {
        int number = 0;
        try {
            number = Integer.parseInt(currentToken);
        } catch (NumberFormatException e) {
            // 转换异常
            throw new ParseException("Warning: " + e);
        }
        return number;
    }
}
