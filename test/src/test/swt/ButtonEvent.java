package test.swt;


import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class ButtonEvent {
	public static void main(String[] args) {
		Display display = new Display();
		Button button;
		Shell shell = new Shell(display);
		shell.setText("设置");
		shell.setBounds(100, 100, 400, 300);
		shell.setLayout(new FillLayout());
		
		for (int i = 0; i < 5; i++) {
			button = new Button(shell, SWT.PUSH);
			button.setText("B"+i);
			button.addSelectionListener(
						new SelectionAdapter() {
							public void widgetSelected(SelectionEvent event){
								String mes = ((Button)event.widget).getText();
								System.out.println(mes);
							}
						}
					);
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
