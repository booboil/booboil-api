package com.yupi.yuapicommon.model.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.yupi.yuapicommon.model.entity.Post;

/**
 * 帖子视图
 *
 * @author <a href="https://github.com/booboil">程序员booboil</a>
 * @from <a href="https://booboil.top">booboil</a>
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class PostVO extends Post {

    /**
     * 是否已点赞
     */
    private Boolean hasThumb;

    private static final long serialVersionUID = 1L;
}