package training.composite;

public class App {

    public static void main(String[] args) {
        WinForm winForm = buildWinForm();
        winForm.print();
    }

    private static WinForm buildWinForm() {
        WinForm winForm = new WinForm("WINDOW窗口");
        winForm.addComponent(new Picture("LOGO图片"));
        winForm.addComponent(new Button("登录"));
        winForm.addComponent(new Button("注册"));
        Frame frame = new Frame("FRAME1");
        winForm.addComponent(frame);

        frame.addComponent(new Lable("用户名"));
        frame.addComponent(new TextBox("文本框"));
        frame.addComponent(new Lable("密码"));
        frame.addComponent(new PasswordBox("密码框"));
        frame.addComponent(new CheckBox("复选框"));
        frame.addComponent(new TextBox("记住用户名"));
        frame.addComponent(new LinkLable("忘记密码"));

        return winForm;
    }

}
