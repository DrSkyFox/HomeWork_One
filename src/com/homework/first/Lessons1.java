package com.homework.first;

public class Lessons1 {
    //class for homework
    private byte aByte;
    private short aLong;
    private int anInt;
    private float aFloat;
    private double aDouble;
    private char aChar;
    private boolean aBoolean;


    public Lessons1(byte aByte, short aLong, int anInt, float aFloat, double aDouble, char aChar, boolean aBoolean) {
        this.aByte = aByte;
        this.aLong = aLong;
        this.anInt = anInt;
        this.aFloat = aFloat;
        this.aDouble = aDouble;
        this.aChar = aChar;
        this.aBoolean = aBoolean;
    }



    @Override
    public String toString() {
        return "Lessons1{" +
               "aByte=" + aByte +
               ", aLong=" + aLong +
               ", anInt=" + anInt +
               ", aFloat=" + aFloat +
               ", aDouble=" + aDouble +
               ", aChar=" + aChar +
               ", aBoolean=" + aBoolean +
               '}';
    }

    public void sum() throws Exception {

    }
    public static  <T extends Number> T sum(T t1, T t2) throws Exception {

//        if (t1 instanceof Byte && t2 instanceof Byte) {
//            return (t1.byteValue() + t2.byteValue());
//        } else if (t1 instanceof Short && t2 instanceof Short) {
//            return (t1.shortValue() + t2.shortValue());
//        } else if (t1 instanceof Long && t2 instanceof Long) {
//            return (t1.longValue() + t2.longValue());
//        } else if (t1 instanceof Integer && t2 instanceof Integer) {
//            return (t1.intValue() + t2.intValue());
//        } else if (t1 instanceof Float && t2 instanceof Float) {
//            return (t1.floatValue() + t2.floatValue());
//        } else if(t1 instanceof Double && t2 instanceof Double) {
//            return (t1.doubleValue() + t2.doubleValue());
//        } else {
//
//        }
        if (t1.getClass() != t2.getClass()) {
            throw new Exception("t1 and t2 is different classes... dont want work...");
        }

        if (t1.getClass() == Byte.class) {
            return (T) Byte.valueOf((byte) (t1.byteValue() + t2.byteValue()));
        }
        if (t1.getClass() == Short.class) {
            return (T) Short.valueOf((short) (t1.shortValue() + t2.shortValue()));
        }
        if (t1.getClass() == Long.class) {
            return (T) Long.valueOf((t1.longValue() + t2.longValue()));
        }
        if(t1.getClass() == Integer.class) {
            return (T) Integer.valueOf((t1.intValue() + t2.intValue()));
        }
        if(t1.getClass() == Float.class) {
            return (T) Float.valueOf((t1.floatValue() + t2.floatValue()));
        }
        if (t1.getClass() == Double.class) {
            return (T) Double.valueOf((t1.doubleValue() + t2.doubleValue()));
        }
        return null;
    }



}
