package com.sujata.byteio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileDemoClass {

	public static void main(String[] args) {

		FileOutputStream fileOutputStream=null;

		try {
			fileOutputStream = new FileOutputStream("ByteDemo");
			
			byte[] arr= {'S','U','J','A','T','A','\n','D','E','L','H','I'};
			
			fileOutputStream.write(arr);
			
			System.out.println("File Created!");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				fileOutputStream.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
