package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @RequestMapping(value="")
    @ResponseBody
    public String skillsTracker() {
        String html = "<h1> Skills Tracker </h1>" +
                "<h2> We have a few skills we would like to learn. Here is the list! </h2>" +
                "<ol> " +
                    "<li> Java </li>" +
                    "<li> JavaScript </li>" +
                    "<li> Python </li>" +
                "</ol>";
        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String optionForm() {
        return "<form method = 'post'>" +
                "<label for='name'>Name: </label><br>" +
                "<input type = 'text' name='name' id='name'/><br>" +

                "<label for='firstLang'>My favorite language: </label><br>" +
                "<select id = 'firstLang' name='firstLang'>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Python'>Python</option>" +
                "</select><br>" +

                "<label for='secondLang'>My second favorite language: </label><br>" +
                "<select id = 'secondLang' name='secondLang'>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Python'>Python</option>" +
                "</select><br>" +

                "<label for='thirdLang'>My third favorite language: </label><br>" +
                "<select id = 'thirdLang' name='thirdLang'>" +
                    "<option value='Java'>Java</option>" +
                    "<option value='JavaScript'>JavaScript</option>" +
                    "<option value='Python'>Python</option>" +
                "</select><br>" +

                "<input type='submit' value='Submit'/>" +
                "</form>";

    }

    @PostMapping(value="form")
    @ResponseBody
    public String namePage(String name, String firstLang, String secondLang, String thirdLang) {
       return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstLang + "</li>" +
                "<li>" + secondLang + "</li>" +
                "<li>" + thirdLang + "</li>" +
                "</ol>";
    }
}

