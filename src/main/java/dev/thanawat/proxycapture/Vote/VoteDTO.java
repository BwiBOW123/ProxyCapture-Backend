package dev.thanawat.proxycapture.Vote;

public class VoteDTO {
	private int TransactionID;
	private int Year;
	public VoteDTO(int transactionID, int year, String share_NO, String term, String result) {
		super();
		TransactionID = transactionID;
		Year = year;
		Share_NO = share_NO;
		Term = term;
		Result = result;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	private String Share_NO;
	private String Term;
	private String Result;
	public int getTransactionID() {
		return TransactionID;
	}
	public void setTransactionID(int transactionID) {
		TransactionID = transactionID;
	}
	public String getShare_NO() {
		return Share_NO;
	}
	public void setShare_NO(String share_NO) {
		Share_NO = share_NO;
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
}
