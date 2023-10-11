

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScrap {
	public static void main(String[] args) {
		scrapFromDellXps();
	}
	
	
	public static void scrapFromDellXps() {
		int pages=3;
		int i=1;
		try {
			Document doc=Jsoup.connect("https://www.dell.com/en-us/shop/dell-laptops/sr/laptops/xps-laptops?page="+i)
								.userAgent("mozilla/17.0").get();
			Elements titles=doc.select("h3.ps-title");			

			for(Element title:titles) {
				
				Product laptop=new Product();
				Element e=title.getElementsByTag("a").first();
				String laptop_URL="https:"+e.attr("href");
				Document laptop_doc=Jsoup.connect(laptop_URL).userAgent("mozilla/17.0").get();
				laptop.setSource(laptop_URL);
				laptop.setBrand("Dell");
				
				Elements specs=laptop_doc.select("li.mb-2 p");
				List<String> datas=new ArrayList<String>();
				for (Element spec:specs) {
					System.out.println(spec.text()+"\n");
					datas.add(spec.text());
				}
				int[] index= {0,1,2,3,4,5,6,7};
				
				break;
			}
		
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
