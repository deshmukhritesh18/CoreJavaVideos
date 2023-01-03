package com.bnt.overriding;

import java.io.EOFException;
import java.io.IOException;

class OverridingException {

	public void m1()throws IOException {
		
	}
}
class P extends OverridingException{
	public void m1()throws EOFException,InterruptedException {
		
	}
}
