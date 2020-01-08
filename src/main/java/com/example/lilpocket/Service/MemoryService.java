package com.example.lilpocket.Service;

import com.example.lilpocket.Bean.Memory;
import com.example.lilpocket.DAO.MemoryDAO;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class MemoryService {

    private MemoryDAO memoryDAO;

    public MemoryService(MemoryDAO memoryDAO) {
        this.memoryDAO = memoryDAO;
    }

    private int addMemory(Memory memory) {
        return 0;
    }

    private List<Memory> getRelatedMemory(String relatedAccount) {
        return null;
    }

    private List<Memory> getMemoryFromSender(String sendAccount) {
        return null;
    }
}
