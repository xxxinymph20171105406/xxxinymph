package cn.edu.imnu.photo;

import java.io.File;
import java.io.IOException;


import com.drew.imaging.ImageProcessingException;
import com.drew.imaging.jpeg.JpegMetadataReader;
import com.drew.imaging.jpeg.JpegProcessingException;
import com.drew.metadata.Metadata;

public class ReadPhoto {
	public static void main(String[] args) throws JpegProcessingException, IOException{
		File file = new File("‪C:\\Users\\hp\\Desktop\\java\\campus.jpg");
		System.out.println("File Name: " + file.getName());
		Metadata metadata = JpegMetadataReader.readMetadata(file);
			


	
	}

	

}  
	
	
	

