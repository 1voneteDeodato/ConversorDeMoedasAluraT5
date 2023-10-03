package com.one.convrsor.brasil;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JOptionPane;


	public  class ConversorMoedas extends JFrame implements ActionListener {
		

			private JMenuBar menuBar;
			
			private JMenu menu;
			
			private JMenuItem entrada1;
			private JMenuItem entrada2;
			private JMenuItem entrada3;
			private JMenuItem entrada4;
			private JMenuItem entrada5;
			private JMenuItem entrada6;
			private JMenuItem entrada7;
			private JMenuItem entrada8;
			private JMenuItem entrada9;
			private JMenuItem entrada10;
			
			private JMenuItem entrada11;
			private JMenuItem entrada12;
			private JMenuItem entrada13;
			private JMenuItem entrada14;
			
			private JMenuItem entrada15;
			
			
	public ConversorMoedas() {
		
		setSize(2000, 2000);
		setTitle("Conversor de Moedas da ONE = ]");
		
		setVisible(true);
		setLocationRelativeTo(this);
		
		setForeground(Color.PINK);
		setFont(new Font("Arial", Font.BOLD, 40)); 
		
		setBackground(new Color(100, 100, 200));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel painel = new JPanel();
		
		exibirMenu();
		painel.add(menuBar);
		add(painel);
		
		
	}
	
	public void exibirMenu() {
		
		menuBar = new JMenuBar();
		menu = new JMenu("Escolha uma Entrada válida");
		
		
		
		entrada1 = new JMenuItem("De BRL/Reais para USD/Dólares");
		entrada2 = new JMenuItem("De BRL/Reais para EUR/Euros");
		entrada3 = new JMenuItem("De BRL/Reais para GBP/Libras Esterlinas");
		entrada4 = new JMenuItem("De BRL/Reais para ARS/Peso Argentino");
		entrada5 = new JMenuItem("De BRL/Reais para CLP/Peso Chileno");
		
		entrada6 = new JMenuItem("De USD/Dólares para BRL/Reais");
		entrada7 = new JMenuItem("De EUR/Euros para BRL/Reais");
		entrada8 = new JMenuItem("De GBP/Libras Esterlinas para BRL/Reais");
		entrada9 = new JMenuItem("De ARS/Peso Argentino para BRL/Reais");
		entrada10 = new JMenuItem("De CLP/Peso Chileno para BRL/Reais");
		
		entrada11 = new JMenuItem("De Metros para Quilômetros");
		entrada12 = new JMenuItem("De Milímetros para Metros");
		
		entrada13 = new JMenuItem("De Metros para Milímetros");
		entrada14 = new JMenuItem("De Quilômetros para Metros");
		
		entrada15 = new JMenuItem("Saindo do Programa");
		
		
		entrada1.setForeground(Color.BLUE);
		entrada1.setBounds(5,3,3,8);
		entrada1.setFont(new Font("Arial", Font.BOLD, 20)); 
		entrada1.setBackground(new Color(5, 10, 7));
		
		entrada2.setForeground(Color.RED);
		entrada2.setBounds(5,3,3,8);
		entrada2.setFont(new Font("Arial", Font.BOLD, 20)); 
		entrada2.setBackground(new Color(5, 10, 7));
		
		entrada3.setForeground(Color.YELLOW);
		entrada3.setBounds(5,3,3,8);
		entrada3.setFont(new Font("Arial", Font.BOLD, 20)); 
		entrada3.setBackground(new Color(5, 10, 7));
		
		entrada4.setForeground(Color.CYAN);
		entrada4.setBounds(5,3,3,8);
		entrada4.setFont(new Font("Arial", Font.BOLD, 20)); 
		entrada4.setBackground(new Color(5, 10, 7));
		
		entrada5.setForeground(Color.green);
		entrada5.setBounds(5,3,3,8);
		entrada5.setFont(new Font("Arial", Font.BOLD, 20)); 
		entrada5.setBackground(new Color(5, 10, 7));
		
		entrada6.setForeground(Color.magenta);
		entrada6.setBounds(5,3,3,8);
		entrada6.setFont(new Font("Arial", Font.BOLD, 20)); 
		entrada6.setBackground(new Color(5, 10, 7));
		
		entrada7.setForeground(Color.ORANGE);
		entrada7.setBounds(5,3,3,8);
		entrada7.setFont(new Font("Arial", Font.BOLD, 20)); 
		entrada7.setBackground(new Color(5, 10, 7));
		
		entrada8.setForeground(Color.GREEN);
		entrada8.setBounds(5,3,3,8);
		entrada8.setFont(new Font("Arial", Font.BOLD, 20)); 
		entrada8.setBackground(new Color(5, 10, 7));
		
		entrada9.setForeground(Color.PINK);
		entrada9.setBounds(5,3,3,8);
		entrada9.setFont(new Font("Arial", Font.BOLD, 20)); 
		entrada9.setBackground(new Color(5, 10, 7));
		
		entrada10.setForeground(Color.MAGENTA);
		entrada10.setBounds(5,3,3,8);
		entrada10.setFont(new Font("Arial", Font.BOLD, 20)); 
		entrada10.setBackground(new Color(5, 10, 7));
		
		entrada11.setForeground(Color.BLUE);
		entrada11.setBounds(5,3,3,8);
		entrada11.setFont(new Font("Arial", Font.BOLD, 20)); 
		entrada11.setBackground(new Color(5, 10, 7));
		
		
		entrada12.setForeground(Color.YELLOW);
		entrada12.setBounds(5,3,3,8);
		entrada12.setFont(new Font("Arial", Font.BOLD, 20)); 
		entrada12.setBackground(new Color(5, 10, 7));
		
		entrada13.setForeground(Color.pink);
		entrada13.setBounds(5,3,3,8);
		entrada13.setFont(new Font("Arial", Font.BOLD, 20)); 
		entrada13.setBackground(new Color(5, 10, 7));
		
		entrada14.setForeground(Color.orange);
		entrada14.setBounds(5,3,3,8);
		entrada14.setFont(new Font("Arial", Font.BOLD, 20)); 
		entrada14.setBackground(new Color(5, 10, 7));
		
			
		entrada15.setForeground(Color.lightGray);
		entrada15.setBounds(5,3,3,8);
		entrada15.setFont(new Font("Arial", Font.BOLD, 20)); 
		entrada15.setBackground(new Color(5, 10, 7));
		
		
		
		menu.add(entrada1);
		menu.add(entrada2);
		menu.add(entrada3);
		menu.add(entrada4);
		menu.add(entrada5);
		menu.add(entrada6);
		menu.add(entrada7);
		menu.add(entrada8);
		menu.add(entrada9);
		menu.add(entrada10);
		
		menu.add(entrada11);
		menu.add(entrada12);
		menu.add(entrada13);
		menu.add(entrada14);
		
		menu.add(entrada15);
		
		
		menuBar.add(menu);
		
	
		
		
	// Muito importante este método
	
	entrada1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			

			String moeda;

			moeda = JOptionPane.showInputDialog("Escolha a opção 1 BRL/Reais para USD/Dólares"
					+ "\n1 = Dólar");

			int opcao;

			opcao = Integer.parseInt(moeda);

			if(opcao == 1) {

				String valor;
				valor = JOptionPane.showInputDialog("Digite O valor em reais que deseja converter");
				double valorReal = Double.parseDouble(valor);
				final double dolar = 4.88;
				double valorConvertido = valorReal / dolar;
				String msg;
				msg = "o valor em Dólar é: "+valorConvertido;
				JOptionPane.showMessageDialog(null, msg);
				
			
			}
			
		
		}
	});
	
	
