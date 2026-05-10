package com.xyls184.gtwc.item;

import java.util.Arrays;
import java.util.List;

public enum ProcessType {
    // 模板说明: 最后一个可变参数填写该处理方式适用的 tabGroup（可以填多个）

    // 蔬菜区特有/通用
    SEGMENT("%s_segment", "%s Segment", "%s段", "vegetables", "fruit"),
    SLICE("sliced_%s", "Sliced %s", "%s片", "vegetables", "fruit"),  // 多个的示例
    SHRED("shredded_%s", "Shredded %s", "%s丝", "vegetables"),
    //下面两个用的是一个机器，但是电路板不一样
    BLOCK("block_of_%s", "Block of %s", "%s块", "vegetables"),
    TINY("%s_tiny", "Tiny %s", "%s粒", "vegetables"),

    // 下面两个用的是一个机器
    MASH("mashed_%s", "Mashed %s", "%s泥", "vegetables"),
    DUST("%s_dust", "%s Dust", "%s粉", "vegetables"),

    // 下面两个用的是一个机器
    JUICE("%s_juice", "%s Juice", "%s汁", "vegetables", "fruit"),
    OIL("%s_oil", "%s Oil", "%s油", "vegetables"),




    // 肉类特有 (只是代码示例)
    MINCE("minced_%s", "Minced %s", "肉糜(%s)", "meat"),
    ROAST("roasted_%s", "Roasted %s", "烤%s", "meat");

    private final String idTemplate;
    private final String enTemplate;
    private final String zhTemplate;
    private final List<String> applicableGroups; // 新增：适用的分类列表

    // 构造函数新增 String... applicableGroups
    ProcessType(String idTemplate, String enTemplate, String zhTemplate, String... applicableGroups) {
        this.idTemplate = idTemplate;
        this.enTemplate = enTemplate;
        this.zhTemplate = zhTemplate;
        this.applicableGroups = Arrays.asList(applicableGroups);
    }

    public String generateId(String baseId) { return String.format(idTemplate, baseId); }
    public String generateEnName(String baseEnName) { return String.format(enTemplate, baseEnName); }
    public String generateZhName(String baseZhName) { return String.format(zhTemplate, baseZhName); }

    // 新增：判断该处理方式是否适用于某个分类
    public boolean isApplicableTo(String tabGroup) {
        return applicableGroups.contains(tabGroup);
    }
}
