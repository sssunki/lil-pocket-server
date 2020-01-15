package com.example.lilpocket.DAO;

import com.example.lilpocket.Bean.Memory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MemoryDAO {

    void addMemory(Memory memory);
    List<Memory> getMemoryListFromSend(String sendAccount);
    List<Memory> getMemoryListFromReceiver(String receiveAccount);
}
