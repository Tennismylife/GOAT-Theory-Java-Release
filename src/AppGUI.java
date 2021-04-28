import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JComponent;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import javax.swing.Timer;

public class AppGUI implements ActionListener {

	private JFrame frmTennismylife;
	private JMenuBar menuBarPlayer1;
	private JPanel homePlayerPanel;
	private JMenu mnMenuPlayer1;
	private JMenuItem mntmHomeFederer1;
	private JMenuItem mntmHomeNadal1;

	private static Goat tennis;

	// Player 1
	// Slam
	private JTextField textFieldSlamR128Player1, textFieldSlamR64Player1, textFieldSlamR32Player1,
			textFieldSlamR16Player1, textFieldSlamQFPlayer1, textFieldSlamSFPlayer1, textFieldSlamFPlayer1,
			textFieldSlamWPlayer1, textFieldCountSlamR128Player1, textFieldCountSlamR64Player1,
			textFieldCountSlamR32Player1, textFieldCountSlamR16Player1, textFieldCountSlamQFPlayer1,
			textFieldCountSlamSFPlayer1, textFieldCountSlamFPlayer1, textFieldCountSlamWPlayer1;
	// M1000
	private JTextField textFieldM1000R128Player1, textFieldM1000R64Player1, textFieldM1000R32Player1,
			textFieldM1000R16Player1, textFieldM1000QFPlayer1, textFieldM1000SFPlayer1, textFieldM1000FPlayer1,
			textFieldM1000WPlayer1, textFieldCountM1000R128Player1, textFieldCountM1000R64Player1,
			textFieldCountM1000R32Player1, textFieldCountM1000R16Player1, textFieldCountM1000QFPlayer1,
			textFieldCountM1000SFPlayer1, textFieldCountM1000FPlayer1, textFieldCountM1000WPlayer1;
	// ATP 500
	private JTextField textFieldATP500R128Player1, textFieldATP500R64Player1, textFieldATP500R32Player1,
			textFieldATP500R16Player1, textFieldATP500QFPlayer1, textFieldATP500SFPlayer1, textFieldATP500FPlayer1,
			textFieldATP500WPlayer1, textFieldCountATP500R128Player1, textFieldCountATP500R64Player1,
			textFieldCountATP500R32Player1, textFieldCountATP500R16Player1, textFieldCountATP500QFPlayer1,
			textFieldCountATP500SFPlayer1, textFieldCountATP500FPlayer1, textFieldCountATP500WPlayer1;
	// ATP 250
	private JTextField textFieldATP250R128Player1, textFieldATP250R64Player1, textFieldATP250R32Player1,
			textFieldATP250R16Player1, textFieldATP250QFPlayer1, textFieldATP250SFPlayer1, textFieldATP250FPlayer1,
			textFieldATP250WPlayer1, textFieldCountATP250R128Player1, textFieldCountATP250R64Player1,
			textFieldCountATP250R32Player1, textFieldCountATP250R16Player1, textFieldCountATP250QFPlayer1,
			textFieldCountATP250SFPlayer1, textFieldCountATP250FPlayer1, textFieldCountATP250WPlayer1;
	// Olympics
	private JTextField textFieldOlympicsR128Player1, textFieldOlympicsR64Player1, textFieldOlympicsR32Player1,
			textFieldOlympicsR16Player1, textFieldOlympicsQFPlayer1, textFieldOlympicsSFPlayer1,
			textFieldOlympicsFPlayer1, textFieldOlympicsWPlayer1, textFieldCountOlympicsR128Player1,
			textFieldCountOlympicsR64Player1, textFieldCountOlympicsR32Player1, textFieldCountOlympicsR16Player1,
			textFieldCountOlympicsQFPlayer1, textFieldCountOlympicsSFPlayer1, textFieldCountOlympicsFPlayer1,
			textFieldCountOlympicsWPlayer1;
	// Masters
	private JTextField textFieldMastersRR1Player1, textFieldMastersRR2Player1, textFieldMastersRR3Player1,
			textFieldMastersSFPlayer1, textFieldMastersFPlayer1, textFieldMastersWPlayer1,
			textFieldCountMastersRR1Player1, textFieldCountMastersRR2Player1, textFieldCountMastersRR3Player1,
			textFieldCountMastersSFPlayer1, textFieldCountMastersFPlayer1, textFieldCountMastersWPlayer1;

	// Player 2
	// Slam
	private JTextField textFieldSlamR128Player2, textFieldSlamR64Player2, textFieldSlamR32Player2,
			textFieldSlamR16Player2, textFieldSlamQFPlayer2, textFieldSlamSFPlayer2, textFieldSlamFPlayer2,
			textFieldSlamWPlayer2, textFieldCountSlamR128Player2, textFieldCountSlamR64Player2,
			textFieldCountSlamR32Player2, textFieldCountSlamR16Player2, textFieldCountSlamQFPlayer2,
			textFieldCountSlamSFPlayer2, textFieldCountSlamFPlayer2, textFieldCountSlamWPlayer2;
	// M1000
	private JTextField textFieldM1000R128Player2, textFieldM1000R64Player2, textFieldM1000R32Player2,
			textFieldM1000R16Player2, textFieldM1000QFPlayer2, textFieldM1000SFPlayer2, textFieldM1000FPlayer2,
			textFieldM1000WPlayer2, textFieldCountM1000R128Player2, textFieldCountM1000R64Player2,
			textFieldCountM1000R32Player2, textFieldCountM1000R16Player2, textFieldCountM1000QFPlayer2,
			textFieldCountM1000SFPlayer2, textFieldCountM1000FPlayer2, textFieldCountM1000WPlayer2;
	// ATP 500
	private JTextField textFieldATP500R128Player2, textFieldATP500R64Player2, textFieldATP500R32Player2,
			textFieldATP500R16Player2, textFieldATP500QFPlayer2, textFieldATP500SFPlayer2, textFieldATP500FPlayer2,
			textFieldATP500WPlayer2, textFieldCountATP500R128Player2, textFieldCountATP500R64Player2,
			textFieldCountATP500R32Player2, textFieldCountATP500R16Player2, textFieldCountATP500QFPlayer2,
			textFieldCountATP500SFPlayer2, textFieldCountATP500FPlayer2, textFieldCountATP500WPlayer2;
	// ATP 250
	private JTextField textFieldATP250R128Player2, textFieldATP250R64Player2, textFieldATP250R32Player2,
			textFieldATP250R16Player2, textFieldATP250QFPlayer2, textFieldATP250SFPlayer2, textFieldATP250FPlayer2,
			textFieldATP250WPlayer2, textFieldCountATP250R128Player2, textFieldCountATP250R64Player2,
			textFieldCountATP250R32Player2, textFieldCountATP250R16Player2, textFieldCountATP250QFPlayer2,
			textFieldCountATP250SFPlayer2, textFieldCountATP250FPlayer2, textFieldCountATP250WPlayer2;
	// Olympics
	private JTextField textFieldOlympicsR128Player2, textFieldOlympicsR64Player2, textFieldOlympicsR32Player2,
			textFieldOlympicsR16Player2, textFieldOlympicsQFPlayer2, textFieldOlympicsSFPlayer2,
			textFieldOlympicsFPlayer2, textFieldOlympicsWPlayer2, textFieldCountOlympicsR128Player2,
			textFieldCountOlympicsR64Player2, textFieldCountOlympicsR32Player2, textFieldCountOlympicsR16Player2,
			textFieldCountOlympicsQFPlayer2, textFieldCountOlympicsSFPlayer2, textFieldCountOlympicsFPlayer2,
			textFieldCountOlympicsWPlayer2;
	// Masters
	private JTextField textFieldMastersRR1Player2, textFieldMastersRR2Player2, textFieldMastersRR3Player2,
			textFieldMastersSFPlayer2, textFieldMastersFPlayer2, textFieldMastersWPlayer2,
			textFieldCountMastersRR1Player2, textFieldCountMastersRR2Player2, textFieldCountMastersRR3Player2,
			textFieldCountMastersSFPlayer2, textFieldCountMastersFPlayer2, textFieldCountMastersWPlayer2;
	// Placings
	private JTextField textFieldPlacingsR128, textFieldPlacingsR64, textFieldPlacingsR32, textFieldPlacingsR16,
			textFieldPlacingsQF, textFieldPlacingsSF, textFieldPlacingsF, textFieldPlacingsW;

	// Max Point
	private JTextField textFieldSlamMaxPoints, textFieldM1000MaxPoints, textFieldATP500MaxPoints,
			textFieldATP250MaxPoints, textFieldMastersMaxPoints, textFieldOlympicsMaxPoints;
	// Sum Player 1
	private JTextField textFieldCountSlamSumPlayer1, textFieldCountM1000SumPlayer1, textFieldCountATP500SumPlayer1,
			textFieldCountATP250SumPlayer1, textFieldCountMastersSumPlayer1, textFieldCountOlympicsSumPlayer1;
	// Sum Player 2
	private JTextField textFieldCountSlamSumPlayer2, textFieldCountM1000SumPlayer2, textFieldCountATP500SumPlayer2,
			textFieldCountATP250SumPlayer2, textFieldCountMastersSumPlayer2, textFieldCountOlympicsSumPlayer2;
	// Proportions
	private JTextField PropSlamM1000, PropM1000ATP500, PropATP500ATP250, PropSlamMasters, PropSlamOlympics;

	// GOAT Points
	private JTextField textFieldGOATPointsPlayer1, textFieldGOATPointsPlayer2;

	// Slider
	private JSlider sliderATP500ATP250, sliderSlamMasters, sliderSlamOlympics, sliderSlamM1000, sliderM1000ATP500;

	private JTextField textPlayer1, textPlayer1Slam, textPlayer1M1000, textPlayer1ATP500, textPlayer1ATP250,
			textPlayer1Olympics, textPlayer1Masters;
	private JTextField textPlayer2, textPlayer2Slam, textPlayer2M1000, textPlayer2ATP500, textPlayer2ATP250,
			textPlayer2Olympics, textPlayer2Masters;

	private JLabel lblM1000, lblATP500, lblATP250, lblMasters, lblOlympics;
	private JLabel lblPropSlamM1000, lblPropM1000ATP500, lblPropATP500ATP250, lblPropSlamMasters, lblPropSlamOlympics;
	private JLabel lblPlayer1;
	private JLabel lblNewLabel;
	private JLabel lblMastersRR1, lblMastersRR2, lblMastersRR3, lblMastersSF, lblMastersF, lblMastersW;
	private JLabel lblGOATPoint1, lblGOATPoint2, lblGOATPoint3, lblGOATPoint4, lblGOATPoint6, lblGOATPoint7, lblGOATPoint8,
			lblGOATPoint9, lblGOATPoint10, lblGOATPoint111, lblGOATPoint12;
	private JLabel lblImgPlayer1, lblImgPlayer2, lblImgWinner;
	private JLabel lblWinner;
	private JLabel lblMaxPointsSlam;
	private JLabel lblMaxPointsM1000;
	private JLabel lblMaxPointsATP500;
	private JLabel lblMaxPointsATP250;
	private JLabel lblMaxPointsMasters;
	private JLabel lblMaxPointsOlympics;
	private JLabel lblPlacings;
	private JLabel lblSlam;
	private JLabel lblPlacingsR128, lblPlacingsR64, lblPlacingsR32, lblPlacingsR16, lblPlacingsQF, lblPlacingsSF,
			lblPlacingsF, lblPlacingsW;

	private JMenuItem mntmHomeFederer2, mntmHomeNadal2;

	private JButton btnCalculate;

	private ImageIcon iReportPlayer1, iReportPlayer2, iReportFederer, iReportNadal;

	private JRadioButtonMenuItem rdbPlacingsTML;
	private JRadioButtonMenuItem rdbPlacingsATP;
	private ButtonGroup buttonGroup;
	private Placings placings;
	private JMenuBar menuBarPlayer2;
	private JMenu mnMenuPlayer2;
	
	private JButton btnStopSimulation;
	private JButton btnStartSimulation;
	private Timer timer;
	
	private JTextField textFieldSimulationNumber1;
	private JTextField textFieldSimulationNumber2;

	private int numberSimulation1 = 0;
	private int numberSimulation2 = 0;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tennis = new Goat();
					AppGUI window = new AppGUI();
					window.frmTennismylife.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTennismylife = new JFrame();
		frmTennismylife.setBackground(Color.WHITE);
		frmTennismylife.setTitle("www.tennismylife.org");
		frmTennismylife.setBounds(0, 0, 1280, 900);
		frmTennismylife.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		placings = new Placings("TML");

		homePlayerPanel = new JPanel();
		frmTennismylife.getContentPane().add(homePlayerPanel);
		homePlayerPanel.setLayout(null);

		menuBarPlayer2 = new JMenuBar();
		menuBarPlayer2.setBounds(50, 0, 70, 20);
		homePlayerPanel.add(menuBarPlayer2);

		mnMenuPlayer2 = new JMenu("Player 2");
		menuBarPlayer2.add(mnMenuPlayer2);

		mntmHomeFederer2 = new JMenuItem("Federer");
		mnMenuPlayer2.add(mntmHomeFederer2);

		mntmHomeNadal2 = new JMenuItem("Nadal");
		mnMenuPlayer2.add(mntmHomeNadal2);

		menuBarPlayer1 = new JMenuBar();
		menuBarPlayer1.setToolTipText("");
		menuBarPlayer1.setBounds(0, 0, 50, 20);

		homePlayerPanel.add(menuBarPlayer1);

		mnMenuPlayer1 = new JMenu("Player1");
		menuBarPlayer1.add(mnMenuPlayer1);

		mntmHomeFederer1 = new JMenuItem("Federer");
		mnMenuPlayer1.add(mntmHomeFederer1);

		mntmHomeNadal1 = new JMenuItem("Nadal");
		mnMenuPlayer1.add(mntmHomeNadal1);
		homePlayerPanel.setVisible(true);

		mntmHomeFederer1.addActionListener(this);
		mntmHomeNadal1.addActionListener(this);
		mntmHomeFederer2.addActionListener(this);
		mntmHomeNadal2.addActionListener(this);

		lblPlacings = new JLabel("Placings");
		lblPlacings.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPlacings.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlacings.setBounds(270, 13, 56, 16);
		homePlayerPanel.add(lblPlacings);

		lblSlam = new JLabel("Slam");
		lblSlam.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSlam.setHorizontalAlignment(SwingConstants.CENTER);
		lblSlam.setBounds(276, 90, 50, 20);
		homePlayerPanel.add(lblSlam);

		lblM1000 = new JLabel("Masters 1000");
		lblM1000.setHorizontalAlignment(SwingConstants.CENTER);
		lblM1000.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblM1000.setBounds(250, 200, 100, 20);
		homePlayerPanel.add(lblM1000);

		lblATP500 = new JLabel("ATP 500");
		lblATP500.setHorizontalAlignment(SwingConstants.CENTER);
		lblATP500.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblATP500.setBounds(270, 310, 70, 20);
		homePlayerPanel.add(lblATP500);

		lblATP250 = new JLabel("ATP 250");
		lblATP250.setHorizontalAlignment(SwingConstants.CENTER);
		lblATP250.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblATP250.setBounds(270, 420, 70, 20);
		homePlayerPanel.add(lblATP250);

		lblPlacingsR128 = new JLabel("R128");
		lblPlacingsR128.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlacingsR128.setBounds(100, 31, 50, 20);
		homePlayerPanel.add(lblPlacingsR128);

		lblPlacingsR64 = new JLabel("R64");
		lblPlacingsR64.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlacingsR64.setBounds(150, 31, 50, 20);
		homePlayerPanel.add(lblPlacingsR64);

		lblPlacingsR32 = new JLabel("R32");
		lblPlacingsR32.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlacingsR32.setBounds(200, 31, 50, 20);
		homePlayerPanel.add(lblPlacingsR32);

		lblPlacingsR16 = new JLabel("R16");
		lblPlacingsR16.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlacingsR16.setBounds(250, 31, 50, 20);
		homePlayerPanel.add(lblPlacingsR16);

		lblPlacingsQF = new JLabel("QF");
		lblPlacingsQF.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlacingsQF.setBounds(300, 31, 50, 20);
		homePlayerPanel.add(lblPlacingsQF);

		lblPlacingsSF = new JLabel("SF");
		lblPlacingsSF.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlacingsSF.setBounds(350, 31, 50, 20);
		homePlayerPanel.add(lblPlacingsSF);

		lblPlacingsF = new JLabel("F");
		lblPlacingsF.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlacingsF.setBounds(400, 31, 50, 20);
		homePlayerPanel.add(lblPlacingsF);

		lblPlacingsW = new JLabel("W");
		lblPlacingsW.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlacingsW.setBounds(450, 31, 50, 20);
		homePlayerPanel.add(lblPlacingsW);

		lblGOATPoint1 = new JLabel("GOAT Points");
		lblGOATPoint1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGOATPoint1.setHorizontalAlignment(SwingConstants.CENTER);
		lblGOATPoint1.setBounds(10, 130, 90, 20);
		homePlayerPanel.add(lblGOATPoint1);

		textFieldPlacingsR128 = new JTextField();
		textFieldPlacingsR128.setHorizontalAlignment(SwingConstants.CENTER);

		textFieldPlacingsR128.setBounds(100, 50, 50, 20);
		homePlayerPanel.add(textFieldPlacingsR128);
		textFieldPlacingsR128.setColumns(10);

		textFieldPlacingsR64 = new JTextField();

		textFieldPlacingsR64.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPlacingsR64.setBounds(150, 50, 50, 20);
		homePlayerPanel.add(textFieldPlacingsR64);
		textFieldPlacingsR64.setColumns(10);

		textFieldPlacingsR32 = new JTextField();

		textFieldPlacingsR32.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPlacingsR32.setBounds(200, 50, 50, 20);
		homePlayerPanel.add(textFieldPlacingsR32);
		textFieldPlacingsR32.setColumns(10);

		textFieldPlacingsR16 = new JTextField();

		textFieldPlacingsR16.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPlacingsR16.setBounds(250, 50, 50, 20);
		homePlayerPanel.add(textFieldPlacingsR16);
		textFieldPlacingsR16.setColumns(10);

		textFieldPlacingsQF = new JTextField();
		textFieldPlacingsQF.setHorizontalAlignment(SwingConstants.CENTER);

		textFieldPlacingsQF.setBounds(300, 50, 50, 20);
		homePlayerPanel.add(textFieldPlacingsQF);
		textFieldPlacingsQF.setColumns(10);

		textFieldPlacingsSF = new JTextField();

		textFieldPlacingsSF.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldPlacingsSF.setBounds(350, 50, 50, 20);
		homePlayerPanel.add(textFieldPlacingsSF);
		textFieldPlacingsSF.setColumns(10);

		textFieldPlacingsF = new JTextField();
		textFieldPlacingsF.setHorizontalAlignment(SwingConstants.CENTER);

		textFieldPlacingsF.setBounds(400, 50, 50, 20);
		homePlayerPanel.add(textFieldPlacingsF);
		textFieldPlacingsF.setColumns(10);

		textFieldPlacingsW = new JTextField();
		textFieldPlacingsW.setHorizontalAlignment(SwingConstants.CENTER);

		textFieldPlacingsW.setBounds(450, 50, 50, 20);
		homePlayerPanel.add(textFieldPlacingsW);
		textFieldPlacingsW.setColumns(10);

		setPlacings();

		textFieldSlamR128Player1 = new JTextField();
		textFieldSlamR128Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSlamR128Player1.setBounds(100, 110, 50, 20);
		homePlayerPanel.add(textFieldSlamR128Player1);
		textFieldSlamR128Player1.setColumns(10);

		textFieldSlamR64Player1 = new JTextField();
		textFieldSlamR64Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSlamR64Player1.setBounds(150, 110, 50, 20);
		homePlayerPanel.add(textFieldSlamR64Player1);
		textFieldSlamR64Player1.setColumns(10);

		textFieldSlamR32Player1 = new JTextField();
		textFieldSlamR32Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSlamR32Player1.setBounds(200, 110, 50, 20);
		homePlayerPanel.add(textFieldSlamR32Player1);
		textFieldSlamR32Player1.setColumns(10);

		textFieldSlamR16Player1 = new JTextField();
		textFieldSlamR16Player1.setSize(50, 20);
		textFieldSlamR16Player1.setLocation(250, 90);
		textFieldSlamR16Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSlamR16Player1.setBounds(250, 110, 50, 20);
		homePlayerPanel.add(textFieldSlamR16Player1);
		textFieldSlamR16Player1.setColumns(10);

		textFieldSlamQFPlayer1 = new JTextField();
		textFieldSlamQFPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSlamQFPlayer1.setBounds(300, 110, 50, 20);
		homePlayerPanel.add(textFieldSlamQFPlayer1);
		textFieldSlamQFPlayer1.setColumns(10);

		textFieldSlamSFPlayer1 = new JTextField();
		textFieldSlamSFPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSlamSFPlayer1.setBounds(350, 110, 50, 20);
		homePlayerPanel.add(textFieldSlamSFPlayer1);
		textFieldSlamSFPlayer1.setColumns(10);

		textFieldSlamFPlayer1 = new JTextField();
		textFieldSlamFPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSlamFPlayer1.setBounds(400, 110, 50, 20);
		homePlayerPanel.add(textFieldSlamFPlayer1);
		textFieldSlamFPlayer1.setColumns(10);

		textFieldSlamWPlayer1 = new JTextField();
		textFieldSlamWPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSlamWPlayer1.setBounds(450, 110, 50, 20);
		homePlayerPanel.add(textFieldSlamWPlayer1);
		textFieldSlamWPlayer1.setColumns(10);

		textFieldSlamMaxPoints = new JTextField();
		textFieldSlamMaxPoints.setBackground(Color.GREEN);
		textFieldSlamMaxPoints.setForeground(Color.BLACK);
		textFieldSlamMaxPoints.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSlamMaxPoints.setText("2000");
		textFieldSlamMaxPoints.setBounds(500, 110, 50, 20);
		homePlayerPanel.add(textFieldSlamMaxPoints);
		textFieldSlamMaxPoints.setColumns(10);

