module swingx.common {
	exports org.jdesktop.beans;
	exports org.jdesktop.swingx.util;
	
	requires transitive java.desktop;
	requires java.logging;
	requires transitive java.compiler;
	
	uses javax.annotation.processing.Processor;
	
	provides javax.annotation.processing.Processor
		with org.jdesktop.beans.JavaBeanProcessor;
}