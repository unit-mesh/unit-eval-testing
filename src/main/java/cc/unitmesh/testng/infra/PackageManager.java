package cc.unitmesh.testng.infra;

public class PackageManager {
    private static volatile PackageManager instance;

    private PackageManager() {}

    public static PackageManager getInstance() {
        if (instance == null) {
            synchronized (PackageManager.class) {
                if (instance == null) {
                    instance = new PackageManager();
                }
            }
        }
        return instance;
    }
}
