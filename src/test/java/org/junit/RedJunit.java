package org.junit;

import org.utilities.BaseClass;

public class RedJunit extends BaseClass {
	
@Before
	public void launchchrome() {
		launchChrome();
		loadUrl(" https://www.redbus.in/");
		fullWindow();
}
		@Test
		public void redBus() {

		}

}