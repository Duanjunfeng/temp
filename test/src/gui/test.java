package gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;

public class test {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			test window = new test();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(344, 300);
		shell.setText("SWT Application");
		shell.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		TabFolder tabFolder = new TabFolder(shell, SWT.NONE);
		
		TabItem tabItem = new TabItem(tabFolder, SWT.NONE);
		tabItem.setText("服  务");
		
		Composite composite = new Composite(tabFolder, SWT.NONE);
		tabItem.setControl(composite);
		
		text = new Text(composite, SWT.BORDER);
		text.setBounds(116, 28, 192, 23);
		
		Label URL = new Label(composite, SWT.NONE);
		URL.setBounds(65, 31, 45, 17);
		URL.setText("URL");
		
		Label label = new Label(composite, SWT.NONE);
		label.setText("帐号");
		label.setBounds(65, 76, 45, 17);
		
		text_1 = new Text(composite, SWT.BORDER);
		text_1.setBounds(116, 73, 192, 23);
		
		Label label_1 = new Label(composite, SWT.NONE);
		label_1.setText("密码");
		label_1.setBounds(65, 122, 45, 17);
		
		text_2 = new Text(composite, SWT.BORDER);
		text_2.setBounds(116, 119, 192, 23);
		
		Button btnNewButton = new Button(composite, SWT.NONE);
		btnNewButton.setBounds(340, 182, 80, 27);
		btnNewButton.setText("取 消");
		
		Button btnNewButton_1 = new Button(composite, SWT.NONE);
		btnNewButton_1.setBounds(244, 182, 80, 27);
		btnNewButton_1.setText("确 定");
		
		TabItem tbtmNewItem = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem.setText("源  码");
		
		Composite composite_3 = new Composite(tabFolder, SWT.NONE);
		tbtmNewItem.setControl(composite_3);
		
		TabItem tbtmNewItem_2 = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem_2.setText("文  档");
		
		Composite composite_2 = new Composite(tabFolder, SWT.NONE);
		tbtmNewItem_2.setControl(composite_2);
		
		TabItem tabItem_1 = new TabItem(tabFolder, SWT.NONE);
		tabItem_1.setText("关  于");
		
		Composite composite_1 = new Composite(tabFolder, SWT.NONE);
		tabItem_1.setControl(composite_1);
		
		Label lblNewLabel = new Label(composite_1, SWT.NONE);
		lblNewLabel.setImage(SWTResourceManager.getImage("D:\\个人\\我的图片\\PSV壁纸\\战神1.jpg"));
		lblNewLabel.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_BACKGROUND));
		lblNewLabel.setBounds(10, 10, 304, 103);
		lblNewLabel.setText("New Label");
		
		Label label_2 = new Label(composite_1, SWT.SEPARATOR | SWT.HORIZONTAL);
		label_2.setBounds(10, 119, 304, 2);
		
		Label lblNewLabel_1 = new Label(composite_1, SWT.NONE);
		lblNewLabel_1.setImage(SWTResourceManager.getImage("D:\\个人\\我的图片\\PSV壁纸\\战神1.jpg"));
		lblNewLabel_1.setBounds(10, 130, 304, 95);
		lblNewLabel_1.setText("New Label");

	}
}
