

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class test {
	public static void main(String[] args) {
		scrap();
	}
	
	
	public static void scrap() {
		try {
			Document doc=Jsoup.connect("https://www.dell.com/en-us/shop/dell-laptops/sr/laptops/xps-laptops?page=1")
								.userAgent("mozilla/17.0").get();
			Elements temp=doc.select("h3.ps-title");
			int i=0;
			for(Element name:temp) {
				i++;
				System.out.println(i+"  "+name.getElementsByTag("a").first().text());
			}
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
