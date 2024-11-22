package springbootapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RootController {

    @GetMapping(value = "/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("The story of one awesome CRUD-application");
        messages.add("Java version " + System.getProperty("java.version"));
        model.addAttribute("messages", messages);
        return "index";
    }

}