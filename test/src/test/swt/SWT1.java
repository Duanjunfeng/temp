package test.swt;


import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;

public class SWT1 {
	public static void main(String[] args) {
		//每一个基于SWT的应用程序只有一个Display实例。该实例表示了低层平台和SWT间的连接。除了可以管理SWT事件的循环之外，它还提供访问SWT所需的系统资源的方法。
		Display display = new Display();
		//每个窗口有一个Shell对象，它代表用户交互的窗口帧。它处理对所有窗口都类似的移动和变换大小行为，并且它是显示在它边框内的所有窗口小部件的父对象。
		Shell shell = new Shell(display);
		//设置窗口帧的标题
		shell.setText("Hello World!");
		//设置窗口帧的大小和位置 x,y,w,h
		shell.setBounds(400, 400, 300, 150);
		//setLayout() 方法设置窗口帧的布局管理器。FillLayout 是一个简单的布局，它让单一子窗口小部件填充其父窗口小部件的整个边框。
		shell.setLayout(new FillLayout());
		//本行创建一个简单的标签部件，该部件的父部件是shell，并在相对于其自身的中央位置显示它的文本。
		Label label = new Label(shell,SWT.CENTER);
		//设置标签文本
		label.setText("wawawa");
		//使用红色创建了一个Color实例。也可以使用系统颜色的红色。
		//Color red2 = display.getSystemColor(SWT.COLOR_RED);
		Color red = new Color(display,255,0,0);
		//设置标签前景色
		label.setForeground(red);
		//到此为止，窗口帧还是不可见的，open()方法是让窗口帧可见。
		shell.open();
		//循环不断检查窗口帧是否被关闭。
		while(!shell.isDisposed()){
			//display管理事件循环，readAndDispatch() 方法从系统事件队列读取事件,并将他们分发给合适的接收者。
			//当还有更多任务要完成时，方法返回true，当事件队列为空时，返回false（此时可以运行UI线程睡眠，直至有更多的任务完成）
			if(!display.readAndDispatch()){
				display.sleep();
			}
		}
		//当循环检测到窗口已经被释放时，就需要释放颜色，display和所有相关联的系统资源。注意系统颜色不应被释放。
		red.dispose();
		display.dispose();
	}
}
