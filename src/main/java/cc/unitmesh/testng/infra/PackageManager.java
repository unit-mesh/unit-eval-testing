package cc.unitmesh.testng.infra;

public class PackageManager {
    private static volatile PackageManager instance;

    private PackageManager() {
    }

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

    public void install(String packageName) {
        System.out.println("Installing package " + packageName);
    }

    public void uninstall(String packageName) {
        System.out.println("Uninstalling package " + packageName);
    }

    public void update(String packageName) {
        System.out.println("Updating package " + packageName);
    }

    public void upgrade(String packageName) {
        System.out.println("Upgrading package " + packageName);
    }

    public void downgrade(String packageName) {
        System.out.println("Downgrading package " + packageName);
    }

    public void reinstall(String packageName) {
        System.out.println("Reinstalling package " + packageName);
    }

    public void purge(String packageName) {
        System.out.println("Purging package " + packageName);
    }

    public void clean(String packageName) {
        System.out.println("Cleaning package " + packageName);
    }
}
