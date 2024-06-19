package com.ohgiraffers.jhpage.Controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("jhee")
public class BlogController {
    @GetMapping("myblog")
    public ModelAndView myblog(ModelAndView mv) {
        mv.setViewName("jhee/myblog");
        return mv;
    }

    @GetMapping("myinfo")
    public ModelAndView myinfo(ModelAndView mv) {
        mv.setViewName("jhee/myinfo");
        return mv;
    }

    @GetMapping("neighborblog")
    public ModelAndView neighborblog(ModelAndView mv) {
        mv.setViewName("jhee/neighborblog");
        return mv;
    }

}
