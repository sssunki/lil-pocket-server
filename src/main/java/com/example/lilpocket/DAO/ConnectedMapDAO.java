package com.example.lilpocket.DAO;

import com.example.lilpocket.Bean.ConnectedMap;
import com.example.lilpocket.Bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ConnectedMapDAO {
    List<ConnectedMap> getConnectedUserFromParent(String parentAccount);
    List<ConnectedMap> getConnectedUserFromChild(String childAccount);
}
