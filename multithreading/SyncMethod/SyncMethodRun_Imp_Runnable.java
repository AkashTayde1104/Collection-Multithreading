package com.multithreading.SyncMethod;

public class SyncMethodRun_Imp_Runnable implements Runnable {
SyncMethod_Imp_Runnable s;
int n;
public SyncMethodRun_Imp_Runnable(SyncMethod_Imp_Runnable s, int n) {
	
	this.s = s;
	this.n = n;
}
@Override
public void run()
{
	s.mul(n);
}

}
