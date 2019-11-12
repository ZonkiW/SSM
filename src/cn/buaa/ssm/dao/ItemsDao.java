package cn.buaa.ssm.dao;

import java.util.List;

import cn.buaa.ssm.domain.Items;

public interface ItemsDao {

	List<Items> selectItems();

	Items getItemsById(Integer id);

	void UpdateItems(Items items);

}
