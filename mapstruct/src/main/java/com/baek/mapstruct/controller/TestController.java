package com.baek.mapstruct.controller;

import com.baek.mapstruct.i18n.ErrorCode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/error-code")
    public String enumApplyI18N() {
        return ErrorCode.INVALID_PARAMETER.getMessage();
    }
}
