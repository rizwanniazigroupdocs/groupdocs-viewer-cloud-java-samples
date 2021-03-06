package com.groupdocs.cloud.viewer.examples.Working_With_Document_Pages.Rendering_Document_Pages;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.ImageCreatePdfFileRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;

public class Render_Email_PDF {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			ImageCreatePdfFileRequest request = new ImageCreatePdfFileRequest();
			request.setFileName("with-attachment.msg");
			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			PdfFileOptions pdfFileOptions = new PdfFileOptions();
			EmailOptions emailOptions = new EmailOptions();

			emailOptions.setPageSize("A0");
			pdfFileOptions.setEmailOptions(emailOptions);

			request.setPdfFileOptions(pdfFileOptions);

			PdfFileInfo response = apiInstance.imageCreatePdfFile(request);

			System.out.println("Cache Created");
			System.out.println("File Name: " + response.getFileName());

			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}