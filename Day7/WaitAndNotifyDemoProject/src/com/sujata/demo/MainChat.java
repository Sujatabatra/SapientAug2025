package com.sujata.demo;

public class MainChat {

	public static void main(String[] args) {
		Chat chat=new Chat();
		
		Thread pammi=new Thread(new QuestionJob(chat), "Pammi");
		Thread tanya=new Thread(new AnswerJob(chat),"Tanya");
		
		pammi.start();
		tanya.start();

	}

}
