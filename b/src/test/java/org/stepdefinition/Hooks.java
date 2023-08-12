package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
@Before
//Pre conditions
private void precondition() {
  launchBrowser();
}

@After
//post conditions
private void postconditions() throws InterruptedException {
	Thread.sleep(5000);
	close();

}
}
