/**
* On windows we see the byte order mark in the first two positions of the byte array backToBytes.
*/
import java.nio.charset.Charset;

public class ReturnsBOMOnWindows{ 
	public static void main(String[] args){
		byte[] fyodorUTF16Bytes = { 
					(byte)0x04, (byte)0x24,
					(byte)0x04, (byte)0x51,
					(byte)0x04, (byte)0x34,
					(byte)0x04, (byte)0x3e,
					(byte)0x04, (byte)0x40,
					(byte)0x00, (byte)0x0a
		};
		
		String fyodor = new String(fyodorUTF16Bytes, Charset.forName("UTF-16"));
		System.out.println(fyodor.length());
		byte[] backToBytes = fyodor.getBytes(Charset.forName("UTF-16"));
		for( byte b : backToBytes){
			String s = String.format("%02X", b);
			System.out.println(s);
		}
		System.out.println(fyodor);
	}
}
