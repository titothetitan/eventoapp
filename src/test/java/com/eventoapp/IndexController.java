/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eventoapp;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Tito
 */
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "index";

    }
}