entrada2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			String moeda;

			moeda = JOptionPane.showInputDialog("Escolha a opção 1 BRL/Reais para EUR/Euros"+ "\n1 = Euro");

			int opcao;

			opcao = Integer.parseInt(moeda);

			if(opcao == 1) {

				String valor;
				valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter");
				double valorReal = Double.parseDouble(valor);
				final double euro = 3.298;
				double valorConvertido = valorReal / euro;
				String msg;
				msg = "o valor em Euro é: "+valorConvertido;
				JOptionPane.showMessageDialog(null, msg);
				
				

			}


		
		}
	});


entrada3.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String moeda; 
		String valor;
		int opcao;
		String operador = "/";
		
		double valorReal; 
		double ValorLibrasEsterlinas;
		double valorConvertido = 0;
		final double librasEsterlinas = 6.27;
		
		
		JOptionPane.showMessageDialog(null, "BRL/Reais para GBP/Libras Esterlinas");
			
		moeda = JOptionPane.showInputDialog("Digite a opção BRL/Reais para GBP/Libras Esterlinas"+ "\n1");
		
		JOptionPane.showInputDialog("digite a operacaço", " /");
		
		
		opcao = Integer.parseInt(moeda);
	
		

		valor = JOptionPane.showInputDialog("Digite o segundo valor que deseja converter BRL/Reais para GBP/Libras Esterlinas");
		
		valorReal = Double.parseDouble(moeda);
		
		ValorLibrasEsterlinas = Double.parseDouble(valor);
		
		switch(operador)
		{
			case "/": valorConvertido = valorReal / ValorLibrasEsterlinas; 
			 
			break;
			default: JOptionPane.showMessageDialog(null, "Operação Inválida");
		}
		
			
			String msg;
			msg = "o valor em LibrasEsterlinas é: "+valorConvertido;
			JOptionPane.showMessageDialog(null, msg);

	
	
	}
});

