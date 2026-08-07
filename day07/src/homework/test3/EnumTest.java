package homework.test3;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("---- 遍历所有品牌 ----");

        BrandEnum[] brands = BrandEnum.values();
        for (int i = 0; i < brands.length; i++) {
            BrandEnum brand = brands[i];
            System.out.printf("%d. %s (%s) - 操作系统: %s%n",
                    i + 1, brand.name(), brand.getChineseName(), brand.getSystem());
        }

        System.out.println("\n---- switch 匹配 APPLE ----");

        BrandEnum target = BrandEnum.APPLE;
        switch (target) {
            case APPLE:
                System.out.println("苹果手机使用 iOS 系统，流畅稳定");
                break;
            default:
                System.out.println("其他品牌手机");
                break;
        }
    }
}