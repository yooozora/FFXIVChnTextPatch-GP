package name.yumao.ffxiv.chn.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import name.yumao.ffxiv.chn.util.FFXIVLauncher;
import name.yumao.ffxiv.chn.util.HexUtils;
import name.yumao.ffxiv.chn.util.res.Config;

public class ClientLauncherPanel extends JFrame implements ActionListener {
	private static Point origin = new Point();
	
	private static String title = "提莫苑|快速启动";
	
	private JLabel title_lable = new JLabel(title);
	
	private Dimension dimension;
	
	private JButton closeButton = new JButton("x");
	
	private JPanel titlePanel = new JPanel();
	
	private JPanel bodyPanel = new JPanel();
	
	private JLabel bootModeLable = new JLabel("版本");
	
	private JComboBox<String> bootModeVal;
	
	private JLabel dxModeLable = new JLabel("DX");
	
	private JComboBox<String> dxModeVal;
	
	private JLabel userLable = new JLabel("账户");
	
	private JTextField userField = new JTextField();
	
	private JLabel pwdLable = new JLabel("密码");
	
	private JPasswordField pwdField = new JPasswordField();
	
	private JLabel otpLable = new JLabel("密保");
	
	private JPasswordField otpField = new JPasswordField();
	
	private JButton submitButton = new JButton("启动");
	
	private JButton exitButton = new JButton("关闭");
	
