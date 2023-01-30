import java.util.HashMap;

public class LocalConfig {

    protected HashMap<String, Device> allDevices = new HashMap<>();

    private void addDevice(String deviceName, Device device) {
        this.allDevices.put(deviceName, device);
    }

    public class Device {
        public String name;
        public String apkPath;
        public String apkName;

        public Device (String name, String apkPath, String apkName){
            this.name = name;
            this.apkPath = apkPath;
            this.apkName = apkName;
            addDevice(name, this);
        }
    }

    public Device pixel5 = new Device("Pixel 5 API 31", "src/main/resources/", "Free Unit Converter.apk");
//    pixe
    public Device getDeviceConfig(String deviceName) {
        return allDevices.get(deviceName);
    }


    // File appDir = new File("src/main/resources/");
    //        File app = new File(appDir, "Free Unit Converter.apk");
}
