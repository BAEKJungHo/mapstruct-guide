package com.baek.mapstruct.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

public enum ErrorCode {
    INVALID_PARAMETER("101", "common.invalid.parameter"),
    ;

    private final String code;
    private final String message;

    private static final ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", Locale.ENGLISH);

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return resourceBundle.getString(message);
    }
}
