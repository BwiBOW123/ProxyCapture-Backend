package dev.thanawat.proxycapture.Vote;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

import dev.thanawat.proxycapture.Holder.AGMS_HOLDER;


@Entity
public class AGMS_VOTE {
	@Id
	@GeneratedValue
	@Column(name = "TRANSACTION_ID")
	private int TransactionID;
	
	@ManyToOne
	@JoinColumn(name = "Share_NO")
	@JsonBackReference
	private AGMS_HOLDER Share_NO;
	
	@Column(name = "YEAR")
	private int Year;
	@Column(name = "TERM",length = 2)
	private String Term;
	@Column(name = "RESULT",length = 1)
	private String Result;
	@Column(name = "CREATED_BY",length = 20)
	private String CreatedBY;
	@Column(name = "CREATED_DATE")
	private LocalDate createDate;
	@Column(name = "UPDATED_BY",length = 20)
	private String updatedBY;
	@Column(name = "UPDATED_DATE")
	private LocalDate updatedDate;
	public AGMS_VOTE() {
	}
	public AGMS_VOTE(int transactionID, int year, String term, String result, String createdBY,
			LocalDate createDate, String updatedBY, LocalDate updatedDate) {
		super();
		TransactionID = transactionID;
		Year = year;
		Term = term;
		Result = result;
		CreatedBY = createdBY;
		this.createDate = createDate;
		this.updatedBY = updatedBY;
		this.updatedDate = updatedDate;
	}

	public AGMS_HOLDER getShareNO() {
		return Share_NO;
	}
	public void setShareNO(AGMS_HOLDER shareNO) {
		Share_NO = shareNO;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public String getUpdatedBY() {
		return updatedBY;
	}
	public void setUpdatedBY(String updatedBY) {
		this.updatedBY = updatedBY;
	}
	public LocalDate getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}
	public int getTransactionID() {
		return TransactionID;
	}

	public void setTransactionID(int transactionID) {
		TransactionID = transactionID;
	}

	public AGMS_HOLDER getHolder() {
		return Share_NO;
	}

	public void setHolder(AGMS_HOLDER holder) {
		this.Share_NO = holder;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public String getTerm() {
		return Term;
	}

	public void setTerm(String term) {
		Term = term;
	}

	public String getResult() {
		return Result;
	}

	public void setResult(String result) {
		Result = result;
	}

	public String getCreatedBY() {
		return CreatedBY;
	}

	public void setCreatedBY(String createdBY) {
		CreatedBY = createdBY;
	}
}
