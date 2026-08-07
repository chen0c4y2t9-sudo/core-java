package homework.test3;

public enum BrandEnum {

    HUAWEI("华为", "鸿蒙"),
    XIAOMI("小米", "MIUI"),
    APPLE("苹果", "iOS"),
    OPPO("OPPO", "ColorOS"),
    VIVO("VIVO", "Funtouch OS");


    private final String chineseName;
    private final String system;


    private BrandEnum(String chineseName, String system) {
        this.chineseName = chineseName;
        this.system = system;
    }


    public String getChineseName() {
        return chineseName;
    }

    public String getSystem() {
        return system;
    }
}
