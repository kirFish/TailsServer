package kirichripper.entertainment.server.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/tail")
public class TailController {

    @ResponseBody
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getTail(ModelMap model){
        return "That is a big tail";
    }




}
