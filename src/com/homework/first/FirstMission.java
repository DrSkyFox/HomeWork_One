package com.homework.first;

public class FirstMission implements Comparable<FirstMission> {
    private Integer integer;
    private Double aDouble;

    public FirstMission(Integer integer, double aDouble) {
        this.integer = integer;
        this.aDouble = aDouble;
    }

    @Override
    public int compareTo(FirstMission firstMission) {
        try {
            return compareNum(aDouble,aDouble) + compareNum(this.integer, firstMission.integer);
        } catch (Exception e) {
            e.printStackTrace();
            return -666;
        }
    }

    public <T extends Number & Comparable<? super T>> int compareNum(T t1, T t2) throws Exception {
        if (!(t1 instanceof Double && t2 instanceof Double) || !(t1 instanceof Integer && t2 instanceof Integer)) {
            throw new Exception("Different Type: I dont want compare... ");
        }

        return t1.compareTo(t2);
    }


    @Override
    public String toString() {
        return "FirstMission{" +
               '\'' +
               ", Integer=" + integer +
               ", double =" + aDouble +
               '\'' +
               '}';
    }


}
