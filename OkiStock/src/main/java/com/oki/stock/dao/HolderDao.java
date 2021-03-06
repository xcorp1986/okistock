package com.oki.stock.dao;

import com.oki.stock.dto.HolderParamDTO;
import com.oki.stock.entity.Holder;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HolderDao {

    int insertStockHolder(Holder holder);

    List<Holder> queryUserHoldersByOpenid(String openid);

    List<Holder> queryUserHolderByStockName(String stockName);

    Holder queryUserHolder(HolderParamDTO holderParamDTO);

    int updateStockHolder(Holder holder);

    int deleteStockHolder(Integer holderId);

}
