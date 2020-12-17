package com.offcn.thymeleafdemo.controller;

import com.offcn.thymeleafdemo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Controller
public class thymeleafController {

    @GetMapping("/index2")
    public String indexPage(Model model){
        System.out.println("——————》》进入控制层");
        model.addAttribute("msg","mymodel");
        return "index2";  // 约定去找index，无需配置
    }

    @GetMapping("/index")
    public String getUser(Model model){
        User user = new User("小红", "21", "女", "164");
        model.addAttribute("user",user);

        HashMap<Object, Object> map = new HashMap<>();
        map.put("src1","1.jpg");
        map.put("src2","2.jpg");
        map.put("src3","3.jpg");
        map.put("src4","4.jpg");
        model.addAttribute("map",map);

        model.addAttribute("msg","我是msg信息，《图片展示》");
        return "index";
    }

    @RequestMapping("/index3")
    public String index3(Model model){
        User user = new User("小红", "21", "女", "164");
        User user1 = new User("lili", "21", "女", "164");
        User user2 = new User("lolo", "21", "女", "164");
        User user3 = new User("kiki", "21", "女", "164");
        List<Object> list = new ArrayList<>();
        list.add(user);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        model.addAttribute("list",list);
        return "index3";
    }
    @RequestMapping("/index4")
    public String index4(Model model){
        model.addAttribute("username","huli");
        model.addAttribute("color","白色");
        return "index4";
    }
     @RequestMapping("/index5")
    public String index5(Model model){
        model.addAttribute("result","yes");
        model.addAttribute("menu","1");
        return "index5";
    }

    @RequestMapping("/index6")
    public String index6(Model model){
        return "index6";
    }

    @RequestMapping("/index7")
        public String index7(Model model){
//        日期
        Date date = new Date();
//        字符
        String str = "我是字符串1"+"我是字符串243266666666543666";
        String str2 = "我可能不是是字符串";
//        数字
        double num= 100.14417685483;
        model.addAttribute("date",date);
        model.addAttribute("str",str);
        model.addAttribute("str2",str2);
        model.addAttribute("num",num);
            return "index7";
        }


}
