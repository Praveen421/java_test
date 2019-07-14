package test;
import java.util.*;
public class ChannelMap {
	public static final HashMap<String,Integer> hm;
	static {
		hm=new HashMap<>();
		hm.put("STAR PLUS", 1);
		hm.put("STAR NEWS", 2);
		hm.put("STAR BHARAT", 3);
		hm.put("STAR GOLD", 4);
		hm.put("GEE NEWS ", 5);
		hm.put("GEE CINEMA", 6);
		hm.put("GEE TV", 7);
		hm.put("GEE ANMOL", 8);
	}
	public static int getChannel(String channel) {
		return (int)ChannelMap.hm.get(channel.toUpperCase()); 
	}
}