entrada4.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String moeda;

		moeda = JOptionPane.showInputDialog("Escolha a opção 1 BRL/Reais para ARS/Peso Argentino "+ "\n1 Peso Argentino");

		int opcao;

		opcao = Integer.parseInt(moeda);

		if(opcao == 1) {

			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter");
			double valorReal = Double.parseDouble(valor);
			final double pesoArgentino = 0.019;
			double valorConvertido = valorReal / pesoArgentino;
			String msg;
			msg = "o valor em Peso Argentino é: "+valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
			
			

		}
	
	}
});

entrada5.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String moeda;

		moeda = JOptionPane.showInputDialog("Escolha a opção 1 BRL/Reais para CLP/Peso Chileno "+ "\n1 Peso Argentino");

		int opcao;

		opcao = Integer.parseInt(moeda);

		if(opcao == 1) {

			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter");
			double valorReal = Double.parseDouble(valor);
			final double pesoChileno = 0.0065;
			double valorConvertido = valorReal / pesoChileno;
			String msg;
			msg = "o valor em Peso Chileno é: "+valorConvertido;
			JOptionPane.showMessageDialog(null, msg);
			
			

		}
		
		
	
	}
});

entrada6.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String moeda;

		moeda = JOptionPane.showInputDialog("Escolha a opção 1 USD/Dólares para BRL/Reais "+ "\n1");

		int opcao;

		opcao = Integer.parseInt(moeda);

		if(opcao == 1) {

			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em Dólar que deseja converter");
			double valorReal = Double.parseDouble(valor);
			final double dolar = 4.88;
			double valorConvertido = valorReal * dolar;
			String msg;
			msg = "o valor em Dólar é: "+valorConvertido;
			JOptionPane.showMessageDialog(null, msg);

		}
	
	}
});

entrada7.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String moeda;

		moeda = JOptionPane.showInputDialog("Escolha a opção 1 EUR/Euros para BRL/Reais "+ "\n1");

		int opcao;

		opcao = Integer.parseInt(moeda);

		if(opcao == 1) {

			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em Euro que deseja converter");
			double valorReal = Double.parseDouble(valor);
			final double euro = 5.36;
			double valorConvertido = valorReal * euro;
			String msg;
			msg = "o valor em Euro é: "+valorConvertido;
			JOptionPane.showMessageDialog(null, msg);

		}
	
	
	}
});

entrada8.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		String moeda;

		moeda = JOptionPane.showInputDialog("Escolha a opção 1 GBP/Libras Esterlinas para BRL/Reais "+ "\n1");

		int opcao;

		opcao = Integer.parseInt(moeda);

		if(opcao == 1) {

			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em Libras Esterlinas que deseja converter");
			double valorReal = Double.parseDouble(valor);
			final double librasEsterlinas  = 6.27;
			double valorConvertido = valorReal * librasEsterlinas;
			String msg;
			msg = "o valor em Libras Esterlinas é: "+valorConvertido;
			JOptionPane.showMessageDialog(null, msg);

		}
	}
});

