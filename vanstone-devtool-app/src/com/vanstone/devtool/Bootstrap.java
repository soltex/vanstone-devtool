package com.vanstone.devtool;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * Bootstrap Æô¶¯´°Ìå
 * @author shipeng
 */
public class Bootstrap {
	
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(808, 533);
		shell.setText("SWT Application");
		shell.setLayout(null);
		
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
