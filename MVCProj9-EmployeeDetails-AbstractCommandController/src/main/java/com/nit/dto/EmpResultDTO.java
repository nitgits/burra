package com.nit.dto;

public class EmpResultDTO extends EmpInputDTO{
	private String mgr;
	private int deptno;
	public String getMgr() {
		return mgr;
	}
	public void setMgr(String mgr) {
		this.mgr = mgr;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	
}
