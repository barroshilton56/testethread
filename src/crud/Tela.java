package crud;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela extends JFrame {
	private JButton cadastrar;
	private JButton consultar;
	private JButton editar;
	private JButton excluir;
	private JLabel teste;

	public Tela() {
		super("Cadastro de Paciente");
		setLayout(new FlowLayout());

		cadastrar = new JButton("Cadastrar");
		consultar = new JButton("Consultar");
		editar = new JButton("Editar");
		excluir = new JButton("Excluir");
		teste = new JLabel();
		add(cadastrar);
		add(consultar);
		add(editar);
		add(excluir);
		add(teste);
		
		cadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ModalTela modal = new ModalTela();
				modal.setSize(new Dimension(500, 400));
				modal.setLocationRelativeTo(null);
				modal.setVisible(true);
				
			}
		});
	}

	

}