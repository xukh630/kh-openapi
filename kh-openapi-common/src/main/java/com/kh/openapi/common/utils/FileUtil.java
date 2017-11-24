package com.kh.openapi.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author zhangkai
 * @create 2017-06-27-上午8:34
 */
public class FileUtil {

	private static final Logger LOGGER = LoggerFactory.getLogger(FileUtil.class);

	/**
	 * 从网络Url中下载文件
	 *
	 * @param urlStr
	 * @param fileName
	 * @param savePath
	 * @throws IOException
	 */
	public static void downLoadFromUrl(String urlStr, String fileName, String savePath) {

		LOGGER.info("文件下载，url = {}，savePath = {}，fileName = {}", urlStr, savePath, fileName);
		URL url;
		FileOutputStream fos = null;
		InputStream inputStream = null;
		try {
			url = new URL(urlStr);
			HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
			httpURLConnection.setConnectTimeout(3 * 1000);
//			httpURLConnection.setReadTimeout(60 * 1000);
//			httpURLConnection.setDoOutput(true);
//			httpURLConnection.setDoInput(true);
//			httpURLConnection.setUseCaches(false);
			//防止屏蔽程序抓取而返回403错误
			httpURLConnection
					.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
//			httpURLConnection.setRequestMethod("POST");
//			httpURLConnection.setRequestProperty("connection", "Keep-Alive");
//			httpURLConnection.setRequestProperty("Content-type", "application/x-java-serialized-object");
//			httpURLConnection.setRequestProperty("Charsert", "UTF-8");

			httpURLConnection.connect();

			inputStream = httpURLConnection.getInputStream();

			//文件目录
			File saveDir = new File(savePath);

			//			//创建文件父级目录
			File parentSaveDir = saveDir.getParentFile();
			if (!parentSaveDir.exists()) {
				parentSaveDir.mkdirs();
			}

			//创建文件目录
			if (!saveDir.exists()) {
				saveDir.mkdir();
			}

			File file = new File(saveDir + File.separator + fileName);
			if (!file.exists()) {
				file.setWritable(true,false);
				file.setExecutable(true,false);
				file.setReadable(true,false);
				file.createNewFile();
			}

			fos = new FileOutputStream(file);
			byte[] buffer = new byte[1024];
			int readLength;
			while ((readLength = inputStream.read(buffer)) != -1) {
				fos.write(buffer, 0, readLength);
			}
			fos.flush();
		} catch (IOException e) {
			LOGGER.error("下载文件失败，{}", e.getMessage());
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
