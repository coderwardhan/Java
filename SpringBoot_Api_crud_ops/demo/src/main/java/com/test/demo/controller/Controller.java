package com.test.demo.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.demo.bean.RequestBean;
import com.test.demo.bean.ResponseBean;

@RestController
@RequestMapping("/api")
public class Controller {
	
	private Map<Long, RequestBean> requestMap = new HashMap<>();

    // This will store the response
    private ResponseBean response = new ResponseBean();

    @GetMapping("/showall")
    public ResponseBean show() {
        // Assuming ResponseBean has properties to display the stored requests
        response.setRequests(requestMap.values());
        return response;
    }
    
    @GetMapping("/show/{id}")
    public ResponseEntity<ResponseBean> getResquestById(@PathVariable Long id)
    {
RequestBean request = requestMap.get(id);
        
        if (request != null) {
            // Populate ResponseBean with the details of the found RequestBean
            ResponseBean response = new ResponseBean(List.of(request));
            return new ResponseEntity<ResponseBean>(response, HttpStatus.OK);
        } else {
            // Return an empty ResponseBean with NOT_FOUND status
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
    	
    }

    @PostMapping("/insert")
    public String insert(@RequestBody RequestBean request) {
        // Store the incoming RequestBean in the Map
        requestMap.put(request.getId(), request);
        
        // Example: Set response details based on the incoming request
        response.setRequests(requestMap.values());

        return "Request stored successfully.";
    }
}
