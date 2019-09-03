package com.chinadovey.parking.trigger;

import java.util.Iterator;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrServer;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration({ "classpath:config/spring-core.xml", "classpath:config/spring-webapp.xml", "classpath:config/spring-solr.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestSolrj {
	
	@Autowired
	private HttpSolrServer httpSolrServer;
	 
	@Test
	public void testDao() {
		try {
			this.insert();
			this.getById(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
    }
	/**
	 * 新添加或者更新索引
	 */
	public void insert() {
        SolrInputDocument doc = new SolrInputDocument();
        doc.addField("id", "101");
        doc.addField("name", "name101");
        doc.addField("goods_no", "101101");
        doc.addField("goods_name", "更新");
        try {
        	httpSolrServer.add(doc);
        	httpSolrServer.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * 删除单个
     * @param id
     */
    public  void deleteById(String id) {
        try {
        	httpSolrServer.deleteById(id+"");
        	httpSolrServer.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 删除所有文档
     */
    public  void deleteAll() {
        try {
        	httpSolrServer.deleteByQuery("*:*");
        	httpSolrServer.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 根据文档id查询单个文档 。
     */
    public String getById(int id) {
        SolrQuery query = new SolrQuery();
        query.setQuery("id:" + id);
        try {
            QueryResponse rsp = httpSolrServer.query(query);
            SolrDocumentList docs = rsp.getResults();
            Iterator<SolrDocument> iter = docs.iterator();
            while (iter.hasNext()) {
                SolrDocument doc = iter.next();
                String name = (String) doc.getFieldValue("name");
                String goods_no = (String) doc.getFieldValue("goods_no");
                String goods_name = (String) doc.getFieldValue("goods_name");
                System.err.println(name+goods_no+goods_name);
                return (String) doc.getFieldValue("id");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "-1";
    }
   
    

}
