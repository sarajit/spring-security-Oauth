package web.sample.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/secured")
public class HomeController {
	
	

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap model,HttpSession httpSession){
        model.addAttribute("message", "Spring MVC Java Config Example");
        System.out.println("HomeController currentUser----------------------------"+httpSession.getAttribute("currentUser"));
        return "secured";
    }

}
