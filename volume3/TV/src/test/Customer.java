package test;
public class Customer {
	private String cname,adress,channel;
	private int id;
	public Customer(String cname, String adress, String channel, int id) {
		
		this.cname = cname;
		this.adress = adress;
		this.channel = channel;
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		return ChannelCode.getCcode(channel); 
	}
	@Override
	public boolean equals(Object obj) {		
		if(obj instanceof Customer) {
			Customer c=(Customer)obj;
			return (this.channel.equals(c.channel)&&(this.id==c.id));   
		}
		return false; 
	}
	@Override
	public String toString() {
		return "\t"+ cname + "\t" + adress + "\t\t" + channel + "\t" + id + "\n"; 
	}
}
