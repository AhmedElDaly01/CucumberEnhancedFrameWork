package org.example.pages;

import org.openqa.selenium.support.PageFactory;

import static org.example.stepDefs.Hooks.driver;

public class pageBase {
    public pageBase() {
        PageFactory.initElements(driver, this);
    }
}