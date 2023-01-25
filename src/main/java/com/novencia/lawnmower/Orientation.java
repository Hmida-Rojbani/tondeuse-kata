package com.novencia.lawnmower;

import com.novencia.exceptions.OrientationIllegalArgumentException;

/**
 * Orientation is used to represent the orientation of the lawnmower in a given time
 *
 * @author Hmida Rojbani
 *
 */
public enum Orientation {

    /**
     * The Orientation according to the compass
     */
    NORTH("N"){
        @Override
        public Orientation turnLeft() {
            return WEST;
        }

        @Override
        public Orientation turnRight() {
            return EAST;
        }
    },EAST("E") {

        @Override
        public Orientation turnLeft() {
            return NORTH;
        }
        @Override
        public Orientation turnRight() {
            return SOUTH;
        }
    },SOUTH("S") {
        @Override
        public Orientation turnLeft() {
            return EAST;
        }

        @Override
        public Orientation turnRight() {
            return WEST;
        }
    },WEST("W") {
        @Override
        public Orientation turnLeft() {
            return SOUTH;
        }

        @Override
        public Orientation turnRight() {
            return NORTH;
        }
    };

    /**
     * The letter used to represent an orientation
     */
    private final String orientationLetter;
    Orientation(String orientationLetter) {
        this.orientationLetter=orientationLetter;
    }

    /**
     * <p>
     *  get the orientation from one of this set of letters : "N", "E", "S", "W".
     * </p>
     * @param alpha the letter representing the orientation
     * @return the orientation according to the given letter
     * @throws OrientationIllegalArgumentException if an accepted parameter is passed
     *
     */
    public static Orientation get(String alpha) {
        return switch (alpha){
            case "N" -> Orientation.NORTH;
            case "S" -> Orientation.SOUTH;
            case "E" -> Orientation.EAST;
            case "W" -> Orientation.WEST;
            default -> throw new OrientationIllegalArgumentException("\""+alpha +"\" is not accepted as a Orientation");
        };
    }

    @Override
    public String toString() {
        return orientationLetter;
    }

    /**
     * <p>
     *  Turning to the left
     * </p>
     * @return the left orientation of the current one
     *
     */
    public abstract Orientation turnLeft() ;
    /**
     * <p>
     *  Turning to the right
     * </p>
     * @return the right orientation of the current one
     *
     */
    public abstract Orientation turnRight() ;

}