		textFieldCountSlamR128Player1 = new JTextField();
		textFieldCountSlamR128Player1.setEditable(false);
		textFieldCountSlamR128Player1.setBounds(100, 130, 50, 20);
		homePlayerPanel.add(textFieldCountSlamR128Player1);
		textFieldCountSlamR128Player1.setColumns(10);

		textFieldCountSlamR64Player1 = new JTextField();
		textFieldCountSlamR64Player1.setEditable(false);
		textFieldCountSlamR64Player1.setBounds(150, 130, 50, 20);
		homePlayerPanel.add(textFieldCountSlamR64Player1);
		textFieldCountSlamR64Player1.setColumns(10);

		textFieldCountSlamR32Player1 = new JTextField();
		textFieldCountSlamR32Player1.setEditable(false);
		textFieldCountSlamR32Player1.setBounds(200, 130, 50, 20);
		homePlayerPanel.add(textFieldCountSlamR32Player1);
		textFieldCountSlamR32Player1.setColumns(10);

		textFieldCountSlamR16Player1 = new JTextField();
		textFieldCountSlamR16Player1.setEditable(false);
		textFieldCountSlamR16Player1.setBounds(250, 130, 50, 20);
		homePlayerPanel.add(textFieldCountSlamR16Player1);
		textFieldCountSlamR16Player1.setColumns(10);

		textFieldCountSlamQFPlayer1 = new JTextField();
		textFieldCountSlamQFPlayer1.setEditable(false);
		textFieldCountSlamQFPlayer1.setBounds(300, 130, 50, 20);
		homePlayerPanel.add(textFieldCountSlamQFPlayer1);
		textFieldCountSlamQFPlayer1.setColumns(10);

		textFieldCountSlamSFPlayer1 = new JTextField();
		textFieldCountSlamSFPlayer1.setEditable(false);
		textFieldCountSlamSFPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountSlamSFPlayer1.setBounds(350, 130, 50, 20);
		homePlayerPanel.add(textFieldCountSlamSFPlayer1);
		textFieldCountSlamSFPlayer1.setColumns(10);

		textFieldCountSlamFPlayer1 = new JTextField();
		textFieldCountSlamFPlayer1.setEditable(false);
		textFieldCountSlamFPlayer1.setBounds(400, 130, 50, 20);
		homePlayerPanel.add(textFieldCountSlamFPlayer1);
		textFieldCountSlamFPlayer1.setColumns(10);

		textFieldCountSlamWPlayer1 = new JTextField();
		textFieldCountSlamWPlayer1.setEditable(false);
		textFieldCountSlamWPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountSlamWPlayer1.setBounds(450, 130, 50, 20);
		homePlayerPanel.add(textFieldCountSlamWPlayer1);
		textFieldCountSlamWPlayer1.setColumns(10);

		textFieldCountSlamSumPlayer1 = new JTextField();
		textFieldCountSlamSumPlayer1.setEditable(false);
		textFieldCountSlamSumPlayer1.setBounds(500, 130, 50, 20);
		homePlayerPanel.add(textFieldCountSlamSumPlayer1);
		textFieldCountSlamSumPlayer1.setColumns(10);

		textFieldM1000R128Player1 = new JTextField();
		textFieldM1000R128Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldM1000R128Player1.setBounds(100, 220, 50, 20);
		homePlayerPanel.add(textFieldM1000R128Player1);
		textFieldM1000R128Player1.setColumns(10);

		textFieldM1000R64Player1 = new JTextField();
		textFieldM1000R64Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldM1000R64Player1.setBounds(150, 220, 50, 20);
		homePlayerPanel.add(textFieldM1000R64Player1);
		textFieldM1000R64Player1.setColumns(10);

		textFieldM1000R32Player1 = new JTextField();
		textFieldM1000R32Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldM1000R32Player1.setBounds(200, 220, 50, 20);
		homePlayerPanel.add(textFieldM1000R32Player1);
		textFieldM1000R32Player1.setColumns(10);

		textFieldM1000R16Player1 = new JTextField();
		textFieldM1000R16Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldM1000R16Player1.setBounds(250, 220, 50, 20);
		homePlayerPanel.add(textFieldM1000R16Player1);
		textFieldM1000R16Player1.setColumns(10);

		textFieldM1000QFPlayer1 = new JTextField();
		textFieldM1000QFPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldM1000QFPlayer1.setBounds(300, 220, 50, 20);
		homePlayerPanel.add(textFieldM1000QFPlayer1);
		textFieldM1000QFPlayer1.setColumns(10);

		textFieldM1000SFPlayer1 = new JTextField();
		textFieldM1000SFPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldM1000SFPlayer1.setBounds(350, 220, 50, 20);
		homePlayerPanel.add(textFieldM1000SFPlayer1);
		textFieldM1000SFPlayer1.setColumns(10);

		textFieldM1000FPlayer1 = new JTextField();
		textFieldM1000FPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldM1000FPlayer1.setBounds(400, 220, 50, 20);
		homePlayerPanel.add(textFieldM1000FPlayer1);
		textFieldM1000FPlayer1.setColumns(10);

		textFieldM1000WPlayer1 = new JTextField();
		textFieldM1000WPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldM1000WPlayer1.setBounds(450, 220, 50, 20);
		homePlayerPanel.add(textFieldM1000WPlayer1);
		textFieldM1000WPlayer1.setColumns(10);

		textFieldM1000MaxPoints = new JTextField();
		textFieldM1000MaxPoints.setBackground(Color.RED);
		textFieldM1000MaxPoints.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldM1000MaxPoints.setText("1000");
		textFieldM1000MaxPoints.setBounds(500, 220, 50, 20);
		homePlayerPanel.add(textFieldM1000MaxPoints);
		textFieldM1000MaxPoints.setColumns(10);

		textFieldCountM1000R128Player1 = new JTextField();
		textFieldCountM1000R128Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountM1000R128Player1.setEditable(false);
		textFieldCountM1000R128Player1.setBounds(100, 240, 50, 20);
		homePlayerPanel.add(textFieldCountM1000R128Player1);
		textFieldCountM1000R128Player1.setColumns(10);

		textFieldCountM1000R64Player1 = new JTextField();
		textFieldCountM1000R64Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountM1000R64Player1.setEditable(false);
		textFieldCountM1000R64Player1.setBounds(150, 240, 50, 20);
		homePlayerPanel.add(textFieldCountM1000R64Player1);
		textFieldCountM1000R64Player1.setColumns(10);

		textFieldCountM1000R32Player1 = new JTextField();
		textFieldCountM1000R32Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountM1000R32Player1.setEditable(false);
		textFieldCountM1000R32Player1.setBounds(200, 240, 50, 20);
		homePlayerPanel.add(textFieldCountM1000R32Player1);
		textFieldCountM1000R32Player1.setColumns(10);

		textFieldCountM1000R16Player1 = new JTextField();
		textFieldCountM1000R16Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountM1000R16Player1.setEditable(false);
		textFieldCountM1000R16Player1.setBounds(250, 240, 50, 20);
		homePlayerPanel.add(textFieldCountM1000R16Player1);
		textFieldCountM1000R16Player1.setColumns(10);

		lblGOATPoint3 = new JLabel("GOAT Points");
		lblGOATPoint3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGOATPoint3.setHorizontalAlignment(SwingConstants.CENTER);
		lblGOATPoint3.setBounds(10, 240, 90, 20);
		homePlayerPanel.add(lblGOATPoint3);

		textFieldCountM1000QFPlayer1 = new JTextField();
		textFieldCountM1000QFPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountM1000QFPlayer1.setEditable(false);
		textFieldCountM1000QFPlayer1.setBounds(300, 240, 50, 20);
		homePlayerPanel.add(textFieldCountM1000QFPlayer1);
		textFieldCountM1000QFPlayer1.setColumns(10);

		textFieldCountM1000SFPlayer1 = new JTextField();
		textFieldCountM1000SFPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountM1000SFPlayer1.setEditable(false);
		textFieldCountM1000SFPlayer1.setBounds(350, 240, 50, 20);
		homePlayerPanel.add(textFieldCountM1000SFPlayer1);
		textFieldCountM1000SFPlayer1.setColumns(10);

		textFieldCountM1000FPlayer1 = new JTextField();
		textFieldCountM1000FPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountM1000FPlayer1.setEditable(false);
		textFieldCountM1000FPlayer1.setBounds(400, 240, 50, 20);
		homePlayerPanel.add(textFieldCountM1000FPlayer1);
		textFieldCountM1000FPlayer1.setColumns(10);

		textFieldCountM1000WPlayer1 = new JTextField();
		textFieldCountM1000WPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountM1000WPlayer1.setEditable(false);
		textFieldCountM1000WPlayer1.setBounds(450, 240, 50, 20);
		homePlayerPanel.add(textFieldCountM1000WPlayer1);
		textFieldCountM1000WPlayer1.setColumns(10);

		textFieldCountM1000SumPlayer1 = new JTextField();
		textFieldCountM1000SumPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountM1000SumPlayer1.setEditable(false);
		textFieldCountM1000SumPlayer1.setBounds(500, 240, 50, 20);
		homePlayerPanel.add(textFieldCountM1000SumPlayer1);
		textFieldCountM1000SumPlayer1.setColumns(10);

		textFieldATP500R128Player1 = new JTextField();
		textFieldATP500R128Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP500R128Player1.setBounds(100, 330, 50, 20);
		homePlayerPanel.add(textFieldATP500R128Player1);
		textFieldATP500R128Player1.setColumns(10);

		textFieldATP500R64Player1 = new JTextField();
		textFieldATP500R64Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP500R64Player1.setBounds(150, 330, 50, 20);
		homePlayerPanel.add(textFieldATP500R64Player1);
		textFieldATP500R64Player1.setColumns(10);

		textFieldATP500R32Player1 = new JTextField();
		textFieldATP500R32Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP500R32Player1.setBounds(200, 330, 50, 20);
		homePlayerPanel.add(textFieldATP500R32Player1);
		textFieldATP500R32Player1.setColumns(10);

		textFieldATP500R16Player1 = new JTextField();
		textFieldATP500R16Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP500R16Player1.setBounds(250, 330, 50, 20);
		homePlayerPanel.add(textFieldATP500R16Player1);
		textFieldATP500R16Player1.setColumns(10);

		textFieldATP500QFPlayer1 = new JTextField();
		textFieldATP500QFPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP500QFPlayer1.setBounds(300, 330, 50, 20);
		homePlayerPanel.add(textFieldATP500QFPlayer1);
		textFieldATP500QFPlayer1.setColumns(10);

		textFieldATP500SFPlayer1 = new JTextField();
		textFieldATP500SFPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP500SFPlayer1.setBounds(350, 330, 50, 20);
		homePlayerPanel.add(textFieldATP500SFPlayer1);
		textFieldATP500SFPlayer1.setColumns(10);

		textFieldATP500FPlayer1 = new JTextField();
		textFieldATP500FPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP500FPlayer1.setBounds(400, 330, 50, 20);
		homePlayerPanel.add(textFieldATP500FPlayer1);
		textFieldATP500FPlayer1.setColumns(10);

		textFieldATP500WPlayer1 = new JTextField();
		textFieldATP500WPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP500WPlayer1.setBounds(450, 330, 50, 20);
		homePlayerPanel.add(textFieldATP500WPlayer1);
		textFieldATP500WPlayer1.setColumns(10);

		textFieldATP500MaxPoints = new JTextField();
		textFieldATP500MaxPoints.setBackground(Color.ORANGE);
		textFieldATP500MaxPoints.setText("500");
		textFieldATP500MaxPoints.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP500MaxPoints.setBounds(500, 330, 50, 20);
		homePlayerPanel.add(textFieldATP500MaxPoints);
		textFieldATP500MaxPoints.setColumns(10);

		JLabel lblGOATPoint5 = new JLabel("GOAT Points");
		lblGOATPoint5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGOATPoint5.setHorizontalAlignment(SwingConstants.CENTER);
		lblGOATPoint5.setBounds(20, 350, 80, 20);
		homePlayerPanel.add(lblGOATPoint5);

		textFieldCountATP500R128Player1 = new JTextField();
		textFieldCountATP500R128Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP500R128Player1.setEditable(false);
		textFieldCountATP500R128Player1.setBounds(100, 350, 50, 20);
		homePlayerPanel.add(textFieldCountATP500R128Player1);
		textFieldCountATP500R128Player1.setColumns(10);

		textFieldCountATP500R64Player1 = new JTextField();
		textFieldCountATP500R64Player1.setEditable(false);
		textFieldCountATP500R64Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP500R64Player1.setBounds(150, 350, 50, 20);
		homePlayerPanel.add(textFieldCountATP500R64Player1);
		textFieldCountATP500R64Player1.setColumns(10);

		textFieldCountATP500R32Player1 = new JTextField();
		textFieldCountATP500R32Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP500R32Player1.setEditable(false);
		textFieldCountATP500R32Player1.setBounds(200, 350, 50, 20);
		homePlayerPanel.add(textFieldCountATP500R32Player1);
		textFieldCountATP500R32Player1.setColumns(10);

		textFieldCountATP500R16Player1 = new JTextField();
		textFieldCountATP500R16Player1.setEditable(false);
		textFieldCountATP500R16Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP500R16Player1.setBounds(250, 350, 50, 20);
		homePlayerPanel.add(textFieldCountATP500R16Player1);
		textFieldCountATP500R16Player1.setColumns(10);

		textFieldCountATP500QFPlayer1 = new JTextField();
		textFieldCountATP500QFPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP500QFPlayer1.setEditable(false);
		textFieldCountATP500QFPlayer1.setBounds(300, 350, 50, 20);
		homePlayerPanel.add(textFieldCountATP500QFPlayer1);
		textFieldCountATP500QFPlayer1.setColumns(10);

		textFieldCountATP500SFPlayer1 = new JTextField();
		textFieldCountATP500SFPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP500SFPlayer1.setEditable(false);
		textFieldCountATP500SFPlayer1.setBounds(350, 350, 50, 20);
		homePlayerPanel.add(textFieldCountATP500SFPlayer1);
		textFieldCountATP500SFPlayer1.setColumns(10);

		textFieldCountATP500FPlayer1 = new JTextField();
		textFieldCountATP500FPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP500FPlayer1.setEditable(false);
		textFieldCountATP500FPlayer1.setBounds(400, 350, 50, 20);
		homePlayerPanel.add(textFieldCountATP500FPlayer1);
		textFieldCountATP500FPlayer1.setColumns(10);

		textFieldCountATP500WPlayer1 = new JTextField();
		textFieldCountATP500WPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP500WPlayer1.setEditable(false);
		textFieldCountATP500WPlayer1.setBounds(450, 350, 50, 20);
		homePlayerPanel.add(textFieldCountATP500WPlayer1);
		textFieldCountATP500WPlayer1.setColumns(10);

		textFieldCountATP500SumPlayer1 = new JTextField();
		textFieldCountATP500SumPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP500SumPlayer1.setEditable(false);
		textFieldCountATP500SumPlayer1.setBounds(500, 350, 50, 20);
		homePlayerPanel.add(textFieldCountATP500SumPlayer1);
		textFieldCountATP500SumPlayer1.setColumns(10);

		textFieldATP250R128Player1 = new JTextField();
		textFieldATP250R128Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP250R128Player1.setBounds(100, 440, 50, 20);
		homePlayerPanel.add(textFieldATP250R128Player1);
		textFieldATP250R128Player1.setColumns(10);

		textFieldATP250R64Player1 = new JTextField();
		textFieldATP250R64Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP250R64Player1.setBounds(150, 440, 50, 20);
		homePlayerPanel.add(textFieldATP250R64Player1);
		textFieldATP250R64Player1.setColumns(10);

		textFieldATP250R32Player1 = new JTextField();
		textFieldATP250R32Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP250R32Player1.setBounds(200, 440, 50, 20);
		homePlayerPanel.add(textFieldATP250R32Player1);
		textFieldATP250R32Player1.setColumns(10);

		textFieldATP250R16Player1 = new JTextField();
		textFieldATP250R16Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP250R16Player1.setBounds(250, 440, 50, 20);
		homePlayerPanel.add(textFieldATP250R16Player1);
		textFieldATP250R16Player1.setColumns(10);

		textFieldATP250QFPlayer1 = new JTextField();
		textFieldATP250QFPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP250QFPlayer1.setBounds(300, 440, 50, 20);
		homePlayerPanel.add(textFieldATP250QFPlayer1);
		textFieldATP250QFPlayer1.setColumns(10);

		textFieldATP250SFPlayer1 = new JTextField();
		textFieldATP250SFPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP250SFPlayer1.setBounds(350, 440, 50, 20);
		homePlayerPanel.add(textFieldATP250SFPlayer1);
		textFieldATP250SFPlayer1.setColumns(10);

		textFieldATP250FPlayer1 = new JTextField();
		textFieldATP250FPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP250FPlayer1.setBounds(400, 440, 50, 20);
		homePlayerPanel.add(textFieldATP250FPlayer1);
		textFieldATP250FPlayer1.setColumns(10);

		textFieldATP250WPlayer1 = new JTextField();
		textFieldATP250WPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP250WPlayer1.setBounds(450, 440, 50, 20);
		homePlayerPanel.add(textFieldATP250WPlayer1);
		textFieldATP250WPlayer1.setColumns(10);

		textFieldATP250MaxPoints = new JTextField();
		textFieldATP250MaxPoints.setBackground(Color.CYAN);
		textFieldATP250MaxPoints.setText("250");
		textFieldATP250MaxPoints.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP250MaxPoints.setBounds(500, 440, 50, 20);
		homePlayerPanel.add(textFieldATP250MaxPoints);
		textFieldATP250MaxPoints.setColumns(10);

		textFieldSlamR128Player2 = new JTextField();
		textFieldSlamR128Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSlamR128Player2.setColumns(10);
		textFieldSlamR128Player2.setBounds(100, 150, 50, 20);
		homePlayerPanel.add(textFieldSlamR128Player2);

		textFieldSlamR64Player2 = new JTextField();
		textFieldSlamR64Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSlamR64Player2.setColumns(10);
		textFieldSlamR64Player2.setBounds(150, 150, 50, 20);
		homePlayerPanel.add(textFieldSlamR64Player2);

		textFieldSlamR32Player2 = new JTextField();
		textFieldSlamR32Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSlamR32Player2.setColumns(10);
		textFieldSlamR32Player2.setBounds(200, 150, 50, 20);
		homePlayerPanel.add(textFieldSlamR32Player2);

		textFieldSlamR16Player2 = new JTextField();
		textFieldSlamR16Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSlamR16Player2.setColumns(10);
		textFieldSlamR16Player2.setBounds(250, 150, 50, 20);
		homePlayerPanel.add(textFieldSlamR16Player2);

		textFieldSlamQFPlayer2 = new JTextField();
		textFieldSlamQFPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSlamQFPlayer2.setColumns(10);
		textFieldSlamQFPlayer2.setBounds(300, 150, 50, 20);
		homePlayerPanel.add(textFieldSlamQFPlayer2);

		textFieldSlamSFPlayer2 = new JTextField();
		textFieldSlamSFPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSlamSFPlayer2.setColumns(10);
		textFieldSlamSFPlayer2.setBounds(350, 150, 50, 20);
		homePlayerPanel.add(textFieldSlamSFPlayer2);

		textFieldSlamFPlayer2 = new JTextField();
		textFieldSlamFPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSlamFPlayer2.setColumns(10);
		textFieldSlamFPlayer2.setBounds(400, 150, 50, 20);
		homePlayerPanel.add(textFieldSlamFPlayer2);

		textFieldSlamWPlayer2 = new JTextField();
		textFieldSlamWPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSlamWPlayer2.setColumns(10);
		textFieldSlamWPlayer2.setBounds(450, 150, 50, 20);
		homePlayerPanel.add(textFieldSlamWPlayer2);

		textFieldCountSlamR128Player2 = new JTextField();
		textFieldCountSlamR128Player2.setEditable(false);
		textFieldCountSlamR128Player2.setColumns(10);
		textFieldCountSlamR128Player2.setBounds(100, 170, 50, 20);
		homePlayerPanel.add(textFieldCountSlamR128Player2);

		textFieldCountSlamR64Player2 = new JTextField();
		textFieldCountSlamR64Player2.setEditable(false);
		textFieldCountSlamR64Player2.setColumns(10);
		textFieldCountSlamR64Player2.setBounds(150, 170, 50, 20);
		homePlayerPanel.add(textFieldCountSlamR64Player2);

		textFieldCountSlamR32Player2 = new JTextField();
		textFieldCountSlamR32Player2.setEditable(false);
		textFieldCountSlamR32Player2.setColumns(10);
		textFieldCountSlamR32Player2.setBounds(200, 170, 50, 20);
		homePlayerPanel.add(textFieldCountSlamR32Player2);

		textFieldCountSlamR16Player2 = new JTextField();
		textFieldCountSlamR16Player2.setEditable(false);
		textFieldCountSlamR16Player2.setColumns(10);
		textFieldCountSlamR16Player2.setBounds(250, 170, 50, 20);
		homePlayerPanel.add(textFieldCountSlamR16Player2);

		textFieldCountSlamQFPlayer2 = new JTextField();
		textFieldCountSlamQFPlayer2.setEditable(false);
		textFieldCountSlamQFPlayer2.setColumns(10);
		textFieldCountSlamQFPlayer2.setBounds(300, 170, 50, 20);
		homePlayerPanel.add(textFieldCountSlamQFPlayer2);

		textFieldCountSlamSFPlayer2 = new JTextField();
		textFieldCountSlamSFPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountSlamSFPlayer2.setEditable(false);
		textFieldCountSlamSFPlayer2.setColumns(10);
		textFieldCountSlamSFPlayer2.setBounds(350, 170, 50, 20);
		homePlayerPanel.add(textFieldCountSlamSFPlayer2);

