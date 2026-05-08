package com.xyls184.gtwc.item;
// 主要在这里加东西
public enum AutoAdd {
    // 注意这一整段最后有个分号，每一项后面有个逗号
    // Note that there is a semicolon at the end of this entire paragraph, and a comma after each item

    // 蔬菜区
    // 忽略了原版的土豆、胡萝卜、甜菜、南瓜、海带、棕色蘑菇、白色蘑菇
    // 其中蒜苗和蒜薹都是蒜的掉落物，小葱是大葱的掉落物
    // Vegetable section
    // Ignored the vanilla items: potato, carrot, beetroot, pumpkin, kelp, brown mushroom, red mushroom
    // Garlic sprout and garlic scape are both drops from garlic; spring onion is a drop from scallion
    TOMATO("tomato", "Tomato", "番茄", "vegetables", "forge:crops", "forge:crops/tomato", "forge:vegetables", "forge:vegetables/tomato"),
    CHIVE("chive", "Chive", "韭菜", "vegetables", "forge:crops", "forge:crops/chive", "forge:vegetables", "forge:vegetables/chive"),
    SWEET_POTATO("sweet_potato", "Sweet Potato", "红薯", "vegetables", "forge:crops", "forge:crops/sweet_potato", "forge:vegetables", "forge:vegetables/sweet_potato"),
    TARO("taro", "Taro", "芋头", "vegetables", "forge:crops", "forge:crops/taro", "forge:vegetables", "forge:vegetables/taro"),
    PEANUT("peanut", "Peanut", "花生", "vegetables", "forge:crops", "forge:crops/peanut", "forge:vegetables", "forge:vegetables/peanut"),
    OLIVE("olive", "Olive", "橄榄", "vegetables", "forge:crops", "forge:crops/olive", "forge:vegetables", "forge:vegetables/olive"),
    GARLIC("garlic", "Garlic", "蒜", "vegetables", "forge:crops", "forge:crops/garlic", "forge:vegetables", "forge:vegetables/garlic"),
    GARLIC_SPROUT("garlic_sprout", "Garlic Sprout", "蒜苗", "vegetables", "forge:crops", "forge:crops/garlic_sprout", "forge:vegetables", "forge:vegetables/garlic_sprout"),
    GARLIC_SCAPE("garlic_scape", "Garlic Scape", "蒜薹", "vegetables", "forge:crops", "forge:crops/garlic_scape", "forge:vegetables", "forge:vegetables/garlic_scape"),
    ONION("onion", "Onion", "洋葱", "vegetables", "forge:crops", "forge:crops/onion", "forge:vegetables", "forge:vegetables/onion"),
    CILANTRO("cilantro", "Cilantro", "香菜", "vegetables", "forge:crops", "forge:crops/cilantro", "forge:vegetables", "forge:vegetables/cilantro"),
    GREEN_ONION("green_onion", "Green Onion", "小葱", "vegetables", "forge:crops", "forge:crops/green_onion", "forge:vegetables", "forge:vegetables/green_onion"),
    WELSH_ONION("welsh_onion", "Welsh Onion", "大葱", "vegetables", "forge:crops", "forge:crops/welsh_onion", "forge:vegetables", "forge:vegetables/welsh_onion"),
    GINGER("ginger", "Ginger", "姜", "vegetables", "forge:crops", "forge:crops/ginger", "forge:vegetables", "forge:vegetables/ginger"),
    CHILI("chili", "Chili", "辣椒", "vegetables", "forge:crops", "forge:crops/chili", "forge:vegetables", "forge:vegetables/chili"),
    DAIKON("daikon", "Daikon", "白萝卜", "vegetables", "forge:crops", "forge:crops/daikon", "forge:vegetables", "forge:vegetables/daikon"),
    CARROT("carrot", "Carrot", "红萝卜", "vegetables", "forge:crops", "forge:crops/carrot", "forge:vegetables", "forge:vegetables/carrot"),
    ASPARAGUS("asparagus", "Asparagus", "芦笋", "vegetables", "forge:crops", "forge:crops/asparagus", "forge:vegetables", "forge:vegetables/asparagus"),
    BAMBOO_SHOOT("bamboo_shoot", "Bamboo Shoot", "竹笋", "vegetables", "forge:crops", "forge:crops/bamboo_shoot", "forge:vegetables", "forge:vegetables/bamboo_shoot"),
    LUFFA("luffa", "Luffa", "丝瓜", "vegetables", "forge:crops", "forge:crops/luffa", "forge:vegetables", "forge:vegetables/luffa"),
    ZUCCHINI("zucchini", "Zucchini", "西葫芦", "vegetables", "forge:crops", "forge:crops/zucchini", "forge:vegetables", "forge:vegetables/zucchini"),
    BELL_PEPPER("bell_pepper", "Bell Pepper", "甜椒", "vegetables", "forge:crops", "forge:crops/bell_pepper", "forge:vegetables", "forge:vegetables/bell_pepper"),
    BROCCOLI("broccoli", "Broccoli", "西兰花", "vegetables", "forge:crops", "forge:crops/broccoli", "forge:vegetables", "forge:vegetables/broccoli"),
    CAULIFLOWER("cauliflower", "Cauliflower", "花椰菜", "vegetables", "forge:crops", "forge:crops/cauliflower", "forge:vegetables", "forge:vegetables/cauliflower"),
    PURPLE_CABBAGE("purple_cabbage", "Purple Cabbage", "紫甘蓝", "vegetables", "forge:crops", "forge:crops/purple_cabbage", "forge:vegetables", "forge:vegetables/purple_cabbage"),
    CABBAGE("cabbage", "Cabbage", "卷心菜", "vegetables", "forge:crops", "forge:crops/cabbage", "forge:vegetables", "forge:vegetables/cabbage"),
    NAPA_CABBAGE("napa_cabbage", "Napa Cabbage", "白菜", "vegetables", "forge:crops", "forge:crops/napa_cabbage", "forge:vegetables", "forge:vegetables/napa_cabbage"),
    LETTUCE("lettuce", "Lettuce", "生菜", "vegetables", "forge:crops", "forge:crops/lettuce", "forge:vegetables", "forge:vegetables/lettuce"),
    SPINACH("spinach", "Spinach", "菠菜", "vegetables", "forge:crops", "forge:crops/spinach", "forge:vegetables", "forge:vegetables/spinach"),
    YU_CHOY("yu_choy", "Yu Choy", "油菜", "vegetables", "forge:crops", "forge:crops/yu_choy", "forge:vegetables", "forge:vegetables/yu_choy"),
    CELERY("celery", "Celery", "芹菜", "vegetables", "forge:crops", "forge:crops/celery", "forge:vegetables", "forge:vegetables/celery"),
    CUCUMBER("cucumber", "Cucumber", "黄瓜", "vegetables", "forge:crops", "forge:crops/cucumber", "forge:vegetables", "forge:vegetables/cucumber"),
    EGGPLANT("eggplant", "Eggplant", "茄子", "vegetables", "forge:crops", "forge:crops/eggplant", "forge:vegetables", "forge:vegetables/eggplant"),
    OKRA("okra", "Okra", "秋葵", "vegetables", "forge:crops", "forge:crops/okra", "forge:vegetables", "forge:vegetables/okra"),
    BITTER_MELON("bitter_melon", "Bitter Melon", "苦瓜", "vegetables", "forge:crops", "forge:crops/bitter_melon", "forge:vegetables", "forge:vegetables/bitter_melon"),
    PEA("pea", "Pea", "豌豆", "vegetables", "forge:crops", "forge:crops/pea", "forge:vegetables", "forge:vegetables/pea"),
    WATER_CHESTNUT("water_chestnut", "Water Chestnut", "马蹄", "vegetables", "forge:crops", "forge:crops/water_chestnut", "forge:vegetables", "forge:vegetables/water_chestnut"),
    WINTER_MELON("winter_melon", "Winter Melon", "冬瓜", "vegetables", "forge:crops", "forge:crops/winter_melon", "forge:vegetables", "forge:vegetables/winter_melon"),
    LOTUS_ROOT("lotus_root", "Lotus Root", "莲藕", "vegetables", "forge:crops", "forge:crops/lotus_root", "forge:vegetables", "forge:vegetables/lotus_root"),
    LILY("lily", "Lily", "百合", "vegetables", "forge:crops", "forge:crops/lily", "forge:vegetables", "forge:vegetables/lily"),

