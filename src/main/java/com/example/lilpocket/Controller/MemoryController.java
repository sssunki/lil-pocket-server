package com.example.lilpocket.Controller;

import com.example.lilpocket.Bean.Memory;
import com.example.lilpocket.Service.MemoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * method : return memory message, return by send account ,return by related account
 */

//@RestController
//@RequestMapping("/memory")
public class MemoryController {

//    @Autowired
    private MemoryService memoryService = null;

//    @Autowired
    public MemoryController(MemoryService memoryService) {
        this.memoryService = memoryService;
    }

    @GetMapping
    public List<Memory> getMemoryBySendAccount(@RequestBody String account) {
        // TODO: return a list of memory which send account is same as the request body
        return null;
    }

    @GetMapping
    public List<Memory> getMemoryByRelatedAccount(@RequestBody String account) {
        // TODO: return a list of memory which send account or receive account is the same as the request body
        return null;
    }



}
