package com.sujata.demo;

public class AnswerJob implements Runnable {

	private Chat chat;
	
	public AnswerJob(Chat chat) {
		super();
		this.chat = chat;
	}


	@Override
	public void run() {
		String answers[]= {"Hi","I am fine!","Great"};
		for(String answer:answers) {
			chat.answer(answer);
		}

	}

}
