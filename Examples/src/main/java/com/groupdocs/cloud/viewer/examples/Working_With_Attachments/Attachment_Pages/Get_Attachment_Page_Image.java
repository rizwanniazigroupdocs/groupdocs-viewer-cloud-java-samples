package com.groupdocs.cloud.viewer.examples.Working_With_Attachments.Attachment_Pages;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.requests.ImageGetAttachmentPageRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;
import java.io.File;

public class Get_Attachment_Page_Image {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			ImageGetAttachmentPageRequest request = new ImageGetAttachmentPageRequest();
			request.setFileName("with-attachment.msg");
			request.setPassword("");
			request.setPageNumber(1);
			request.setAttachmentName("TestAttachment-File.docx");
			request.setAttachmentPassword("");
			request.setRenderComments(false);
			request.setRenderHiddenPages(true);
			request.setDefaultFontName(null);
			request.setFontsFolder("");
			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			File response = apiInstance.imageGetAttachmentPage(request);

			System.out.println("File Name: " + response.getName());
			System.out.println("File Size: " + response.length());

			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}
