package com.novencia.entries;

import com.novencia.lawnmower.Coordinate;
import com.novencia.lawnmower.Lawn;
import com.novencia.lawnmower.Orientation;
import com.novencia.lawnmower.Position;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcessingInstructionFile {

    public static Lawn parseLawn(String firstLine) {
        String[] coordinates = firstLine.split(" ");
        int coordinateX = Integer.parseInt(coordinates[0]);
        int coordinateY = Integer.parseInt(coordinates[1]);
        return new Lawn(new Coordinate(coordinateX, coordinateY),new Coordinate(0,0),new ArrayList<>());
    }

    public static Position parsePosition(String positionString) {
        String[] positionArray = positionString.split(" ");
        int coordinateX = Integer.parseInt(positionArray[0]);
        int coordinateY = Integer.parseInt(positionArray[1]);
        Orientation orientation = Orientation.get(positionArray[2]);
        return new Position(new Coordinate(coordinateX,coordinateY), orientation);
    }

    public static List<String> readingFile() throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the path of the instruction file :");
            String stringPath = sc.nextLine();
            Path path = Path.of(stringPath);
            return Files.readAllLines(path);
        }
    }
}
