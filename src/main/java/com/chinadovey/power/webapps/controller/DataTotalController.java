package com.chinadovey.power.webapps.controller;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinadovey.power.core.mvc.AbstractBaseController;
import com.chinadovey.power.webapps.biz.DataTotalBiz;

import net.sf.json.JSONObject;

@RequestMapping("/dataTotal")
@Controller
public class DataTotalController extends AbstractBaseController{
	
	/*@Autowired
	private DataTotalBiz dataTotalBiz;
	@Autowired
	private HttpSolrServer httpSolrServer;
	
	@RequestMapping("/testSolr")
	@ResponseBody
	public JSONObject testSolr() throws SolrServerException{
		JSONObject json = new JSONObject();
		try {
			SolrInputDocument document = new SolrInputDocument();
			document.addField("id", "100");
			document.addField("name", "fengguojie");
			document.addField("goods_no", "123");
			document.addField("goods_name", "车轮");
			httpSolrServer.add(document);
			httpSolrServer.commit();
			json.put("res", 1);
		} catch (IOException e) {
			json.put("res", 0);
			e.printStackTrace();
		}
		return json;
	}*/
	
	
	
}
