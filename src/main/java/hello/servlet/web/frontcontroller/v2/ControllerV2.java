package hello.servlet.web.frontcontroller.v2;

import hello.servlet.web.frontcontroller.MyView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * View 분리 - v2
 *
 * v2 구조
 * 클라이언트 -> FrontController(매핑 정보 확인) -> Controller(MyView 반환) -> FrontController -> MyView -> JSP
 */
public interface ControllerV2 {
    MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
