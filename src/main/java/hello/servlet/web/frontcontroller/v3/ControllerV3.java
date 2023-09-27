package hello.servlet.web.frontcontroller.v3;

import hello.servlet.web.frontcontroller.ModelView;

import java.util.Map;

/**
 * Model 추가 - v3
 * 1. 서블릿 종속성 제거
 * 2. 뷰 이름 중복 제거
 */
public interface ControllerV3 {
    ModelView process(Map<String, String> paramMap);
}
