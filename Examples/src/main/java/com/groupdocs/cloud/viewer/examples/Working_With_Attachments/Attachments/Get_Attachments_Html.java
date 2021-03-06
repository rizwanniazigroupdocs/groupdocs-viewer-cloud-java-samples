package com.groupdocs.cloud.viewer.examples.Working_With_Attachments.Attachments;

import com.groupdocs.cloud.viewer.client.*;
import com.groupdocs.cloud.viewer.model.*;
import com.groupdocs.cloud.viewer.model.requests.HtmlGetAttachmentsRequest;
import com.groupdocs.cloud.viewer.examples.Utils;
import com.groupdocs.cloud.viewer.api.ViewerApi;

public class Get_Attachments_Html {

	public static void main(String[] args) {

		ViewerApi apiInstance = Utils.getViewerAPIInstance();
		try {
			HtmlGetAttachmentsRequest request = new HtmlGetAttachmentsRequest();
			request.setFileName("with-attachment.msg");
			request.setFolder("viewerdocs");
			request.setStorage("MyStorage");

			AttachmentCollection response = apiInstance.htmlGetAttachments(request);

			System.out.println("Attachments: " + response.getAttachments().size());
			System.out.println("First Attachment Name: " + response.getAttachments().get(0).getName());

			System.out.println("Executed Successfully");
		} catch (ApiException e) {
			System.err.println("Exception when calling ViewerApi");
			e.printStackTrace();
		}
	}
}
