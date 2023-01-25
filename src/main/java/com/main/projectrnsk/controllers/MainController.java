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
//        List<Users> users = usersService.getAllUsers();
//        model.addAttribute("users",users);
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

}
//    @PostMapping("/item/{id}/update")
//    public String updateItem(
//            @PathVariable(value = "id") long id,
//            @RequestParam String title,
//            @RequestParam String image,
//            @RequestParam String price,
//            @RequestParam String info
//    ) {
//        Item item = itemRepository.findById(id).orElse(new Item());
//        item.setTitle(title);
//        item.setImage(image);
//        item.setInfo(info);
//        item.setPrice(Short.parseShort(price));
//        itemRepository.save(item);
//        return "redirect:/item/" + id;
//    }