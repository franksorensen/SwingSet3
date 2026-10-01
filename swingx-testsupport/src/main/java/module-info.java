module swingx.testsupport {
	exports org.jdesktop.test;
	exports org.jdesktop.test.categories;
	exports org.jdesktop.test.matchers;
	
	requires java.desktop;
	requires java.logging;
	
	requires junit;
	requires hamcrest.core;
	requires org.mockito;
	
}