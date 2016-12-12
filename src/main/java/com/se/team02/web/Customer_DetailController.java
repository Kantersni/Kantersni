package com.se.team02.web;
import com.se.team02.domain.Customer_Detail;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/customer_details")
@Controller
@RooWebScaffold(path = "customer_details", formBackingObject = Customer_Detail.class)
public class Customer_DetailController {
}
