package com.example.tomcat29_3_1;

import java.io.PrintWriter;

public interface DatabaseInt {
    void connect();
    void createSample();
    void querry(PrintWriter writer);
    void close();
}
