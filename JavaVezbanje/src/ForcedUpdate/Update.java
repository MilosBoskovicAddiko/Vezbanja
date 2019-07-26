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
            for (int i = 0; i < currentVersion.length; i++){
                if(Integer.parseInt(currentVersion[i]) < Integer.parseInt(minimalVersion[i])){
                    return true;
                } else if (Integer.parseInt(currentVersion[i]) > Integer.parseInt(minimalVersion[i])){
                    return false;
                } else{
                    if(i==currentVersion.length-1){
                        return false;
                    }
                    continue;
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
