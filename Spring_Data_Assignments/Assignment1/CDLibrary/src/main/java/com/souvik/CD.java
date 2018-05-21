package com.souvik;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CD")
public class CD {
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUST_SEQ")
    @SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1, name = "CUST_SEQ")
    private long cdid;
	
	@Column(name = "cdtitle")
	private String cdtitle;
	
	@Column(name = "cdprice")
	private float cdprice;
	
	@Column(name = "cdpublisher")
	private String cdpublisher;
	

	public long getCdid() {
		return cdid;
	}
	public void setCdid(long cdid) {
		this.cdid = cdid;
	}
	public String getCdtitle() {
		return cdtitle;
	}
	public void setCdtitle(String cdtitle) {
		this.cdtitle = cdtitle;
	}
	public float getCdprice() {
		return cdprice;
	}
	public void setCdprice(float cdprice) {
		this.cdprice = cdprice;
	}
	public String getCdpublisher() {
		return cdpublisher;
	}
	public void setCdpublisher(String cdpublisher) {
		this.cdpublisher = cdpublisher;
	}
	
	@Override
	public String toString() {
		return "CD [cdid=" + cdid + ", cdtitle=" + cdtitle + ", cdprice=" + cdprice + ", cdpublisher=" + cdpublisher
				+ "]";
	}
}
