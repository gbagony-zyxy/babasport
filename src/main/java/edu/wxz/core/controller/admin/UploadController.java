package edu.wxz.core.controller.admin;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FilenameUtils;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;

import edu.wxz.core.bean.product.Brand;
import edu.wxz.core.common.web.Constants;
import edu.wxz.core.common.web.ResponseUtils;
import edu.wxz.core.service.product.BrandService;

@Controller
public class UploadController {

	@Autowired
	private BrandService brandService;

	// 上传图片,异步情况下Spring不需要返回值
	@RequestMapping(value = "/upload/uploadPic.do")
	public void uploadPic(@RequestParam(required = false, value = "pic") MultipartFile multipartFile,
			HttpServletResponse response) {
		// 文件后缀名
		String ext = FilenameUtils.getExtension(multipartFile.getOriginalFilename());

		// 图片名称生成策略
		DateFormat df = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String format = df.format(new Date());
		// 随机三位数
		Random rand = new Random();
		for (int i = 0; i < 3; i++) {
			format += rand.nextInt(10);
		}
		// 实例化Jersey实例
		Client client = new Client();
		// 保存数据库地址
		String path = "upload/" + format + "." + ext;
		// 另一台服务器的请求地址
		String url = Constants.IMAGE_URL + path;
		// 设置请求路径
		WebResource resource = client.resource(url);
		// 发送
		try {
			resource.put(String.class, multipartFile.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 返回两个路径
		JSONObject object = new JSONObject();
		object.put("url", url);
		object.put("path", path);

		ResponseUtils.senderJson(response, object.toString());
	}

	// 添加品牌
	@RequestMapping(value = "/brand/addBrand.do")
	public String addBrand(Brand brand) {
		// 添加
		brandService.addBrand(brand);

		return "redirect:/brand/list.do";
	}

}
