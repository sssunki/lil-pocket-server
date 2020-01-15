package com.example.lilpocket.Controller;

import com.example.lilpocket.Bean.Memory;
import com.example.lilpocket.Bean.User;
import com.example.lilpocket.Service.MemoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * method : return memory message, return by send account ,return by related account
 */

@RestController
@RequestMapping("/memory")
public class MemoryController {

    @Autowired
    private MemoryService memoryService = null;

    @Autowired
    public MemoryController(MemoryService memoryService) {
        this.memoryService = memoryService;
    }

    @PostMapping("/add")
    public int addMemory(@RequestBody Memory memory) {
        return memoryService.addMemory(memory);
    }

    @PostMapping("/get/send")
    public List<Memory> getMemoryBySendAccount(@RequestBody User user) {
        return memoryService.getMemoryFromSender(user.getAccount());
    }

    @PostMapping("/get/receiver")
    public List<Memory> getMemoryByReceiveAccount(@RequestBody User user) {
        return memoryService.getMemoryFromReceiver(user.getAccount());
    }



}