    // 谷物类
    // Grains section
    MUNG_BEAN("mung_bean", "Mung Bean", "绿豆", "grain", "forge:crops", "forge:crops/mung_bean", "forge:grain", "forge:grain/mung_bean"),
    SOYBEAN("soybean", "Soybean", "大豆", "grain", "forge:crops", "forge:crops/soybean", "forge:grain", "forge:grain/soybean"),
    RICE("rice", "Rice", "大米", "grain", "forge:crops", "forge:crops/rice", "forge:grain", "forge:grain/rice"),
    MILLET("millet", "Millet", "小米", "grain", "forge:crops", "forge:crops/millet", "forge:grain", "forge:grain/millet"),
    CORN("corn", "Corn", "玉米", "grain", "forge:crops", "forge:crops/corn", "forge:grain", "forge:grain/corn"),
    ADZUKI_BEAN("adzuki_bean", "Adzuki Bean", "红豆", "grain", "forge:crops", "forge:crops/adzuki_bean", "forge:grain", "forge:grain/adzuki_bean");


    private final String id;
    private final String enName;
    private final String zhName;
    private final String tabGroup; // 用于创造模式物品栏分类
    private final String[] tags;   // 可变参数，填入所有需要的标签

    AutoAdd(String id,String enName, String zhName, String tabGroup, String... tags) {
        this.id = id;
        this.enName = enName;
        this.zhName = zhName;
        this.tabGroup = tabGroup;
        this.tags = tags;
    }

    public String getId() {
        return id;
    }

    public String getEnName() {
        return enName;
    }

    public String getZhName() {
        return zhName;
    }

    public String getTabGroup() {
        return tabGroup;
    }

    public String[] getTags() {
        return tags;
    }
}
