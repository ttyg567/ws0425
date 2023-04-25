package com.kbstar.controller;

import com.kbstar.dto.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class MainController {
    @RequestMapping("/")
    public String main(){
        return "index";
    }

    @RequestMapping("/charts")
    public String charts(Model model){
        model.addAttribute("center", "charts");
        return "index";
    }

    @RequestMapping("/tables")
    public String tables(Model model){
        List<Item> list = new ArrayList<>();
        list.add(new Item(100, "name1", 1000, "a.jpg", new Date()));
        list.add(new Item(101, "name2", 1000, "a.jpg", new Date()));
        list.add(new Item(102, "name3", 1000, "a.jpg", new Date()));
        list.add(new Item(103, "name4", 1000, "a.jpg", new Date()));
        list.add(new Item(104, "name5", 1000, "a.jpg", new Date()));
        list.add(new Item(105, "name6", 1000, "a.jpg", new Date()));
        list.add(new Item(106, "name7", 1000, "a.jpg", new Date()));
        list.add(new Item(107, "name8", 1000, "a.jpg", new Date()));
        list.add(new Item(108, "name9", 1000, "a.jpg", new Date()));
        list.add(new Item(109, "name10", 1000, "a.jpg", new Date()));
        list.add(new Item(110, "name11", 1000, "a.jpg", new Date()));
        list.add(new Item(111, "name12", 1000, "a.jpg", new Date()));
        list.add(new Item(112, "name13", 1000, "a.jpg", new Date()));
        list.add(new Item(113, "name14", 1000, "a.jpg", new Date()));
        list.add(new Item(114, "name15", 1000, "a.jpg", new Date()));
        list.add(new Item(115, "name16", 1000, "a.jpg", new Date()));
        list.add(new Item(116, "name17", 1000, "a.jpg", new Date()));
        list.add(new Item(117, "name18", 1000, "a.jpg", new Date()));
        model.addAttribute("allitem", list);
        model.addAttribute("center", "tables");
        return "index";
    }



}
