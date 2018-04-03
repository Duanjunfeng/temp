package test.swt;


import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;

public class SWT3 {
	public static void main(String[] args) {
		FormData formData;
		
		Display display = new Display();
		final Shell shell = new Shell(display);
		shell.setText("设置");
		shell.setBounds(100, 100, 300, 300);
		shell.setLayout(new FormLayout());
		
		Button cancelButton = new Button(shell,SWT.PUSH);
		cancelButton.setText("取消");
		formData = new FormData();
		formData.right =new FormAttachment(100, -5);
		formData.bottom = new FormAttachment(100, -5);
		cancelButton.setLayoutData(formData);
		
		Button okButton = new Button(shell,SWT.PUSH);
		okButton.setText("确定");
		formData = new FormData();
		formData.right =new FormAttachment(cancelButton, -5);
		formData.bottom = new FormAttachment(100, -5);
		okButton.setLayoutData(formData);
		
		Text text = new Text(shell, SWT.MULTI | SWT.BORDER);
		formData = new FormData();
		formData.top = new FormAttachment(0,5);
		formData.bottom = new FormAttachment(cancelButton, -5);
		formData.left = new FormAttachment(0,5);
		formData.right = new FormAttachment(100,-5);
		text.setLayoutData(formData);
		
		shell.open();
		while(!shell.isDisposed()){
			if(!display.readAndDispatch()){
				display.sleep();
			}
		}
		display.dispose();
	}
}
