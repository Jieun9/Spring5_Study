package survey;

import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Configuration
@RequestMapping("/survey")
public class SurveyController {

    @GetMapping
    public String form() {
        return "survey/surveyForm";
    }
    

    @PostMapping
    public String submit(@ModelAttribute("ansData") AnsweredData data) {
        return "survey/submitted";
    }


}