		textFieldCountSlamFPlayer2 = new JTextField();
		textFieldCountSlamFPlayer2.setEditable(false);
		textFieldCountSlamFPlayer2.setColumns(10);
		textFieldCountSlamFPlayer2.setBounds(400, 170, 50, 20);
		homePlayerPanel.add(textFieldCountSlamFPlayer2);

		textFieldCountSlamWPlayer2 = new JTextField();
		textFieldCountSlamWPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountSlamWPlayer2.setEditable(false);
		textFieldCountSlamWPlayer2.setColumns(10);
		textFieldCountSlamWPlayer2.setBounds(450, 170, 50, 20);
		homePlayerPanel.add(textFieldCountSlamWPlayer2);

		textFieldCountSlamSumPlayer2 = new JTextField();
		textFieldCountSlamSumPlayer2.setEditable(false);
		textFieldCountSlamSumPlayer2.setColumns(10);
		textFieldCountSlamSumPlayer2.setBounds(500, 170, 50, 20);
		homePlayerPanel.add(textFieldCountSlamSumPlayer2);

		lblGOATPoint2 = new JLabel("GOAT Points");
		lblGOATPoint2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGOATPoint2.setHorizontalAlignment(SwingConstants.CENTER);
		lblGOATPoint2.setBounds(10, 172, 90, 20);
		homePlayerPanel.add(lblGOATPoint2);

		textFieldM1000R128Player2 = new JTextField();
		textFieldM1000R128Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldM1000R128Player2.setColumns(10);
		textFieldM1000R128Player2.setBounds(100, 260, 50, 20);
		homePlayerPanel.add(textFieldM1000R128Player2);

		textFieldM1000R64Player2 = new JTextField();
		textFieldM1000R64Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldM1000R64Player2.setColumns(10);
		textFieldM1000R64Player2.setBounds(150, 260, 50, 20);
		homePlayerPanel.add(textFieldM1000R64Player2);

		textFieldM1000R32Player2 = new JTextField();
		textFieldM1000R32Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldM1000R32Player2.setColumns(10);
		textFieldM1000R32Player2.setBounds(200, 260, 50, 20);
		homePlayerPanel.add(textFieldM1000R32Player2);

		textFieldM1000R16Player2 = new JTextField();
		textFieldM1000R16Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldM1000R16Player2.setColumns(10);
		textFieldM1000R16Player2.setBounds(250, 260, 50, 20);
		homePlayerPanel.add(textFieldM1000R16Player2);

		textFieldM1000QFPlayer2 = new JTextField();
		textFieldM1000QFPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldM1000QFPlayer2.setColumns(10);
		textFieldM1000QFPlayer2.setBounds(300, 260, 50, 20);
		homePlayerPanel.add(textFieldM1000QFPlayer2);

		textFieldM1000SFPlayer2 = new JTextField();
		textFieldM1000SFPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldM1000SFPlayer2.setColumns(10);
		textFieldM1000SFPlayer2.setBounds(350, 260, 50, 20);
		homePlayerPanel.add(textFieldM1000SFPlayer2);

		textFieldM1000FPlayer2 = new JTextField();
		textFieldM1000FPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldM1000FPlayer2.setColumns(10);
		textFieldM1000FPlayer2.setBounds(400, 260, 50, 20);
		homePlayerPanel.add(textFieldM1000FPlayer2);

		textFieldM1000WPlayer2 = new JTextField();
		textFieldM1000WPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldM1000WPlayer2.setColumns(10);
		textFieldM1000WPlayer2.setBounds(450, 260, 50, 20);
		homePlayerPanel.add(textFieldM1000WPlayer2);

		textFieldCountM1000R128Player2 = new JTextField();
		textFieldCountM1000R128Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountM1000R128Player2.setEditable(false);
		textFieldCountM1000R128Player2.setColumns(10);
		textFieldCountM1000R128Player2.setBounds(100, 280, 50, 20);
		homePlayerPanel.add(textFieldCountM1000R128Player2);

		textFieldCountM1000R64Player2 = new JTextField();
		textFieldCountM1000R64Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountM1000R64Player2.setEditable(false);
		textFieldCountM1000R64Player2.setColumns(10);
		textFieldCountM1000R64Player2.setBounds(150, 280, 50, 20);
		homePlayerPanel.add(textFieldCountM1000R64Player2);

		textFieldCountM1000R32Player2 = new JTextField();
		textFieldCountM1000R32Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountM1000R32Player2.setEditable(false);
		textFieldCountM1000R32Player2.setColumns(10);
		textFieldCountM1000R32Player2.setBounds(200, 280, 50, 20);
		homePlayerPanel.add(textFieldCountM1000R32Player2);

		textFieldCountM1000R16Player2 = new JTextField();
		textFieldCountM1000R16Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountM1000R16Player2.setEditable(false);
		textFieldCountM1000R16Player2.setColumns(10);
		textFieldCountM1000R16Player2.setBounds(250, 280, 50, 20);
		homePlayerPanel.add(textFieldCountM1000R16Player2);

		textFieldCountM1000QFPlayer2 = new JTextField();
		textFieldCountM1000QFPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountM1000QFPlayer2.setEditable(false);
		textFieldCountM1000QFPlayer2.setColumns(10);
		textFieldCountM1000QFPlayer2.setBounds(300, 280, 50, 20);
		homePlayerPanel.add(textFieldCountM1000QFPlayer2);

		textFieldCountM1000SFPlayer2 = new JTextField();
		textFieldCountM1000SFPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountM1000SFPlayer2.setEditable(false);
		textFieldCountM1000SFPlayer2.setColumns(10);
		textFieldCountM1000SFPlayer2.setBounds(350, 280, 50, 20);
		homePlayerPanel.add(textFieldCountM1000SFPlayer2);

		textFieldCountM1000FPlayer2 = new JTextField();
		textFieldCountM1000FPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountM1000FPlayer2.setEditable(false);
		textFieldCountM1000FPlayer2.setColumns(10);
		textFieldCountM1000FPlayer2.setBounds(400, 280, 50, 20);
		homePlayerPanel.add(textFieldCountM1000FPlayer2);

		textFieldCountM1000WPlayer2 = new JTextField();
		textFieldCountM1000WPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountM1000WPlayer2.setEditable(false);
		textFieldCountM1000WPlayer2.setColumns(10);
		textFieldCountM1000WPlayer2.setBounds(450, 280, 50, 20);
		homePlayerPanel.add(textFieldCountM1000WPlayer2);

		textFieldCountM1000SumPlayer2 = new JTextField();
		textFieldCountM1000SumPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountM1000SumPlayer2.setEditable(false);
		textFieldCountM1000SumPlayer2.setColumns(10);
		textFieldCountM1000SumPlayer2.setBounds(500, 280, 50, 20);
		homePlayerPanel.add(textFieldCountM1000SumPlayer2);

		PropSlamM1000 = new JTextField();
		PropSlamM1000.setBackground(Color.YELLOW);
		PropSlamM1000.setHorizontalAlignment(SwingConstants.CENTER);
		PropSlamM1000.setText("3.56");
		PropSlamM1000.setBounds(623, 170, 50, 20);
		homePlayerPanel.add(PropSlamM1000);
		PropSlamM1000.setColumns(10);

		lblPropSlamM1000 = new JLabel("Slam / M1000");
		lblPropSlamM1000.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPropSlamM1000.setBounds(607, 132, 100, 16);
		homePlayerPanel.add(lblPropSlamM1000);

		textPlayer1 = new JTextField();
		textPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textPlayer1.setEditable(false);
		textPlayer1.setBounds(862, 484, 100, 20);
		homePlayerPanel.add(textPlayer1);
		textPlayer1.setColumns(10);

		lblPlayer1 = new JLabel("Player 1");
		lblPlayer1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		lblPlayer1.setBounds(862, 461, 100, 16);
		homePlayerPanel.add(lblPlayer1);

		textPlayer2 = new JTextField();
		textPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textPlayer2.setEditable(false);
		textPlayer2.setBounds(1081, 484, 100, 20);
		homePlayerPanel.add(textPlayer2);
		textPlayer2.setColumns(10);

		lblNewLabel = new JLabel("Player 2");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(1081, 461, 100, 16);
		homePlayerPanel.add(lblNewLabel);

		textFieldGOATPointsPlayer1 = new JTextField();
		textFieldGOATPointsPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldGOATPointsPlayer1.setEditable(false);
		textFieldGOATPointsPlayer1.setBounds(872, 517, 70, 20);
		homePlayerPanel.add(textFieldGOATPointsPlayer1);
		textFieldGOATPointsPlayer1.setColumns(10);

		textFieldGOATPointsPlayer2 = new JTextField();
		textFieldGOATPointsPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldGOATPointsPlayer2.setEditable(false);
		textFieldGOATPointsPlayer2.setBounds(1091, 517, 70, 20);
		homePlayerPanel.add(textFieldGOATPointsPlayer2);
		textFieldGOATPointsPlayer2.setColumns(10);

		btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(this);
		btnCalculate.setBounds(1081, 579, 97, 25);
		homePlayerPanel.add(btnCalculate);

		textPlayer1Slam = new JTextField();
		textPlayer1Slam.setFont(new Font("Tahoma", Font.BOLD, 13));
		textPlayer1Slam.setHorizontalAlignment(SwingConstants.CENTER);
		textPlayer1Slam.setEditable(false);
		textPlayer1Slam.setColumns(10);
		textPlayer1Slam.setBounds(0, 109, 100, 20);
		homePlayerPanel.add(textPlayer1Slam);

		textPlayer1M1000 = new JTextField();
		textPlayer1M1000.setFont(new Font("Tahoma", Font.BOLD, 13));
		textPlayer1M1000.setHorizontalAlignment(SwingConstants.CENTER);
		textPlayer1M1000.setEditable(false);
		textPlayer1M1000.setColumns(10);
		textPlayer1M1000.setBounds(0, 219, 100, 20);
		homePlayerPanel.add(textPlayer1M1000);

		textPlayer1ATP500 = new JTextField();
		textPlayer1ATP500.setFont(new Font("Tahoma", Font.BOLD, 13));
		textPlayer1ATP500.setHorizontalAlignment(SwingConstants.CENTER);
		textPlayer1ATP500.setEditable(false);
		textPlayer1ATP500.setColumns(10);
		textPlayer1ATP500.setBounds(0, 330, 100, 20);
		homePlayerPanel.add(textPlayer1ATP500);

		// **** //
		// SLIDER //
		// ****//
		sliderSlamM1000 = new JSlider();
		sliderSlamM1000.setMajorTickSpacing(1);
		sliderSlamM1000.setMinimum(100);
		sliderSlamM1000.setMaximum(500);
		sliderSlamM1000.setPaintLabels(true);
		sliderSlamM1000.setPaintTicks(true);
		sliderSlamM1000.setPreferredSize(new java.awt.Dimension(230, 46));
		Format f = new DecimalFormat("0.0");
		Hashtable<Integer, JComponent> labels = new Hashtable<Integer, JComponent>();
		for (int i = 0; i <= 10; i++) {
			JLabel label2 = new JLabel(f.format(i * 0.1));
			label2.setFont(label2.getFont().deriveFont(Font.PLAIN));
			labels.put(i, label2);
		}
		sliderSlamM1000.setLabelTable(labels);
		sliderSlamM1000.setBounds(562, 200, 170, 20);
		sliderSlamM1000.addChangeListener(new ChangeAction());
		homePlayerPanel.add(sliderSlamM1000);

		sliderM1000ATP500 = new JSlider();
		sliderM1000ATP500.setPreferredSize(new Dimension(230, 46));
		sliderM1000ATP500.setPaintTicks(true);
		sliderM1000ATP500.setPaintLabels(true);
		sliderM1000ATP500.setMinimum(100);
		sliderM1000ATP500.setMaximum(500);
		sliderM1000ATP500.setMajorTickSpacing(1);
		sliderM1000ATP500.setLabelTable(labels);
		sliderM1000ATP500.setBounds(562, 310, 170, 20);
		sliderM1000ATP500.addChangeListener(new ChangeAction());
		homePlayerPanel.add(sliderM1000ATP500);

		sliderATP500ATP250 = new JSlider();
		sliderATP500ATP250.setPreferredSize(new Dimension(230, 46));
		sliderATP500ATP250.setPaintTicks(true);
		sliderATP500ATP250.setPaintLabels(true);
		sliderATP500ATP250.setMinimum(100);
		sliderATP500ATP250.setMaximum(500);
		sliderATP500ATP250.setMajorTickSpacing(1);
		sliderATP500ATP250.setBounds(562, 418, 170, 20);
		sliderATP500ATP250.addChangeListener(new ChangeAction());
		homePlayerPanel.add(sliderATP500ATP250);

		textFieldATP500R128Player2 = new JTextField();
		textFieldATP500R128Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP500R128Player2.setColumns(10);
		textFieldATP500R128Player2.setBounds(100, 370, 50, 20);
		homePlayerPanel.add(textFieldATP500R128Player2);

		textFieldATP500R64Player2 = new JTextField();
		textFieldATP500R64Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP500R64Player2.setColumns(10);
		textFieldATP500R64Player2.setBounds(150, 370, 50, 20);
		homePlayerPanel.add(textFieldATP500R64Player2);

		textFieldATP500R32Player2 = new JTextField();
		textFieldATP500R32Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP500R32Player2.setColumns(10);
		textFieldATP500R32Player2.setBounds(200, 370, 50, 20);
		homePlayerPanel.add(textFieldATP500R32Player2);

		textFieldATP500R16Player2 = new JTextField();
		textFieldATP500R16Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP500R16Player2.setColumns(10);
		textFieldATP500R16Player2.setBounds(250, 370, 50, 20);
		homePlayerPanel.add(textFieldATP500R16Player2);

		textFieldATP500QFPlayer2 = new JTextField();
		textFieldATP500QFPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP500QFPlayer2.setColumns(10);
		textFieldATP500QFPlayer2.setBounds(300, 370, 50, 20);
		homePlayerPanel.add(textFieldATP500QFPlayer2);

		textFieldATP500SFPlayer2 = new JTextField();
		textFieldATP500SFPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP500SFPlayer2.setColumns(10);
		textFieldATP500SFPlayer2.setBounds(350, 370, 50, 20);
		homePlayerPanel.add(textFieldATP500SFPlayer2);

		textFieldATP500FPlayer2 = new JTextField();
		textFieldATP500FPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP500FPlayer2.setColumns(10);
		textFieldATP500FPlayer2.setBounds(400, 370, 50, 20);
		homePlayerPanel.add(textFieldATP500FPlayer2);

		textFieldATP500WPlayer2 = new JTextField();
		textFieldATP500WPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP500WPlayer2.setColumns(10);
		textFieldATP500WPlayer2.setBounds(450, 370, 50, 20);
		homePlayerPanel.add(textFieldATP500WPlayer2);

		textFieldCountATP500R128Player2 = new JTextField();
		textFieldCountATP500R128Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP500R128Player2.setEditable(false);
		textFieldCountATP500R128Player2.setColumns(10);
		textFieldCountATP500R128Player2.setBounds(100, 390, 50, 20);
		homePlayerPanel.add(textFieldCountATP500R128Player2);

		textFieldCountATP500R64Player2 = new JTextField();
		textFieldCountATP500R64Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP500R64Player2.setEditable(false);
		textFieldCountATP500R64Player2.setColumns(10);
		textFieldCountATP500R64Player2.setBounds(150, 390, 50, 20);
		homePlayerPanel.add(textFieldCountATP500R64Player2);

		textFieldCountATP500R32Player2 = new JTextField();
		textFieldCountATP500R32Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP500R32Player2.setEditable(false);
		textFieldCountATP500R32Player2.setColumns(10);
		textFieldCountATP500R32Player2.setBounds(200, 390, 50, 20);
		homePlayerPanel.add(textFieldCountATP500R32Player2);

		textFieldCountATP500R16Player2 = new JTextField();
		textFieldCountATP500R16Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP500R16Player2.setEditable(false);
		textFieldCountATP500R16Player2.setColumns(10);
		textFieldCountATP500R16Player2.setBounds(250, 390, 50, 20);
		homePlayerPanel.add(textFieldCountATP500R16Player2);

		textFieldCountATP500QFPlayer2 = new JTextField();
		textFieldCountATP500QFPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP500QFPlayer2.setEditable(false);
		textFieldCountATP500QFPlayer2.setColumns(10);
		textFieldCountATP500QFPlayer2.setBounds(300, 390, 50, 20);
		homePlayerPanel.add(textFieldCountATP500QFPlayer2);

		textFieldCountATP500SFPlayer2 = new JTextField();
		textFieldCountATP500SFPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP500SFPlayer2.setEditable(false);
		textFieldCountATP500SFPlayer2.setColumns(10);
		textFieldCountATP500SFPlayer2.setBounds(350, 390, 50, 20);
		homePlayerPanel.add(textFieldCountATP500SFPlayer2);

		textFieldCountATP500FPlayer2 = new JTextField();
		textFieldCountATP500FPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP500FPlayer2.setEditable(false);
		textFieldCountATP500FPlayer2.setColumns(10);
		textFieldCountATP500FPlayer2.setBounds(400, 390, 50, 20);
		homePlayerPanel.add(textFieldCountATP500FPlayer2);

		textFieldCountATP500WPlayer2 = new JTextField();
		textFieldCountATP500WPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP500WPlayer2.setEditable(false);
		textFieldCountATP500WPlayer2.setColumns(10);
		textFieldCountATP500WPlayer2.setBounds(450, 390, 50, 20);
		homePlayerPanel.add(textFieldCountATP500WPlayer2);

		textFieldCountATP500SumPlayer2 = new JTextField();
		textFieldCountATP500SumPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP500SumPlayer2.setEditable(false);
		textFieldCountATP500SumPlayer2.setColumns(10);
		textFieldCountATP500SumPlayer2.setBounds(500, 390, 50, 20);
		homePlayerPanel.add(textFieldCountATP500SumPlayer2);

		lblGOATPoint6 = new JLabel("GOAT Points");
		lblGOATPoint6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGOATPoint6.setHorizontalAlignment(SwingConstants.CENTER);
		lblGOATPoint6.setBounds(20, 390, 80, 20);
		homePlayerPanel.add(lblGOATPoint6);

		textPlayer2Slam = new JTextField();
		textPlayer2Slam.setFont(new Font("Tahoma", Font.BOLD, 13));
		textPlayer2Slam.setHorizontalAlignment(SwingConstants.CENTER);
		textPlayer2Slam.setEditable(false);
		textPlayer2Slam.setColumns(10);
		textPlayer2Slam.setBounds(0, 150, 100, 20);
		homePlayerPanel.add(textPlayer2Slam);

		textPlayer2M1000 = new JTextField();
		textPlayer2M1000.setFont(new Font("Tahoma", Font.BOLD, 13));
		textPlayer2M1000.setHorizontalAlignment(SwingConstants.CENTER);
		textPlayer2M1000.setEditable(false);
		textPlayer2M1000.setColumns(10);
		textPlayer2M1000.setBounds(0, 260, 100, 20);
		homePlayerPanel.add(textPlayer2M1000);

		textPlayer2ATP500 = new JTextField();
		textPlayer2ATP500.setFont(new Font("Tahoma", Font.BOLD, 13));
		textPlayer2ATP500.setHorizontalAlignment(SwingConstants.CENTER);
		textPlayer2ATP500.setEditable(false);
		textPlayer2ATP500.setColumns(10);
		textPlayer2ATP500.setBounds(0, 370, 100, 20);
		homePlayerPanel.add(textPlayer2ATP500);

		textFieldCountATP250R128Player1 = new JTextField();
		textFieldCountATP250R128Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP250R128Player1.setEditable(false);
		textFieldCountATP250R128Player1.setColumns(10);
		textFieldCountATP250R128Player1.setBounds(100, 460, 50, 20);
		homePlayerPanel.add(textFieldCountATP250R128Player1);

		textFieldCountATP250R64Player1 = new JTextField();
		textFieldCountATP250R64Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP250R64Player1.setEditable(false);
		textFieldCountATP250R64Player1.setColumns(10);
		textFieldCountATP250R64Player1.setBounds(150, 460, 50, 20);
		homePlayerPanel.add(textFieldCountATP250R64Player1);

		textFieldCountATP250R32Player1 = new JTextField();
		textFieldCountATP250R32Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP250R32Player1.setEditable(false);
		textFieldCountATP250R32Player1.setColumns(10);
		textFieldCountATP250R32Player1.setBounds(200, 460, 50, 20);
		homePlayerPanel.add(textFieldCountATP250R32Player1);

		textFieldCountATP250R16Player1 = new JTextField();
		textFieldCountATP250R16Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP250R16Player1.setEditable(false);
		textFieldCountATP250R16Player1.setColumns(10);
		textFieldCountATP250R16Player1.setBounds(250, 460, 50, 20);
		homePlayerPanel.add(textFieldCountATP250R16Player1);

		textFieldCountATP250QFPlayer1 = new JTextField();
		textFieldCountATP250QFPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP250QFPlayer1.setEditable(false);
		textFieldCountATP250QFPlayer1.setColumns(10);
		textFieldCountATP250QFPlayer1.setBounds(300, 460, 50, 20);
		homePlayerPanel.add(textFieldCountATP250QFPlayer1);

		textFieldCountATP250SFPlayer1 = new JTextField();
		textFieldCountATP250SFPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP250SFPlayer1.setEditable(false);
		textFieldCountATP250SFPlayer1.setColumns(10);
		textFieldCountATP250SFPlayer1.setBounds(350, 460, 50, 20);
		homePlayerPanel.add(textFieldCountATP250SFPlayer1);

		textFieldCountATP250FPlayer1 = new JTextField();
		textFieldCountATP250FPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP250FPlayer1.setEditable(false);
		textFieldCountATP250FPlayer1.setColumns(10);
		textFieldCountATP250FPlayer1.setBounds(400, 460, 50, 20);
		homePlayerPanel.add(textFieldCountATP250FPlayer1);

		textFieldCountATP250WPlayer1 = new JTextField();
		textFieldCountATP250WPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP250WPlayer1.setEditable(false);
		textFieldCountATP250WPlayer1.setColumns(10);
		textFieldCountATP250WPlayer1.setBounds(450, 460, 50, 20);
		homePlayerPanel.add(textFieldCountATP250WPlayer1);

