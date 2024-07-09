package org.koreait;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {
    public static String Now() {
        // 현재 날짜/시간
        LocalDateTime now = LocalDateTime.now();
        // 포맷팅
        String formatedNow = now.format(DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss"));
        // 포맷팅 현재 날짜/시간 출력
        return formatedNow;  // 2021년 06월 17일 06시 43분 21초     }}
    }
}