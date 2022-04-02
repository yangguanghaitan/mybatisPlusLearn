package com.boot.service.impl;

import com.boot.dao.ProvinceDao;
import com.boot.domain.Province;
import com.boot.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther d
 * @Date 2022/4/2 13:22
 * @Describe
 **/
@Service
public class ProvinceServiceImpl implements ProvinceService {
    @Autowired
    private ProvinceDao ProvinceDao;
    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public Province queryById(Integer id) {
        return ProvinceDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Province> queryAllByLimit(int offset, int limit) {
        return ProvinceDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param Province 实例对象
     * @return 实例对象
     */
    @Override
    public Province insert(Province Province) {
        ProvinceDao.insert(Province);
        return Province;
    }

    /**
     * 修改数据
     *
     * @param Province 实例对象
     * @return 实例对象
     */
    @Override
    public Province update(Province Province) {
        ProvinceDao.update(Province);
        return this.queryById(Province.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return ProvinceDao.deleteById(id) > 0;
    }
}
