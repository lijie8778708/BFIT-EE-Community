package com.bfit.bfitee.controller;

import com.bfit.bfitee.mapper.QuestionMapper;
import com.bfit.bfitee.model.Question;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.apache.commons.lang3.StringUtils;
import javax.servlet.http.HttpServletRequest;

@Controller
public class PublishController {

    @Autowired
    QuestionMapper questionMapper;

    @GetMapping("/publish")
    public String publish(Model model) {
        return "publish";
    }

    @PostMapping("/publish")
    public String doPublish(
            @RequestParam(value = "title", required = false) String title,
            @RequestParam(value = "description", required = false) String description,
            @RequestParam(value = "tag", required = false) String tag,
            @RequestParam(value = "id", required = false) Long id,
            HttpServletRequest request,
            Model model) {
        model.addAttribute("title", title);
        model.addAttribute("description", description);
        model.addAttribute("tag", tag);

        if(StringUtils.isBlank(title)) {
            model.addAttribute("error", "The title can not be empty");
            return "publish";
        }
        if(StringUtils.isBlank(description)) {
            model.addAttribute("error", "The description can not be empty");
            return "publish";
        }
        if(StringUtils.isBlank(tag)) {
            model.addAttribute("error", "The tag can not be empty");
            return "publish";
        }

        Question question = new Question();
        question.setTitle(title);
        question.setDescription(description);
        question.setTag(tag);
        question.setId(id);
        questionMapper.insert(question);
        return "redirect:/";
    }
}
