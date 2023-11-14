package com.hxl.plugin.springboot.invoke.script;
import java.util.*;
import java.io.*;
import java.net.*;
import java.math.*;
import java.nio.*;
import java.text.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import java.nio.charset.*;
import java.util.function.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.*;
import java.util.random.*;
import java.nio.file.*;
public class ResponseApi extends Utils {
    private Response response;

    public ResponseApi(Response response) {
        this.response = response;
    }

    public void handlerResponse() {
        ${body}
    }
    private void save(String path){
        saveResponse(path,this.response);
    }
    private void saveHeader(String path){
        writeFile(path,this.response.getHeaderAsString());
    }
    private void saveBody(String path){
        saveResponseBody(path,this.response);
    }
}