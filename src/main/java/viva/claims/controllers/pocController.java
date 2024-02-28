package viva.claims.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class pocController {

    @Autowired
    //@PreAuthorize("hasRole('User.Read')")
    @RequestMapping("/api/health")
    public String healthCheck() {

        String str = ">>>>>>>>> Health Check >>>>>>>>>";
        System.out.println(str);
        
        return "REST API Server is up and running";
    }

    
}
