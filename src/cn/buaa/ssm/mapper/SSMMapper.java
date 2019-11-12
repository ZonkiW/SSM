package cn.buaa.ssm.mapper;

import java.util.List;

import cn.buaa.ssm.domain.Items;

public interface SSMMapper {

	public void inserTest(Items items);
	public List<Items> selectItems();
	public Items getItemsById(Integer id);
	public void UpdateItems(Items items);
}
