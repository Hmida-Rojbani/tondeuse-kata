package com.novencia.entries;

import com.novencia.lawnmower.Lawn;
import com.novencia.lawnmower.LawnMower;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            List<String> fileInstructions = ProcessingInstructionFile.readingFile();
            Lawn lawn = ProcessingInstructionFile.parseLawn(fileInstructions.get(0));
            for (int i = 1; i < fileInstructions.size(); i+=2) {
                LawnMower lawnMower = new LawnMower(ProcessingInstructionFile.parsePosition(fileInstructions.get(i)),lawn);
                lawnMower.execute(fileInstructions.get(i+1));
                System.out.println(lawnMower);
            }
        } catch (IOException e) {
            System.err.println("Error in Reading File : "+e.getMessage());
        }

    }
}
