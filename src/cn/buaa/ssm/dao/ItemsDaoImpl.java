package cn.buaa.ssm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.buaa.ssm.domain.Items;
import cn.buaa.ssm.mapper.SSMMapper;

@Repository
public class ItemsDaoImpl implements ItemsDao {

	@Autowired
	private SSMMapper ssmMapper;
	@Override
	public List<Items> selectItems() {
		// TODO Auto-generated method stub
		return ssmMapper.selectItems();
	}
	@Override
	public Items getItemsById(Integer id) {
		// TODO Auto-generated method stub
		return ssmMapper.getItemsById(id);
	}
	@Override
	public void UpdateItems(Items items) {
		// TODO Auto-generated method stub
		ssmMapper.UpdateItems(items);
	}

}
