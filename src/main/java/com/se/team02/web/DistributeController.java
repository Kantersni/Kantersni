package com.se.team02.web;
import com.se.team02.domain.Distribute;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/distributes")
@Controller
@RooWebScaffold(path = "distributes", formBackingObject = Distribute.class)
public class DistributeController {
}
