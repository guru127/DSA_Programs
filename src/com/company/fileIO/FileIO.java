package com.company.fileIO;

import java.io.*;
import java.util.Iterator;

public class FileIO {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw= new BufferedWriter(
                new FileWriter("C:\\Users\\guruc\\IdeaProjects\\DSA_Practice\\src\\com\\company\\fileIO\\file.txt"));
        bw.write("hai helo namskara");

        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\guruc\\IdeaProjects\\DSA_Practice\\src\\com\\company\\fileIO\\file.txt"));

        Iterator<String> iterator=br.lines().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
