package com.abccompany.controller;

import com.abccompany.model.Heading;
import com.abccompany.service.HeadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/headings")
@CrossOrigin(origins = "*")
public class HeadingController {
    @Autowired
    private HeadingService headingService;

    @PostMapping
    public Heading saveHeading(@RequestBody Heading heading) {
        return headingService.saveHeading(heading);
    }

    @GetMapping("/latest")
    public Heading getLatestHeading() {
        return headingService.getLatestHeading();
    }
}