		textFieldCountATP250SumPlayer1 = new JTextField();
		textFieldCountATP250SumPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP250SumPlayer1.setEditable(false);
		textFieldCountATP250SumPlayer1.setColumns(10);
		textFieldCountATP250SumPlayer1.setBounds(500, 460, 50, 20);
		homePlayerPanel.add(textFieldCountATP250SumPlayer1);

		textFieldATP250R128Player2 = new JTextField();
		textFieldATP250R128Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP250R128Player2.setColumns(10);
		textFieldATP250R128Player2.setBounds(100, 480, 50, 20);
		homePlayerPanel.add(textFieldATP250R128Player2);

		textFieldATP250R64Player2 = new JTextField();
		textFieldATP250R64Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP250R64Player2.setColumns(10);
		textFieldATP250R64Player2.setBounds(150, 480, 50, 20);
		homePlayerPanel.add(textFieldATP250R64Player2);

		textFieldATP250R32Player2 = new JTextField();
		textFieldATP250R32Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP250R32Player2.setColumns(10);
		textFieldATP250R32Player2.setBounds(200, 480, 50, 20);
		homePlayerPanel.add(textFieldATP250R32Player2);

		textFieldATP250R16Player2 = new JTextField();
		textFieldATP250R16Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP250R16Player2.setColumns(10);
		textFieldATP250R16Player2.setBounds(250, 480, 50, 20);
		homePlayerPanel.add(textFieldATP250R16Player2);

		textFieldATP250QFPlayer2 = new JTextField();
		textFieldATP250QFPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP250QFPlayer2.setColumns(10);
		textFieldATP250QFPlayer2.setBounds(300, 480, 50, 20);
		homePlayerPanel.add(textFieldATP250QFPlayer2);

		textFieldATP250SFPlayer2 = new JTextField();
		textFieldATP250SFPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP250SFPlayer2.setColumns(10);
		textFieldATP250SFPlayer2.setBounds(350, 480, 50, 20);
		homePlayerPanel.add(textFieldATP250SFPlayer2);

		textFieldATP250FPlayer2 = new JTextField();
		textFieldATP250FPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP250FPlayer2.setColumns(10);
		textFieldATP250FPlayer2.setBounds(400, 480, 50, 20);
		homePlayerPanel.add(textFieldATP250FPlayer2);

		textFieldATP250WPlayer2 = new JTextField();
		textFieldATP250WPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldATP250WPlayer2.setColumns(10);
		textFieldATP250WPlayer2.setBounds(450, 480, 50, 20);
		homePlayerPanel.add(textFieldATP250WPlayer2);

		textFieldCountATP250R128Player2 = new JTextField();
		textFieldCountATP250R128Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP250R128Player2.setEditable(false);
		textFieldCountATP250R128Player2.setColumns(10);
		textFieldCountATP250R128Player2.setBounds(100, 500, 50, 20);
		homePlayerPanel.add(textFieldCountATP250R128Player2);

		textFieldCountATP250R64Player2 = new JTextField();
		textFieldCountATP250R64Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP250R64Player2.setEditable(false);
		textFieldCountATP250R64Player2.setColumns(10);
		textFieldCountATP250R64Player2.setBounds(150, 500, 50, 20);
		homePlayerPanel.add(textFieldCountATP250R64Player2);

		textFieldCountATP250R32Player2 = new JTextField();
		textFieldCountATP250R32Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP250R32Player2.setEditable(false);
		textFieldCountATP250R32Player2.setColumns(10);
		textFieldCountATP250R32Player2.setBounds(200, 500, 50, 20);
		homePlayerPanel.add(textFieldCountATP250R32Player2);

		textFieldCountATP250R16Player2 = new JTextField();
		textFieldCountATP250R16Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP250R16Player2.setEditable(false);
		textFieldCountATP250R16Player2.setColumns(10);
		textFieldCountATP250R16Player2.setBounds(250, 500, 50, 20);
		homePlayerPanel.add(textFieldCountATP250R16Player2);

		textFieldCountATP250QFPlayer2 = new JTextField();
		textFieldCountATP250QFPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP250QFPlayer2.setEditable(false);
		textFieldCountATP250QFPlayer2.setColumns(10);
		textFieldCountATP250QFPlayer2.setBounds(300, 500, 50, 20);
		homePlayerPanel.add(textFieldCountATP250QFPlayer2);

		textFieldCountATP250SFPlayer2 = new JTextField();
		textFieldCountATP250SFPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP250SFPlayer2.setEditable(false);
		textFieldCountATP250SFPlayer2.setColumns(10);
		textFieldCountATP250SFPlayer2.setBounds(350, 500, 50, 20);
		homePlayerPanel.add(textFieldCountATP250SFPlayer2);

		textFieldCountATP250FPlayer2 = new JTextField();
		textFieldCountATP250FPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP250FPlayer2.setEditable(false);
		textFieldCountATP250FPlayer2.setColumns(10);
		textFieldCountATP250FPlayer2.setBounds(400, 500, 50, 20);
		homePlayerPanel.add(textFieldCountATP250FPlayer2);

		textFieldCountATP250WPlayer2 = new JTextField();
		textFieldCountATP250WPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP250WPlayer2.setEditable(false);
		textFieldCountATP250WPlayer2.setColumns(10);
		textFieldCountATP250WPlayer2.setBounds(450, 500, 50, 20);
		homePlayerPanel.add(textFieldCountATP250WPlayer2);

		textFieldCountATP250SumPlayer2 = new JTextField();
		textFieldCountATP250SumPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountATP250SumPlayer2.setEditable(false);
		textFieldCountATP250SumPlayer2.setColumns(10);
		textFieldCountATP250SumPlayer2.setBounds(500, 500, 50, 20);
		homePlayerPanel.add(textFieldCountATP250SumPlayer2);

		lblGOATPoint4 = new JLabel("GOAT Points");
		lblGOATPoint4.setHorizontalAlignment(SwingConstants.CENTER);
		lblGOATPoint4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGOATPoint4.setBounds(10, 280, 90, 20);
		homePlayerPanel.add(lblGOATPoint4);

		lblPropM1000ATP500 = new JLabel("M1000 / ATP500");
		lblPropM1000ATP500.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPropM1000ATP500.setBounds(586, 242, 120, 16);
		homePlayerPanel.add(lblPropM1000ATP500);

		PropM1000ATP500 = new JTextField();
		PropM1000ATP500.setText("4");
		PropM1000ATP500.setHorizontalAlignment(SwingConstants.CENTER);
		PropM1000ATP500.setColumns(10);
		PropM1000ATP500.setBackground(Color.YELLOW);
		PropM1000ATP500.setBounds(623, 280, 50, 20);
		homePlayerPanel.add(PropM1000ATP500);

		lblMastersRR1 = new JLabel("RR1");
		lblMastersRR1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMastersRR1.setBounds(100, 540, 50, 20);
		homePlayerPanel.add(lblMastersRR1);

		lblMastersRR2 = new JLabel("RR2");
		lblMastersRR2.setHorizontalAlignment(SwingConstants.CENTER);
		lblMastersRR2.setBounds(150, 540, 50, 20);
		homePlayerPanel.add(lblMastersRR2);

		lblMastersRR3 = new JLabel("RR3");
		lblMastersRR3.setHorizontalAlignment(SwingConstants.CENTER);
		lblMastersRR3.setBounds(200, 540, 50, 20);
		homePlayerPanel.add(lblMastersRR3);

		lblMastersSF = new JLabel("SF");
		lblMastersSF.setHorizontalAlignment(SwingConstants.CENTER);
		lblMastersSF.setBounds(350, 540, 50, 20);
		homePlayerPanel.add(lblMastersSF);

		lblMastersF = new JLabel("F");
		lblMastersF.setHorizontalAlignment(SwingConstants.CENTER);
		lblMastersF.setBounds(400, 540, 50, 20);
		homePlayerPanel.add(lblMastersF);

		lblMastersW = new JLabel("W");
		lblMastersW.setHorizontalAlignment(SwingConstants.CENTER);
		lblMastersW.setBounds(450, 540, 50, 20);
		homePlayerPanel.add(lblMastersW);

		lblMasters = new JLabel("Masters");
		lblMasters.setHorizontalAlignment(SwingConstants.CENTER);
		lblMasters.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMasters.setBounds(270, 540, 70, 20);
		homePlayerPanel.add(lblMasters);

		textFieldMastersRR1Player1 = new JTextField();
		textFieldMastersRR1Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMastersRR1Player1.setColumns(10);
		textFieldMastersRR1Player1.setBounds(100, 560, 50, 20);
		homePlayerPanel.add(textFieldMastersRR1Player1);

		textFieldMastersRR2Player1 = new JTextField();
		textFieldMastersRR2Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMastersRR2Player1.setColumns(10);
		textFieldMastersRR2Player1.setBounds(150, 560, 50, 20);
		homePlayerPanel.add(textFieldMastersRR2Player1);

		textFieldMastersRR3Player1 = new JTextField();
		textFieldMastersRR3Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMastersRR3Player1.setColumns(10);
		textFieldMastersRR3Player1.setBounds(200, 560, 50, 20);
		homePlayerPanel.add(textFieldMastersRR3Player1);

		textFieldMastersSFPlayer1 = new JTextField();
		textFieldMastersSFPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMastersSFPlayer1.setColumns(10);
		textFieldMastersSFPlayer1.setBounds(350, 560, 50, 20);
		homePlayerPanel.add(textFieldMastersSFPlayer1);

		textFieldMastersFPlayer1 = new JTextField();
		textFieldMastersFPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMastersFPlayer1.setColumns(10);
		textFieldMastersFPlayer1.setBounds(400, 560, 50, 20);
		homePlayerPanel.add(textFieldMastersFPlayer1);

		textFieldMastersWPlayer1 = new JTextField();
		textFieldMastersWPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMastersWPlayer1.setColumns(10);
		textFieldMastersWPlayer1.setBounds(450, 560, 50, 20);
		homePlayerPanel.add(textFieldMastersWPlayer1);

		textFieldCountMastersRR1Player1 = new JTextField();
		textFieldCountMastersRR1Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountMastersRR1Player1.setEditable(false);
		textFieldCountMastersRR1Player1.setColumns(10);
		textFieldCountMastersRR1Player1.setBounds(100, 580, 50, 20);
		homePlayerPanel.add(textFieldCountMastersRR1Player1);

		textFieldCountMastersRR2Player1 = new JTextField();
		textFieldCountMastersRR2Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountMastersRR2Player1.setEditable(false);
		textFieldCountMastersRR2Player1.setColumns(10);
		textFieldCountMastersRR2Player1.setBounds(150, 580, 50, 20);
		homePlayerPanel.add(textFieldCountMastersRR2Player1);

		textFieldCountMastersRR3Player1 = new JTextField();
		textFieldCountMastersRR3Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountMastersRR3Player1.setEditable(false);
		textFieldCountMastersRR3Player1.setColumns(10);
		textFieldCountMastersRR3Player1.setBounds(200, 580, 50, 20);
		homePlayerPanel.add(textFieldCountMastersRR3Player1);

		textFieldCountMastersSFPlayer1 = new JTextField();
		textFieldCountMastersSFPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountMastersSFPlayer1.setEditable(false);
		textFieldCountMastersSFPlayer1.setColumns(10);
		textFieldCountMastersSFPlayer1.setBounds(350, 580, 50, 20);
		homePlayerPanel.add(textFieldCountMastersSFPlayer1);

		textFieldCountMastersFPlayer1 = new JTextField();
		textFieldCountMastersFPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountMastersFPlayer1.setEditable(false);
		textFieldCountMastersFPlayer1.setColumns(10);
		textFieldCountMastersFPlayer1.setBounds(400, 580, 50, 20);
		homePlayerPanel.add(textFieldCountMastersFPlayer1);

		textFieldCountMastersWPlayer1 = new JTextField();
		textFieldCountMastersWPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountMastersWPlayer1.setEditable(false);
		textFieldCountMastersWPlayer1.setColumns(10);
		textFieldCountMastersWPlayer1.setBounds(450, 580, 50, 20);
		homePlayerPanel.add(textFieldCountMastersWPlayer1);

		textFieldMastersMaxPoints = new JTextField();
		textFieldMastersMaxPoints.setBackground(Color.MAGENTA);
		textFieldMastersMaxPoints.setText("1500");
		textFieldMastersMaxPoints.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMastersMaxPoints.setColumns(10);
		textFieldMastersMaxPoints.setBounds(500, 560, 50, 20);
		homePlayerPanel.add(textFieldMastersMaxPoints);

		textFieldCountMastersSumPlayer1 = new JTextField();
		textFieldCountMastersSumPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountMastersSumPlayer1.setEditable(false);
		textFieldCountMastersSumPlayer1.setColumns(10);
		textFieldCountMastersSumPlayer1.setBounds(500, 580, 50, 20);
		homePlayerPanel.add(textFieldCountMastersSumPlayer1);

		textFieldMastersRR1Player2 = new JTextField();
		textFieldMastersRR1Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMastersRR1Player2.setColumns(10);
		textFieldMastersRR1Player2.setBounds(100, 600, 50, 20);
		homePlayerPanel.add(textFieldMastersRR1Player2);

		textFieldMastersRR2Player2 = new JTextField();
		textFieldMastersRR2Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMastersRR2Player2.setColumns(10);
		textFieldMastersRR2Player2.setBounds(150, 600, 50, 20);
		homePlayerPanel.add(textFieldMastersRR2Player2);

		textFieldMastersRR3Player2 = new JTextField();
		textFieldMastersRR3Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMastersRR3Player2.setColumns(10);
		textFieldMastersRR3Player2.setBounds(200, 600, 50, 20);
		homePlayerPanel.add(textFieldMastersRR3Player2);

		textFieldMastersSFPlayer2 = new JTextField();
		textFieldMastersSFPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMastersSFPlayer2.setColumns(10);
		textFieldMastersSFPlayer2.setBounds(350, 600, 50, 20);
		homePlayerPanel.add(textFieldMastersSFPlayer2);

		textFieldMastersFPlayer2 = new JTextField();
		textFieldMastersFPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMastersFPlayer2.setColumns(10);
		textFieldMastersFPlayer2.setBounds(400, 600, 50, 20);
		homePlayerPanel.add(textFieldMastersFPlayer2);

		textFieldMastersWPlayer2 = new JTextField();
		textFieldMastersWPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMastersWPlayer2.setColumns(10);
		textFieldMastersWPlayer2.setBounds(450, 600, 50, 20);
		homePlayerPanel.add(textFieldMastersWPlayer2);

		textFieldCountMastersRR1Player2 = new JTextField();
		textFieldCountMastersRR1Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountMastersRR1Player2.setEditable(false);
		textFieldCountMastersRR1Player2.setColumns(10);
		textFieldCountMastersRR1Player2.setBounds(100, 620, 50, 20);
		homePlayerPanel.add(textFieldCountMastersRR1Player2);

		textFieldCountMastersRR2Player2 = new JTextField();
		textFieldCountMastersRR2Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountMastersRR2Player2.setEditable(false);
		textFieldCountMastersRR2Player2.setColumns(10);
		textFieldCountMastersRR2Player2.setBounds(150, 619, 50, 20);
		homePlayerPanel.add(textFieldCountMastersRR2Player2);

		textFieldCountMastersRR3Player2 = new JTextField();
		textFieldCountMastersRR3Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountMastersRR3Player2.setEditable(false);
		textFieldCountMastersRR3Player2.setColumns(10);
		textFieldCountMastersRR3Player2.setBounds(200, 620, 50, 20);
		homePlayerPanel.add(textFieldCountMastersRR3Player2);

		textFieldCountMastersSFPlayer2 = new JTextField();
		textFieldCountMastersSFPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountMastersSFPlayer2.setEditable(false);
		textFieldCountMastersSFPlayer2.setColumns(10);
		textFieldCountMastersSFPlayer2.setBounds(350, 620, 50, 20);
		homePlayerPanel.add(textFieldCountMastersSFPlayer2);

		textFieldCountMastersFPlayer2 = new JTextField();
		textFieldCountMastersFPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountMastersFPlayer2.setEditable(false);
		textFieldCountMastersFPlayer2.setColumns(10);
		textFieldCountMastersFPlayer2.setBounds(400, 620, 50, 20);
		homePlayerPanel.add(textFieldCountMastersFPlayer2);

		textFieldCountMastersWPlayer2 = new JTextField();
		textFieldCountMastersWPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountMastersWPlayer2.setEditable(false);
		textFieldCountMastersWPlayer2.setColumns(10);
		textFieldCountMastersWPlayer2.setBounds(450, 620, 50, 20);
		homePlayerPanel.add(textFieldCountMastersWPlayer2);

		textFieldCountMastersSumPlayer2 = new JTextField();
		textFieldCountMastersSumPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountMastersSumPlayer2.setEditable(false);
		textFieldCountMastersSumPlayer2.setColumns(10);
		textFieldCountMastersSumPlayer2.setBounds(500, 620, 50, 20);
		homePlayerPanel.add(textFieldCountMastersSumPlayer2);

		textPlayer1ATP250 = new JTextField();
		textPlayer1ATP250.setHorizontalAlignment(SwingConstants.CENTER);
		textPlayer1ATP250.setFont(new Font("Tahoma", Font.BOLD, 13));
		textPlayer1ATP250.setEditable(false);
		textPlayer1ATP250.setColumns(10);
		textPlayer1ATP250.setBounds(0, 440, 100, 20);
		homePlayerPanel.add(textPlayer1ATP250);

		textPlayer2ATP250 = new JTextField();
		textPlayer2ATP250.setHorizontalAlignment(SwingConstants.CENTER);
		textPlayer2ATP250.setFont(new Font("Tahoma", Font.BOLD, 13));
		textPlayer2ATP250.setEditable(false);
		textPlayer2ATP250.setColumns(10);
		textPlayer2ATP250.setBounds(0, 480, 100, 20);
		homePlayerPanel.add(textPlayer2ATP250);

		textPlayer1Masters = new JTextField();
		textPlayer1Masters.setHorizontalAlignment(SwingConstants.CENTER);
		textPlayer1Masters.setFont(new Font("Tahoma", Font.BOLD, 13));
		textPlayer1Masters.setEditable(false);
		textPlayer1Masters.setColumns(10);
		textPlayer1Masters.setBounds(0, 560, 100, 20);
		homePlayerPanel.add(textPlayer1Masters);

		textPlayer2Masters = new JTextField();
		textPlayer2Masters.setHorizontalAlignment(SwingConstants.CENTER);
		textPlayer2Masters.setFont(new Font("Tahoma", Font.BOLD, 13));
		textPlayer2Masters.setEditable(false);
		textPlayer2Masters.setColumns(10);
		textPlayer2Masters.setBounds(0, 599, 100, 20);
		homePlayerPanel.add(textPlayer2Masters);

		textPlayer1Olympics = new JTextField();
		textPlayer1Olympics.setHorizontalAlignment(SwingConstants.CENTER);
		textPlayer1Olympics.setFont(new Font("Tahoma", Font.BOLD, 13));
		textPlayer1Olympics.setEditable(false);
		textPlayer1Olympics.setColumns(10);
		textPlayer1Olympics.setBounds(0, 680, 100, 20);
		homePlayerPanel.add(textPlayer1Olympics);

		textPlayer2Olympics = new JTextField();
		textPlayer2Olympics.setHorizontalAlignment(SwingConstants.CENTER);
		textPlayer2Olympics.setFont(new Font("Tahoma", Font.BOLD, 13));
		textPlayer2Olympics.setEditable(false);
		textPlayer2Olympics.setColumns(10);
		textPlayer2Olympics.setBounds(0, 719, 100, 20);
		homePlayerPanel.add(textPlayer2Olympics);

		lblGOATPoint7 = new JLabel("GOAT Points");
		lblGOATPoint7.setHorizontalAlignment(SwingConstants.CENTER);
		lblGOATPoint7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGOATPoint7.setBounds(20, 460, 80, 20);
		homePlayerPanel.add(lblGOATPoint7);

		lblGOATPoint8 = new JLabel("GOAT Points");
		lblGOATPoint8.setHorizontalAlignment(SwingConstants.CENTER);
		lblGOATPoint8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGOATPoint8.setBounds(20, 500, 80, 20);
		homePlayerPanel.add(lblGOATPoint8);

		lblGOATPoint9 = new JLabel("GOAT Points");
		lblGOATPoint9.setHorizontalAlignment(SwingConstants.CENTER);
		lblGOATPoint9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGOATPoint9.setBounds(20, 580, 80, 20);
		homePlayerPanel.add(lblGOATPoint9);

		lblGOATPoint10 = new JLabel("GOAT Points");
		lblGOATPoint10.setHorizontalAlignment(SwingConstants.CENTER);
		lblGOATPoint10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGOATPoint10.setBounds(20, 620, 80, 20);
		homePlayerPanel.add(lblGOATPoint10);

		textFieldOlympicsR128Player1 = new JTextField();
		textFieldOlympicsR128Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldOlympicsR128Player1.setColumns(10);
		textFieldOlympicsR128Player1.setBounds(100, 680, 50, 20);
		homePlayerPanel.add(textFieldOlympicsR128Player1);

		textFieldOlympicsR64Player1 = new JTextField();
		textFieldOlympicsR64Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldOlympicsR64Player1.setColumns(10);
		textFieldOlympicsR64Player1.setBounds(150, 680, 50, 20);
		homePlayerPanel.add(textFieldOlympicsR64Player1);

		textFieldOlympicsR32Player1 = new JTextField();
		textFieldOlympicsR32Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldOlympicsR32Player1.setColumns(10);
		textFieldOlympicsR32Player1.setBounds(200, 680, 50, 20);
		homePlayerPanel.add(textFieldOlympicsR32Player1);

		textFieldOlympicsR16Player1 = new JTextField();
		textFieldOlympicsR16Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldOlympicsR16Player1.setColumns(10);
		textFieldOlympicsR16Player1.setBounds(250, 680, 50, 20);
		homePlayerPanel.add(textFieldOlympicsR16Player1);

