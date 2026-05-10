package com.xyls184.gtwc.item;
// 主要在这里加东西
public enum AutoAdd {
    // 注意这一整段最后有个分号，每一项后面有个逗号
    // Note that there is a semicolon at the end of this entire paragraph, and a comma after each item

    // 蔬菜区
    // 忽略了原版的土豆√、胡萝卜√、甜菜√、南瓜√、海带√、棕色蘑菇、红色蘑菇
    // 其中蒜苗和蒜薹都是蒜的掉落物，小葱是大葱的掉落物
    // Vegetable section
    // Ignored the vanilla items: potato, carrot, beetroot, pumpkin, kelp, brown mushroom, red mushroom
    // Garlic sprout and garlic scape are both drops from garlic; spring onion is a drop from scallion
    ASPARAGUS("asparagus", "Asparagus", "芦笋", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.DUST, ProcessType.OIL}, "forge:crops/asparagus", "forge:vegetables", "forge:vegetables/asparagus"),
    BAMBOO_SHOOT("bamboo_shoot", "Bamboo Shoot", "竹笋", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.BLOCK, ProcessType.TINY, ProcessType.MASH, ProcessType.DUST, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/bamboo_shoot", "forge:vegetables", "forge:vegetables/bamboo_shoot"),
    BEETROOT("beetroot", "Beetroot", "甜菜", "vegetables", true, new ProcessType[]{ProcessType.SEGMENT, ProcessType.MASH, ProcessType.DUST, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/beetroot", "forge:vegetables", "forge:vegetables/beetroot"),
    BELL_PEPPER("bell_pepper", "Bell Pepper", "甜椒", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.MASH, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/bell_pepper", "forge:vegetables", "forge:vegetables/bell_pepper"),
    BITTER_MELON("bitter_melon", "Bitter Melon", "苦瓜", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.TINY, ProcessType.MASH, ProcessType.DUST, ProcessType.OIL}, "forge:crops", "forge:crops/bitter_melon", "forge:vegetables", "forge:vegetables/bitter_melon"),
    BROCCOLI("broccoli", "Broccoli", "西兰花", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.SLICE, ProcessType.SHRED, ProcessType.TINY, ProcessType.DUST, ProcessType.OIL}, "forge:crops", "forge:crops/broccoli", "forge:vegetables", "forge:vegetables/broccoli"),
    BROWN_MUSHROOM("brown_mushroom", "Brown Mushroom", "棕色蘑菇", "vegetables", true, new ProcessType[]{ProcessType.SEGMENT, ProcessType.MASH, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/brown_mushroom", "forge:vegetables", "forge:vegetables/brown_mushroom"),
    CABBAGE("cabbage", "Cabbage", "卷心菜", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.BLOCK, ProcessType.TINY, ProcessType.MASH, ProcessType.DUST, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/cabbage", "forge:vegetables", "forge:vegetables/cabbage"),
    CARROT("carrot", "Carrot", "胡萝卜", "vegetables", true, new ProcessType[]{ProcessType.SEGMENT, ProcessType.DUST, ProcessType.OIL}, "forge:crops", "forge:crops/carrot", "forge:vegetables", "forge:vegetables/carrot"),
    CAULIFLOWER("cauliflower", "Cauliflower", "花椰菜", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.SLICE, ProcessType.SHRED, ProcessType.TINY, ProcessType.MASH, ProcessType.DUST, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/cauliflower", "forge:vegetables", "forge:vegetables/cauliflower"),
    CELERY("celery", "Celery", "芹菜", "vegetables", new ProcessType[]{ProcessType.SLICE, ProcessType.MASH, ProcessType.DUST, ProcessType.OIL}, "forge:crops", "forge:crops/celery", "forge:vegetables", "forge:vegetables/celery"),
    CHILI("chili", "Chili", "辣椒", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.SHRED, ProcessType.BLOCK, ProcessType.TINY, ProcessType.MASH, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/chili", "forge:vegetables", "forge:vegetables/chili"),
    CILANTRO("cilantro", "Cilantro", "香菜", "vegetables", new ProcessType[]{ProcessType.SLICE, ProcessType.SHRED, ProcessType.BLOCK, ProcessType.TINY, ProcessType.MASH, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/cilantro", "forge:vegetables", "forge:vegetables/cilantro"),
    CUCUMBER("cucumber", "Cucumber", "黄瓜", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.MASH, ProcessType.DUST, ProcessType.OIL}, "forge:crops", "forge:crops/cucumber", "forge:vegetables", "forge:vegetables/cucumber"),
    DAIKON("daikon", "Daikon", "白萝卜", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.DUST, ProcessType.OIL}, "forge:crops", "forge:crops/daikon", "forge:vegetables", "forge:vegetables/daikon"),
    EGGPLANT("eggplant", "Eggplant", "茄子", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.DUST, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/eggplant", "forge:vegetables", "forge:vegetables/eggplant"),
    GARLIC("garlic", "Garlic", "蒜", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.SHRED, ProcessType.BLOCK, ProcessType.MASH, ProcessType.OIL}, "forge:crops", "forge:crops/garlic", "forge:vegetables", "forge:vegetables/garlic"),
    GARLIC_CHIVES("garlic_chives", "Garlic Chives", "韭菜", "vegetables", new ProcessType[]{ProcessType.SLICE, ProcessType.SHRED, ProcessType.BLOCK, ProcessType.TINY, ProcessType.MASH, ProcessType.DUST, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/garlic_chives", "forge:vegetables", "forge:vegetables/garlic_chives"),
    GARLIC_SCAPE("garlic_scape", "Garlic Scape", "蒜薹", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.SLICE, ProcessType.BLOCK, ProcessType.TINY, ProcessType.MASH, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/garlic_scape", "forge:vegetables", "forge:vegetables/garlic_scape"),
    GARLIC_SPROUT("garlic_sprout", "Garlic Sprout", "蒜苗", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.SLICE, ProcessType.BLOCK, ProcessType.TINY, ProcessType.MASH, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/garlic_sprout", "forge:vegetables", "forge:vegetables/garlic_sprout"),
    GINGER("ginger", "Ginger", "姜", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.BLOCK, ProcessType.MASH, ProcessType.OIL}, "forge:crops", "forge:crops/ginger", "forge:vegetables", "forge:vegetables/ginger"),
    GREEN_ONION("green_onion", "Green Onion", "小葱", "vegetables", new ProcessType[]{ProcessType.SLICE, ProcessType.SHRED, ProcessType.BLOCK, ProcessType.MASH, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/green_onion", "forge:vegetables", "forge:vegetables/green_onion"),
    KELP("kelp", "Kelp", "海带", "vegetables", true, new ProcessType[]{ProcessType.SEGMENT, ProcessType.BLOCK, ProcessType.TINY, ProcessType.MASH, ProcessType.DUST, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/kelp", "forge:vegetables", "forge:vegetables/kelp"),
    LETTUCE("lettuce", "Lettuce", "生菜", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.BLOCK, ProcessType.TINY, ProcessType.MASH, ProcessType.DUST, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/lettuce", "forge:vegetables", "forge:vegetables/lettuce"),
    LILY_BULB("lily_bulb", "Lily Bulb", "百合", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.SLICE, ProcessType.SHRED, ProcessType.BLOCK, ProcessType.TINY, ProcessType.MASH, ProcessType.DUST, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/lily_bulb", "forge:vegetables", "forge:vegetables/lily_bulb"),
    LOTUS_ROOT("lotus_root", "Lotus Root", "莲藕", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.MASH, ProcessType.OIL}, "forge:crops", "forge:crops/lotus_root", "forge:vegetables", "forge:vegetables/lotus_root"),
    LUFFA("luffa", "Luffa", "丝瓜", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.TINY, ProcessType.MASH, ProcessType.DUST, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/luffa", "forge:vegetables", "forge:vegetables/luffa"),
    NAPA_CABBAGE("napa_cabbage", "Napa Cabbage", "白菜", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.BLOCK, ProcessType.TINY, ProcessType.MASH, ProcessType.DUST, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/napa_cabbage", "forge:vegetables", "forge:vegetables/napa_cabbage"),
    OKRA("okra", "Okra", "秋葵", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.TINY, ProcessType.DUST, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/okra", "forge:vegetables", "forge:vegetables/okra"),
    OLIVE("olive", "Olive", "橄榄", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.SLICE, ProcessType.SHRED, ProcessType.BLOCK, ProcessType.TINY, ProcessType.MASH, ProcessType.DUST, ProcessType.JUICE}, "forge:crops", "forge:crops/olive", "forge:vegetables", "forge:vegetables/olive"),
    ONION("onion", "Onion", "洋葱", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.DUST, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/onion", "forge:vegetables", "forge:vegetables/onion"),
    PEA("pea", "Pea", "豌豆", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.SLICE, ProcessType.SHRED, ProcessType.BLOCK, ProcessType.TINY, ProcessType.MASH, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/pea", "forge:vegetables", "forge:vegetables/pea"),
    PEANUT("peanut", "Peanut", "花生", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.SLICE, ProcessType.SHRED, ProcessType.BLOCK, ProcessType.TINY, ProcessType.MASH, ProcessType.JUICE}, "forge:crops", "forge:crops/peanut", "forge:vegetables", "forge:vegetables/peanut"),
    POTATO("potato", "Potato", "马铃薯", "vegetables", true, new ProcessType[]{ProcessType.SEGMENT, ProcessType.DUST, ProcessType.JUICE, ProcessType.OIL}, "forge:crops/potato", "forge:vegetables"),
    PUMPKIN("pumpkin", "Pumpkin", "南瓜", "vegetables", true, new ProcessType[]{ProcessType.SEGMENT, ProcessType.SHRED, ProcessType.DUST, ProcessType.OIL}, "forge:crops", "forge:crops/pumpkin", "forge:vegetables", "forge:vegetables/pumpkin"),
    RED_CABBAGE("red_cabbage", "Red Cabbage", "紫甘蓝", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.BLOCK, ProcessType.TINY, ProcessType.MASH, ProcessType.DUST, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/red_cabbage", "forge:vegetables", "forge:vegetables/red_cabbage"),
    RED_MUSHROOM("red_mushroom", "Red Mushroom", "红色蘑菇", "vegetables", true, new ProcessType[]{ProcessType.SEGMENT, ProcessType.MASH, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/red_mushroom", "forge:vegetables", "forge:vegetables/red_mushroom"),
    SPINACH("spinach", "Spinach", "菠菜", "vegetables", new ProcessType[]{ProcessType.SLICE, ProcessType.SHRED, ProcessType.BLOCK, ProcessType.TINY, ProcessType.MASH, ProcessType.DUST, ProcessType.OIL}, "forge:crops", "forge:crops/spinach", "forge:vegetables", "forge:vegetables/spinach"),
    SWEET_POTATO("sweet_potato", "Sweet Potato", "红薯", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.DUST, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/sweet_potato", "forge:vegetables", "forge:vegetables/sweet_potato"),
    TARO("taro", "Taro", "芋头", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.DUST, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/taro", "forge:vegetables", "forge:vegetables/taro"),
    TOMATO("tomato", "Tomato", "番茄", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.SHRED, ProcessType.DUST, ProcessType.OIL}, "forge:crops", "forge:crops/tomato", "forge:vegetables", "forge:vegetables/tomato"),
    WATER_CHESTNUT("water_chestnut", "Water Chestnut", "马蹄", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.SHRED, ProcessType.MASH, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/water_chestnut", "forge:vegetables", "forge:vegetables/water_chestnut"),
    WELSH_ONION("welsh_onion", "Welsh Onion", "大葱", "vegetables", new ProcessType[]{ProcessType.SLICE, ProcessType.BLOCK, ProcessType.MASH, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/welsh_onion", "forge:vegetables", "forge:vegetables/welsh_onion"),
    WINTER_MELON("winter_melon", "Winter Melon", "冬瓜", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.SHRED, ProcessType.OIL}, "forge:crops", "forge:crops/winter_melon", "forge:vegetables", "forge:vegetables/winter_melon"),
    YU_CHOY("yu_choy", "Yu Choy", "油菜", "vegetables", new ProcessType[]{ProcessType.SLICE, ProcessType.SHRED, ProcessType.BLOCK, ProcessType.TINY, ProcessType.MASH, ProcessType.DUST, ProcessType.JUICE}, "forge:crops", "forge:crops/yu_choy", "forge:vegetables", "forge:vegetables/yu_choy"),
    ZUCCHINI("zucchini", "Zucchini", "西葫芦", "vegetables", new ProcessType[]{ProcessType.SEGMENT, ProcessType.TINY, ProcessType.MASH, ProcessType.DUST, ProcessType.JUICE, ProcessType.OIL}, "forge:crops", "forge:crops/zucchini", "forge:vegetables", "forge:vegetables/zucchini"),

    // 谷物类
    // Grains section
    ADZUKI_BEAN("adzuki_bean", "Adzuki Bean", "红豆", "grain", "forge:crops", "forge:crops/adzuki_bean", "forge:grain", "forge:grain/adzuki_bean"),
    CORN("corn", "Corn", "玉米", "grain", "forge:crops", "forge:crops/corn", "forge:grain", "forge:grain/corn"),
    MILLET("millet", "Millet", "小米", "grain", "forge:crops", "forge:crops/millet", "forge:grain", "forge:grain/millet"),
    MUNG_BEAN("mung_bean", "Mung Bean", "绿豆", "grain", "forge:crops", "forge:crops/mung_bean", "forge:grain", "forge:grain/mung_bean"),
    RICE("rice", "Rice", "大米", "grain", "forge:crops", "forge:crops/rice", "forge:grain", "forge:grain/rice"),
    SOYBEAN("soybean", "Soybean", "大豆", "grain", "forge:crops", "forge:crops/soybean", "forge:grain", "forge:grain/soybean");


    private final String id;
    private final String enName;
    private final String zhName;
    private final String tabGroup; // 用于创造模式物品栏分类
    private final boolean isVanilla;
    private final ProcessType[] disabledTypes;// 不需要生成的形态黑名单
    private final String[] tags;   // 可变参数，填入所有需要的标签

    // ==========================================
    // 构造方法 1：最简模式 (连黑名单都不用写)
    // 如果你第五个参数直接填 String 标签，Java 就会调用这个方法
    // ==========================================
    AutoAdd(String id, String enName, String zhName, String tabGroup, String... tags) {
        // 自动传递给主构造方法：默认不是原版 (false)，默认黑名单为空 (new ProcessType[]{})
        this(id, enName, zhName, tabGroup, false, new ProcessType[]{}, tags);
    }

    // ==========================================
    // 构造方法 2：屏蔽模式 (只写黑名单，不写 true/false)
    // 如果你第五个参数填 new ProcessType[]，Java 就会调用这个方法
    // ==========================================
    AutoAdd(String id, String enName, String zhName, String tabGroup, ProcessType[] disabledTypes, String... tags) {
        // 自动传递给主构造方法：默认不是原版 (false)
        this(id, enName, zhName, tabGroup, false, disabledTypes, tags);
    }

    // ==========================================
    // 构造方法 3：主构造方法 (全参数)
    // ==========================================
    AutoAdd(String id, String enName, String zhName, String tabGroup, boolean isVanilla, ProcessType[] disabledTypes, String... tags) {
        this.id = id;
        this.enName = enName;
        this.zhName = zhName;
        this.tabGroup = tabGroup;
        this.isVanilla = isVanilla;
        this.disabledTypes = disabledTypes;
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

    public boolean isVanilla() {
        return isVanilla;
    }

    public ProcessType[] getDisabledTypes() {
        return disabledTypes;
    }

    public String[] getTags() {
        return tags;
    }
}
