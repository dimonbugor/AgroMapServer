package servlets;

import dao.UserDao;
import entitys.User;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.UserService;

public class LoginServlet extends HttpServlet {

    private static final Logger log = Logger.getLogger(LoginServlet.class.getName());

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

            log.info("======================================================");
            log.info(user.toString());
            log.info("======================================================");

            loginSearch = true;
            passwordSearch = user.getPassword().equals(password);

        } catch (NullPointerException npex) {

            log.warning(npex.toString());

            loginSearch = false;
            passwordSearch = false;
        }

        log.info("======================================================");
        log.log(Level.INFO, "loginSearch: {0}", String.valueOf(loginSearch));
        log.log(Level.INFO, "passwordSearch: {0}", String.valueOf(passwordSearch));
        log.info("======================================================");

        String returnJson = "{login: " + loginSearch + ", password: " + passwordSearch + "}";
        response.setHeader("JSON", returnJson);        
    }
}
