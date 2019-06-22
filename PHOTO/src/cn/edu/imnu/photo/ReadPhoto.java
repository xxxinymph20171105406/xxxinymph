package cn.edu.imnu.photo;

import java.io.File;
import java.io.IOException;


import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;


public class ReadPhoto {
	public static void main(String[] args) throws Exception, Exception{
		File file = new File("C:\\Users\\hp\\Desktop\\java\\meal.jpg");
		System.out.println("File Name: " + file.getName());
		printImageTags(file);

	}

	private static void printImageTags(File file) throws ImageProcessingException ,Exception{
		Metadata metadata = ImageMetadataReader.readMetadata(file);
		for(Directory directory : metadata.getDirectories()){
			for(Tag tag : directory.getTags()) {
				String tagName = tag.getTagName();
				String info = tag.getDescription();
				if(tagName.equals("Image Height")) {
					System.out.println("图片高度 ： " + info);
				}else if(tagName.equals("Image Width")) {
					System.out.println("图片宽度 ： " + info);
				}else if(tagName.equals("Date/Time Original")) {
					System.out.println("拍摄时间 ： " + info);
				}else if(tagName.equals("GPS Latitude")) {
					System.out.println("维度：" + info);
				}else if(tagName.equals("GPS Longitude")) {
					System.err.println("经度： " + info);
				}
				
				
			}
		}
		
	}

	

}  
	
	
	

