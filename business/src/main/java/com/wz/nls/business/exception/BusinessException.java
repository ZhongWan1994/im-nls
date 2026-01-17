package com.wz.nls.business.exception;

import lombok.Data;


@Data
public class BusinessException extends RuntimeException {
    private BusinessExceptionEnum e;

    public BusinessException(BusinessExceptionEnum e) {
        super(e.getDesc());
        this.e = e;
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}
