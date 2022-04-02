package com.boot.web.controller;

import com.boot.domain.Province;
import com.boot.service.ProvinceService;
import com.boot.web.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther d
 * @Date 2022/4/2 13:56
 * @Describe
 **/
@Controller
@RequestMapping("/province")
public class ProvinceController extends BaseController {
    @Autowired
    private ProvinceService provinceService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public void selectOne(Integer id) {
        Province oneById = this.provinceService.queryById(id);
        logger.info("selectOne,{}",oneById);
    }

}
