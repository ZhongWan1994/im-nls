package com.wz.nls.business.resp;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CommonResp<T> {
    /**
     * 业务成功或失败
     */
    private boolean success=true;
    /**
     * 返回信息
     */
    private String message;
    /**
     * 返回泛型数据
     */
    private T cotent;
    public CommonResp(T cotent) {
        this.cotent = cotent;
    }
}
