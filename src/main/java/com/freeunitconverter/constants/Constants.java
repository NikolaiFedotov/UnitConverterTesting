package com.freeunitconverter.constants;

public class Constants {

    public static final class FrameMenu {
        public static final String AREA = "Area";
        public static final String TEMPERATURE = "Temperature";
        public static final String LENGTH = "Length";
        public static final String MASS = "Mass";
        public static final String SPEED = "Speed";
        public static final String VOLUME = "Volume";
        public static final String FUEL_CONSUMPTION = "Fuel consumption";
        public static final String TIME = "Time";
        public static final String DIGITAL_STORAGE_DATA = "Digital Storage/Data";
        public static final String ANGLE = "Angle";
        public static final String POWER = "Power";
        public static final String ENERGY = "Energy";
        public static final String PRESSURE = "Pressure";
        public static final String FORCE = "Force";
        public static final String DIGITAL_IMAGING = "Digital Imaging";

    }

    public static final class Direction {
        private final String direction;
        public static final Direction UP = new Direction("up");
        public static final Direction DOWN = new Direction("down");

        private Direction(String direction) {
            super();
            this.direction = direction;
        }

        public String toString() {
            return this.direction;
        }
    }
}
