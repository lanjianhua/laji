package com.itheima.Controller;

import com.itheima.service.ItemsService;
import itheima.domain.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    @RequestMapping("show")
    public String  show(Model model){
        Items items = itemsService.findById();
        model.addAttribute("item",items);
        return "itemDetail";
    }
}
