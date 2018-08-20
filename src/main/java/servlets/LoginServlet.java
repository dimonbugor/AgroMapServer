package servlets;

import dao.UserDao;
import entitys.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.UserService;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        boolean loginSearch = false;
        boolean passwordSearch = false;

        UserService userService = new UserService(new UserDao());

        try {
            User user = userService.findByLogin(login);
            loginSearch = true;
            passwordSearch = user.getPassword().equals(password);
        } catch (NullPointerException npex) {
            loginSearch = false;
            passwordSearch = false;
        }

        String returnJson = "{login: "+ loginSearch +", password: "+ passwordSearch +"}";
        response.setHeader("JSON", returnJson);
    }
}
