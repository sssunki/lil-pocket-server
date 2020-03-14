package com.example.lilpocket.Service;

import com.example.lilpocket.Bean.MemoryDetail;
import com.example.lilpocket.Bean.MemorySummary;
import com.example.lilpocket.DAO.MemoryDetailDAO;
import com.example.lilpocket.DAO.MemorySummaryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemoryService {

    private MemoryDetailDAO memoryDAO;
    private MemorySummaryDAO memorySummaryDAO;

    @Autowired
    public MemoryService(MemoryDetailDAO memoryDAO, MemorySummaryDAO memorySummaryDAO) {
        this.memoryDAO = memoryDAO;
        this.memorySummaryDAO = memorySummaryDAO;
    }

    public void addMemoryFile() {
        // todo: the logic of save the files. the file should be named as memoryId + int;
    }

    public void getMemoryFile() {
        // todo: the login of get the files, including find the file according to the memoryId;
    }

    public List<MemorySummary> getMemorySummaryFromSender(String account) {
        return memorySummaryDAO.getMemorySummaryFromSender(account);
    }


    public List<MemorySummary> getMemorySummaryFromReceiver(String account) {
        return memorySummaryDAO.getMemorySummaryFromReceiver(account);
    }

    public MemoryDetail getMemoryDetail(String memoryId) {
        return memoryDAO.getMemoryDetail(memoryId);
    }

    public void addMemoryDetailMessage(MemoryDetail memoryDetail) {
        memoryDAO.addMemoryDetail(memoryDetail);
        memorySummaryDAO.addMemorySummary(MemorySummary.createFromMemoryDetail(memoryDetail));
    }

}
