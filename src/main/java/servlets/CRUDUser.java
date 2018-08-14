package servlets;

import dao.UserDao;
import entitys.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import service.UserService;

public class CRUDUser extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        crudUser();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    protected void crudUser() {
        
        UserService userService = new UserService(new UserDao());
        
        User user1 = new User("Root", "root", "Петр", "Сидоров");
        User user2 = new User("Pred", "pred", "Василий", "Калач");
        User user3 = new User("Work", "work", "Иван", "Ключев");
        
        userService.add(user1);
        userService.add(user2);
        userService.add(user3);
        
        System.out.println("***crudUser END***");
    }

}
