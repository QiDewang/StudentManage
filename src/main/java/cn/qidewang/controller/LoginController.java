package cn.qidewang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/login")
/**
* @author 78692
* @date 17:00
* @param
*/
public class LoginController {

    @RequestMapping("/loginOut")
    public ModelAndView loginOut(HttpServletRequest request){
        HttpSession session = request.getSession();
        //session 失效
        session.invalidate();
        return new ModelAndView("redirect:/index.html");
    }
}
