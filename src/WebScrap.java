

import java.io.IOException;
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
				Element e=title.getElementsByTag("a").first();
				String laptop_URL=e.attr("href");
				Document laptop_doc=Jsoup.connect("https:"+laptop_URL).userAgent("mozilla/17.0").get();
				Elements specs=laptop_doc.select("li.mb-2");	
				for (Element spec:specs) {
					System.out.println(spec.text()+"\n");
				}
			
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
