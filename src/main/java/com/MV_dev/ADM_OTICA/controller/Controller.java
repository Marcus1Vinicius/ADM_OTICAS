package com.MV_dev.ADM_OTICA.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/boasvindas")
public class Controller {
    @GetMapping
    public String BoasVindas(){

        return "Primeira mensagem nessa rota";
    }
}
