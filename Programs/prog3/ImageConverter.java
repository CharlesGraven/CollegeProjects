package prog3;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 *  Program #3
 *  ImageConverter reads an image edits it
 *  and writes it to different image locations
 *  based on what was changed in the image
 *  while keeping the original image unedited
 *  CS108-3
 *  Date 2/25/17
 *  @author Charles Graven
 */
 public class ImageConverter {
 
//Class privated vairables
private BufferedImage img = null;
private String fileName = null;
 
 /**
 * Read in image file into img variable
 * @param String name of image file to read
 */
 public void readImage(String filename) {
	 File f = new File(filename);	 	
	 	//Try to read the given file
	 	try{
			if(f.canRead()){
				img = ImageIO.read(new File(filename));
				this.fileName = filename;
			}
			else{
				//If the file cannot be read throw new Exception
				throw new IOException("Cannot read file: " + f.getPath());
			}
	 		}catch(IOException e){
	 			System.out.println(e);
		    }
 }

 /**
 * Write img to file
 * @param String the fileName of the destination that is being wrote to
 * @param BufferedImage the image being wrote to the file
 */
 public void writeImage(String f, BufferedImage i) {
	 try{
		 ImageIO.write(i, "jpg", new File(f));
	 }catch(IOException e){
		 e.printStackTrace();
	 }
 }

 /**
 * Display RGB value (omit transparency) in decimal
 * @param x, the target pixel in the x column
 * @param y, the target pixel in the y column
 */
 public void test(int x, int y) {
	 int p = img.getRGB(x, y);
	 
	 int r = (p>>16)&0xff;
     int g = (p>>8)&0xff;
     int b = p&0xff;
     
     System.out.println("R: "+r+" G: "+g+" B: "+b);
	 System.out.println(p);
 }
 /**
 * Convert each pixel in img to grayscale getting R,G,B to average
 * then write the image to a new file named test1Grayscale
 */
 public void toGrayscale() {
	 int width = img.getWidth();
	 int height = img.getHeight();
	 
	 this.readImage(fileName);
	 BufferedImage i = getImage();
	 
	 for(int y = 0; y < height; y++){
         for(int x = 0; x < width; x++){
             int p = img.getRGB(x,y);
             
             int a = (p>>24)&0xff;
             int r = (p>>16)&0xff;
             int g = (p>>8)&0xff;
             int b = p&0xff;
             
             //calculate average
             int avg = (r+g+b)/3;
             
             //replace RGB value with avg
             p = (a<<24) | (avg<<16) | (avg<<8) | avg;
             
             img.setRGB(x, y, p);
         }
     }
	 //Write the new grayscale image to a file
	 writeImage(appendColorToOutput()+"Grayscale.jpg", i);
 }

 /**
 * Convert each pixel in img to red, masking out green and blue
 * then write the new image to a test1Red.jpg file
 */
 public void toRed(){
	 int width = img.getWidth();
	 int height = img.getHeight();
	 
	 this.readImage(fileName);
	 BufferedImage i = getImage();
	
	 for(int y = 0; y<height; y++){
		 for(int x = 0; x<width;x++){
			 int p = img.getRGB(x, y);
			 
			 int a = (p>>24)&0xff;
             int r = (p>>16)&0xff;
             
             //replace RGB values of the current pixel
             p = (a<<24) | (r<<16) | (0<<16) | 0;
             
			 i.setRGB(x, y, p);
		 }
	 }
	//Write the new red image to a file
	 writeImage(appendColorToOutput()+"Red.jpg", i);
	 
 }

 /**
 * Convert each pixel in img to green, masking out red and blue
 * then write the new image to a test1Green.jpg file
 */
 public void toGreen() {
	 int width = img.getWidth();
	 int height = img.getHeight();
	 
	 this.readImage(fileName);
	 BufferedImage i = getImage();
	 
	 for(int y = 0; y<height; y++){
		 for(int x = 0; x<width;x++){
			 int p = img.getRGB(x, y);
			 
			 int a = (p>>24)&0xff;
             int g = (p>>8)&0xff;
          
             //replace RGB values of the current pixel
             p = (a<<24) | (0<<16) | (g<<8) | 0;
             
			 i.setRGB(x, y, p);
		 }
	 }
	//Write the new green image to a file
	 writeImage(appendColorToOutput()+"Green.jpg",i);
 }

 /**
 * Convert each pixel in img to blue, masking out red and green
 * then write the new image to a test1Blue.jpg file
 */
 public void toBlue() {
	 int width = img.getWidth();
	 int height = img.getHeight();
	 
	 this.readImage(fileName);
	 BufferedImage i = getImage();
	 
	 for(int y = 0; y<height; y++){
		 for(int x = 0; x<width;x++){
			 int p = img.getRGB(x, y);
			 
			 int a = (p>>24)&0xff;
             int b = p&0xff;
             
             //replace RGB values of the current pixel
             p = (a<<24) | (0<<16) | (0<<8) | b;
             
			 i.setRGB(x, y, p);
		 }
	 }
	//Write the new blue image to a file
	 writeImage(appendColorToOutput()+"Blue.jpg",i);
 }


 /**
 * Return output file name with color appended before ".jpg"
 * Assumes filename and color are class variables
 * @return String filenameColor.jpg
 */
 private String appendColorToOutput() {
	int o = fileName.lastIndexOf('/');
	String out = fileName.substring(0, o+1);
	return out+"test1";
 }
 
 /**
  * Getter for the class Image
  * @return the image saved to the class
  */
 private BufferedImage getImage(){
	 return this.img;
 }
 }
