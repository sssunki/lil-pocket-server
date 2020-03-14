package com.example.lilpocket.DAO;

import com.example.lilpocket.Bean.MemorySummary;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.LinkedList;

@Repository
@Mapper
public interface MemorySummaryDAO {

    LinkedList<MemorySummary> getMemorySummaryFromSender(String sendAccount);
    LinkedList<MemorySummary> getMemorySummaryFromReceiver(String receiveAccount);

    int addMemorySummary(MemorySummary memorySummary);
}
