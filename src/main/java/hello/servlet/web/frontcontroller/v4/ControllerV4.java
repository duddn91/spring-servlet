package hello.servlet.web.frontcontroller.v4;

import java.util.Map;

/**
 * 단순하고 실용적인 컨트롤러 - v4
 * 기본적인 구조는 v3와 같으나 컨트롤러가 ModelView 를 반환하지 않고 ViewName 만 반환한다.
 */
public interface ControllerV4 {

    /**
     * @param paramMap
     * @param model
     * @return viewName
     */
    String process(Map<String, String> paramMap, Map<String, Object> model);
}
