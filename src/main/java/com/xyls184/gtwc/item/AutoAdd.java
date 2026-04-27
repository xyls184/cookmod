package com.xyls184.gtwc.item;
// 主要在这里加东西
public enum AutoAdd {
    TOMATO("tomato", "Tomato", "番茄", "vegetables", "forge:crops", "forge:crops/tomato", "forge:vegetables"),
    SWEET_POTATO("sweet_potato", "Sweet Potato", "红薯", "vegetables", "forge:crops", "forge:vegetables/sweet_potato"),
    TARO("taro", "Taro", "芋头", "vegetables", "forge:crops", "forge:vegetables/taro"),
    PEANUT("peanut", "Peanut", "花生", "vegetables", "forge:crops", "forge:crops/peanut");

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
