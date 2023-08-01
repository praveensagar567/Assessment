package com.controller;

import com.service.VoterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/voters")
public class VoterController {
    @Autowired
    private VoterService voterService;
    // Voter CRUD APIs
}