entrada9.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String moeda;

		moeda = JOptionPane.showInputDialog("Escolha a opção 1 ARS/Peso Argentino para BRL/Reais "+ "\n1");

		int opcao;

		opcao = Integer.parseInt(moeda);

		if(opcao == 1) {

			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em Peso Argentino que deseja converter");
			double valorReal = Double.parseDouble(valor);
			final double pesoArgentino  = 0.019;
			double valorConvertido = valorReal * pesoArgentino;
			String msg;
			msg = "o valor em Peso Argentino é: "+valorConvertido;
			JOptionPane.showMessageDialog(null, msg);

		}
	
	}
});

entrada10.addActionListener(new ActionListener() {	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		String moeda;

		moeda = JOptionPane.showInputDialog("Escolha a opção 1 CLP/Peso Chileno para BRL/Reais "+ "\n1");

		int opcao;

		opcao = Integer.parseInt(moeda);

		if(opcao == 1) {

			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em Peso Chileno que deseja converter");
			double valorReal = Double.parseDouble(valor);
			final double pesoChileno  = 0.0064;
			double valorConvertido = valorReal * pesoChileno;
			String msg;
			msg = "o valor em Peso Chileno é: "+valorConvertido;
			JOptionPane.showMessageDialog(null, msg);

		}
	

	}
});

	//}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}} Metros, Milímetros e Quilômetros }}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}



entrada11.addActionListener(new ActionListener() {	
	@Override
	public void actionPerformed(ActionEvent e) {
								
		String metros;

		metros = JOptionPane.showInputDialog("Escolha a opção 1 de Metros para Quilômetros "+ "\n1");

		int opcao;

		opcao = Integer.parseInt(metros);

		if(opcao == 1) {

			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em distância para Metros para Quilômetros");
			double valorMetros = Double.parseDouble(valor);
			final double quilometros  = 1000;
			double valorConvertido = valorMetros / quilometros;
			String resultado;
			resultado = " Metros em quilômetros é: "+valorConvertido;
			JOptionPane.showMessageDialog(null, resultado);

		}
	

	}
});

entrada12.addActionListener(new ActionListener() {	
	@Override
	public void actionPerformed(ActionEvent e) {
		
entrada12 = new JMenuItem("");
		
		
		String milimetros;

		milimetros = JOptionPane.showInputDialog("Escolha a opção 1 de Milímetros para Metros "+ "\n1");

		int opcao;

		opcao = Integer.parseInt(milimetros);

		if(opcao == 1) {

			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em Milímetros para Metros");
			double valorMilimetros = Double.parseDouble(valor);
			final double metros  = 1000;
			double valorConvertido = valorMilimetros / metros;
			String resultado;
			resultado = " Milímetros para Metros é: "+valorConvertido;
			JOptionPane.showMessageDialog(null, resultado);

		}
	}
});

entrada13.addActionListener(new ActionListener() {	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		String Metros;

		Metros = JOptionPane.showInputDialog("Escolha a opção 1 de Metros para Milímetros "+ "\n1");

		int opcao;

		opcao = Integer.parseInt(Metros);

		if(opcao == 1) {

			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em Metros para Milímetros");
			double valorMetros = Double.parseDouble(valor);
			final double metros  = 1000;
			double valorConvertido = valorMetros * metros;
			String resultado;
			resultado = " Metros para Milímetros é: "+valorConvertido;
			JOptionPane.showMessageDialog(null, resultado);

		}
	

	}
});

entrada14.addActionListener(new ActionListener() {	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		String quilometros;

		quilometros = JOptionPane.showInputDialog("Escolha a opção 1 de Quilômetros para Metros "+ "\n1");

		int opcao;

		opcao = Integer.parseInt(quilometros);

		if(opcao == 1) {

			String valor;
			valor = JOptionPane.showInputDialog("Digite o valor em Quilômetros para Metros");
			double valorQquilometros = Double.parseDouble(valor);
			final double metros  = 1000;
			double valorConvertido = valorQquilometros * metros;
			String resultado;
			resultado = " Quilômetros para Metros é: "+valorConvertido;
			JOptionPane.showMessageDialog(null, resultado);

		}	

	}
});


	entrada15.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			JOptionPane.showMessageDialog(null, "Finalizando Programa");
			System.exit(0);
			
		}
		
	});
	
	
	
	
	
	
	}

	public static void main(String[] args) {
		
		ConversorMoedas janela = new ConversorMoedas();
		
		janela.setVisible(true);
		new ConversorMoedas();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	
		
	}
	
	
		


	


