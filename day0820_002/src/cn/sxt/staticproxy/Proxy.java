package cn.sxt.staticproxy;

public class Proxy implements Rent{

	private Host host;
	
	public Proxy(Host host) {
		super();
		this.host = host;
	}

	public Proxy() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Host getHost() {
		return host;
	}

	public void setHost(Host host) {
		this.host = host;
	}

	@Override
	public void rent() {
		// TODO Auto-generated method stub
		checkHouse();
		host.rent();
		charge();
	}

	private void checkHouse() {
		System.out.println("中介带你看房");
	}
	
	private void charge() {
		System.out.println("中介收费");
	}
}
