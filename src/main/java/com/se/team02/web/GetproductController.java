package com.se.team02.web;
import com.se.team02.domain.Getproduct;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/getproducts")
@Controller
@RooWebScaffold(path = "getproducts", formBackingObject = Getproduct.class)
public class GetproductController {
}
