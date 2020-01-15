package com.example.lilpocket.Service;

import com.example.lilpocket.Bean.Memory;
import com.example.lilpocket.DAO.MemoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class MemoryService {

    private MemoryDAO memoryDAO;

    @Autowired
    public MemoryService(MemoryDAO memoryDAO) {
        this.memoryDAO = memoryDAO;
    }

    public int addMemory(Memory memory) {
        memoryDAO.addMemory(memory);
        return 0;
    }

    public List<Memory> getMemoryFromReceiver(String receiveAccount) {
        return memoryDAO.getMemoryListFromReceiver(receiveAccount);
    }

    public List<Memory> getMemoryFromSender(String sendAccount) {
        return memoryDAO.getMemoryListFromSend(sendAccount);
    }
}
