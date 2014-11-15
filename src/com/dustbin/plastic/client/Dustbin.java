package com.dustbin.plastic.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
// Entry point class
public class Dustbin implements EntryPoint {
// Entry point method		
	public void onModuleLoad() {
		final VerticalPanel vPanel = new VerticalPanel();
		vPanel.setBorderWidth(1);
		final TextBox txt1 = new TextBox();
		final Image myimg = new Image ("images/pan1.jpg");
		final Label mylbl = new Label("Hi this is panneer");
		Button btn1 = new Button("Send");
		btn1.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				// TODO Auto-generated method stub
				String newStrng = txt1.getText();
				mylbl.setText(newStrng);
				if ( myimg.isVisible() == true ){
				myimg.setVisible(false);
				} else {
					myimg.setVisible(true);
				}
			}
			
		});
		vPanel.add(myimg);
		vPanel.add(mylbl);
		vPanel.add(txt1);
		vPanel.add(btn1);
		
		RootPanel.get("nameFieldContainer").add(vPanel);
		
		}		
}
