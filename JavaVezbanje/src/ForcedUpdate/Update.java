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
                    boolean flag = currentVersion.length < minimalVersion.length;
                    for (int i = 0; i < (flag ? currentVersion.length : minimalVersion.length); i++) {
                        if (Integer.parseInt(currentVersion[i]) < Integer.parseInt(minimalVersion[i])) {
                            return true;
                        } else if (Integer.parseInt(currentVersion[i]) > Integer.parseInt(minimalVersion[i])) {
                            return false;
                        } else {
                            if ((i == currentVersion.length - 1 | i == minimalVersion.length - 1) && flag) {
                                for (int j = currentVersion.length; j < minimalVersion.length; j++) {
                                    if (Integer.parseInt(minimalVersion[j]) != 0) {
                                        return true;
                                    }
                                }
                            }
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
            e.getMessage();
        } catch (NumberFormatException e) {
            e.getMessage();
        } catch (IndexOutOfBoundsException e) {
            e.getMessage();
        }
        return false;
    }

}
