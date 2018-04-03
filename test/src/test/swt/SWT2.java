package test.swt;


import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;

public class SWT2 {
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("设置");
		shell.setBounds(100, 100, 300, 300);
		shell.setLayout(new FillLayout());
		//
		
		final TabFolder tabFolder = new TabFolder(shell, SWT.BORDER);
		for (int i = 1; i < 5; i++) {
			TabItem tabItem = new TabItem(tabFolder, SWT.NULL);
			tabItem.setText("t"+i);
			Composite composite = new Composite(tabFolder, SWT.NULL);
			tabItem.setControl(composite);
			
			Button button = new Button(composite, SWT.PUSH);
			button.setBounds(25, 25, 100, 25);
			button.setText("click");
		}
		
		shell.open();
		while(!shell.isDisposed()){
			if(!display.readAndDispatch()){
				display.sleep();
			}
		}
		display.dispose();
	}
}
