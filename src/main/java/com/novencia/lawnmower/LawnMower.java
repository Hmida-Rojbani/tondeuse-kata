package com.novencia.lawnmower;

/**
 *
 */
public class LawnMower {
    private Position position;
    private Lawn lawn;

    public LawnMower(Position position, Lawn lawn) {
        this.position = position;
        this.lawn = lawn;
    }

    /**
     * Execute a sequence of instructions
     * @param instructions
     */
    public void execute(String instructions) {
        instructions.chars()
                .mapToObj( c -> (char) c)
                .forEach(this::execute);
    }

    /**
     * Execute single Instruction
     * @param instruction a character must one of this set {'D','G','A'}
     */
    private void execute(Character instruction) {
        switch (instruction) {
            case 'D' -> rotateToRight();
            case 'G' -> rotateToLeft();
            case 'A' -> advance();
            default -> throw new IllegalArgumentException("'"+instruction+"' is not an accepted instruction.");
        }
    }

    /**
     * Advance lawnmower forward if is possible
     */
    private void advance() {
        Position nextPosition = position.moveForward();
        if(lawn.isInside(nextPosition.coordinate()))
            position = nextPosition;
    }

    /**
     * Rotate lawnmower to the left
     */
    private void rotateToLeft() {
        position = position.rotateToLeft();
    }
    /**
     * Rotate lawnmower to the right
     */
    private void rotateToRight() {
        position = position.rotateToRight();
    }

    @Override
    public String toString() {
         return position.toString();
    }
}
