package com.example.lilpocket.DAO;

import com.example.lilpocket.Bean.ConnectedMap;
import com.example.lilpocket.Bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Mapper
public interface ConnectedMapDAO {
    ArrayList<ConnectedMap> getConnectedUserFromParent(String parentAccount);
    ArrayList<ConnectedMap> getConnectedUserFromChild(String childAccount);

    int addConnectedMap(ConnectedMap connectedMap);
    ConnectedMap findConnectedMap(String parentAccount, String childAccount);
}
