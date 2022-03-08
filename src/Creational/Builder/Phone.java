package Creational.Builder;

public class Phone {

    private String OS;
    private int ram;
    private int rom;
    private int camera;

    public Phone(String OS, int ram, int rom, int camera) {
        this.OS = OS;
        this.ram = ram;
        this.rom = rom;
        this.camera = camera;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "OS='" + OS + '\'' +
                ", ram=" + ram +
                ", rom=" + rom +
                ", camera=" + camera +
                '}';
    }
}
