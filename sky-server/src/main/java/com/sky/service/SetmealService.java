package com.sky.service;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.SetmealVO;

import java.util.List;

public interface SetmealService{
    void addSetmeal(SetmealDTO setmealdto);

    PageResult pageQuery(SetmealPageQueryDTO setmealPageQueryDTO);

    void delById(List<Long> ids);

    SetmealVO getById(Long id);

    void update(SetmealDTO setmealDTO);

    void updateStatus(Integer status, Long id);
}
