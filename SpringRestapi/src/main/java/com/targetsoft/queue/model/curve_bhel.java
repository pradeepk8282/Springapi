package com.targetsoft.queue.model;

public class curve_bhel {

	private String time;
	private String ms_flow;
	private String rh_flow;
	private String sh_temp;
	private String rh_temp	;
	private String ms_press;
	private String load;
	private String turbine_steamflow;
	private String rh_press;
	
	public curve_bhel() {
		// TODO Auto-generated constructor stub
	}
	

	public curve_bhel(String time, String ms_flow, String rh_flow, String sh_temp, String rh_temp, String ms_press,
			String load, String turbine_steamflow, String rh_press) {
		super();
		this.time = time;
		this.ms_flow = ms_flow;
		this.rh_flow = rh_flow;
		this.sh_temp = sh_temp;
		this.rh_temp = rh_temp;
		this.ms_press = ms_press;
		this.load = load;
		this.turbine_steamflow = turbine_steamflow;
		this.rh_press = rh_press;
	}


	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}



	public String getMs_flow() {
		return ms_flow;
	}

	public void setMs_flow(String ms_flow) {
		this.ms_flow = ms_flow;
	}

	public String getRh_flow() {
		return rh_flow;
	}

	public void setRh_flow(String rh_flow) {
		this.rh_flow = rh_flow;
	}

	public String getSh_temp() {
		return sh_temp;
	}

	public void setSh_temp(String sh_temp) {
		this.sh_temp = sh_temp;
	}

	public String getRh_temp() {
		return rh_temp;
	}

	public void setRh_temp(String rh_temp) {
		this.rh_temp = rh_temp;
	}

	public String getMs_press() {
		return ms_press;
	}

	public void setMs_press(String ms_press) {
		this.ms_press = ms_press;
	}

	public String getLoad() {
		return load;
	}

	public void setLoad(String load) {
		this.load = load;
	}

	public String getTurbine_steamflow() {
		return turbine_steamflow;
	}

	public void setTurbine_steamflow(String turbine_steamflow) {
		this.turbine_steamflow = turbine_steamflow;
	}

	public String getRh_press() {
		return rh_press;
	}

	public void setRh_press(String rh_press) {
		this.rh_press = rh_press;
	}
	@Override
	public String toString() {
		return "curve_bhel [time=" + time + ", ms_flow=" + ms_flow + ", rh_flow=" + rh_flow + ", sh_temp=" + sh_temp
				+ ", rh_temp=" + rh_temp + ", ms_press=" + ms_press + ", load=" + load + ", turbine_steamflow="
				+ turbine_steamflow + ", rh_press=" + rh_press + "]";
	}
	
}
