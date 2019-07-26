package ForcedUpdate;

public class Update {

    enum OperatingSystem {
        ANDROID,
        IOS
    }

    public static boolean forceUpdate(OperatingSystem operatingSystem, String currVersion, String minVersion) {
        try {
            switch (operatingSystem) {
                case IOS:
                    String[] currentVersion = currVersion.split("\\.");
                    String[] minimalVersion = minVersion.split("\\.");
                    for (int i = 0; i < currentVersion.length; i++) {
                        if (Integer.parseInt(currentVersion[i]) < Integer.parseInt(minimalVersion[i])) {
                            return true;
                        } else if (Integer.parseInt(currentVersion[i]) > Integer.parseInt(minimalVersion[i])) {
                            return false;
                        } else {
                            if (i == currentVersion.length - 1) {
                                return false;
                            }
                            continue;
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
        } catch (NullPointerException e) {
            return false;
        }

        return false;
    }

}
