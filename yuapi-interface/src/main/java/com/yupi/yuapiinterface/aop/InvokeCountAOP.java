package com.yupi.yuapiinterface.aop;

import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 调用次数统计切面
 *
 * @author <a href="https://github.com/booboil">程序员booboil</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@RestControllerAdvice
public class InvokeCountAOP {

    // 原创_项目 [booboil](https://github.com/booboil)

//    @Resource
//    private UserInterfaceInfoService userInterfaceInfoService;

    // 伪代码
    // 定义切面触发的时机（什么时候执行方法）controller 接口的方法执行成功后，执行下述方法
//    public void doInvokeCount() {
//        // 调用方法
//        object.proceed();
//        // 调用成功后，次数 + 1
//        userInterfaceInfoService.invokeCount();
//    }
}
