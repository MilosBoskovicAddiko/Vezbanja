package ForcedUpdate;

public class Update {

    enum OperatingSystem{
        ANDROID,
        IOS
    }

    public boolean forceUpdate(OperatingSystem operatingSystem, String currVersion, String minVersion){
        if (operatingSystem.name().equals("IOS")){
            double currentVersion = Double.parseDouble(currVersion.substring(0,currVersion.indexOf("."))+"."+currVersion.substring(currVersion.indexOf(".")).replaceAll("[\\.0]",""));
            double minimalVersion = Double.parseDouble(minVersion.substring(0,minVersion.indexOf("."))+"."+minVersion.substring(minVersion.indexOf(".")).replaceAll("[\\.0]",""));
            return currentVersion < minimalVersion;
        }else if(operatingSystem.name().equals("ANDROID")){
            long currentVersion = Long.parseLong(currVersion);
            long minimalVersion = Long.parseLong(minVersion);
            return currentVersion < minimalVersion;
        }
        return false;
    }

}
