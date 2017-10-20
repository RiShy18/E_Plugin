package com.jdi.connect.spi;

import java.io.IOException;

public abstract class Connection {
	
	public abstract byte[] readPacket()throws IOException;
	public abstract void writePacket(byte pkt[])throws IOException;
	public abstract void close() throws IOException;
	public abstract boolean isOpen();
	

}
