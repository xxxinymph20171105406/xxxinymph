package cn.edu.imnu.photo;

import java.io.File;

public class ReadPhoto {
	public static void main(String[] args) {
		File jpegFile = new File("C:\\Users\\hp\\Pictures\\壁纸.JPG");
		
		Metadata metadata = JpegMetadataReader.readMetadata(jpegFile);
		
    }  
	
	
	

}
