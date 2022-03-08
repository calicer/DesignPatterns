package Creational.Builder;

public class PhoneBuilder {

    private String OS;
    private int ram;
    private int rom;
    private int camera;

    public Phone getPhone(){
        return new Phone(OS,ram,rom,camera);
    }

    public PhoneBuilder setOS(String OS) {
        this.OS = OS;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setRom(int rom) {
        this.rom = rom;
        return this;
    }

    public PhoneBuilder setCamera(int camera) {
        this.camera = camera;
        return this;
    }
}
