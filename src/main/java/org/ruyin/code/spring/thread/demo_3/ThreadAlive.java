package org.ruyin.code.spring.thread.demo_3;

public class ThreadAlive extends Thread{

	public ThreadAlive() {
		super("VV");
		System.out.println("-----Constructor begin-----");
		System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive()="+Thread.currentThread().isAlive());
		System.out.println("this.getName()="+this.getName());
		System.out.println("this.isAlive()="+this.isAlive());
		System.out.println("-----Constructor end-----");
	}
	
	@Override
	public void run() {
		super.run();
		System.out.println("-----Run begin-----");
		System.out.println("Thread.currentThread().getName()="+Thread.currentThread().getName());
		System.out.println("Thread.currentThread().isAlive()="+Thread.currentThread().isAlive());
		System.out.println("this.getName()="+this.getName());
		System.out.println("this.isAlive()="+this.isAlive());
		System.out.println("-----Run end-----");
	}
}
