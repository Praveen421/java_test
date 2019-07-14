package test;
import java.io.*;
@SuppressWarnings("serial")
public class BookBean implements Serializable{
	private String bCode,bName,bAuthor;
	private int bPrice;
	private int bQty;
	
	public BookBean() {} 

	public String getbCode() {
		return bCode;
	}

	public void setbCode(String bCode) {
		this.bCode = bCode;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbAuthor() {
		return bAuthor;
	}

	public void setbAuthor(String bAuthor) {
		this.bAuthor = bAuthor;
	}

	public int getbPrice() {
		return bPrice; 
	}

	public void setbPrice(int bPrice) {
		this.bPrice = bPrice;
	}

	public int getbQty() {
		return bQty;
	}

	public void setbQty(int bQty) {
		this.bQty = bQty;
	}

	public BookBean(String bCode, String bName, String bAuthor, int bPrice, int bQty) {
		//super();
		this.bCode = bCode;
		this.bName = bName;
		this.bAuthor = bAuthor;
		this.bPrice = bPrice;
		this.bQty = bQty;
	}
}
