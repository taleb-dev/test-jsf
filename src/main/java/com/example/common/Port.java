package com.example.common;


public class Port {
    private Integer quote;
    private LuPort port;

    public Integer getQuote() {
        return quote;
    }

    public Port(Integer quote, LuPort port) {
        this.quote = quote;
        this.port = port;
    }

    public Port() {
    }

    public void setQuote(Integer quote) {
        this.quote = quote;
    }

    public LuPort getPort() {
        return port;
    }

    public void setPort(LuPort port) {
        this.port = port;
    }
}
