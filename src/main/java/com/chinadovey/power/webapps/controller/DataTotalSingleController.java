package com.chinadovey.power.webapps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chinadovey.power.core.mvc.AbstractBaseController;
import com.chinadovey.power.webapps.biz.DataTotalSingleBiz;

@RequestMapping("/dataTotalSingle")
@Controller
public class DataTotalSingleController extends AbstractBaseController{
	
	@Autowired
	private DataTotalSingleBiz dataTotalSingleBiz;
	
	
	
}
