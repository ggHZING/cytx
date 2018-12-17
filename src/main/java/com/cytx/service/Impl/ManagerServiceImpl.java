package com.cytx.service.Impl;

import com.cytx.dao.ManagerMapper;
import com.cytx.pojo.Manager;
import com.cytx.pojo.ManagerExample;
import com.cytx.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    ManagerMapper managerMapper;

    @Override
    public Manager confirmManager(Manager manager) {
        ManagerExample example = new ManagerExample();
        example.or().andManagerUsernameEqualTo(manager.getManagerUsername()).andManagerPasswordEqualTo(manager.getManagerPassword());
        List<Manager> result = managerMapper.selectByExample(example);
        if (result.isEmpty())
            return null;
        return result.get(0);
    }
}
