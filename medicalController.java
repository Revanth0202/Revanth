package controller;

import entity.Medical;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class medicalController {
    @PostMapping("/api/medicine")
    public void saveMedicines(@RequestBody Medical medical){
        System.out.println(medical);

    }

}
