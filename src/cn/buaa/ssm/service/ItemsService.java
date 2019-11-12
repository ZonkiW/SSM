package cn.buaa.ssm.service;

import java.util.List;

import cn.buaa.ssm.domain.Items;

public interface ItemsService {

	List<Items> selectItems();

	Items getItemsById(Integer id);

	void UpdateItems(Items items);

	
}
