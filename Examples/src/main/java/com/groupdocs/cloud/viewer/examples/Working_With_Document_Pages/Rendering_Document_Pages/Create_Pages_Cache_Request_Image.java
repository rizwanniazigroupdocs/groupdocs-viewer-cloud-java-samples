package com.groupdocs.cloud.viewer.examples.Working_With_Document_Pages.Rendering_Document_Pages;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.ImageCreatePagesCacheFromContentRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Create_Pages_Cache_Request_Image {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {

			Path filePath = Paths.get("D://one-page.docx");
			File file = filePath.toFile();

			Watermark watermark = new Watermark();
			watermark.setText("GrouDocs Cloud API");

			ImageOptions imageOptions = new ImageOptions();
			
			imageOptions.setWatermark(watermark);
			imageOptions.setFormat("jpg");
			ImageCreatePagesCacheFromContentRequest request = new ImageCreatePagesCacheFromContentRequest();
			request.setFile(file);

			JSON json = new JSON();
			String content = json.serialize(imageOptions);

			try {
				File imageOptionsfile = File.createTempFile("java", ".json");
				FileWriter fileWriter = new FileWriter(imageOptionsfile.getAbsoluteFile(), true);
				fileWriter.write(content);
				fileWriter.close();
				request.setImageOptions(imageOptionsfile);
			} catch (IOException e) {
			}

			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			ImagePageCollection response = apiInstance.imageCreatePagesCacheFromContent(request);

			System.out.println("File Name: " + response.getFileName());

			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}
