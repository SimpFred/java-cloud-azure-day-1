package com.booleanuk.simpleapi.controllers;

import com.booleanuk.simpleapi.models.Label;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/labels")
@CrossOrigin
public class LabelController extends GenericController<Label, Integer> {
}
