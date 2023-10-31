package com.sdevgenians.sdev.common;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum ErrorStatus {

    /**
     * Success Code : 400
     * Bad Request
     */
    INVALID_REQUEST(400, "FAIL", "유효하지 않은 요청입니다."),
    FAILED_TO_LOGIN(400, "FAIL", "이메일 또는 비밀번호를 잘못 입력했습니다."),
    ALREADY_INACTIVE_MASTER(400, "FAIL", "이미 탈퇴한 계정입니다"),
    EXIST_EMAIL(400,"FAIL","이미 존재하는 이메일입니다.");


    public static String NOT_UPDATE_IMAGE;
    private final int code;
    private final String result;
    private final String message;

}
