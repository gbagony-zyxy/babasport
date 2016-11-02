package edu.wxz.core.common.qacode;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;

import org.junit.Test;

import com.alibaba.fastjson.JSONObject;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Binarizer;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.EncodeHintType;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;

/**
 *	二维码生成与解析 
 */
public class QRCodeTest {

	/**
	 *	生成图像 
	 */
	@Test
	public void testEncode() throws WriterException, IOException{
		String filepath = "D://";
		String filename = "zxing.png";
		//JSONObject json = new JSONObject();
		//json.put("zxing", "http://spring.io");
		//json.put("author", "xxx");
		//String contents = json.toJSONString();
		int width = 200;
		int height = 200;
		String format = "png";
		Map<EncodeHintType,Object> hints = new HashMap<>();
		hints.put(EncodeHintType.CHARACTER_SET, "UTF-8");
		//想要跳转页面只需要在前面添加"http://"
		BitMatrix bitMatrix = new MultiFormatWriter().encode("http://spring.io", BarcodeFormat.QR_CODE, width, height);
		Path path = FileSystems.getDefault().getPath(filepath, filename);
		MatrixToImageWriter.writeToPath(bitMatrix, format, path);
		//System.out.println(contents);
		System.out.println("输出成功!");
	}
	
	/**
	 *	解析图像 
	 */
	@Test
	public void testDecode(){
		String filepath = "D:/zxing.png";
		BufferedImage image;
		
		try {
			image = ImageIO.read(new File(filepath));
			LuminanceSource source = new BufferedImageLuminanceSource(image);
			Binarizer binarizer = new HybridBinarizer(source);
			BinaryBitmap binaryBitmap = new BinaryBitmap(binarizer);
			Map<DecodeHintType, Object> hints = new HashMap<>();
			hints.put(DecodeHintType.CHARACTER_SET, "UTF-8");
			Result result = new MultiFormatReader().decode(binaryBitmap,hints);
			
			JSONObject contents = JSONObject.parseObject(result.getText());
			System.out.println("图片中内容:");
			System.out.println("author:"+contents.getString("author"));
			System.out.println("zxing:"+contents.getString("zxing"));
			System.out.println("图片中格式:");
			System.out.println("encode:"+result.getBarcodeFormat());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NotFoundException e) {
			e.printStackTrace();
		}
	}
}
