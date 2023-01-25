package com.main.projectrnsk.controllers;

import com.main.projectrnsk.models.Admonition;
import com.main.projectrnsk.models.Users;
import com.main.projectrnsk.service.AdmonitionService;
import com.main.projectrnsk.service.UsersService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private UsersService usersService;

    @Autowired
    private AdmonitionService admonitionService;

    @GetMapping("/")
    public String index(@NotNull Model model) {
        List<Admonition> admonitions = admonitionService.getAllAdmonition();
        model.addAttribute("admonitions", admonitions);
        return "index.html";
    }

    @GetMapping("/update/{id}")
    public String update(@PathVariable(value = "id") long id, Model model) {
        Admonition admonition = admonitionService.findAdmonition(id);
        model.addAttribute("admonitions", admonition);
        return "admonition-update";
    }

    @GetMapping("/add")
    public String add(){
        return "admonition-add";
    }


    @PostMapping("/update/{id}")
    public String updateAdmonition(@PathVariable(value = "id") long id,
                                   @RequestParam String number,
                                   @RequestParam String customer,
                                   @RequestParam String nameObject,
                                   @RequestParam String codeObject,
                                   @RequestParam String perfomer,
                                   @RequestParam String typeWork,
                                   @RequestParam String description,
                                   @RequestParam String classificationDescription,
                                   @RequestParam String regulatoryDocuments,
                                   @RequestParam String typeDescription,
                                   @RequestParam String dateIssue,
                                   @RequestParam String correctionDatePlan,
                                   @RequestParam String correctionDateFact,
                                   @RequestParam String remedyMarkFinal,
                                   @RequestParam String employee,
                                   @RequestParam String executor,
                                   @RequestParam String customerRepresentative) {

        Admonition admonition = admonitionService.findAdmonition(id);
        admonition.setNumberDescription(number);
        admonition.setCustomer(customer);
        admonition.setNameObject(nameObject);
        admonition.setCodeObject(Integer.parseInt(codeObject));
        admonition.setPerfomer(perfomer);
        admonition.setTypeWork(typeWork);
        admonition.setDescription(description);
        admonition.setClassificationDescription(classificationDescription);
        admonition.setRegulatoryDocuments(regulatoryDocuments);
        admonition.setTypeDescription(typeDescription);
        admonition.setDateIssue(dateIssue);
        admonition.setCorrectionDatePlan(correctionDatePlan);
        admonition.setCorrectionDateFact(correctionDateFact);
        admonition.setRemedyMarkFinal(remedyMarkFinal);
        admonition.setEmployee(employee);
        admonition.setExecutor(executor);
        admonition.setCustomerRepresentative(customerRepresentative);
        admonitionService.saveAdmonition(admonition);
        return "redirect:/";
    }

    @PostMapping("/add")
    public String addAdmonition(@RequestParam String number,
                                @RequestParam String customer,
                                @RequestParam String nameObject,
                                @RequestParam String codeObject,
                                @RequestParam String perfomer,
                                @RequestParam String typeWork,
                                @RequestParam String description,
                                @RequestParam String classificationDescription,
                                @RequestParam String regulatoryDocuments,
                                @RequestParam String typeDescription,
                                @RequestParam String dateIssue,
                                @RequestParam String correctionDatePlan,
                                @RequestParam String correctionDateFact,
                                @RequestParam String remedyMarkFinal,
                                @RequestParam String employee,
                                @RequestParam String executor,
                                @RequestParam String customerRepresentative) {

        Admonition admonition = new Admonition(customer, nameObject, Integer.parseInt(codeObject), perfomer, typeWork,
                description, classificationDescription, regulatoryDocuments, number, typeDescription, dateIssue,
                correctionDatePlan, remedyMarkFinal, employee, executor, customerRepresentative);

        admonitionService.saveAdmonition(admonition);

        return "redirect:/";
    }

}
