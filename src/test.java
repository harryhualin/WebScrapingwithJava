

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class test {
	public static void main(String[] args) {
		scrapFromDellXps();
	}
	
	
	public static void scrapFromDellXps() {
		
		
		try {
			Document doc=Jsoup.connect("https://www.dell.com/en-us/shop/dell-laptops/sr/laptops/xps-laptops?page=1")
								.userAgent("mozilla/17.0").get();
			Elements temp=doc.select("section.ps-show-hide");
			Product lap=new Product();
			int i=0;
			Elements index=doc.select("div.pagination");
			Elements eles=index.get(0).getElementsByClass("hide-xs");
			int pages=eles.size();
		
			
			for(Element name:temp) {
				i++;
//				System.out.println(i+"  "+name.getElementsByTag("a").first().text());
//				Elements eles=name.getElementsByClass("ps-iconography-specs-label");
//				
//				for(Element text:eles) {
//					System.out.println(text.text());					
//				}
//				System.out.println("");
				
			}
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
