import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class a {
	public static boolean xo = false;
	public static int ll1;
	public static int ll2;
	public static int ll3;
	public static int ll4;
	public static int ll5;
	public static int ll6;
	public static int ll7;
	public static int ll8;
	public static int ll9;
	public static boolean win = false;
	public final Label l2 = new Label("");
	public final Label l1 = new Label("");
	public final Label l8 = new Label("");
	public final Label l7 = new Label("");
	public final Label l9 = new Label("");
	public final Label l6 = new Label("");
	public final Label l5 = new Label("");
	public final Label l4 = new Label("");
	public final Label l3 = new Label("");
	public static boolean play = false;
	public static boolean set1 = false;
	public static boolean set2 = false;
	public static boolean set3 = false;
	public static boolean set4 = false;
	public static boolean set5 = false;
	public static boolean set6 = false;
	public static boolean set7 = false;
	public static boolean set8 = false;
	public static boolean set9 = false;

	private JFrame frmXoGame;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {
				try {
					a window = new a();
					window.frmXoGame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public a() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frmXoGame = new JFrame();
		frmXoGame.setTitle("XO GAME");
		frmXoGame.getContentPane().setBackground(Color.DARK_GRAY);
		frmXoGame.setBounds(100, 100, 403, 389);
		frmXoGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmXoGame.getContentPane().setLayout(null);
		l1.addMouseListener(new MouseAdapter() {
			boolean set = false;

			@Override
			public void mouseClicked(MouseEvent arg0) {

				// System.out.println(xo);

				if (set1 == false) {
					if ((xo == false)) {
						l1.setText("X");
						ll1 = 1;
						set1 = true;
						xo = true;
					} else {
						l1.setText("O");
						ll1 = 2;
						set1 = true;
						xo = false;
					}

				}
				ceck();
				if (win == false) {
					if (l1.getText().equals("") || l2.getText().equals("")
							|| l3.getText().equals("")
							|| l4.getText().equals("")
							|| l5.getText().equals("")
							|| l6.getText().equals("")
							|| l7.getText().equals("")
							|| l8.getText().equals("")
							|| l9.getText().equals("")) {

					} else {

						int dialogButton = JOptionPane.YES_NO_OPTION;
						int dialogResult = JOptionPane.showConfirmDialog(null,
								"play again ", "x win", dialogButton);
						if (dialogResult == JOptionPane.YES_OPTION) {
							reset();
							l1.setText("");
							l2.setText("");
							l3.setText("");
							l4.setText("");
							l5.setText("");
							l6.setText("");
							l7.setText("");
							l8.setText("");
							l9.setText("");
						} else {
							System.exit(0);
						}

					}

				} else if (play == true) {
					reset();
					l1.setText("");
					l2.setText("");
					l3.setText("");
					l4.setText("");
					l5.setText("");
					l6.setText("");
					l7.setText("");
					l8.setText("");
					l9.setText("");

				}
			}
		});
		l1.setFont(new Font("Dialog", Font.BOLD, 78));
		l1.setAlignment(Label.CENTER);
		l1.setBackground(Color.LIGHT_GRAY);
		l1.setBounds(10, 10, 106, 95);
		frmXoGame.getContentPane().add(l1);

		l2.setAlignment(Label.CENTER);
		l2.addMouseListener(new MouseAdapter() {
			boolean set = false;

			@Override
			public void mouseClicked(MouseEvent arg0) {

				// System.out.println(xo);

				if (set2 == false) {
					if ((xo == false)) {
						l2.setText("X");
						ll2 = 1;
						set2 = true;
						xo = true;
					} else {
						l2.setText("O");
						ll2 = 2;
						set2 = true;
						xo = false;
					}

				}
				ceck();
				if (win == false) {
					if (l1.getText().equals("") || l2.getText().equals("")
							|| l3.getText().equals("")
							|| l4.getText().equals("")
							|| l5.getText().equals("")
							|| l6.getText().equals("")
							|| l7.getText().equals("")
							|| l8.getText().equals("")
							|| l9.getText().equals("")) {

					} else {

						int dialogButton = JOptionPane.YES_NO_OPTION;
						int dialogResult = JOptionPane.showConfirmDialog(null,
								"play again ", "x win", dialogButton);
						if (dialogResult == JOptionPane.YES_OPTION) {
							reset();
							l1.setText("");
							l2.setText("");
							l3.setText("");
							l4.setText("");
							l5.setText("");
							l6.setText("");
							l7.setText("");
							l8.setText("");
							l9.setText("");
						} else {
							System.exit(0);
						}

					}

				} else if (play == true) {
					reset();
					l1.setText("");
					l2.setText("");
					l3.setText("");
					l4.setText("");
					l5.setText("");
					l6.setText("");
					l7.setText("");
					l8.setText("");
					l9.setText("");

				}
			}
		});
		l2.setBackground(Color.LIGHT_GRAY);
		l2.setBounds(122, 10, 149, 95);
		frmXoGame.getContentPane().add(l2);

		l3.setAlignment(Label.CENTER);
		l3.addMouseListener(new MouseAdapter() {
			boolean set = false;

			@Override
			public void mouseClicked(MouseEvent arg0) {

				// System.out.println(xo);

				if (set3 == false) {
					if ((xo == false)) {
						l3.setText("X");
						ll3 = 1;
						set3 = true;
						xo = true;
					} else {
						l3.setText("O");
						ll3 = 2;
						set3 = true;
						xo = false;
					}

				}
				ceck();
				if (win == false) {
					if (l1.getText().equals("") || l2.getText().equals("")
							|| l3.getText().equals("")
							|| l4.getText().equals("")
							|| l5.getText().equals("")
							|| l6.getText().equals("")
							|| l7.getText().equals("")
							|| l8.getText().equals("")
							|| l9.getText().equals("")) {

					} else {

						int dialogButton = JOptionPane.YES_NO_OPTION;
						int dialogResult = JOptionPane.showConfirmDialog(null,
								"play again ", "x win", dialogButton);
						if (dialogResult == JOptionPane.YES_OPTION) {
							reset();
							l1.setText("");
							l2.setText("");
							l3.setText("");
							l4.setText("");
							l5.setText("");
							l6.setText("");
							l7.setText("");
							l8.setText("");
							l9.setText("");
						} else {
							System.exit(0);
						}

					}

				} else if (play == true) {
					reset();
					l1.setText("");
					l2.setText("");
					l3.setText("");
					l4.setText("");
					l5.setText("");
					l6.setText("");
					l7.setText("");
					l8.setText("");
					l9.setText("");

				}
			}
		});
		l3.setBackground(Color.LIGHT_GRAY);
		l3.setBounds(277, 10, 108, 95);
		frmXoGame.getContentPane().add(l3);

		l4.setAlignment(Label.CENTER);
		l4.addMouseListener(new MouseAdapter() {
			boolean set = false;

			@Override
			public void mouseClicked(MouseEvent arg0) {

				// System.out.println(xo);

				if (set4 == false) {
					if ((xo == false)) {
						l4.setText("X");
						ll4 = 1;
						set4 = true;
						xo = true;
					} else {
						l4.setText("O");
						ll4 = 2;
						set4 = true;
						xo = false;
					}

				}
				ceck();
				if (win == false) {
					if (l1.getText().equals("") || l2.getText().equals("")
							|| l3.getText().equals("")
							|| l4.getText().equals("")
							|| l5.getText().equals("")
							|| l6.getText().equals("")
							|| l7.getText().equals("")
							|| l8.getText().equals("")
							|| l9.getText().equals("")) {

					} else {

						int dialogButton = JOptionPane.YES_NO_OPTION;
						int dialogResult = JOptionPane.showConfirmDialog(null,
								"play again ", "x win", dialogButton);
						if (dialogResult == JOptionPane.YES_OPTION) {
							reset();
							l1.setText("");
							l2.setText("");
							l3.setText("");
							l4.setText("");
							l5.setText("");
							l6.setText("");
							l7.setText("");
							l8.setText("");
							l9.setText("");
						} else {
							System.exit(0);
						}

					}

				} else if (play == true) {
					reset();
					l1.setText("");
					l2.setText("");
					l3.setText("");
					l4.setText("");
					l5.setText("");
					l6.setText("");
					l7.setText("");
					l8.setText("");
					l9.setText("");

				}
			}
		});
		l4.setBackground(Color.LIGHT_GRAY);
		l4.setBounds(10, 111, 106, 124);
		frmXoGame.getContentPane().add(l4);

		l5.setAlignment(Label.CENTER);
		l5.addMouseListener(new MouseAdapter() {
			boolean set = false;

			@Override
			public void mouseClicked(MouseEvent arg0) {

				// System.out.println(xo);

				if (set5 == false) {
					if ((xo == false)) {
						l5.setText("X");
						ll5 = 1;
						set5 = true;
						xo = true;
					} else {
						l5.setText("O");
						ll5 = 2;
						set5 = true;
						xo = false;
					}

				}
				ceck();
				if (win == false) {
					if (l1.getText().equals("") || l2.getText().equals("")
							|| l3.getText().equals("")
							|| l4.getText().equals("")
							|| l5.getText().equals("")
							|| l6.getText().equals("")
							|| l7.getText().equals("")
							|| l8.getText().equals("")
							|| l9.getText().equals("")) {

					} else {

						int dialogButton = JOptionPane.YES_NO_OPTION;
						int dialogResult = JOptionPane.showConfirmDialog(null,
								"play again ", "x win", dialogButton);
						if (dialogResult == JOptionPane.YES_OPTION) {
							reset();
							l1.setText("");
							l2.setText("");
							l3.setText("");
							l4.setText("");
							l5.setText("");
							l6.setText("");
							l7.setText("");
							l8.setText("");
							l9.setText("");
						} else {
							System.exit(0);
						}

					}

				} else {
					reset();
					l1.setText("");
					l2.setText("");
					l3.setText("");
					l4.setText("");
					l5.setText("");
					l6.setText("");
					l7.setText("");
					l8.setText("");
					l9.setText("");

				}
			}
		});
		l5.setBackground(Color.LIGHT_GRAY);
		l5.setBounds(122, 111, 149, 124);
		frmXoGame.getContentPane().add(l5);

		l6.setAlignment(Label.CENTER);
		l6.addMouseListener(new MouseAdapter() {
			boolean set = false;

			@Override
			public void mouseClicked(MouseEvent arg0) {

				// System.out.println(xo);

				if (set6 == false) {
					if ((xo == false)) {
						l6.setText("X");
						ll6 = 1;
						set6 = true;
						xo = true;
					} else {
						l6.setText("O");
						ll6 = 2;
						set6 = true;
						xo = false;
					}

				}
				ceck();
				if (win == false) {
					if (l1.getText().equals("") || l2.getText().equals("")
							|| l3.getText().equals("")
							|| l4.getText().equals("")
							|| l5.getText().equals("")
							|| l6.getText().equals("")
							|| l7.getText().equals("")
							|| l8.getText().equals("")
							|| l9.getText().equals("")) {

					} else {

						int dialogButton = JOptionPane.YES_NO_OPTION;
						int dialogResult = JOptionPane.showConfirmDialog(null,
								"play again ", "x win", dialogButton);
						if (dialogResult == JOptionPane.YES_OPTION) {
							reset();
							l1.setText("");
							l2.setText("");
							l3.setText("");
							l4.setText("");
							l5.setText("");
							l6.setText("");
							l7.setText("");
							l8.setText("");
							l9.setText("");
						} else {
							System.exit(0);
						}

					}

				} else {
					reset();
					l1.setText("");
					l2.setText("");
					l3.setText("");
					l4.setText("");
					l5.setText("");
					l6.setText("");
					l7.setText("");
					l8.setText("");
					l9.setText("");

				}
			}
		});
		l6.setBackground(Color.LIGHT_GRAY);
		l6.setBounds(277, 111, 108, 124);
		frmXoGame.getContentPane().add(l6);

		l9.setAlignment(Label.CENTER);
		l9.addMouseListener(new MouseAdapter() {
			boolean set7 = false;

			@Override
			public void mouseClicked(MouseEvent arg0) {

				// System.out.println(xo);

				if (set9 == false) {
					if ((xo == false)) {
						l9.setText("X");
						ll9 = 1;
						set9 = true;
						xo = true;
					} else {
						l9.setText("O");
						ll9 = 2;
						set9 = true;
						xo = false;
					}

				}
				ceck();
				if (win == false) {
					if (l1.getText().equals("") || l2.getText().equals("")
							|| l3.getText().equals("")
							|| l4.getText().equals("")
							|| l5.getText().equals("")
							|| l6.getText().equals("")
							|| l7.getText().equals("")
							|| l8.getText().equals("")
							|| l9.getText().equals("")) {

					} else {

						int dialogButton = JOptionPane.YES_NO_OPTION;
						int dialogResult = JOptionPane.showConfirmDialog(null,
								"play again ", "x win", dialogButton);
						if (dialogResult == JOptionPane.YES_OPTION) {
							reset();
							l1.setText("");
							l2.setText("");
							l3.setText("");
							l4.setText("");
							l5.setText("");
							l6.setText("");
							l7.setText("");
							l8.setText("");
							l9.setText("");
						} else {
							System.exit(0);
						}

					}

				} else {
					reset();
					l1.setText("");
					l2.setText("");
					l3.setText("");
					l4.setText("");
					l5.setText("");
					l6.setText("");
					l7.setText("");
					l8.setText("");
					l9.setText("");

				}
			}
		});
		l9.setBackground(Color.LIGHT_GRAY);
		l9.setBounds(277, 241, 108, 102);
		frmXoGame.getContentPane().add(l9);

		l7.setAlignment(Label.CENTER);
		l7.addMouseListener(new MouseAdapter() {
			boolean set = false;

			@Override
			public void mouseClicked(MouseEvent arg0) {

				// System.out.println(xo);

				if (set7 == false) {
					if ((xo == false)) {
						l7.setText("X");
						ll7 = 1;
						set7 = true;
						xo = true;
					} else {
						l7.setText("O");
						ll7 = 2;
						set7 = true;
						xo = false;
					}

				}
				ceck();
				if (win == false) {
					if (l1.getText().equals("") || l2.getText().equals("")
							|| l3.getText().equals("")
							|| l4.getText().equals("")
							|| l5.getText().equals("")
							|| l6.getText().equals("")
							|| l7.getText().equals("")
							|| l8.getText().equals("")
							|| l9.getText().equals("")) {

					} else {

						int dialogButton = JOptionPane.YES_NO_OPTION;
						int dialogResult = JOptionPane.showConfirmDialog(null,
								"play again ", "x win", dialogButton);
						if (dialogResult == JOptionPane.YES_OPTION) {
							reset();
							l1.setText("");
							l2.setText("");
							l3.setText("");
							l4.setText("");
							l5.setText("");
							l6.setText("");
							l7.setText("");
							l8.setText("");
							l9.setText("");
						} else {
							System.exit(0);
						}

					}

				} else if (play == true) {
					reset();
					l1.setText("");
					l2.setText("");
					l3.setText("");
					l4.setText("");
					l5.setText("");
					l6.setText("");
					l7.setText("");
					l8.setText("");
					l9.setText("");

				}
			}
		});
		l7.setBackground(Color.LIGHT_GRAY);
		l7.setBounds(10, 241, 106, 102);
		frmXoGame.getContentPane().add(l7);

		l8.setAlignment(Label.CENTER);
		l8.addMouseListener(new MouseAdapter() {
			boolean set = false;

			@Override
			public void mouseClicked(MouseEvent arg0) {

				// System.out.println(xo);

				if (set8 == false) {
					if ((xo == false)) {
						l8.setText("X");
						ll8 = 1;
						set8 = true;
						xo = true;
					} else {
						l8.setText("O");
						ll8 = 2;
						set8 = true;
						xo = false;
					}

				}
				ceck();
				if (win == false) {
					if (l1.getText().equals("") || l2.getText().equals("")
							|| l3.getText().equals("")
							|| l4.getText().equals("")
							|| l5.getText().equals("")
							|| l6.getText().equals("")
							|| l7.getText().equals("")
							|| l8.getText().equals("")
							|| l9.getText().equals("")) {
					} else {

						int dialogButton = JOptionPane.YES_NO_OPTION;
						int dialogResult = JOptionPane.showConfirmDialog(null,
								"play again ", "x win", dialogButton);
						if (dialogResult == JOptionPane.YES_OPTION) {
							reset();
							l1.setText("");
							l2.setText("");
							l3.setText("");
							l4.setText("");
							l5.setText("");
							l6.setText("");
							l7.setText("");
							l8.setText("");
							l9.setText("");
						} else {
							System.exit(0);
						}

					}
				} else if (play == true) {
					reset();
					l1.setText("");
					l2.setText("");
					l3.setText("");
					l4.setText("");
					l5.setText("");
					l6.setText("");
					l7.setText("");
					l8.setText("");
					l9.setText("");

				}
			}
		});
		l8.setBackground(Color.LIGHT_GRAY);
		l8.setBounds(122, 241, 149, 102);
		frmXoGame.getContentPane().add(l8);
		l2.setFont(new Font("Dialog", Font.BOLD, 78));
		l3.setFont(new Font("Dialog", Font.BOLD, 78));
		l4.setFont(new Font("Dialog", Font.BOLD, 78));
		l5.setFont(new Font("Dialog", Font.BOLD, 78));
		l6.setFont(new Font("Dialog", Font.BOLD, 78));
		l7.setFont(new Font("Dialog", Font.BOLD, 78));
		l8.setFont(new Font("Dialog", Font.BOLD, 78));
		l9.setFont(new Font("Dialog", Font.BOLD, 78));

		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(53, 169, 254, 1);
		frmXoGame.getContentPane().add(horizontalStrut);

	}

	public static void ceck() {

		if ((ll1 == 1 && ll2 == 1 && ll3 == 1)
				|| (ll4 == 1 && ll5 == 1 && ll6 == 1)
				|| (ll7 == 1 && ll8 == 1 && ll9 == 1)
				|| (ll1 == 1 && ll4 == 1 && ll7 == 1)
				|| (ll2 == 1 && ll5 == 1 && ll8 == 1)
				|| (ll3 == 1 && ll6 == 1 && ll9 == 1)
				|| (ll1 == 1 && ll5 == 1 && ll9 == 1)) {
			win = true;
			// System.out.println("X win");
			int dialogButton = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(null,
					"play again", "X win ", dialogButton);
			if (dialogResult == JOptionPane.YES_OPTION) {
				play = true;
				reset();

			} else {
				play = false;
			}

		} else if ((ll1 == 2 && ll2 == 2 && ll3 == 2)
				|| (ll4 == 2 && ll5 == 2 && ll6 == 2)
				|| (ll7 == 2 && ll8 == 2 && ll9 == 2)
				|| (ll1 == 2 && ll4 == 2 && ll7 == 2)
				|| (ll2 == 2 && ll5 == 2 && ll8 == 2)
				|| (ll3 == 2 && ll6 == 2 && ll9 == 2)
				|| (ll1 == 2 && ll5 == 2 && ll9 == 2)) {
			win = true;
			// System.out.println("O win");
			int dialogButton = JOptionPane.YES_NO_OPTION;
			int dialogResult = JOptionPane.showConfirmDialog(null,
					"play again ", "x win", dialogButton);
			if (dialogResult == JOptionPane.YES_OPTION) {
				play = true;
				reset();
			} else {
				play = false;
			}
		}

	}

	public static void reset() {
		ll1 = 0;
		ll2 = 0;
		ll3 = 0;
		ll4 = 0;
		ll5 = 0;
		ll6 = 0;
		ll7 = 0;
		ll8 = 0;
		ll9 = 0;
		xo = false;
		set1 = false;
		set2 = false;
		set3 = false;
		set4 = false;
		set5 = false;
		set6 = false;
		set7 = false;
		set8 = false;
		set9 = false;

	}
}
