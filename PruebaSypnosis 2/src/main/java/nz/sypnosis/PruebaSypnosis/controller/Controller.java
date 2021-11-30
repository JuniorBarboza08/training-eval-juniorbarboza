package nz.sypnosis.PruebaSypnosis.controller;

import nz.sypnosis.PruebaSypnosis.InterfaceServices.IClient_Services;
import nz.sypnosis.PruebaSypnosis.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.ui.Model;


import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {
    @Autowired
    private IClient_Services service;

    @GetMapping("/list")
    public String list(Model model){
        List<Client>clients=service.list();
        model.addAttribute("clients", clients);
        return "index";
    }

    @GetMapping("/new")
    public String add(Model model){
        model.addAttribute("clients", new Client());
        return "form";
    }

    public String save(@Validated Client c, Model model){
        service.save(c);
        return "redirect:/listar";
    }
}
