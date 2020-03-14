package com.example.lilpocket.DAO;

import com.example.lilpocket.Bean.MemoryDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MemoryDetailDAO {

    MemoryDetail getMemoryDetail(String memoryId);
    void addMemoryDetail(MemoryDetail memory);
}
