package cn.buaa.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.buaa.ssm.domain.Items;
import cn.buaa.ssm.exception.MessageException;
import cn.buaa.ssm.service.ItemsService;

@Controller
public class Springmvc1 {

//	@Resource(type=SSMMapper.class)
	/*@Autowired
	private SSMMapper ssmMapper;*/
	@Resource
	private ItemsService itemsServiceImpl;
	@RequestMapping(value="/test.action")
	public ModelAndView itemsList() throws MessageException{
		
		List<Items> list=itemsServiceImpl.selectItems();	 	
		
		ModelAndView modelAndView = new ModelAndView();
		/*if(null==null){
			throw new MessageException("Ô¤ÆÚÒì³£");
		}*/
		@SuppressWarnings("unused")
		Integer i=1/0;
		modelAndView.addObject("itemList", list);
		modelAndView.setViewName("itemList");
		
		return modelAndView;
	}
	
	@RequestMapping(value="/itemEdit.action")
	public ModelAndView getItemsById(Integer id){
		Items items=itemsServiceImpl.getItemsById(id);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("item", items);
		modelAndView.setViewName("editItem");
		
		return modelAndView;
		
	}
	
	@RequestMapping(value="/updateitem.action")
	public ModelAndView UpdateItems(Items items){
		
		itemsServiceImpl.UpdateItems(items);
		ModelAndView modelAndView = new ModelAndView();
		
		return modelAndView;
		
	}
}
