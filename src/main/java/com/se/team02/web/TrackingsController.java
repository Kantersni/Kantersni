package com.se.team02.web;
import com.se.team02.domain.Trackings;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/trackingses")
@Controller
@RooWebScaffold(path = "trackingses", formBackingObject = Trackings.class)
public class TrackingsController {
}
