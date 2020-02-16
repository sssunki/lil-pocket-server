package com.example.lilpocket.Controller;

import com.example.lilpocket.Bean.Memory;
import com.example.lilpocket.Bean.User;
import com.example.lilpocket.Service.MemoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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

    @PostMapping("/addMemoryBody")
    public int addMemoryBody(@RequestBody Memory memory) {
        return memoryService.addMemory(memory);
    }

    @PostMapping("/addMemoryFile")
    public int addMemoryFile(@RequestParam("files")MultipartFile file) {
        return 0;
    }

    @PostMapping("/getList/sender")
    public List<Memory> getMemoryBySendAccount(@RequestBody User user) {
        return memoryService.getMemoryFromSender(user.getAccount());
    }

    @PostMapping("/getSpecific/receiver")
    public void getSpecificFromReceiver(@RequestParam int id, @RequestParam String account) {

    }

    @PostMapping("/getSpecific/sender")
    public void getSpecificFromSender(@RequestParam int id, @RequestParam String account) {

    }

    @PostMapping("/getList/receiver")
    public List<Memory> getMemoryByReceiveAccount(@RequestBody User user) {
        return memoryService.getMemoryFromReceiver(user.getAccount());
    }


}
