package ForcedUpdate;

public class Update {

    enum OperatingSystem {
        ANDROID,
        IOS
    }

    public static boolean forceUpdate(OperatingSystem operatingSystem, String currVersion, String minVersion) {
        if (operatingSystem == null || StringUtils.isEmpty(currVersion) || StringUtils.isEmpty(minVersion)) {
            return false;
        }
        switch (operatingSystem) {
            case IOS:
                String[] currentVersion = currVersion.trim().split("\\.");
                String[] minimalVersion = minVersion.trim().split("\\.");
                if (currentVersion.length != minimalVersion.length) {
                    return false;
                }
                for (int i = 0; i < currentVersion.length; i++) {
                    if (Integer.parseInt(currentVersion[i]) < Integer.parseInt(minimalVersion[i])) {
                        return true;
                    } else if (Integer.parseInt(currentVersion[i]) > Integer.parseInt(minimalVersion[i])) {
                        return false;
                    }
                }
                break;
            case ANDROID:
                long curVersion = Long.parseLong(currVersion);
                long minimVersion = Long.parseLong(minVersion);
                return curVersion < minimVersion;
            default:
                return false;
        }
        return false;
    }

}
