package cn.buaa.ssm.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class CustomerExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object arg2,
			Exception e) {
		// TODO Auto-generated method stub
		ModelAndView modelAndView = new ModelAndView();
		
		if(e instanceof MessageException){
			MessageException me=(MessageException)e;
			modelAndView.addObject("error", me.getMessageException());
//			System.out.println("Ԥ���쳣");
		}
		else{
			modelAndView.addObject("error", "δ֪�쳣");
//			System.out.println("δ֪�쳣");
		}
		modelAndView.setViewName("error");
		
		return modelAndView;
	}

}
