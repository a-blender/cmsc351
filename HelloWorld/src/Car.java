import java.awt.Color;

public class Car {

    // data types
    int avgMpg;
    String licensePlate;
    Color paintColor;
    boolean areTailightsWorking;

    public Car (int avgMpg, String licensePlate, Color paintColor, boolean areTaillightsWorking) {
        this.avgMpg = avgMpg;
        this.licensePlate = licensePlate;
        this.paintColor = paintColor;
        this.areTailightsWorking = areTaillightsWorking;
    }

    public int getAvgMpg() {
        return avgMpg;
    }

    public void setAvgMpg(int avgMpg) {
        this.avgMpg = avgMpg;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Color getPaintColor() {
        return paintColor;
    }

    public void setPaintColor(Color paintColor) {
        this.paintColor = paintColor;
    }

    public boolean isAreTailightsWorking() {
        return areTailightsWorking;
    }

    public void setAreTailightsWorking(boolean areTailightsWorking) {
        this.areTailightsWorking = areTailightsWorking;
    }

    @Override
    public String toString() {
        return "Car{" +
                "avgMpg=" + avgMpg +
                ", licensePlate='" + licensePlate + '\'' +
                ", paintColor=" + paintColor +
                ", areTailightsWorking=" + areTailightsWorking +
                '}';
    }
}