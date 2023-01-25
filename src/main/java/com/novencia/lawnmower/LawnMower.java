package com.novencia.lawnmower;

public class LawnMower {
    private Position position;
    private Lawn lawn;

    public LawnMower(Position position, Lawn lawn) {
        this.position = position;
        this.lawn = lawn;
    }

    public void execute(String instructions) {
        instructions.chars()
                .mapToObj( c -> (char) c)
                .forEach(this::execute);
    }

    private void execute(Character instruction) {
        switch (instruction) {
            case 'D' -> rotateToRight();
            case 'G' -> rotateToLeft();
            case 'A' -> advance();
            default -> throw new IllegalArgumentException("'"+instruction+"' is not an accepted instruction.");
        }
    }

    private void advance() {
        Position nextPosition = position.moveForward();
        if(lawn.isInside(nextPosition.coordinate()))
            position = nextPosition;
    }

    private void rotateToLeft() {
        position = position.rotateToLeft();
    }

    private void rotateToRight() {
        position = position.rotateToRight();
    }

    @Override
    public String toString() {
         return position.toString();
    }
}
