package cn.buaa.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.buaa.ssm.dao.ItemsDao;
import cn.buaa.ssm.domain.Items;

@Service
public class ItemsServiceImpl implements ItemsService {

	@Resource
	private ItemsDao itemsDaoImpl;
	@Override
	public List<Items> selectItems() {
		// TODO Auto-generated method stub
		return itemsDaoImpl.selectItems();
	}
	@Override
	public Items getItemsById(Integer id) {
		// TODO Auto-generated method stub
		
		return itemsDaoImpl.getItemsById(id);
	}
	@Override
	public void UpdateItems(Items items) {
		// TODO Auto-generated method stub
		itemsDaoImpl.UpdateItems(items);
	}

}
