package cn.buaa.ssm.exception;

public class MessageException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String messageException;
	
	

	public MessageException(String messageException) {
		super();
		this.messageException = messageException;
	}
	
	public String getMessageException() {
		return messageException;
	}
	
	
	public void setMessageException(String messageException) {
		this.messageException = messageException;
	}
	
	
}
