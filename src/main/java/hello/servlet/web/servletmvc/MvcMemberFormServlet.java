package hello.servlet.web.servletmvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * MVC 패턴의 한계
 * 1. 포워드 중복
 * 2. ViewPath 중복
 * 3. 사용하지 않는 코드 ex) response
 * 4. 공통 처리가 어려움
 *
 * 정리하자면 공통 처리가 어렵다는 문제가 존재 -> 프론트 컨트롤러 패턴을 도입해 수문장 역할을 하는 기능이 필요
 * 입구를 단일화(게이트)
 */
@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPath = "/WEB-INF/views/new-form.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        dispatcher.forward(request, response);
    }
}