		textFieldOlympicsQFPlayer1 = new JTextField();
		textFieldOlympicsQFPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldOlympicsQFPlayer1.setColumns(10);
		textFieldOlympicsQFPlayer1.setBounds(300, 680, 50, 20);
		homePlayerPanel.add(textFieldOlympicsQFPlayer1);

		textFieldOlympicsSFPlayer1 = new JTextField();
		textFieldOlympicsSFPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldOlympicsSFPlayer1.setColumns(10);
		textFieldOlympicsSFPlayer1.setBounds(350, 680, 50, 20);
		homePlayerPanel.add(textFieldOlympicsSFPlayer1);

		textFieldOlympicsFPlayer1 = new JTextField();
		textFieldOlympicsFPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldOlympicsFPlayer1.setColumns(10);
		textFieldOlympicsFPlayer1.setBounds(400, 680, 50, 20);
		homePlayerPanel.add(textFieldOlympicsFPlayer1);

		textFieldOlympicsWPlayer1 = new JTextField();
		textFieldOlympicsWPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldOlympicsWPlayer1.setColumns(10);
		textFieldOlympicsWPlayer1.setBounds(450, 680, 50, 20);
		homePlayerPanel.add(textFieldOlympicsWPlayer1);

		textFieldOlympicsMaxPoints = new JTextField();
		textFieldOlympicsMaxPoints.setBackground(Color.YELLOW);
		textFieldOlympicsMaxPoints.setText("750");
		textFieldOlympicsMaxPoints.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldOlympicsMaxPoints.setColumns(10);
		textFieldOlympicsMaxPoints.setBounds(500, 680, 50, 20);
		homePlayerPanel.add(textFieldOlympicsMaxPoints);

		lblOlympics = new JLabel("Olympics");
		lblOlympics.setHorizontalAlignment(SwingConstants.CENTER);
		lblOlympics.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblOlympics.setBounds(270, 650, 70, 20);
		homePlayerPanel.add(lblOlympics);

		textFieldCountOlympicsR128Player1 = new JTextField();
		textFieldCountOlympicsR128Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountOlympicsR128Player1.setEditable(false);
		textFieldCountOlympicsR128Player1.setColumns(10);
		textFieldCountOlympicsR128Player1.setBounds(100, 700, 50, 20);
		homePlayerPanel.add(textFieldCountOlympicsR128Player1);

		textFieldCountOlympicsR64Player1 = new JTextField();
		textFieldCountOlympicsR64Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountOlympicsR64Player1.setEditable(false);
		textFieldCountOlympicsR64Player1.setColumns(10);
		textFieldCountOlympicsR64Player1.setBounds(150, 700, 50, 20);
		homePlayerPanel.add(textFieldCountOlympicsR64Player1);

		textFieldCountOlympicsR32Player1 = new JTextField();
		textFieldCountOlympicsR32Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountOlympicsR32Player1.setEditable(false);
		textFieldCountOlympicsR32Player1.setColumns(10);
		textFieldCountOlympicsR32Player1.setBounds(200, 700, 50, 20);
		homePlayerPanel.add(textFieldCountOlympicsR32Player1);

		textFieldCountOlympicsR16Player1 = new JTextField();
		textFieldCountOlympicsR16Player1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountOlympicsR16Player1.setEditable(false);
		textFieldCountOlympicsR16Player1.setColumns(10);
		textFieldCountOlympicsR16Player1.setBounds(250, 700, 50, 20);
		homePlayerPanel.add(textFieldCountOlympicsR16Player1);

		textFieldCountOlympicsQFPlayer1 = new JTextField();
		textFieldCountOlympicsQFPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountOlympicsQFPlayer1.setEditable(false);
		textFieldCountOlympicsQFPlayer1.setColumns(10);
		textFieldCountOlympicsQFPlayer1.setBounds(300, 700, 50, 20);
		homePlayerPanel.add(textFieldCountOlympicsQFPlayer1);

		textFieldCountOlympicsSFPlayer1 = new JTextField();
		textFieldCountOlympicsSFPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountOlympicsSFPlayer1.setEditable(false);
		textFieldCountOlympicsSFPlayer1.setColumns(10);
		textFieldCountOlympicsSFPlayer1.setBounds(350, 700, 50, 20);
		homePlayerPanel.add(textFieldCountOlympicsSFPlayer1);

		textFieldCountOlympicsFPlayer1 = new JTextField();
		textFieldCountOlympicsFPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountOlympicsFPlayer1.setEditable(false);
		textFieldCountOlympicsFPlayer1.setColumns(10);
		textFieldCountOlympicsFPlayer1.setBounds(400, 700, 50, 20);
		homePlayerPanel.add(textFieldCountOlympicsFPlayer1);

		textFieldCountOlympicsWPlayer1 = new JTextField();
		textFieldCountOlympicsWPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountOlympicsWPlayer1.setEditable(false);
		textFieldCountOlympicsWPlayer1.setColumns(10);
		textFieldCountOlympicsWPlayer1.setBounds(450, 700, 50, 20);
		homePlayerPanel.add(textFieldCountOlympicsWPlayer1);

		textFieldCountOlympicsSumPlayer1 = new JTextField();
		textFieldCountOlympicsSumPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountOlympicsSumPlayer1.setEditable(false);
		textFieldCountOlympicsSumPlayer1.setColumns(10);
		textFieldCountOlympicsSumPlayer1.setBounds(500, 700, 50, 20);
		homePlayerPanel.add(textFieldCountOlympicsSumPlayer1);

		textFieldOlympicsR128Player2 = new JTextField();
		textFieldOlympicsR128Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldOlympicsR128Player2.setColumns(10);
		textFieldOlympicsR128Player2.setBounds(100, 720, 50, 20);
		homePlayerPanel.add(textFieldOlympicsR128Player2);

		textFieldOlympicsR64Player2 = new JTextField();
		textFieldOlympicsR64Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldOlympicsR64Player2.setColumns(10);
		textFieldOlympicsR64Player2.setBounds(150, 720, 50, 20);
		homePlayerPanel.add(textFieldOlympicsR64Player2);

		textFieldOlympicsR32Player2 = new JTextField();
		textFieldOlympicsR32Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldOlympicsR32Player2.setColumns(10);
		textFieldOlympicsR32Player2.setBounds(200, 720, 50, 20);
		homePlayerPanel.add(textFieldOlympicsR32Player2);

		textFieldOlympicsR16Player2 = new JTextField();
		textFieldOlympicsR16Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldOlympicsR16Player2.setColumns(10);
		textFieldOlympicsR16Player2.setBounds(250, 720, 50, 20);
		homePlayerPanel.add(textFieldOlympicsR16Player2);

		textFieldOlympicsQFPlayer2 = new JTextField();
		textFieldOlympicsQFPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldOlympicsQFPlayer2.setColumns(10);
		textFieldOlympicsQFPlayer2.setBounds(300, 720, 50, 20);
		homePlayerPanel.add(textFieldOlympicsQFPlayer2);

		textFieldOlympicsSFPlayer2 = new JTextField();
		textFieldOlympicsSFPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldOlympicsSFPlayer2.setColumns(10);
		textFieldOlympicsSFPlayer2.setBounds(350, 720, 50, 20);
		homePlayerPanel.add(textFieldOlympicsSFPlayer2);

		textFieldOlympicsFPlayer2 = new JTextField();
		textFieldOlympicsFPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldOlympicsFPlayer2.setColumns(10);
		textFieldOlympicsFPlayer2.setBounds(400, 720, 50, 20);
		homePlayerPanel.add(textFieldOlympicsFPlayer2);

		textFieldOlympicsWPlayer2 = new JTextField();
		textFieldOlympicsWPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldOlympicsWPlayer2.setColumns(10);
		textFieldOlympicsWPlayer2.setBounds(450, 720, 50, 20);
		homePlayerPanel.add(textFieldOlympicsWPlayer2);

		textFieldCountOlympicsR128Player2 = new JTextField();
		textFieldCountOlympicsR128Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountOlympicsR128Player2.setEditable(false);
		textFieldCountOlympicsR128Player2.setColumns(10);
		textFieldCountOlympicsR128Player2.setBounds(100, 740, 50, 20);
		homePlayerPanel.add(textFieldCountOlympicsR128Player2);

		textFieldCountOlympicsR64Player2 = new JTextField();
		textFieldCountOlympicsR64Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountOlympicsR64Player2.setEditable(false);
		textFieldCountOlympicsR64Player2.setColumns(10);
		textFieldCountOlympicsR64Player2.setBounds(150, 740, 50, 20);
		homePlayerPanel.add(textFieldCountOlympicsR64Player2);

		textFieldCountOlympicsR32Player2 = new JTextField();
		textFieldCountOlympicsR32Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountOlympicsR32Player2.setEditable(false);
		textFieldCountOlympicsR32Player2.setColumns(10);
		textFieldCountOlympicsR32Player2.setBounds(200, 740, 50, 20);
		homePlayerPanel.add(textFieldCountOlympicsR32Player2);

		textFieldCountOlympicsR16Player2 = new JTextField();
		textFieldCountOlympicsR16Player2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountOlympicsR16Player2.setEditable(false);
		textFieldCountOlympicsR16Player2.setColumns(10);
		textFieldCountOlympicsR16Player2.setBounds(250, 740, 50, 20);
		homePlayerPanel.add(textFieldCountOlympicsR16Player2);

		textFieldCountOlympicsQFPlayer2 = new JTextField();
		textFieldCountOlympicsQFPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountOlympicsQFPlayer2.setEditable(false);
		textFieldCountOlympicsQFPlayer2.setColumns(10);
		textFieldCountOlympicsQFPlayer2.setBounds(300, 740, 50, 20);
		homePlayerPanel.add(textFieldCountOlympicsQFPlayer2);

		textFieldCountOlympicsSFPlayer2 = new JTextField();
		textFieldCountOlympicsSFPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountOlympicsSFPlayer2.setEditable(false);
		textFieldCountOlympicsSFPlayer2.setColumns(10);
		textFieldCountOlympicsSFPlayer2.setBounds(350, 740, 50, 20);
		homePlayerPanel.add(textFieldCountOlympicsSFPlayer2);

		textFieldCountOlympicsFPlayer2 = new JTextField();
		textFieldCountOlympicsFPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountOlympicsFPlayer2.setEditable(false);
		textFieldCountOlympicsFPlayer2.setColumns(10);
		textFieldCountOlympicsFPlayer2.setBounds(400, 740, 50, 20);
		homePlayerPanel.add(textFieldCountOlympicsFPlayer2);

		textFieldCountOlympicsWPlayer2 = new JTextField();
		textFieldCountOlympicsWPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountOlympicsWPlayer2.setEditable(false);
		textFieldCountOlympicsWPlayer2.setColumns(10);
		textFieldCountOlympicsWPlayer2.setBounds(450, 740, 50, 20);
		homePlayerPanel.add(textFieldCountOlympicsWPlayer2);

		textFieldCountOlympicsSumPlayer2 = new JTextField();
		textFieldCountOlympicsSumPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldCountOlympicsSumPlayer2.setEditable(false);
		textFieldCountOlympicsSumPlayer2.setColumns(10);
		textFieldCountOlympicsSumPlayer2.setBounds(500, 740, 50, 20);
		homePlayerPanel.add(textFieldCountOlympicsSumPlayer2);

		lblGOATPoint111 = new JLabel("GOAT Points");
		lblGOATPoint111.setHorizontalAlignment(SwingConstants.CENTER);
		lblGOATPoint111.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGOATPoint111.setBounds(20, 700, 80, 20);
		homePlayerPanel.add(lblGOATPoint111);

		lblGOATPoint12 = new JLabel("GOAT Points");
		lblGOATPoint12.setHorizontalAlignment(SwingConstants.CENTER);
		lblGOATPoint12.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblGOATPoint12.setBounds(20, 740, 80, 20);
		homePlayerPanel.add(lblGOATPoint12);

		lblPropATP500ATP250 = new JLabel("ATP500 / ATP 250");
		lblPropATP500ATP250.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPropATP500ATP250.setBounds(586, 350, 120, 16);
		homePlayerPanel.add(lblPropATP500ATP250);

		PropATP500ATP250 = new JTextField();
		PropATP500ATP250.setText("2");
		PropATP500ATP250.setHorizontalAlignment(SwingConstants.CENTER);
		PropATP500ATP250.setColumns(10);
		PropATP500ATP250.setBackground(Color.YELLOW);
		PropATP500ATP250.setBounds(623, 388, 50, 20);
		homePlayerPanel.add(PropATP500ATP250);

		lblPropSlamMasters = new JLabel("Slam / Masters");
		lblPropSlamMasters.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPropSlamMasters.setBounds(587, 462, 120, 16);
		homePlayerPanel.add(lblPropSlamMasters);

		sliderSlamMasters = new JSlider();
		sliderSlamMasters.setPreferredSize(new Dimension(230, 46));
		sliderSlamMasters.setPaintTicks(true);
		sliderSlamMasters.setPaintLabels(true);
		sliderSlamMasters.setMinimum(100);
		sliderSlamMasters.setMaximum(500);
		sliderSlamMasters.setMajorTickSpacing(1);
		sliderSlamMasters.setBounds(562, 533, 170, 20);
		sliderSlamMasters.addChangeListener(new ChangeAction());
		homePlayerPanel.add(sliderSlamMasters);

		PropSlamMasters = new JTextField();
		PropSlamMasters.setText("2.37");
		PropSlamMasters.setHorizontalAlignment(SwingConstants.CENTER);
		PropSlamMasters.setColumns(10);
		PropSlamMasters.setBackground(Color.YELLOW);
		PropSlamMasters.setBounds(623, 499, 50, 20);
		homePlayerPanel.add(PropSlamMasters);

		lblPropSlamOlympics = new JLabel("Slam / Olympics");
		lblPropSlamOlympics.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPropSlamOlympics.setBounds(586, 582, 120, 16);
		homePlayerPanel.add(lblPropSlamOlympics);

		PropSlamOlympics = new JTextField();
		PropSlamOlympics.setText("2.96");
		PropSlamOlympics.setHorizontalAlignment(SwingConstants.CENTER);
		PropSlamOlympics.setColumns(10);
		PropSlamOlympics.setBackground(Color.YELLOW);
		PropSlamOlympics.setBounds(623, 620, 50, 20);
		homePlayerPanel.add(PropSlamOlympics);

		sliderSlamOlympics = new JSlider();
		sliderSlamOlympics.setPreferredSize(new Dimension(230, 46));
		sliderSlamOlympics.setPaintTicks(true);
		sliderSlamOlympics.setPaintLabels(true);
		sliderSlamOlympics.setMinimum(100);
		sliderSlamOlympics.setMaximum(500);
		sliderSlamOlympics.setMajorTickSpacing(1);
		sliderSlamOlympics.addChangeListener(new ChangeAction());
		sliderSlamOlympics.setBounds(562, 660, 170, 20);
		homePlayerPanel.add(sliderSlamOlympics);

		lblImgPlayer1 = new JLabel();
		lblImgPlayer1.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgPlayer1.setBounds(814, 240, 196, 200);
		homePlayerPanel.add(lblImgPlayer1);

		lblImgPlayer2 = new JLabel();
		lblImgPlayer2.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgPlayer2.setBounds(1040, 240, 193, 200);
		homePlayerPanel.add(lblImgPlayer2);

		lblImgWinner = new JLabel();
		lblImgWinner.setHorizontalAlignment(SwingConstants.CENTER);
		lblImgWinner.setBounds(927, 651, 196, 200);
		homePlayerPanel.add(lblImgWinner);

		lblWinner = new JLabel("Winner");
		lblWinner.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblWinner.setHorizontalAlignment(SwingConstants.CENTER);
		lblWinner.setBounds(973, 621, 90, 16);
		homePlayerPanel.add(lblWinner);

		lblMaxPointsSlam = new JLabel("Max Points");
		lblMaxPointsSlam.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaxPointsSlam.setBounds(490, 90, 70, 16);
		homePlayerPanel.add(lblMaxPointsSlam);

		lblMaxPointsM1000 = new JLabel("Max Points");
		lblMaxPointsM1000.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaxPointsM1000.setBounds(490, 202, 70, 16);
		homePlayerPanel.add(lblMaxPointsM1000);

		lblMaxPointsATP500 = new JLabel("Max Points");
		lblMaxPointsATP500.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaxPointsATP500.setBounds(490, 312, 70, 16);
		homePlayerPanel.add(lblMaxPointsATP500);

		lblMaxPointsATP250 = new JLabel("Max Points");
		lblMaxPointsATP250.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaxPointsATP250.setBounds(490, 420, 70, 16);
		homePlayerPanel.add(lblMaxPointsATP250);

		lblMaxPointsMasters = new JLabel("Max Points");
		lblMaxPointsMasters.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaxPointsMasters.setBounds(490, 542, 70, 16);
		homePlayerPanel.add(lblMaxPointsMasters);

		lblMaxPointsOlympics = new JLabel("Max Points");
		lblMaxPointsOlympics.setHorizontalAlignment(SwingConstants.CENTER);
		lblMaxPointsOlympics.setBounds(490, 660, 70, 16);
		homePlayerPanel.add(lblMaxPointsOlympics);

		buttonGroup = new ButtonGroup();

		rdbPlacingsTML = new JRadioButtonMenuItem("TML");
		buttonGroup.add(rdbPlacingsTML);
		rdbPlacingsTML.setHorizontalAlignment(SwingConstants.CENTER);
		rdbPlacingsTML.setBounds(512, 27, 149, 24);
		rdbPlacingsTML.setSelected(true);
		homePlayerPanel.add(rdbPlacingsTML);
		rdbPlacingsTML.addActionListener(this);

		rdbPlacingsATP = new JRadioButtonMenuItem("ATP");
		buttonGroup.add(rdbPlacingsATP);
		rdbPlacingsATP.setHorizontalAlignment(SwingConstants.CENTER);
		rdbPlacingsATP.setBounds(512, 46, 149, 24);
		rdbPlacingsATP.addActionListener(this);
		homePlayerPanel.add(rdbPlacingsATP);
		
		btnStartSimulation = new JButton("Start");
		btnStopSimulation = new JButton("Stop");  
		
		timer = new Timer(1, new ActionListener() {
			private DecimalFormat df2 = new DecimalFormat(".##");

	        public void actionPerformed(ActionEvent e)
	        {  
                 tennis.variables.valuePropSlamOlympics = tennis.variables.valuePropSlamOlympics + 0.1;
                 
                 PropSlamOlympics.setText(String.valueOf(df2.format(tennis.variables.valuePropSlamOlympics)).replace(",","."));
                 setPoints();
                 
                 if(tennis.variables.valuePropSlamOlympics > 2) 
                 {
                	 tennis.variables.valuePropSlamOlympics = 1.0;
                	 PropSlamOlympics.setText(String.valueOf("1.00"));
                	 
                     tennis.variables.valuePropSlamMasters = tennis.variables.valuePropSlamMasters + 0.1;
                     
                     PropSlamMasters.setText(String.valueOf(df2.format(tennis.variables.valuePropSlamMasters)).replace(",","."));
                     setPoints();
                  
                 }
                     if(tennis.variables.valuePropSlamMasters > 2) 
                     {
                    	 tennis.variables.valuePropSlamMasters = 1.0;
                    	 PropSlamMasters.setText(String.valueOf("1.00"));
                    	 
                    	 tennis.variables.valuePropSlamOlympics = 1.0;
                    	 PropSlamOlympics.setText(String.valueOf("1.00"));
                    	 
                         tennis.variables.valuePropATP500ATP250 = tennis.variables.valuePropATP500ATP250 + 0.1;
                         
                         PropATP500ATP250.setText(String.valueOf(df2.format(tennis.variables.valuePropATP500ATP250)).replace(",","."));
                         setPoints();
                     
                     }
                     
                     if(tennis.variables.valuePropATP500ATP250 > 2) 
                     {
                    	 tennis.variables.valuePropATP500ATP250 = 1.0;
                    	 PropATP500ATP250.setText(String.valueOf("1.00"));
                    	 
                    	 tennis.variables.valuePropSlamMasters = 1.0;
                    	 PropSlamMasters.setText(String.valueOf("1.00"));
                    	 
                    	 tennis.variables.valuePropSlamOlympics = 1.0;
                    	 PropSlamOlympics.setText(String.valueOf("1.00"));
                    	 
                         tennis.variables.valuePropM1000ATP500 = tennis.variables.valuePropM1000ATP500 + 0.1;
                         
                         PropM1000ATP500.setText(String.valueOf(df2.format(tennis.variables.valuePropM1000ATP500)).replace(",","."));
                         setPoints();
                     
                     }
                	 
                 
                 
               if(Double.parseDouble(textFieldGOATPointsPlayer1.getText()) > Double.parseDouble(textFieldGOATPointsPlayer2.getText())) {
            	   numberSimulation1++;
            	   textFieldSimulationNumber1.setText(String.valueOf(numberSimulation1));
            	   
               }
               
               if(Double.parseDouble(textFieldGOATPointsPlayer1.getText()) < Double.parseDouble(textFieldGOATPointsPlayer2.getText())) {
            	   numberSimulation2++;
            	   textFieldSimulationNumber2.setText(String.valueOf(numberSimulation2));
               }  
                 
	        }  
			
			
			
		});  
		
		btnStartSimulation.addActionListener(new ActionListener () {  
	        public void actionPerformed(ActionEvent e) {
	        	tennis.variables.valuePropSlamOlympics = 1;
	        	PropSlamOlympics.setText("1");
	        	
	        	tennis.variables.valuePropSlamMasters = 1;
	        	PropSlamMasters.setText("1");
	        	
	        	tennis.variables.valuePropATP500ATP250 = 1;
	        	PropATP500ATP250.setText("1");
	        	
	        	tennis.variables.valuePropM1000ATP500 = 1;
	        	PropM1000ATP500.setText("1");
	        	
	        	tennis.variables.valuePropSlamM1000 = 1;
	        	PropSlamM1000.setText("1");
	        	
	            timer.start();
	            
	            btnStartSimulation.setEnabled(false);  
	            btnStopSimulation.setEnabled(true);  
	        }  
	    });  
		
