package com.yupi.project.common;

// https://space.bilibili.com/12890453/

import lombok.Data;

import java.io.Serializable;

/**
 * 删除请求
 *
 * @author <a href="https://github.com/booboil">程序员booboil</a>
 * @from <a href="https://booboil.top">booboil</a>
 */
@Data
public class IdRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    private static final long serialVersionUID = 1L;
}