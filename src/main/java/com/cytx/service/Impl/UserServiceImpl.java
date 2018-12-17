package com.cytx.service.Impl;

import com.cytx.dao.UserMapper;
import com.cytx.pojo.QueryVo;
import com.cytx.pojo.User;
import com.cytx.pojo.UserExample;
import com.cytx.service.UserService;
import com.cytx.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public User confirmUser(User user) {
        UserExample example = new UserExample();
        example.or().andUserNameEqualTo(user.getUserName()).andUserPasswordEqualTo(user.getUserPassword());
        List<User> result = userMapper.selectByExample(example);
        if (result.isEmpty())
            return null;
        return result.get(0);
    }

    @Override
    public Boolean phoneIsExist(String phone) {
        UserExample example = new UserExample();
        example.or().andUserPhoneEqualTo(phone);
        List<User> result = userMapper.selectByExample(example);
        if (result.isEmpty()){
            return false;
        }else {
            return true;
        }

    }

    @Override
    public int checkPhone(String userPhone) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserPhoneEqualTo(userPhone);
        int count =(int) userMapper.countByExample(example);

        return count;
    }

    @Override
    public int userRegister(User user) {

        user.setUserName(user.getUserName());
        user.setUserPassword(user.getUserPassword());
        user.setUserEmail(user.getUserEmail());
        user.setUserPhone(user.getUserPhone());

        int i = userMapper.insert(user);

        return i;
    }

    @Override
    public int checkUsernane(String userName) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUserNameEqualTo(userName);
        int count =(int) userMapper.countByExample(example);

        return count;
    }



    @Override
    public void deleteById(Integer id) {
        userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Page<User> selectPageByQueryVo(QueryVo vo) {
        Page<User> page = new Page<User>();
        //每页数
        page.setSize(5);
        vo.setSize(5);
        if (null != vo) {
            if(null != vo.getName() && !"".equals(vo.getName().trim())){
                vo.setName(vo.getName().trim());
            }
            // 判断当前页
            if (null != vo.getPage()) {
                page.setPage(vo.getPage());
                vo.setStartRow((vo.getPage() -1)*vo.getSize());
            }
            //总条数
            UserExample example = new UserExample();
            int count =(int) userMapper.countByExample(example);
            page.setTotal(count);

            UserExample example1 = new UserExample();
            UserExample.Criteria criteria = example1.createCriteria();
            criteria.andUserNameLike("%"+vo.getName()+"%");
            example1.setOrderByClause("user_id asc");
            example1.setStart(vo.getStartRow());
            example1.setCount(vo.getSize());
            List<User> list = userMapper.selectByExample(example1);

            page.setRows(list);
        }
        return page;
    }


}
