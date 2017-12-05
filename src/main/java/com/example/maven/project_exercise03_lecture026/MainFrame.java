package com.example.maven.project_exercise03_lecture026;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	
	public MainFrame() {
		initialize();
	}

	private void initialize() {
		frame.setVisible(true);
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.setBounds(100, 100, 430, 387);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnToRadians = new JButton("to radians");
		btnToRadians.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnToRadians.setBackground(new Color(255, 255, 255));
		btnToRadians.setFont(new Font("Purisa", Font.BOLD, 14));
		btnToRadians.setBounds(27, 293, 136, 25);
		frame.getContentPane().add(btnToRadians);
		
		JButton btnToDegrees = new JButton("to degrees");
		btnToDegrees.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnToDegrees.setBackground(new Color(255, 255, 255));
		btnToDegrees.setFont(new Font("Purisa", Font.BOLD, 14));
		btnToDegrees.setBounds(175, 293, 136, 25);
		frame.getContentPane().add(btnToDegrees);
		
		JLabel lblEnterTheValue = new JLabel("Enter the value in degrees:");
		lblEnterTheValue.setFont(new Font("Purisa", Font.PLAIN, 10));
		lblEnterTheValue.setBounds(27, 26, 166, 15);
		frame.getContentPane().add(lblEnterTheValue);
		
		JLabel lblEnterTheValue_1 = new JLabel("Enter the value in radians:");
		lblEnterTheValue_1.setFont(new Font("Purisa", Font.PLAIN, 10));
		lblEnterTheValue_1.setBounds(27, 88, 167, 15);
		frame.getContentPane().add(lblEnterTheValue_1);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(46, 53, 114, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(46, 115, 114, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setFont(new Font("Purisa", Font.PLAIN, 12));
		lblResult.setBounds(27, 161, 70, 15);
		frame.getContentPane().add(lblResult);
	}
}
