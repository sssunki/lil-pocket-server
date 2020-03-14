package com.example.lilpocket.Controller;

import com.example.lilpocket.Bean.MemoryDetail;
import com.example.lilpocket.Bean.MemorySummary;
import com.example.lilpocket.Bean.User;
import com.example.lilpocket.Service.MemoryService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.security.RunAs;
import java.util.List;

@RestController
@RequestMapping("/memory")
public class MemoryController {

    @Autowired
    private MemoryService memoryService = null;

    @Autowired
    public MemoryController(MemoryService memoryService) {
        this.memoryService = memoryService;
    }

    @PostMapping("/add/detail")
    public int addMemoryBody(@RequestBody MemoryDetail memory) {
        memoryService.addMemoryDetailMessage(memory);
        return 1;
    }

    @PostMapping("/add/file")
    public int addMemoryFile(@RequestParam("files")MultipartFile file) {
        // TODO: complete this method , used to add file;
        return 0;
    }

    @PostMapping("/get/detail")
    public MemoryDetail getMemoryDetail(String memoryId) {
        return memoryService.getMemoryDetail(memoryId);
    }

    @PostMapping("/get/file")
    public void getMemoryFile() {
        // TODO: complete this method, usd to get file;
    }

    @PostMapping("/get/summary/sender")
    public List<MemorySummary> getMemorySummaryFromSender(@RequestBody String account) {
        return memoryService.getMemorySummaryFromSender(account);
    }

    @PostMapping("/get/summary/receiver")
    public List<MemorySummary> getMemorySummaryFromReceiver(@RequestBody String account) {
        return memoryService.getMemorySummaryFromReceiver(account);
    }

}
