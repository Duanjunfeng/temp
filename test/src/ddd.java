import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;

public class ddd {
	private static Text text;
	private static Text text_1;
	private static Text text_2;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(369, 300);
		shell.setText("SWT Application");
		shell.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		TabFolder tabFolder = new TabFolder(shell, SWT.NONE);
		
		TabItem tabItem = new TabItem(tabFolder, SWT.NONE);
		tabItem.setText("服  务");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		tabItem.setControl(composite);
		
		Label lblNewLabel = new Label(composite, SWT.NONE);
		lblNewLabel.setBounds(40, 24, 41, 17);
		lblNewLabel.setText("URL");
		
		text = new Text(composite, SWT.BORDER);
		text.setBounds(87, 21, 223, 23);
		
		text_1 = new Text(composite, SWT.BORDER);
		text_1.setBounds(87, 65, 223, 23);
		
		Label label = new Label(composite, SWT.NONE);
		label.setText("帐号");
		label.setBounds(40, 68, 41, 17);
		
		text_2 = new Text(composite, SWT.BORDER);
		text_2.setBounds(87, 110, 223, 23);
		
		Label label_1 = new Label(composite, SWT.NONE);
		label_1.setText("密码");
		label_1.setBounds(40, 113, 41, 17);
		
		Button btnNewButton = new Button(composite, SWT.NONE);
		btnNewButton.setBounds(271, 181, 68, 27);
		btnNewButton.setText("取消");
		
		Button button = new Button(composite, SWT.NONE);
		button.setText("确定");
		button.setBounds(191, 181, 68, 27);
		
		TabItem tbtmNewItem = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem.setText("源  码");
		
		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		tbtmNewItem.setControl(composite_1);
		
		TabItem tabItem_1 = new TabItem(tabFolder, 0);
		tabItem_1.setText("文  档");
		
		Composite composite_2 = new Composite(tabFolder, SWT.NONE);
		tabItem_1.setControl(composite_2);
		
		TabItem tabItem_2 = new TabItem(tabFolder, 0);
		tabItem_2.setText("关  于");
		
		Composite composite_3 = new Composite(tabFolder, SWT.NONE);
		tabItem_2.setControl(composite_3);
		
		Label lblNewLabel_1 = new Label(composite_3, SWT.NONE);
//		Image img = new Image(display, "icons/aa.png");    
		Image img = SWTResourceManager.getImage("icons/aa.png");    
		
		lblNewLabel_1.setImage(img);
		lblNewLabel_1.setBounds(10, 10, 329, 110);
		
		
		Label label_2 = new Label(composite_3, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_2.setBounds(10, 126, 329, 2);
		
		Label lblNewLabel_2 = new Label(composite_3, SWT.NONE);
		lblNewLabel_2.setBounds(10, 136, 329, 89);
		lblNewLabel_2.setText("说明：");

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		display.dispose();
	}
}
