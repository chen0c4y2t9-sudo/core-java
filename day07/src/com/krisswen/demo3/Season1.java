package com.krisswen.demo3;

public enum Season1 implements Info {

    SPRING("春天","春天万物复苏"){
        @Override
        public void show() {
            System.out.println("这是对春天进行描述");
        }
    },
    SUMMER("夏天","夏天生机勃勃"){
        @Override
        public void show() {
            System.out.println("这是对夏天进行描述");
        }
    },
    AUTUMN("秋天","秋天硕果累累"){
        @Override
        public void show() {
            System.out.println("这是对秋天进行描述");
        }
    },
    WINTER("冬天","冬天万物冬眠"){
        @Override
        public void show() {
            System.out.println("这是对冬天进行描述");
        }
    };

    private final String seasonName;
    private final String seasonDesc;

    Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

}
