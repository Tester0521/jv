package com.tester0521.other;

public final class Temperature {
    private final String name;
    private final int minTemperature;
    private final int maxTemperature;
    private Temperature(String name, int minTemperature, int maxTemperature) {
        this.name = name;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
    }

    public static final Temperature COLD    = new Temperature("Холодно", -50, 10);
    public static final Temperature NORMAL  = new Temperature("Нормально", 10, 25);
    public static final Temperature HOT     = new Temperature("Жарко", 25, 60);
    public String getName()           { return name; }
    public int    getMinTemperature() { return minTemperature; }
    public int    getMaxTemperature() { return maxTemperature; }
    
    public static Temperature getByTemperature(int temperature) {
        if (temperature >= COLD.getMinTemperature() && temperature <= COLD.getMaxTemperature()) return COLD;
        else if (temperature >= NORMAL.getMinTemperature() && temperature <= NORMAL.getMaxTemperature()) return NORMAL;
        else if (temperature >= HOT.getMinTemperature() && temperature <= HOT.getMaxTemperature()) return HOT;
        throw new IllegalArgumentException("Температура вне допустимого диапазона.");
    }
}
