package com.se.team02.web;
import com.se.team02.domain.Kan;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/kans")
@Controller
@RooWebScaffold(path = "kans", formBackingObject = Kan.class)
public class KanController {
}
