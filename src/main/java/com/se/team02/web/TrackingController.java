package com.se.team02.web;
import com.se.team02.domain.Tracking;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/trackings")
@Controller
@RooWebScaffold(path = "trackings", formBackingObject = Tracking.class)
public class TrackingController {
}
