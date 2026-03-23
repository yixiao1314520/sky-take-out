package com.sky.mapper;

import com.sky.entity.Dish;
import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);

    void insertBatch(List<SetmealDish> setmealDishes);

    @Delete("delete from setmeal_dish where id = #{id}")
    void delBySetmealId(Long setmealId);

    @Select("select * from setmeal_dish where id = #{id}")
    List<SetmealDish> getBySetmealId(Long id);

    @Select("select a.* from dish a left join setmeal_dish b on a.id = b.dish_id where b.setmeal_id = #{setmealId};")
    List<Dish> getDishBySetmealId(Long id);
}
