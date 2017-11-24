package com.kh.openapi.common.utils;

import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: rizenguo Date: 2014/11/1 Time: 14:06
 */
public class XMLParser {

	public static Map<String, String> getMapFromXML(String xmlString)
			throws ParserConfigurationException, IOException, SAXException {
		//xmlString = xmlString.replaceFirst("encoding=\".*\"", "encoding=\"GBK\"");
		// 这里用Dom的方式解析回包的最主要目的是防止API新增回包字段
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();

		InputStream is = Util.getStringStream(xmlString);
		Document document = builder.parse(is);

		// 获取到document里面的全部结点
		NodeList allNodes = document.getFirstChild().getChildNodes();
		Node node;
		Map<String, String> map = new HashMap<String, String>();
		int i = 0;
		while (i < allNodes.getLength()) {
			node = allNodes.item(i);
			if (node instanceof Element) {
				map.put(node.getNodeName(), node.getTextContent());
			}
			i++;
		}
		return map;

	}

	//xml形式的字符串转换为map集合
	public static Map<String,String> getMapForXMLStr(String xmlStr) throws DocumentException {
		Map<String,String> map = new HashMap<>();
		org.dom4j.Document doc;
		try {
			doc = DocumentHelper.parseText(xmlStr);
			org.dom4j.Element root = doc.getRootElement();
			List children = root.elements();
			if(children != null && children.size() > 0) {
				for(int i = 0; i < children.size(); i++) {
					org.dom4j.Element child = (org.dom4j.Element) children.get(i);
					map.put(child.getName(), child.getTextTrim());
					//System.out.println(child.getName() + "--------------" + child.getTextTrim());
				}
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		return map;
	}
}
