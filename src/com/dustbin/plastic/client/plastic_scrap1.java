package com.dustbin.plastic.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.Widget;

public class plastic_scrap1 implements EntryPoint {

	private scrap1_ui ui1 = new scrap1_ui();
	private Label msg = new Label("Hello, World");

	@Override
	public void onModuleLoad() {
		// TODO Auto-generated method stub
		RootPanel.get().add(msg);
		RootPanel.get().add(ui1);

	}

}
