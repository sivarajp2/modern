package com.siva.modern;

import java.sql.Timestamp;

public class TranInput {
	
	    private String accountNumber;
	    private String mytimestamp;
		public String getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		public String getMytimestamp() {
			return mytimestamp;
		}
		public void setMytimestamp(String mytimestamp) {
			this.mytimestamp = mytimestamp;
		}
		@Override
		public String toString() {
			return "TranInput [accountNumber=" + accountNumber
					+ ", mytimestamp=" + mytimestamp + "]";
		} 

	


	}
	