		btnStopSimulation.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {  
	            timer.stop();  
	            numberSimulation1=0;
	            numberSimulation2=0;
	            btnStartSimulation.setEnabled(true);  
	            btnStopSimulation.setEnabled(false);  
	        }  
	    });  
	    
	    btnStartSimulation.addActionListener(new ActionListener () {  
			private long startTime;
			public void actionPerformed(ActionEvent e) {  
				startTime = System.currentTimeMillis();  
				timer.start();  
				btnStartSimulation.setEnabled(false);  
				btnStopSimulation.setEnabled(true);  
			}  
		});  
	    
	    btnStopSimulation.addActionListener(new ActionListener() {  
			public void actionPerformed(ActionEvent e) {  
				timer.stop();  
				btnStartSimulation.setEnabled(true);  
				btnStopSimulation.setEnabled(false);  
			}  
		}); 
	    
		btnStartSimulation.setBounds(862, 580, 89, 23);
		homePlayerPanel.add(btnStartSimulation);
		
		
		btnStopSimulation.setBounds(973, 580, 89, 23);
		homePlayerPanel.add(btnStopSimulation);
		
		textFieldSimulationNumber1 = new JTextField();
		textFieldSimulationNumber1.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSimulationNumber1.setText("0");
		textFieldSimulationNumber1.setEditable(false);
		textFieldSimulationNumber1.setBounds(872, 548, 70, 20);
		homePlayerPanel.add(textFieldSimulationNumber1);
		textFieldSimulationNumber1.setColumns(10);
		
		textFieldSimulationNumber2 = new JTextField();
		textFieldSimulationNumber2.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldSimulationNumber2.setText("0");
		textFieldSimulationNumber2.setEditable(false);
		textFieldSimulationNumber2.setBounds(1091, 548, 70, 20);
		homePlayerPanel.add(textFieldSimulationNumber2);
		textFieldSimulationNumber2.setColumns(10);
		
		JLabel lblSimulationNumber = new JLabel("Simulations Number");
		lblSimulationNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblSimulationNumber.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSimulationNumber.setBounds(952, 548, 129, 20);
		homePlayerPanel.add(lblSimulationNumber);
		
		JLabel lblNewLabel_1 = new JLabel("Clock simulation");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(754, 584, 100, 14);
		homePlayerPanel.add(lblNewLabel_1);

	}
	
	
	

	private void initializeVariables() {
		// Slam
		tennis.variables.valueSlamR128Player1 = Double.parseDouble(textFieldSlamR128Player1.getText());
		tennis.variables.valueSlamR64Player1 = Double.parseDouble(textFieldSlamR64Player1.getText());
		tennis.variables.valueSlamR32Player1 = Double.parseDouble(textFieldSlamR32Player1.getText());
		tennis.variables.valueSlamR16Player1 = Double.parseDouble(textFieldSlamR16Player1.getText());
		tennis.variables.valueSlamQFPlayer1 = Double.parseDouble(textFieldSlamQFPlayer1.getText());
		tennis.variables.valueSlamSFPlayer1 = Double.parseDouble(textFieldSlamSFPlayer1.getText());
		tennis.variables.valueSlamFPlayer1 = Double.parseDouble(textFieldSlamFPlayer1.getText());
		tennis.variables.valueSlamWPlayer1 = Double.parseDouble(textFieldSlamWPlayer1.getText());
		
		tennis.variables.valueSlamR128Player2 = Double.parseDouble(textFieldSlamR128Player2.getText());
		tennis.variables.valueSlamR64Player2 = Double.parseDouble(textFieldSlamR64Player2.getText());
		tennis.variables.valueSlamR32Player2 = Double.parseDouble(textFieldSlamR32Player2.getText());
		tennis.variables.valueSlamR16Player2 = Double.parseDouble(textFieldSlamR16Player2.getText());
		tennis.variables.valueSlamQFPlayer2 = Double.parseDouble(textFieldSlamQFPlayer2.getText());
		tennis.variables.valueSlamSFPlayer2 = Double.parseDouble(textFieldSlamSFPlayer2.getText());
		tennis.variables.valueSlamFPlayer2 = Double.parseDouble(textFieldSlamFPlayer2.getText());
		tennis.variables.valueSlamWPlayer2 = Double.parseDouble(textFieldSlamWPlayer2.getText());

		// M1000
		tennis.variables.valueM1000R128Player1 = Double.parseDouble(textFieldM1000R128Player1.getText());
		tennis.variables.valueM1000R64Player1 = Double.parseDouble(textFieldM1000R64Player1.getText());
		tennis.variables.valueM1000R32Player1 = Double.parseDouble(textFieldM1000R32Player1.getText());
		tennis.variables.valueM1000R16Player1 = Double.parseDouble(textFieldM1000R16Player1.getText());
		tennis.variables.valueM1000QFPlayer1 = Double.parseDouble(textFieldM1000QFPlayer1.getText());
		tennis.variables.valueM1000SFPlayer1 = Double.parseDouble(textFieldM1000SFPlayer1.getText());
		tennis.variables.valueM1000FPlayer1 = Double.parseDouble(textFieldM1000FPlayer1.getText());
		tennis.variables.valueM1000WPlayer1 = Double.parseDouble(textFieldM1000WPlayer1.getText());

		tennis.variables.valueM1000R128Player2 = Double.parseDouble(textFieldM1000R128Player2.getText());
		tennis.variables.valueM1000R64Player2 = Double.parseDouble(textFieldM1000R64Player2.getText());
		tennis.variables.valueM1000R32Player2 = Double.parseDouble(textFieldM1000R32Player2.getText());
		tennis.variables.valueM1000R16Player2 = Double.parseDouble(textFieldM1000R16Player2.getText());
		tennis.variables.valueM1000QFPlayer2 = Double.parseDouble(textFieldM1000QFPlayer2.getText());
		tennis.variables.valueM1000SFPlayer2 = Double.parseDouble(textFieldM1000SFPlayer2.getText());
		tennis.variables.valueM1000FPlayer2 = Double.parseDouble(textFieldM1000FPlayer2.getText());
		tennis.variables.valueM1000WPlayer2 = Double.parseDouble(textFieldM1000SFPlayer2.getText());

		// ATP500
		tennis.variables.valueATP500R128Player1 = Double.parseDouble(textFieldATP500R128Player1.getText());
		tennis.variables.valueATP500R64Player1 = Double.parseDouble(textFieldATP500R64Player1.getText());
		tennis.variables.valueATP500R32Player1 = Double.parseDouble(textFieldATP500R32Player1.getText());
		tennis.variables.valueATP500R16Player1 = Double.parseDouble(textFieldATP500R16Player1.getText());
		tennis.variables.valueATP500QFPlayer1 = Double.parseDouble(textFieldATP500QFPlayer1.getText());
		tennis.variables.valueATP500SFPlayer1 = Double.parseDouble(textFieldATP500SFPlayer1.getText());
		tennis.variables.valueATP500FPlayer1 = Double.parseDouble(textFieldATP500FPlayer1.getText());
		tennis.variables.valueATP500WPlayer1 = Double.parseDouble(textFieldATP500WPlayer1.getText());

		tennis.variables.valueATP500R128Player2 = Double.parseDouble(textFieldATP500R128Player2.getText());
		tennis.variables.valueATP500R64Player2 = Double.parseDouble(textFieldATP500R64Player2.getText());
		tennis.variables.valueATP500R32Player2 = Double.parseDouble(textFieldATP500R32Player2.getText());
		tennis.variables.valueATP500R16Player2 = Double.parseDouble(textFieldATP500R16Player2.getText());
		tennis.variables.valueATP500QFPlayer2 = Double.parseDouble(textFieldATP500QFPlayer2.getText());
		tennis.variables.valueATP500SFPlayer2 = Double.parseDouble(textFieldATP500SFPlayer2.getText());
		tennis.variables.valueATP500FPlayer2 = Double.parseDouble(textFieldATP500FPlayer2.getText());
		tennis.variables.valueATP500WPlayer2 = Double.parseDouble(textFieldATP500WPlayer2.getText());

		// AT250
		tennis.variables.valueATP250R128Player1 = Double.parseDouble(textFieldATP250R128Player1.getText());
		tennis.variables.valueATP250R64Player1 = Double.parseDouble(textFieldATP250R64Player1.getText());
		tennis.variables.valueATP250R32Player1 = Double.parseDouble(textFieldATP250R32Player1.getText());
		tennis.variables.valueATP250R16Player1 = Double.parseDouble(textFieldATP250R16Player1.getText());
		tennis.variables.valueATP250QFPlayer1 = Double.parseDouble(textFieldATP250QFPlayer1.getText());
		tennis.variables.valueATP250SFPlayer1 = Double.parseDouble(textFieldATP250SFPlayer1.getText());
		tennis.variables.valueATP250FPlayer1 = Double.parseDouble(textFieldATP250FPlayer1.getText());
		tennis.variables.valueATP250WPlayer1 = Double.parseDouble(textFieldATP250WPlayer1.getText());

		tennis.variables.valueATP250R128Player2 = Double.parseDouble(textFieldATP250R128Player2.getText());
		tennis.variables.valueATP250R64Player2 = Double.parseDouble(textFieldATP250R64Player2.getText());
		tennis.variables.valueATP250R32Player2 = Double.parseDouble(textFieldATP250R32Player2.getText());
		tennis.variables.valueATP250R16Player2 = Double.parseDouble(textFieldATP250R16Player2.getText());
		tennis.variables.valueATP250QFPlayer2 = Double.parseDouble(textFieldATP250QFPlayer2.getText());
		tennis.variables.valueATP250SFPlayer2 = Double.parseDouble(textFieldATP250SFPlayer2.getText());
		tennis.variables.valueATP250FPlayer2 = Double.parseDouble(textFieldATP250FPlayer2.getText());
		tennis.variables.valueATP250WPlayer2 = Double.parseDouble(textFieldATP250WPlayer2.getText());
		
		//Olympics
		tennis.variables.valueOlympicsR128Player1 = Double.parseDouble(textFieldOlympicsR128Player1.getText());
		tennis.variables.valueOlympicsR64Player1 = Double.parseDouble(textFieldOlympicsR64Player1.getText());
		tennis.variables.valueOlympicsR32Player1 = Double.parseDouble(textFieldOlympicsR32Player1.getText());
		tennis.variables.valueOlympicsR16Player1 = Double.parseDouble(textFieldOlympicsR16Player1.getText());
		tennis.variables.valueOlympicsQFPlayer1 = Double.parseDouble(textFieldOlympicsQFPlayer1.getText());
		tennis.variables.valueOlympicsSFPlayer1 = Double.parseDouble(textFieldOlympicsSFPlayer1.getText());
		tennis.variables.valueOlympicsFPlayer1 = Double.parseDouble(textFieldOlympicsFPlayer1.getText());
		tennis.variables.valueOlympicsWPlayer1 = Double.parseDouble(textFieldOlympicsWPlayer1.getText());

		tennis.variables.valueOlympicsR128Player2 = Double.parseDouble(textFieldOlympicsR128Player2.getText());
		tennis.variables.valueOlympicsR64Player2 = Double.parseDouble(textFieldOlympicsR64Player2.getText());
		tennis.variables.valueOlympicsR32Player2 = Double.parseDouble(textFieldOlympicsR32Player2.getText());
		tennis.variables.valueOlympicsR16Player2 = Double.parseDouble(textFieldOlympicsR16Player2.getText());
		tennis.variables.valueOlympicsQFPlayer2 = Double.parseDouble(textFieldOlympicsQFPlayer2.getText());
		tennis.variables.valueOlympicsSFPlayer2 = Double.parseDouble(textFieldOlympicsSFPlayer2.getText());
		tennis.variables.valueOlympicsFPlayer2 = Double.parseDouble(textFieldOlympicsFPlayer2.getText());
		tennis.variables.valueOlympicsWPlayer2 = Double.parseDouble(textFieldOlympicsWPlayer2.getText());
		
		//Masters
		tennis.variables.valueMastersRR1Player1 = Double.parseDouble(textFieldMastersRR1Player1.getText());
		tennis.variables.valueMastersRR2Player1 = Double.parseDouble(textFieldMastersRR2Player1.getText());
		tennis.variables.valueMastersRR3Player1 = Double.parseDouble(textFieldMastersRR3Player1.getText());
		tennis.variables.valueMastersSFPlayer1 = Double.parseDouble(textFieldMastersSFPlayer1.getText());
		tennis.variables.valueMastersFPlayer1 = Double.parseDouble(textFieldMastersFPlayer1.getText());
		tennis.variables.valueMastersWPlayer1 = Double.parseDouble(textFieldMastersWPlayer1.getText());

		tennis.variables.valueMastersRR1Player2 = Double.parseDouble(textFieldMastersRR1Player2.getText());
		tennis.variables.valueMastersRR2Player2 = Double.parseDouble(textFieldMastersRR2Player2.getText());
		tennis.variables.valueMastersRR3Player2 = Double.parseDouble(textFieldMastersRR3Player2.getText());
		tennis.variables.valueMastersSFPlayer2 = Double.parseDouble(textFieldMastersSFPlayer2.getText());
		tennis.variables.valueMastersFPlayer2 = Double.parseDouble(textFieldMastersFPlayer2.getText());
		tennis.variables.valueMastersWPlayer2 = Double.parseDouble(textFieldMastersWPlayer2.getText());
		
		// Placings
		tennis.variables.valuePlacingsR128 = Double.parseDouble(textFieldPlacingsR128.getText());
		tennis.variables.valuePlacingsR64 = Double.parseDouble(textFieldPlacingsR64.getText());
		tennis.variables.valuePlacingsR32 = Double.parseDouble(textFieldPlacingsR32.getText());
		tennis.variables.valuePlacingsR16 = Double.parseDouble(textFieldPlacingsR16.getText());
		tennis.variables.valuePlacingsQF = Double.parseDouble(textFieldPlacingsQF.getText());
		tennis.variables.valuePlacingsSF = Double.parseDouble(textFieldPlacingsSF.getText());
		tennis.variables.valuePlacingsF = Double.parseDouble(textFieldPlacingsF.getText());
		tennis.variables.valuePlacingsW = Double.parseDouble(textFieldPlacingsW.getText());

		// Max Points
		tennis.variables.valueSlamMaxPoints = Double.parseDouble(textFieldSlamMaxPoints.getText());
		tennis.variables.valueM1000MaxPoints = Double.parseDouble(textFieldM1000MaxPoints.getText());
		tennis.variables.valueATP500MaxPoints = Double.parseDouble(textFieldATP500MaxPoints.getText());
		tennis.variables.valueATP250MaxPoints = Double.parseDouble(textFieldATP250MaxPoints.getText());
		tennis.variables.valueMastersMaxPoints = Double.parseDouble(textFieldMastersMaxPoints.getText());
		tennis.variables.valueOlympicsMaxPoints = Double.parseDouble(textFieldOlympicsMaxPoints.getText());
		
		//Proportions
		tennis.variables.valuePropSlamM1000 = Double.parseDouble(PropSlamM1000.getText());
		tennis.variables.valuePropM1000ATP500 = Double.parseDouble(PropM1000ATP500.getText());
		tennis.variables.valuePropATP500ATP250 = Double.parseDouble(PropATP500ATP250.getText());
		tennis.variables.valuePropSlamMasters = Double.parseDouble(PropSlamMasters.getText());
		tennis.variables.valuePropSlamOlympics = Double.parseDouble(PropSlamOlympics.getText());

	}

	private void setPlacings() {
		textFieldPlacingsR128.setText(placings.getPlacingsR128());
		textFieldPlacingsR64.setText(placings.getPlacingsR64());
		textFieldPlacingsR32.setText(placings.getPlacingsR32());
		textFieldPlacingsR16.setText(placings.getPlacingsR16());
		textFieldPlacingsQF.setText(placings.getPlacingsQF());
		textFieldPlacingsSF.setText(placings.getPlacingsSF());
		textFieldPlacingsF.setText(placings.getPlacingsF());
		textFieldPlacingsW.setText(placings.getPlacingsW());

	}

	private void setPlayer(String name, int player) {
		if (player == 1) {
			setValuesPlayer1(name, 1);
			textPlayer1.setText(name);
			textPlayer1Slam.setText(name);
			textPlayer1M1000.setText(name);
			textPlayer1ATP500.setText(name);
			textPlayer1ATP250.setText(name);
			textPlayer1Masters.setText(name);
			textPlayer1Olympics.setText(name);
		}

		if (player == 2) {
			setValuePlayer2(name, 2);
			textPlayer2.setText(name);
			textPlayer2Slam.setText(name);
			textPlayer2M1000.setText(name);
			textPlayer2ATP500.setText(name);
			textPlayer2ATP250.setText(name);
			textPlayer2Masters.setText(name);
			textPlayer2Olympics.setText(name);
		}
	}

	private void setValuesPlayer1(String name, int i) {
		if (name.equals("Federer")) {
			Federer(i);
			iReportFederer = new ImageIcon(getClass().getResource("/Federer.png"));
			iReportPlayer1 = iReportFederer;
			if (iReportFederer != null) {
				lblImgPlayer1.setIcon(iReportFederer);
			}
		}
		if (name.equals("Nadal")) {
			Nadal(i);
			iReportNadal = new ImageIcon(getClass().getResource("/Nadal.png"));
			iReportPlayer1 = iReportNadal;
			if (iReportNadal != null) {
				lblImgPlayer1.setIcon(iReportNadal);
			}
		}

	}

	private void setValuePlayer2(String name, int i) {
		if (name.equals("Federer")) {
			Federer(i);
			iReportFederer = new ImageIcon(getClass().getResource("/Federer.png"));
			iReportPlayer2 = iReportNadal;
			if (iReportFederer != null) {
				lblImgPlayer2.setIcon(iReportFederer);
			}
		}
		if (name.equals("Nadal")) {
			Nadal(i);
			iReportNadal = new ImageIcon(getClass().getResource("/Nadal.png"));
			iReportPlayer2 = iReportNadal;
			if (iReportNadal != null) {
				lblImgPlayer2.setIcon(iReportNadal);
			}
		}
		
		initializeVariables();

	}

	private void Federer(int n) {
		if (n == 1) {
			// SLAM//
			setText(textFieldSlamWPlayer1, 20);
			setText(textFieldSlamFPlayer1, 10);
			setText(textFieldSlamSFPlayer1, 13);
			setText(textFieldSlamQFPlayer1, 10);
			setText(textFieldSlamR16Player1, 7);
			setText(textFieldSlamR32Player1, 5);
			setText(textFieldSlamR64Player1, 1);
			setText(textFieldSlamR128Player1, 6);
			// M1000
			setText(textFieldM1000WPlayer1, 27);
			setText(textFieldM1000FPlayer1, 20);
			setText(textFieldM1000SFPlayer1, 14);
			setText(textFieldM1000QFPlayer1, 15);
			setText(textFieldM1000R16Player1, 15);
			setText(textFieldM1000R32Player1, 17);
			setText(textFieldM1000R64Player1, 15);
			setText(textFieldM1000R128Player1, 2);
			// ATP500
			setText(textFieldATP500WPlayer1, 20);
			setText(textFieldATP500FPlayer1, 6);
			setText(textFieldATP500SFPlayer1, 6);
			setText(textFieldATP500QFPlayer1, 5);
			setText(textFieldATP500R16Player1, 2);
			setText(textFieldATP500R32Player1, 2);
			setText(textFieldATP500R64Player1, 2);
			setText(textFieldATP500R128Player1, 0);
			// ATP250
			setText(textFieldATP250WPlayer1, 23);
			setText(textFieldATP250FPlayer1, 9);
			setText(textFieldATP250SFPlayer1, 10);
			setText(textFieldATP250QFPlayer1, 10);
			setText(textFieldATP250R16Player1, 8);
			setText(textFieldATP250R32Player1, 2);
			setText(textFieldATP250R64Player1, 0);
			setText(textFieldATP250R128Player1, 0);
			// Masters
			setText(textFieldMastersWPlayer1, 6);
			setText(textFieldMastersFPlayer1, 4);
			setText(textFieldMastersSFPlayer1, 0);
			setText(textFieldMastersRR3Player1, 10);
			setText(textFieldMastersRR2Player1, 3);
			setText(textFieldMastersRR1Player1, 2);
			// Olympics
			setText(textFieldOlympicsWPlayer1, 0);
			setText(textFieldOlympicsFPlayer1, 1);
			setText(textFieldOlympicsSFPlayer1, 1);
			setText(textFieldOlympicsQFPlayer1, 1);
			setText(textFieldOlympicsR16Player1, 0);
			setText(textFieldOlympicsR32Player1, 1);
			setText(textFieldOlympicsR64Player1, 0);
			setText(textFieldOlympicsR128Player1, 0);

		}
		if (n == 2) {
			setText(textFieldSlamWPlayer2, 20);
			setText(textFieldSlamFPlayer2, 10);
			setText(textFieldSlamSFPlayer2, 13);
			setText(textFieldSlamQFPlayer2, 10);
			setText(textFieldSlamR16Player2, 7);
			setText(textFieldSlamR32Player2, 5);
			setText(textFieldSlamR64Player2, 1);
			setText(textFieldSlamR128Player2, 6);
			// M1000
			setText(textFieldM1000WPlayer2, 27);
			setText(textFieldM1000FPlayer2, 20);
			setText(textFieldM1000SFPlayer2, 14);
			setText(textFieldM1000QFPlayer2, 15);
			setText(textFieldM1000R16Player2, 15);
			setText(textFieldM1000R32Player2, 17);
			setText(textFieldM1000R64Player2, 15);
			setText(textFieldM1000R128Player2, 2);
			// ATP500
			setText(textFieldATP500WPlayer2, 20);
			setText(textFieldATP500FPlayer2, 6);
			setText(textFieldATP500SFPlayer2, 6);
			setText(textFieldATP500QFPlayer2, 5);
			setText(textFieldATP500R16Player2, 2);
			setText(textFieldATP500R32Player2, 2);
			setText(textFieldATP500R64Player2, 2);
			setText(textFieldATP500R128Player2, 0);
			// ATP250
			setText(textFieldATP250WPlayer2, 23);
			setText(textFieldATP250FPlayer2, 9);
			setText(textFieldATP250SFPlayer2, 10);
			setText(textFieldATP250QFPlayer2, 10);
			setText(textFieldATP250R16Player2, 8);
			setText(textFieldATP250R32Player2, 2);
			setText(textFieldATP250R64Player2, 0);
			setText(textFieldATP250R128Player2, 0);
			// Masters
			setText(textFieldMastersWPlayer2, 6);
			setText(textFieldMastersFPlayer2, 4);
			setText(textFieldMastersSFPlayer2, 0);
			setText(textFieldMastersRR3Player2, 10);
			setText(textFieldMastersRR2Player2, 3);
			setText(textFieldMastersRR1Player2, 2);
			// Olympics
			setText(textFieldOlympicsWPlayer2, 0);
			setText(textFieldOlympicsFPlayer2, 1);
			setText(textFieldOlympicsSFPlayer2, 1);
			setText(textFieldOlympicsQFPlayer2, 1);
			setText(textFieldOlympicsR16Player2, 0);
			setText(textFieldOlympicsR32Player2, 1);
			setText(textFieldOlympicsR64Player2, 0);
			setText(textFieldOlympicsR128Player2, 0);
		}
	}

	private void Nadal(int n) {
		if (n == 1) {
			// SLAM//
			setText(textFieldSlamWPlayer1, 16);
			setText(textFieldSlamFPlayer1, 7);
			setText(textFieldSlamSFPlayer1, 3);
			setText(textFieldSlamQFPlayer1, 7);
			setText(textFieldSlamR16Player1, 6);
			setText(textFieldSlamR32Player1, 5);
			setText(textFieldSlamR64Player1, 5);
			setText(textFieldSlamR128Player1, 2);
			// M1000
			setText(textFieldM1000WPlayer1, 30);
			setText(textFieldM1000FPlayer1, 16);
			setText(textFieldM1000SFPlayer1, 18);
			setText(textFieldM1000QFPlayer1, 18);
			setText(textFieldM1000R16Player1, 11);
			setText(textFieldM1000R32Player1, 9);
			setText(textFieldM1000R64Player1, 6);
			setText(textFieldM1000R128Player1, 0);
			// ATP500
			setText(textFieldATP500WPlayer1, 19);
			setText(textFieldATP500FPlayer1, 5);
			setText(textFieldATP500SFPlayer1, 3);
			setText(textFieldATP500QFPlayer1, 8);
			setText(textFieldATP500R16Player1, 2);
			setText(textFieldATP500R32Player1, 3);
			setText(textFieldATP500R64Player1, 0);
			setText(textFieldATP500R128Player1, 0);
			// ATP250
			setText(textFieldATP250WPlayer1, 9);
			setText(textFieldATP250FPlayer1, 5);
			setText(textFieldATP250SFPlayer1, 7);
			setText(textFieldATP250QFPlayer1, 13);
			setText(textFieldATP250R16Player1, 5);
			setText(textFieldATP250R32Player1, 9);
			setText(textFieldATP250R64Player1, 0);
			setText(textFieldATP250R128Player1, 0);
			// Masters
			setText(textFieldMastersWPlayer1, 0);
			setText(textFieldMastersFPlayer1, 2);
			setText(textFieldMastersSFPlayer1, 0);
			setText(textFieldMastersRR3Player1, 3);
			setText(textFieldMastersRR2Player1, 2);
			setText(textFieldMastersRR1Player1, 1);
			// Olympics
			setText(textFieldOlympicsWPlayer1, 1);
			setText(textFieldOlympicsFPlayer1, 0);
			setText(textFieldOlympicsSFPlayer1, 1);
			setText(textFieldOlympicsQFPlayer1, 0);
			setText(textFieldOlympicsR16Player1, 0);
			setText(textFieldOlympicsR32Player1, 0);
			setText(textFieldOlympicsR64Player1, 0);
			setText(textFieldOlympicsR128Player1, 0);
		}

		if (n == 2) {
			// SLAM//
			setText(textFieldSlamWPlayer2, 16);
			setText(textFieldSlamFPlayer2, 7);
			setText(textFieldSlamSFPlayer2, 3);
			setText(textFieldSlamQFPlayer2, 7);
			setText(textFieldSlamR16Player2, 6);
			setText(textFieldSlamR32Player2, 5);
			setText(textFieldSlamR64Player2, 5);
			setText(textFieldSlamR128Player2, 2);
			// M1000
			setText(textFieldM1000WPlayer2, 30);
			setText(textFieldM1000FPlayer2, 16);
			setText(textFieldM1000SFPlayer2, 18);
			setText(textFieldM1000QFPlayer2, 18);
			setText(textFieldM1000R16Player2, 11);
			setText(textFieldM1000R32Player2, 9);
			setText(textFieldM1000R64Player2, 6);
			setText(textFieldM1000R128Player2, 0);
			// ATP500
			setText(textFieldATP500WPlayer2, 19);
			setText(textFieldATP500FPlayer2, 5);
			setText(textFieldATP500SFPlayer2, 3);
			setText(textFieldATP500QFPlayer2, 8);
			setText(textFieldATP500R16Player2, 2);
			setText(textFieldATP500R32Player2, 3);
			setText(textFieldATP500R64Player2, 0);
			setText(textFieldATP500R128Player2, 0);
			// ATP250
			setText(textFieldATP250WPlayer2, 9);
			setText(textFieldATP250FPlayer2, 5);
			setText(textFieldATP250SFPlayer2, 7);
			setText(textFieldATP250QFPlayer2, 13);
			setText(textFieldATP250R16Player2, 5);
			setText(textFieldATP250R32Player2, 9);
			setText(textFieldATP250R64Player2, 0);
			setText(textFieldATP250R128Player2, 0);
			// Masters
			setText(textFieldMastersWPlayer2, 0);
			setText(textFieldMastersFPlayer2, 2);
			setText(textFieldMastersSFPlayer2, 0);
			setText(textFieldMastersRR3Player2, 3);
			setText(textFieldMastersRR2Player2, 2);
			setText(textFieldMastersRR1Player2, 1);
			// Olympics
			setText(textFieldOlympicsWPlayer2, 1);
			setText(textFieldOlympicsFPlayer2, 0);
			setText(textFieldOlympicsSFPlayer2, 1);
			setText(textFieldOlympicsQFPlayer2, 0);
			setText(textFieldOlympicsR16Player2, 0);
			setText(textFieldOlympicsR32Player2, 0);
			setText(textFieldOlympicsR64Player2, 0);
			setText(textFieldOlympicsR128Player2, 0);
		}
	}

	private void setText(JTextField textField, int number) {
		textField.setText(String.valueOf(number));

	}

	private void setPoints() {
		
		textFieldCountSlamWPlayer1.setText(countPoints(tennis.variables.valueSlamWPlayer1,
				tennis.variables.valuePlacingsW, tennis.variables.valueSlamMaxPoints, "Slam"));
		textFieldCountSlamFPlayer1.setText(countPoints(tennis.variables.valueSlamFPlayer1,
				tennis.variables.valuePlacingsF, tennis.variables.valueSlamMaxPoints, "Slam"));
		textFieldCountSlamSFPlayer1.setText(countPoints(tennis.variables.valueSlamSFPlayer1,
				tennis.variables.valuePlacingsSF, tennis.variables.valueSlamMaxPoints, "Slam"));
		textFieldCountSlamQFPlayer1.setText(countPoints(tennis.variables.valueSlamQFPlayer1,
				tennis.variables.valuePlacingsQF, tennis.variables.valueSlamMaxPoints, "Slam"));
		textFieldCountSlamR16Player1.setText(countPoints(tennis.variables.valueSlamR16Player1,
				tennis.variables.valuePlacingsR16, tennis.variables.valueSlamMaxPoints, "Slam"));
		textFieldCountSlamR32Player1.setText(countPoints(tennis.variables.valueSlamR32Player1,
				tennis.variables.valuePlacingsR32, tennis.variables.valueSlamMaxPoints, "Slam"));
		textFieldCountSlamR64Player1.setText(countPoints(tennis.variables.valueSlamR64Player1,
				tennis.variables.valuePlacingsR64, tennis.variables.valueSlamMaxPoints, "Slam"));
		textFieldCountSlamR128Player1.setText(countPoints(tennis.variables.valueSlamR128Player1,
				tennis.variables.valuePlacingsR128, tennis.variables.valueSlamMaxPoints, "Slam"));
		// Masters 1000
		textFieldCountM1000WPlayer1.setText(countPoints(tennis.variables.valueM1000WPlayer1,
				tennis.variables.valuePlacingsW, tennis.variables.valueM1000MaxPoints, "M1000"));
		textFieldCountM1000FPlayer1.setText(countPoints(tennis.variables.valueM1000FPlayer1,
				tennis.variables.valuePlacingsF, tennis.variables.valueM1000MaxPoints, "M1000"));
		textFieldCountM1000SFPlayer1.setText(countPoints(tennis.variables.valueM1000SFPlayer1,
				tennis.variables.valuePlacingsSF, tennis.variables.valueM1000MaxPoints, "M1000"));
		textFieldCountM1000QFPlayer1.setText(countPoints(tennis.variables.valueM1000QFPlayer1,
				tennis.variables.valuePlacingsQF, tennis.variables.valueM1000MaxPoints, "M1000"));
		textFieldCountM1000R16Player1.setText(countPoints(tennis.variables.valueM1000R16Player1,
				tennis.variables.valuePlacingsR16, tennis.variables.valueM1000MaxPoints, "M1000"));
		textFieldCountM1000R32Player1.setText(countPoints(tennis.variables.valueM1000R32Player1,
				tennis.variables.valuePlacingsR32, tennis.variables.valueM1000MaxPoints, "M1000"));
		textFieldCountM1000R64Player1.setText(countPoints(tennis.variables.valueM1000R64Player1,
				tennis.variables.valuePlacingsR64, tennis.variables.valueM1000MaxPoints, "M1000"));
		textFieldCountM1000R128Player1.setText(countPoints(tennis.variables.valueM1000R128Player1,
				tennis.variables.valuePlacingsR128, tennis.variables.valueM1000MaxPoints, "M1000"));
		// ATP500
		textFieldCountATP500WPlayer1.setText(countPoints(tennis.variables.valueATP500WPlayer1,
				tennis.variables.valuePlacingsW, tennis.variables.valueATP500MaxPoints, "ATP500"));
		textFieldCountATP500FPlayer1.setText(countPoints(tennis.variables.valueATP500FPlayer1,
				tennis.variables.valuePlacingsF, tennis.variables.valueATP500MaxPoints, "ATP500"));
		textFieldCountATP500SFPlayer1.setText(countPoints(tennis.variables.valueATP500SFPlayer1,
				tennis.variables.valuePlacingsSF, tennis.variables.valueATP500MaxPoints, "ATP500"));
		textFieldCountATP500QFPlayer1.setText(countPoints(tennis.variables.valueATP500QFPlayer1,
				tennis.variables.valuePlacingsQF, tennis.variables.valueATP500MaxPoints, "ATP500"));
		textFieldCountATP500R16Player1.setText(countPoints(tennis.variables.valueATP500R16Player1,
				tennis.variables.valuePlacingsR16, tennis.variables.valueATP500MaxPoints, "ATP500"));
		textFieldCountATP500R32Player1.setText(countPoints(tennis.variables.valueATP500R32Player1,
				tennis.variables.valuePlacingsR32, tennis.variables.valueATP500MaxPoints, "ATP500"));
		textFieldCountATP500R64Player1.setText(countPoints(tennis.variables.valueATP500R64Player1,
				tennis.variables.valuePlacingsR64, tennis.variables.valueATP500MaxPoints, "ATP500"));
		textFieldCountATP500R128Player1.setText(countPoints(tennis.variables.valueATP500R128Player1,
				tennis.variables.valuePlacingsR128, tennis.variables.valueATP500MaxPoints, "ATP500"));
		// ATP250
		textFieldCountATP250WPlayer1.setText(countPoints(tennis.variables.valueATP250WPlayer1,
				tennis.variables.valuePlacingsW, tennis.variables.valueATP250MaxPoints, "ATP250"));
		textFieldCountATP250FPlayer1.setText(countPoints(tennis.variables.valueATP250FPlayer1,
				tennis.variables.valuePlacingsF, tennis.variables.valueATP250MaxPoints, "ATP250"));
		textFieldCountATP250SFPlayer1.setText(countPoints(tennis.variables.valueATP250SFPlayer1,
				tennis.variables.valuePlacingsSF, tennis.variables.valueATP250MaxPoints, "ATP250"));
		textFieldCountATP250QFPlayer1.setText(countPoints(tennis.variables.valueATP250QFPlayer1,
				tennis.variables.valuePlacingsQF, tennis.variables.valueATP250MaxPoints, "ATP250"));
		textFieldCountATP250R16Player1.setText(countPoints(tennis.variables.valueATP250R16Player1,
				tennis.variables.valuePlacingsR16, tennis.variables.valueATP250MaxPoints, "ATP250"));
		textFieldCountATP250R32Player1.setText(countPoints(tennis.variables.valueATP250R32Player1,
				tennis.variables.valuePlacingsR32, tennis.variables.valueATP250MaxPoints, "ATP250"));
		textFieldCountATP250R64Player1.setText(countPoints(tennis.variables.valueATP250R64Player1,
				tennis.variables.valuePlacingsR64, tennis.variables.valueATP250MaxPoints, "ATP250"));
		textFieldCountATP250R128Player1.setText(countPoints(tennis.variables.valueATP250R128Player1,
				tennis.variables.valuePlacingsR128, tennis.variables.valueATP250MaxPoints, "ATP250"));
		// Masters
		textFieldCountMastersWPlayer1.setText(countPoints(tennis.variables.valueMastersWPlayer1,
				tennis.variables.valuePlacingsW, tennis.variables.valueMastersMaxPoints, "Masters"));
		textFieldCountMastersFPlayer1.setText(countPoints(tennis.variables.valueMastersFPlayer1,
				tennis.variables.valuePlacingsF, tennis.variables.valueMastersMaxPoints, "Masters"));
		textFieldCountMastersSFPlayer1.setText(countPoints(tennis.variables.valueMastersSFPlayer1,
				tennis.variables.valuePlacingsSF, tennis.variables.valueMastersMaxPoints, "Masters"));
		textFieldCountMastersRR3Player1.setText(countPoints(tennis.variables.valueMastersRR3Player1,
				tennis.variables.valuePlacingsSF, tennis.variables.valueMastersMaxPoints, "Masters"));
		textFieldCountMastersRR2Player1.setText(countPoints(tennis.variables.valueMastersRR2Player1,
				tennis.variables.valuePlacingsQF, tennis.variables.valueMastersMaxPoints, "Masters"));
		textFieldCountMastersRR1Player1.setText(countPoints(tennis.variables.valueMastersRR1Player1,
				tennis.variables.valuePlacingsR16, tennis.variables.valueMastersMaxPoints, "Masters"));
		// Olympics
		textFieldCountOlympicsWPlayer1.setText(countPoints(tennis.variables.valueOlympicsWPlayer1,
				tennis.variables.valuePlacingsW, tennis.variables.valueOlympicsMaxPoints, "Olympics"));
		textFieldCountOlympicsFPlayer1.setText(countPoints(tennis.variables.valueOlympicsFPlayer1,
				tennis.variables.valuePlacingsF, tennis.variables.valueOlympicsMaxPoints, "Olympics"));
		textFieldCountOlympicsSFPlayer1.setText(countPoints(tennis.variables.valueOlympicsSFPlayer1,
				tennis.variables.valuePlacingsSF, tennis.variables.valueOlympicsMaxPoints, "Olympics"));
		textFieldCountOlympicsQFPlayer1.setText(countPoints(tennis.variables.valueOlympicsQFPlayer1,
				tennis.variables.valuePlacingsQF, tennis.variables.valueOlympicsMaxPoints, "Olympics"));
		textFieldCountOlympicsR16Player1.setText(countPoints(tennis.variables.valueOlympicsR16Player1,
				tennis.variables.valuePlacingsR16, tennis.variables.valueOlympicsMaxPoints, "Olympics"));
		textFieldCountOlympicsR32Player1.setText(countPoints(tennis.variables.valueOlympicsR32Player1,
				tennis.variables.valuePlacingsR32, tennis.variables.valueOlympicsMaxPoints, "Olympics"));
		textFieldCountOlympicsR64Player1.setText(countPoints(tennis.variables.valueOlympicsR64Player1,
				tennis.variables.valuePlacingsR64, tennis.variables.valueOlympicsMaxPoints, "Olympics"));
		textFieldCountOlympicsR128Player1.setText(countPoints(tennis.variables.valueOlympicsR128Player1,
				tennis.variables.valuePlacingsR128, tennis.variables.valueOlympicsMaxPoints, "Olympics"));

		// Player 2
		// Slam
		textFieldCountSlamWPlayer2.setText(countPoints(tennis.variables.valueSlamWPlayer2,
				tennis.variables.valuePlacingsW, tennis.variables.valueSlamMaxPoints, "Slam"));
		textFieldCountSlamFPlayer2.setText(countPoints(tennis.variables.valueSlamFPlayer2,
				tennis.variables.valuePlacingsF, tennis.variables.valueSlamMaxPoints, "Slam"));
		textFieldCountSlamSFPlayer2.setText(countPoints(tennis.variables.valueSlamSFPlayer2,
				tennis.variables.valuePlacingsSF, tennis.variables.valueSlamMaxPoints, "Slam"));
		textFieldCountSlamQFPlayer2.setText(countPoints(tennis.variables.valueSlamQFPlayer2,
				tennis.variables.valuePlacingsQF, tennis.variables.valueSlamMaxPoints, "Slam"));
		textFieldCountSlamR16Player2.setText(countPoints(tennis.variables.valueSlamR16Player2,
				tennis.variables.valuePlacingsR16, tennis.variables.valueSlamMaxPoints, "Slam"));
		textFieldCountSlamR32Player2.setText(countPoints(tennis.variables.valueSlamR32Player2,
				tennis.variables.valuePlacingsR32, tennis.variables.valueSlamMaxPoints, "Slam"));
		textFieldCountSlamR64Player2.setText(countPoints(tennis.variables.valueSlamR64Player2,
				tennis.variables.valuePlacingsR64, tennis.variables.valueSlamMaxPoints, "Slam"));
		textFieldCountSlamR128Player2.setText(countPoints(tennis.variables.valueSlamR128Player2,
				tennis.variables.valuePlacingsR128, tennis.variables.valueSlamMaxPoints, "Slam"));
		// M1000
		textFieldCountM1000WPlayer2.setText(countPoints(tennis.variables.valueM1000WPlayer2,
				tennis.variables.valuePlacingsW, tennis.variables.valueM1000MaxPoints, "M1000"));
		textFieldCountM1000FPlayer2.setText(countPoints(tennis.variables.valueM1000FPlayer2,
				tennis.variables.valuePlacingsF, tennis.variables.valueM1000MaxPoints, "M1000"));
		textFieldCountM1000SFPlayer2.setText(countPoints(tennis.variables.valueM1000SFPlayer2,
				tennis.variables.valuePlacingsSF, tennis.variables.valueM1000MaxPoints, "M1000"));
		textFieldCountM1000QFPlayer2.setText(countPoints(tennis.variables.valueM1000QFPlayer2,
				tennis.variables.valuePlacingsQF, tennis.variables.valueM1000MaxPoints, "M1000"));
		textFieldCountM1000R16Player2.setText(countPoints(tennis.variables.valueM1000R16Player2,
				tennis.variables.valuePlacingsR16, tennis.variables.valueM1000MaxPoints, "M1000"));
		textFieldCountM1000R32Player2.setText(countPoints(tennis.variables.valueM1000R32Player2,
				tennis.variables.valuePlacingsR32, tennis.variables.valueM1000MaxPoints, "M1000"));
		textFieldCountM1000R64Player2.setText(countPoints(tennis.variables.valueM1000R64Player2,
				tennis.variables.valuePlacingsR64, tennis.variables.valueM1000MaxPoints, "M1000"));
		textFieldCountM1000R128Player2.setText(countPoints(tennis.variables.valueM1000R128Player2,
				tennis.variables.valuePlacingsR128, tennis.variables.valueM1000MaxPoints, "M1000"));
		// ATP500
		textFieldCountATP500WPlayer2.setText(countPoints(tennis.variables.valueATP500WPlayer2,
				tennis.variables.valuePlacingsW, tennis.variables.valueATP500MaxPoints, "ATP500"));
		textFieldCountATP500FPlayer2.setText(countPoints(tennis.variables.valueATP500FPlayer2,
				tennis.variables.valuePlacingsF, tennis.variables.valueATP500MaxPoints, "ATP500"));
		textFieldCountATP500SFPlayer2.setText(countPoints(tennis.variables.valueATP500SFPlayer2,
				tennis.variables.valuePlacingsSF, tennis.variables.valueATP500MaxPoints, "ATP500"));
		textFieldCountATP500QFPlayer2.setText(countPoints(tennis.variables.valueATP500QFPlayer2,
				tennis.variables.valuePlacingsQF, tennis.variables.valueATP500MaxPoints, "ATP500"));
		textFieldCountATP500R16Player2.setText(countPoints(tennis.variables.valueATP500R16Player2,
				tennis.variables.valuePlacingsR16, tennis.variables.valueATP500MaxPoints, "ATP500"));
		textFieldCountATP500R32Player2.setText(countPoints(tennis.variables.valueATP500R32Player2,
				tennis.variables.valuePlacingsR32, tennis.variables.valueATP500MaxPoints, "ATP500"));
		textFieldCountATP500R64Player2.setText(countPoints(tennis.variables.valueATP500R64Player2,
				tennis.variables.valuePlacingsR64, tennis.variables.valueATP500MaxPoints, "ATP500"));
		textFieldCountATP500R128Player2.setText(countPoints(tennis.variables.valueATP500R128Player2,
				tennis.variables.valuePlacingsR128, tennis.variables.valueATP500MaxPoints, "ATP500"));
		// ATP250
		textFieldCountATP250WPlayer2.setText(countPoints(tennis.variables.valueATP250WPlayer2,
				tennis.variables.valuePlacingsW, tennis.variables.valueATP250MaxPoints, "ATP250"));
		textFieldCountATP250FPlayer2.setText(countPoints(tennis.variables.valueATP250FPlayer2,
				tennis.variables.valuePlacingsF, tennis.variables.valueATP250MaxPoints, "ATP250"));
		textFieldCountATP250SFPlayer2.setText(countPoints(tennis.variables.valueATP250SFPlayer2,
				tennis.variables.valuePlacingsSF, tennis.variables.valueATP250MaxPoints, "ATP250"));
		textFieldCountATP250QFPlayer2.setText(countPoints(tennis.variables.valueATP250QFPlayer2,
				tennis.variables.valuePlacingsQF, tennis.variables.valueATP250MaxPoints, "ATP250"));
		textFieldCountATP250R16Player2.setText(countPoints(tennis.variables.valueATP250R16Player2,
				tennis.variables.valuePlacingsR16, tennis.variables.valueATP250MaxPoints, "ATP250"));
		textFieldCountATP250R32Player2.setText(countPoints(tennis.variables.valueATP250R32Player2,
				tennis.variables.valuePlacingsR32, tennis.variables.valueATP250MaxPoints, "ATP250"));
		textFieldCountATP250R64Player2.setText(countPoints(tennis.variables.valueATP250R64Player2,
				tennis.variables.valuePlacingsR64, tennis.variables.valueATP250MaxPoints, "ATP250"));
		textFieldCountATP250R128Player2.setText(countPoints(tennis.variables.valueATP250R128Player2,
				tennis.variables.valuePlacingsR128, tennis.variables.valueATP250MaxPoints, "ATP250"));
		// Masters
		textFieldCountMastersWPlayer2.setText(countPoints(tennis.variables.valueMastersWPlayer2,
				tennis.variables.valuePlacingsW, tennis.variables.valueMastersMaxPoints, "Masters"));
		textFieldCountMastersFPlayer2.setText(countPoints(tennis.variables.valueMastersFPlayer2,
				tennis.variables.valuePlacingsF, tennis.variables.valueMastersMaxPoints, "Masters"));
		textFieldCountMastersSFPlayer2.setText(countPoints(tennis.variables.valueMastersSFPlayer2,
				tennis.variables.valuePlacingsSF, tennis.variables.valueMastersMaxPoints, "Masters"));
		textFieldCountMastersRR3Player2.setText(countPoints(tennis.variables.valueMastersRR3Player2,
				tennis.variables.valuePlacingsSF, tennis.variables.valueMastersMaxPoints, "Masters"));
		textFieldCountMastersRR2Player2.setText(countPoints(tennis.variables.valueMastersRR2Player2,
				tennis.variables.valuePlacingsQF, tennis.variables.valueMastersMaxPoints, "Masters"));
		textFieldCountMastersRR1Player2.setText(countPoints(tennis.variables.valueMastersRR1Player2,
				tennis.variables.valuePlacingsR16, tennis.variables.valueMastersMaxPoints, "Masters"));
		// Olympics
		textFieldCountOlympicsWPlayer2.setText(countPoints(tennis.variables.valueOlympicsWPlayer2,
				tennis.variables.valuePlacingsW, tennis.variables.valueOlympicsMaxPoints, "Olympics"));
		textFieldCountOlympicsFPlayer2.setText(countPoints(tennis.variables.valueOlympicsFPlayer2,
				tennis.variables.valuePlacingsF, tennis.variables.valueOlympicsMaxPoints, "Olympics"));
		textFieldCountOlympicsSFPlayer2.setText(countPoints(tennis.variables.valueOlympicsSFPlayer2,
				tennis.variables.valuePlacingsSF, tennis.variables.valueOlympicsMaxPoints, "Olympics"));
		textFieldCountOlympicsQFPlayer2.setText(countPoints(tennis.variables.valueOlympicsQFPlayer2,
				tennis.variables.valuePlacingsQF, tennis.variables.valueOlympicsMaxPoints, "Olympics"));
		textFieldCountOlympicsR16Player2.setText(countPoints(tennis.variables.valueOlympicsR16Player2,
				tennis.variables.valuePlacingsR16, tennis.variables.valueOlympicsMaxPoints, "Olympics"));
		textFieldCountOlympicsR32Player2.setText(countPoints(tennis.variables.valueOlympicsR32Player2,
				tennis.variables.valuePlacingsR32, tennis.variables.valueOlympicsMaxPoints, "Olympics"));
		textFieldCountOlympicsR64Player2.setText(countPoints(tennis.variables.valueOlympicsR64Player2,
				tennis.variables.valuePlacingsR64, tennis.variables.valueOlympicsMaxPoints, "Olympics"));
		textFieldCountOlympicsR128Player2.setText(countPoints(tennis.variables.valueOlympicsR128Player2,
				tennis.variables.valuePlacingsR128, tennis.variables.valueOlympicsMaxPoints, "Olympics"));

		double MaxProp = tennis.variables.valueSlamMaxPoints / Double.parseDouble(PropSlamM1000.getText());
		MaxProp = (Math.ceil(MaxProp * Math.pow(10, 1)) / Math.pow(10, 1));
		tennis.variables.valueM1000MaxPoints = MaxProp;
		textFieldM1000MaxPoints.setText(Double.toString(MaxProp));

		MaxProp = tennis.variables.valueM1000MaxPoints / Double.parseDouble(PropM1000ATP500.getText());
		MaxProp = (Math.ceil(MaxProp * Math.pow(10, 1)) / Math.pow(10, 1));
		tennis.variables.valueATP500MaxPoints = MaxProp;
		textFieldATP500MaxPoints.setText(Double.toString(MaxProp));
		
		MaxProp = tennis.variables.valueATP500MaxPoints / Double.parseDouble(PropATP500ATP250.getText());
		MaxProp = (Math.ceil(MaxProp * Math.pow(10, 1)) / Math.pow(10, 1));
		tennis.variables.valueATP250MaxPoints = MaxProp;
		textFieldATP250MaxPoints.setText(Double.toString(MaxProp));

		MaxProp = tennis.variables.valueSlamMaxPoints / Double.parseDouble(PropSlamMasters.getText());
		MaxProp = (Math.ceil(MaxProp * Math.pow(10, 1)) / Math.pow(10, 1));
		tennis.variables.valueMastersMaxPoints = MaxProp;
		textFieldMastersMaxPoints.setText(Double.toString(MaxProp));

		MaxProp = tennis.variables.valueSlamMaxPoints / Double.parseDouble(PropSlamOlympics.getText());
		MaxProp = (Math.ceil(MaxProp * Math.pow(10, 1)) / Math.pow(10, 1));
		tennis.variables.valueOlympicsMaxPoints = MaxProp;
		textFieldOlympicsMaxPoints.setText(Double.toString(MaxProp));

		countSum();

	}

	private void countSum() {
		double countSlam;

		// Slam
		countSlam = Double.parseDouble(textFieldCountSlamWPlayer1.getText())
				+ Double.parseDouble(textFieldCountSlamFPlayer1.getText())
				+ Double.parseDouble(textFieldCountSlamSFPlayer1.getText())
				+ Double.parseDouble(textFieldCountSlamQFPlayer1.getText())
				+ Double.parseDouble(textFieldCountSlamR16Player1.getText())
				+ Double.parseDouble(textFieldCountSlamR32Player1.getText())
				+ Double.parseDouble(textFieldCountSlamR64Player1.getText())
				+ Double.parseDouble(textFieldCountSlamR128Player1.getText());
		
		countSlam = (Math.ceil(countSlam * Math.pow(10, 1)) / Math.pow(10, 1));
		textFieldCountSlamSumPlayer1.setText(String.valueOf(countSlam));

		countSlam = Double.parseDouble(textFieldCountSlamWPlayer2.getText())
				+ Double.parseDouble(textFieldCountSlamFPlayer2.getText())
				+ Double.parseDouble(textFieldCountSlamSFPlayer2.getText())
				+ Double.parseDouble(textFieldCountSlamQFPlayer2.getText())
				+ Double.parseDouble(textFieldCountSlamR16Player2.getText())
				+ Double.parseDouble(textFieldCountSlamR32Player2.getText())
				+ Double.parseDouble(textFieldCountSlamR64Player2.getText())
				+ Double.parseDouble(textFieldCountSlamR128Player2.getText());

		countSlam = (Math.ceil(countSlam * Math.pow(10, 1)) / Math.pow(10, 1));
		textFieldCountSlamSumPlayer2.setText(String.valueOf(countSlam));

		// M1000
		double countM1000;
		countM1000 = Double.parseDouble(textFieldCountM1000WPlayer1.getText())
				+ Double.parseDouble(textFieldCountM1000FPlayer1.getText())
				+ Double.parseDouble(textFieldCountM1000SFPlayer1.getText())
				+ Double.parseDouble(textFieldCountM1000QFPlayer1.getText())
				+ Double.parseDouble(textFieldCountM1000R16Player1.getText())
				+ Double.parseDouble(textFieldCountM1000R32Player1.getText())
				+ Double.parseDouble(textFieldCountM1000R64Player1.getText())
				+ Double.parseDouble(textFieldCountM1000R128Player1.getText());
		countM1000 = (Math.ceil(countM1000 * Math.pow(10, 1)) / Math.pow(10, 1));
		textFieldCountM1000SumPlayer1.setText(String.valueOf(countM1000));

		countM1000 = Double.parseDouble(textFieldCountM1000WPlayer2.getText())
				+ Double.parseDouble(textFieldCountM1000FPlayer2.getText())
				+ Double.parseDouble(textFieldCountM1000SFPlayer2.getText())
				+ Double.parseDouble(textFieldCountM1000QFPlayer2.getText())
				+ Double.parseDouble(textFieldCountM1000R16Player2.getText())
				+ Double.parseDouble(textFieldCountM1000R32Player2.getText())
				+ Double.parseDouble(textFieldCountM1000R64Player2.getText())
				+ Double.parseDouble(textFieldCountM1000R128Player2.getText());

		countM1000 = (Math.ceil(countM1000 * Math.pow(10, 1)) / Math.pow(10, 1));
		textFieldCountM1000SumPlayer2.setText(String.valueOf(countM1000));

		double countATP500;
		countATP500 = Double.parseDouble(textFieldCountATP500WPlayer1.getText())
				+ Double.parseDouble(textFieldCountATP500FPlayer1.getText())
				+ Double.parseDouble(textFieldCountATP500SFPlayer1.getText())
				+ Double.parseDouble(textFieldCountATP500QFPlayer1.getText())
				+ Double.parseDouble(textFieldCountATP500R16Player1.getText())
				+ Double.parseDouble(textFieldCountATP500R32Player1.getText())
				+ Double.parseDouble(textFieldCountATP500R64Player1.getText())
				+ Double.parseDouble(textFieldCountATP500R128Player1.getText());
		countATP500 = (Math.ceil(countATP500 * Math.pow(10, 1)) / Math.pow(10, 1));
		textFieldCountATP500SumPlayer1.setText(String.valueOf(countATP500));

		countATP500 = Double.parseDouble(textFieldCountATP500WPlayer2.getText())
				+ Double.parseDouble(textFieldCountATP500FPlayer2.getText())
				+ Double.parseDouble(textFieldCountATP500SFPlayer2.getText())
				+ Double.parseDouble(textFieldCountATP500QFPlayer2.getText())
				+ Double.parseDouble(textFieldCountATP500R16Player2.getText())
				+ Double.parseDouble(textFieldCountATP500R32Player2.getText())
				+ Double.parseDouble(textFieldCountATP500R64Player2.getText())
				+ Double.parseDouble(textFieldCountATP500R128Player2.getText());

		countATP500 = (Math.ceil(countATP500 * Math.pow(10, 1)) / Math.pow(10, 1));
		textFieldCountATP500SumPlayer2.setText(String.valueOf(countATP500));

		double countATP250;
		countATP250 = Double.parseDouble(textFieldCountATP250WPlayer1.getText())
				+ Double.parseDouble(textFieldCountATP250FPlayer1.getText())
				+ Double.parseDouble(textFieldCountATP250SFPlayer1.getText())
				+ Double.parseDouble(textFieldCountATP250QFPlayer1.getText())
				+ Double.parseDouble(textFieldCountATP250R16Player1.getText())
				+ Double.parseDouble(textFieldCountATP250R32Player1.getText())
				+ Double.parseDouble(textFieldCountATP250R64Player1.getText())
				+ Double.parseDouble(textFieldCountATP250R128Player1.getText());
		countATP250 = (Math.ceil(countATP250 * Math.pow(10, 1)) / Math.pow(10, 1));
		textFieldCountATP250SumPlayer1.setText(String.valueOf(countATP250));

		countATP250 = Double.parseDouble(textFieldCountATP250WPlayer2.getText())
				+ Double.parseDouble(textFieldCountATP250FPlayer2.getText())
				+ Double.parseDouble(textFieldCountATP250SFPlayer2.getText())
				+ Double.parseDouble(textFieldCountATP250QFPlayer2.getText())
				+ Double.parseDouble(textFieldCountATP250R16Player2.getText())
				+ Double.parseDouble(textFieldCountATP250R32Player2.getText())
				+ Double.parseDouble(textFieldCountATP250R64Player2.getText())
				+ Double.parseDouble(textFieldCountATP250R128Player2.getText());

		countATP250 = (Math.ceil(countATP250 * Math.pow(10, 1)) / Math.pow(10, 1));
		textFieldCountATP250SumPlayer2.setText(String.valueOf(countATP250));

		double countMasters;
		countMasters = Double.parseDouble(textFieldCountMastersWPlayer1.getText())
				+ Double.parseDouble(textFieldCountMastersFPlayer1.getText())
				+ Double.parseDouble(textFieldCountMastersSFPlayer1.getText())
				+ Double.parseDouble(textFieldCountMastersRR3Player1.getText())
				+ Double.parseDouble(textFieldCountMastersRR2Player1.getText())
				+ Double.parseDouble(textFieldCountMastersRR1Player1.getText());

		countMasters = (Math.ceil(countMasters * Math.pow(10, 1)) / Math.pow(10, 1));
		textFieldCountMastersSumPlayer1.setText(String.valueOf(countMasters));

		countMasters = Double.parseDouble(textFieldCountMastersWPlayer2.getText())
				+ Double.parseDouble(textFieldCountMastersFPlayer2.getText())
				+ Double.parseDouble(textFieldCountMastersSFPlayer2.getText())
				+ Double.parseDouble(textFieldCountMastersRR3Player2.getText())
				+ Double.parseDouble(textFieldCountMastersRR2Player2.getText())
				+ Double.parseDouble(textFieldCountMastersRR1Player2.getText());

		countMasters = (Math.ceil(countMasters * Math.pow(10, 1)) / Math.pow(10, 1));
		textFieldCountMastersSumPlayer2.setText(String.valueOf(countMasters));

		double countOlympics;
		countOlympics = Double.parseDouble(textFieldCountOlympicsWPlayer1.getText())
				+ Double.parseDouble(textFieldCountOlympicsFPlayer1.getText())
				+ Double.parseDouble(textFieldCountOlympicsSFPlayer1.getText())
				+ Double.parseDouble(textFieldCountOlympicsQFPlayer1.getText())
				+ Double.parseDouble(textFieldCountOlympicsR16Player1.getText())
				+ Double.parseDouble(textFieldCountOlympicsR32Player1.getText())
				+ Double.parseDouble(textFieldCountOlympicsR64Player1.getText())
				+ Double.parseDouble(textFieldCountOlympicsR128Player1.getText());
		countOlympics = (Math.ceil(countOlympics * Math.pow(10, 1)) / Math.pow(10, 1));
		textFieldCountOlympicsSumPlayer1.setText(String.valueOf(countOlympics));

		countOlympics = Double.parseDouble(textFieldCountOlympicsWPlayer2.getText())
				+ Double.parseDouble(textFieldCountOlympicsFPlayer2.getText())
				+ Double.parseDouble(textFieldCountOlympicsSFPlayer2.getText())
				+ Double.parseDouble(textFieldCountOlympicsQFPlayer2.getText())
				+ Double.parseDouble(textFieldCountOlympicsR16Player2.getText())
				+ Double.parseDouble(textFieldCountOlympicsR32Player2.getText())
				+ Double.parseDouble(textFieldCountOlympicsR64Player2.getText())
				+ Double.parseDouble(textFieldCountOlympicsR128Player2.getText());

		countOlympics = (Math.ceil(countOlympics * Math.pow(10, 1)) / Math.pow(10, 1));
		textFieldCountOlympicsSumPlayer2.setText(String.valueOf(countOlympics));

		double GOATPointsPlayer1 = Double.parseDouble(String.valueOf(textFieldCountSlamSumPlayer1.getText()))
				+ Double.parseDouble(String.valueOf(textFieldCountM1000SumPlayer1.getText()))
				+ Double.parseDouble(String.valueOf(textFieldCountATP500SumPlayer1.getText()))
				+ Double.parseDouble(String.valueOf(textFieldCountATP250SumPlayer1.getText()))
				+ Double.parseDouble(String.valueOf(textFieldCountMastersSumPlayer1.getText()))
				+ Double.parseDouble(String.valueOf(textFieldCountOlympicsSumPlayer1.getText()));
		double GOATPointsPlayer2 = Double.parseDouble(String.valueOf(textFieldCountSlamSumPlayer2.getText()))
				+ Double.parseDouble(String.valueOf(textFieldCountM1000SumPlayer2.getText()))
				+ Double.parseDouble(String.valueOf(textFieldCountATP500SumPlayer2.getText()))
				+ Double.parseDouble(String.valueOf(textFieldCountATP250SumPlayer2.getText()))
				+ Double.parseDouble(String.valueOf(textFieldCountMastersSumPlayer2.getText()))
				+ Double.parseDouble(String.valueOf(textFieldCountOlympicsSumPlayer2.getText()));

		GOATPointsPlayer1 = (Math.ceil(GOATPointsPlayer1 * Math.pow(10, 1)) / Math.pow(10, 1));
		GOATPointsPlayer2 = (Math.ceil(GOATPointsPlayer2 * Math.pow(10, 1)) / Math.pow(10, 1));

		textFieldGOATPointsPlayer1.setText(String.valueOf(GOATPointsPlayer1));
		textFieldGOATPointsPlayer2.setText(String.valueOf(GOATPointsPlayer2));
		if (GOATPointsPlayer1 > GOATPointsPlayer2) {
			textFieldGOATPointsPlayer1.setBackground(Color.GREEN);
			textFieldGOATPointsPlayer2.setBackground(Color.WHITE);
			lblImgWinner.setIcon(iReportPlayer1);

		} else {
			textFieldGOATPointsPlayer2.setBackground(Color.GREEN);
			textFieldGOATPointsPlayer1.setBackground(Color.WHITE);
			lblImgWinner.setIcon(iReportPlayer2);
		}

	}

	private String countPoints(double number, double placings, double maxPoints, String type) {
		double count = 0.0;
		if (type.equals("Slam")) {
			count = number * placings * maxPoints;
		}
		if (type.equals("M1000")) {
			count = number * placings * maxPoints;
		}
		if (type.equals("ATP500")) {
			count = number * placings * maxPoints;
		}
		if (type.equals("ATP250")) {
			count = number * placings * maxPoints;
		}
		if (type.equals("Masters")) {
			count = number * placings * maxPoints;
		}
		if (type.equals("Olympics")) {
			count = number * placings * maxPoints;
		}

		count = (Math.ceil(count * Math.pow(10, 1)) / Math.pow(10, 1));
		return String.valueOf(count);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();

		if (source instanceof JMenuItem) {
			if (source == mntmHomeFederer1) {
				setPlayer("Federer", 1);
				setPoints();
			}
			if (source == mntmHomeNadal1) {
				setPlayer("Nadal", 1);
				setPoints();
			}
			if (source == mntmHomeFederer2) {
				setPlayer("Federer", 2);
				setPoints();
			}
			if (source == mntmHomeNadal2) {
				setPlayer("Nadal", 2);
				setPoints();
			}
		}

		if (source == btnCalculate) {
			setPoints();
		}

		if (source == rdbPlacingsTML) {
			placings = new Placings("TML");
			setPlacings();
			setPoints();
		}

		if (source == rdbPlacingsATP) {
			placings = new Placings("ATP");
			setPlacings();
			setPoints();
		}

	}

	public void itemStateChanged(ItemEvent event) {
	}

	public class ChangeAction implements ChangeListener {
		double value;
		String string;
		@Override
		public void stateChanged(ChangeEvent e) {
			
			Object slider = e.getSource();
			if (slider == sliderSlamM1000) {
				value = sliderSlamM1000.getValue() / 100.0;
				string = Double.toString(value);
				PropSlamM1000.setText(string);
				setPoints();
			}
			if (slider == sliderM1000ATP500) {
				value = sliderM1000ATP500.getValue() / 100.0;
				string = Double.toString(value);
				PropM1000ATP500.setText(string);
				setPoints();
			}
			if (slider == sliderATP500ATP250) {
				value = sliderATP500ATP250.getValue() / 100.0;
				string = Double.toString(value);
				PropATP500ATP250.setText(string);
				setPoints();
			}

			if (slider == sliderSlamMasters) {
				value = sliderSlamMasters.getValue() / 100.0;
				string = Double.toString(value);
				PropSlamMasters.setText(string);
				setPoints();
			}

			if (slider == sliderSlamOlympics) {
				value = sliderSlamOlympics.getValue() / 100.0;
				string = Double.toString(value);
				PropSlamOlympics.setText(string);
				setPoints();
			}

		}
	}
}
