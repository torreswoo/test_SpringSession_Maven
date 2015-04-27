package com.skplanet;

/**
 * Created by 1002475 on 15. 4. 27..
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Controller
@RequestMapping("/")
public class HelloController {

    private static final long serialVersionUID = 2878267318695777395L;

    @RequestMapping(value="/test", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        System.out.println("...HelloController...printWelcome()");
        model.addAttribute("message", "Hello world!");

        return "hello";
    }

    @RequestMapping( method = RequestMethod.GET)
    public String test(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("...HelloController...test()");
//        String attributeName = req.getParameter("attributeName");
//        String attributeValue = req.getParameter("attributeValue");
//
//        req.getSession().setAttribute(attributeName, attributeValue);

        //resp.sendRedirect(req.getContextPath() + "/");
        return "/index";
    }
}