	public ClientLauncherPanel() {
		super("提莫苑|快速启动");
		setUndecorated(true);
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		setIconImage(toolkit.createImage(HexUtils.hexStringToBytes("89504E470D0A1A0A0000000D4948445200000040000000400806000000AA6971DE000004EC4944415478DAED5B69485451141EB50DB3C56AA821A329C7596CD459A2FA57467B513F0209F147CB0F2B82C20ACA928ACA3F2544605909051651D962641B914542942456602B6DE492AD56A29665DF9137F27ACD7BB3F4EECCBB830F0EF7CD9B33EFDEEFDC73CE3DF79C3B3A5D082EB7DB3D283535D5EE703816B85CAE5CA7D3791C7407F74FF1DD1BB4F5681BD0D6815E821EE1FB4AB487D1AE453B2B2525C58A77F4D7F174198DC67E003D07200A00A20AD40EA09D81127EF71BEF20C194A05D6AB3D90C5AC6DD0B839C8FC19E007D0F06B01F02F905BA857EB2939393E334811A031982016DC6C0DEB2002D47E8F32BFA2C84798C090B70D8663C06918F417C535261B27750332B41E0DD3F4007ED76FBA850618F06F015E8FC83C2C07E92C3831F28C1FD975068044D04FA5B47A6C80C39A46C232FAD34E3684FA5A5A5CD236F1F4A9310994635CCC2A23A78805B056A5300FF009D4F062D24FB0C0778B1366012B254016E32990602D04985CEDAA17A5B70DF1B7C79821674869B842574DB7F81872A25E045F7153A790E1E1758A3D0D93E2D00F76212FB697C0183870A8DA3684DE1C56514E9D1CBA10107B4085E34D68280C163769B141C1DBD309A786929D432780F619256FAABF6168ACFE5C0E345EB3DBC00BF4C2B36EF874F68C378C72B82B75AAD43C9AE159C4A8E484B9C78DECA037811861AD93881BC38186E2AA8D00E116F2C789FF104DEA72928D932BE3B26F6A4F8BC9B47F002BD008498BFC0432A53F045875C6445DB5B11AF438E97235398290E74FAE2C11319E616D8BA5912115EE619BC4005E2D9CF5590D41AA9A6F0E2F57D68C0450FA0C1F8F05986B15A6A2B78561E01B34F02B8D195AFC3CD2605C674C9EC275146264204709A6C792A25226518AE7B592576450278C1B1E791000AE518E0F86648F047853AE5C5729748A13E09A05686E9B174F7841F4C8894D907EE339EE5EC938C7A6CF0A2FE791102BEBE3BB5EE2D9949EAE12DCB8AE7D722007C1D1569C4B3FAD10BE37B3C9F6DB7DB1345D15F14CBAC6E889C5E39300D97CE6A8D2F67016A9111142FF490CA72729B9F9C48716CD2F09D7298A0698AA9302A6C60862F45C2B246C517002EA28C744085548BC532003FBAC01160AA02D5824A29130D9AFB8F6D0773619DCF10CAD2E1DCE874600C8D68A9BE705528916FA74228804E27C74C491BA6352F746444C74B4045E8AC02ED6B7FD35E42E5B6992246A1CE7F97964F9A2DDC1753124528A25281258BCAE76827510E12CFF59E24AB262F2A4593AA2188180DB089341B142F4073469ACDE6617ABD3E2EA8DC7BCFD573755F06832196340C9A3591D66E98C57298C8D6AE8D0BAF179DEF0198C594592230A03D007604748E9212E4F0845D66AB42167723B70250A36A04019DE75900875488E31BB9150066AF4C8D1801ABD0082E0580C1DF5343005E3254DC6840934A51E26AEEC053F0A456680D3FB097C725D0AD66428347FBCF54B9ACCD9DFDEF545100EF788C01AEA8B955E66EB3E5E32469C044C7F578527F93DA0913DA7AF3A4FED96A0B206CA7C283D4805206677B9278C11FC3A29680B8622C17E885F3469D0C4C208117F52F642100AA63F010FFF7517BF9F3649C75D2A36D1AF5FE8B18D50C1A7851FFDB8CCA5F559A078F40259D61FDEF2C0FA16F25C3FA7EBED6673F83F101E74C2D273EE285FF00331300937F81A9E8F98B19D7FF9B349DF7A39A3D63011CD5B2F9D31FA62B581C9F174E7EBCA2E3F92C06FE07D4147657975EC1240000000049454E44AE426082")));
		this.dimension = toolkit.getScreenSize();
		setBounds((this.dimension.width - 230) / 2, (this.dimension.height - 225) / 2, 230, 225);
		setResizable(false);
		setLayout((LayoutManager)null);
		setDefaultCloseOperation(3);
		this.titlePanel.setBounds(0, 0, 230, 30);
		this.titlePanel.setBackground(new Color(110, 110, 110));
		this.titlePanel.setBorder(new MatteBorder(0, 0, 0, 0, new Color(110, 110, 110)));
		add(this.titlePanel);
		this.bodyPanel.setBounds(0, 0, 230, 225);
		this.bodyPanel.setBackground(new Color(255, 255, 255));
		this.bodyPanel.setBorder(new MatteBorder(0, 1, 1, 1, new Color(110, 110, 110)));
		add(this.bodyPanel);
		this.title_lable.setBounds(10, 0, 150, 30);
		this.title_lable.setFont(new Font("Microsoft Yahei", 1, 13));
		this.title_lable.setForeground(new Color(255, 255, 255));
		add(this.title_lable, 0);
		this.closeButton.setBounds(200, 0, 20, 30);
		this.closeButton.setFont(new Font("Microsoft Yahei", 1, 12));
		this.closeButton.setForeground(new Color(255, 255, 255));
		this.closeButton.setMargin(new Insets(0, 0, 0, 0));
		this.closeButton.setBorder((Border)null);
		this.closeButton.setOpaque(false);
		this.closeButton.setIconTextGap(0);
		this.closeButton.setContentAreaFilled(false);
		this.closeButton.setFocusable(false);
		this.closeButton.addActionListener(this);
		add(this.closeButton, 0);
		addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						ClientLauncherPanel.origin.x = e.getX();
						ClientLauncherPanel.origin.y = e.getY();
					}
				});
		addMouseMotionListener(new MouseMotionAdapter() {
					public void mouseDragged(MouseEvent e) {
						Point p = ClientLauncherPanel.this.getLocation();
						ClientLauncherPanel.this.setLocation(p.x + e.getX() - ClientLauncherPanel.origin.x, p.y + e.getY() - ClientLauncherPanel.origin.y);
					}
				});
		addWindowListener(new WindowAdapter() {
					public void windowOpened(WindowEvent e) {
						ClientLauncherPanel.this.otpField.requestFocus();
					}
				});
		this.bootModeLable.setBounds(30, 40, 100, 25);
		this.bootModeLable.setFont(new Font("Microsoft Yahei", 1, 13));
		this.bootModeLable.setForeground(new Color(110, 110, 110));
		add(this.bootModeLable, 0);
		this.bootModeVal = new JComboBox<>();
		this.bootModeVal.addItem("PC");
		this.bootModeVal.addItem("Steam");
		this.bootModeVal.addItem("Mac");
		this.bootModeVal.addItem("PS4");
		this.bootModeVal.setBounds(80, 40, 120, 23);
		this.bootModeVal.setFont(new Font("Microsoft Yahei", 1, 13));
		this.bootModeVal.setForeground(new Color(110, 110, 110));
		this.bootModeVal.setOpaque(false);
		this.bootModeVal.setFocusable(false);
		add(this.bootModeVal, 0);
		this.dxModeLable.setBounds(30, 70, 100, 25);
		this.dxModeLable.setFont(new Font("Microsoft Yahei", 1, 13));
		this.dxModeLable.setForeground(new Color(110, 110, 110));
		add(this.dxModeLable, 0);
		this.dxModeVal = new JComboBox<>();
		this.dxModeVal.addItem("DX11");
		this.dxModeVal.addItem("DX9");
		this.dxModeVal.setBounds(80, 70, 120, 23);
		this.dxModeVal.setFont(new Font("Microsoft Yahei", 1, 13));
		this.dxModeVal.setForeground(new Color(110, 110, 110));
		this.dxModeVal.setOpaque(false);
		this.dxModeVal.setFocusable(false);
		add(this.dxModeVal, 0);
		this.userLable.setBounds(30, 100, 100, 25);
		this.userLable.setFont(new Font("Microsoft Yahei", 1, 13));
		this.userLable.setForeground(new Color(110, 110, 110));
		add(this.userLable, 0);
		this.userField.setBounds(80, 102, 120, 20);
		this.userField.setFont(new Font("Microsoft Yahei", 1, 12));
		this.userField.setForeground(new Color(110, 110, 110));
		add(this.userField, 0);
		this.pwdLable.setBounds(30, 130, 100, 25);
		this.pwdLable.setFont(new Font("Microsoft Yahei", 1, 13));
		this.pwdLable.setForeground(new Color(110, 110, 110));
		add(this.pwdLable, 0);
		this.pwdField.setBounds(80, 132, 120, 20);
		this.pwdField.setFont(new Font("Microsoft Yahei", 1, 12));
		this.pwdField.setForeground(new Color(110, 110, 110));
		add(this.pwdField, 0);
		this.otpLable.setBounds(30, 160, 100, 25);
		this.otpLable.setFont(new Font("Microsoft Yahei", 1, 13));
		this.otpLable.setForeground(new Color(110, 110, 110));
		add(this.otpLable, 0);
		this.otpField.setBounds(80, 162, 120, 20);
		this.otpField.setFont(new Font("Microsoft Yahei", 1, 12));
		this.otpField.setForeground(new Color(110, 110, 110));
		add(this.otpField, 0);
		this.rootPane.setDefaultButton(this.submitButton);
		this.submitButton.setBounds(30, 190, 60, 25);
		this.submitButton.setFont(new Font("Microsoft Yahei", 1, 12));
		this.submitButton.setForeground(new Color(110, 110, 110));
		this.submitButton.setMargin(new Insets(0, 0, 0, 0));
		this.submitButton.setOpaque(false);
		this.submitButton.setIconTextGap(0);
		this.submitButton.setContentAreaFilled(false);
		this.submitButton.setFocusable(false);
		this.submitButton.addActionListener(this);
		add(this.submitButton, 0);
		this.exitButton.setBounds(140, 190, 60, 25);
		this.exitButton.setFont(new Font("Microsoft Yahei", 1, 12));
		this.exitButton.setForeground(new Color(110, 110, 110));
		this.exitButton.setMargin(new Insets(0, 0, 0, 0));
		this.exitButton.setOpaque(false);
		this.exitButton.setIconTextGap(0);
		this.exitButton.setContentAreaFilled(false);
		this.exitButton.setFocusable(false);
		this.exitButton.addActionListener(this);
		add(this.exitButton, 0);
		try {
			if (!(new File("conf" + File.separator + "boot.properties")).exists())
				(new File("conf" + File.separator + "boot.properties")).createNewFile(); 
		} catch (Exception exception) {}
		Config.setConfigResource("boot", "conf" + File.separator + "boot.properties");
		if (Config.getProperty("boot", "BootMode") != null && Config.getProperty("boot", "BootMode").length() > 0)
			this.bootModeVal.setSelectedItem(Config.getProperty("boot", "BootMode")); 
		if (Config.getProperty("boot", "DirectX") != null && Config.getProperty("boot", "DirectX").length() > 0)
			this.bootModeVal.setSelectedItem(Config.getProperty("boot", "DirectX")); 
		if (Config.getProperty("boot", "Username") != null && Config.getProperty("boot", "Username").length() > 0)
			this.userField.setText(Config.getProperty("boot", "Username")); 
		if (Config.getProperty("boot", "Password") != null && Config.getProperty("boot", "Password").length() > 0)
			this.pwdField.setText(Config.getProperty("boot", "Password")); 
		setVisible(false);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.closeButton || e.getSource() == this.exitButton)
			dispose(); 
		if (e.getSource() == this.submitButton) {
			Config.setProperty("boot", "BootMode", (String)this.bootModeVal.getSelectedItem());
			Config.setProperty("boot", "DirectX", (String)this.dxModeVal.getSelectedItem());
			Config.setProperty("boot", "Username", this.userField.getText());
			Config.setProperty("boot", "Password", new String(this.pwdField.getPassword()));
			Config.saveProperty("boot");
			String launchParams = FFXIVLauncher.getlaunchParams(this.userField.getText(), new String(this.pwdField.getPassword()), new String(this.otpField.getPassword()));
			String[] params = launchParams.split(",");
			if (params[1].equals("err")) {
				JOptionPane.showMessageDialog(null, params[2], "登陆错误", 0);
			} else {
				String sid = FFXIVLauncher.getSid(launchParams).split(",")[0];
				String scode = FFXIVLauncher.getSid(launchParams).split(",")[1];
				if (!scode.equals("204")) {
					JOptionPane.showMessageDialog(null, "<html><body>检测到客户端有更新内容<br />确定后将启动官方启动器以更新</body></html>", "需要更新", 0);
					FFXIVLauncher.launchBoot();
					System.exit(0);
				} else {
					FFXIVLauncher.launchClient(launchParams, sid);
					System.exit(0);
				} 
			} 
		} 
	}
	
	public static void main(String[] args) {
		new ClientLauncherPanel();
	}
}
