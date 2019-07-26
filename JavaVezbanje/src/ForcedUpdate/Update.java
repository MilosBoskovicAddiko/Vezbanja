package ForcedUpdate;

public class Update {

    enum OperatingSystem {
        ANDROID,
        IOS
    }

    public static boolean forceUpdate(OperatingSystem operatingSystem, String currVersion, String minVersion) {
        if (operatingSystem.name().equals("IOS")) {
            String[] currentVersion = currVersion.split("\\.");
            String[] minimalVersion = minVersion.split("\\.");
            if (Integer.parseInt(currentVersion[0]) < Integer.parseInt(minimalVersion[0])) {
                return true;
            } else if (Integer.parseInt(currentVersion[0]) > Integer.parseInt(minimalVersion[0])) {
                return false;
            } else {
                if (Integer.parseInt(currentVersion[1]) < Integer.parseInt(minimalVersion[1])) {
                    return true;
                } else if (Integer.parseInt(currentVersion[1]) > Integer.parseInt(minimalVersion[1])) {
                    return false;
                } else {
                    if (Integer.parseInt(currentVersion[2]) < Integer.parseInt(minimalVersion[2])) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
        } else if (operatingSystem.name().equals("ANDROID")) {
            long currentVersion = Long.parseLong(currVersion);
            long minimalVersion = Long.parseLong(minVersion);
            return currentVersion < minimalVersion;
        }
        return false;
    }

}
