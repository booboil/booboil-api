package com.yupi.yuapicommon.model.enums;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 接口信息状态枚举
 *
 * @author <a href="https://github.com/booboil">程序员booboil</a>
 * @from <a href="https://booboil.top">booboil</a>
 */
public enum InterfaceInfoStatusEnum {

    OFFLINE("关闭", 0),
    ONLINE("上线", 1);

    private final String text;

    private final int value;

    InterfaceInfoStatusEnum(String text, int value) {
        this.text = text;
        this.value = value;
    }

    /**
     * 获取值列表
     *
     * @return
     */
    public static List<Integer> getValues() {
        return Arrays.stream(values()).map(item -> item.value).collect(Collectors.toList());
    }

    public int getValue() {
        return value;
    }

    public String getText() {
        return text;
    }
}
