package crud;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

@SuppressWarnings("serial")
public class ModalTela extends JDialog {
	private JLabel labelNome, labelDataNasc, labelEndereco, labelNumero, labelObs;
	private JTextField textFielNome, textDataNasc, textEndereco, textNumero, textObs;
	private JButton buttonOK;

	public ModalTela() {
		// titulo e layout
		setTitle("Cadastro de Paciente");
		setLayout(new FlowLayout());
		// instancia componentes
		labelNome = new JLabel("Nome: ");
		textFielNome = new JTextField(50);
		labelDataNasc = new JLabel("Data Nascimento: ");
		textDataNasc = new JTextField(10);
		labelEndereco = new JLabel("Endereço: ");
		textEndereco = new JTextField(30);
		labelNumero = new JLabel("Número: ");
		textNumero = new JTextField(15);
		labelObs = new JLabel("Observação: ");
		textObs = new JTextField(50);
		buttonOK = new JButton("OK");
		// adiciona os componentes na tela
		add(labelNome);
		add(textFielNome);
		add(labelDataNasc);
		add(textDataNasc);
		add(labelEndereco);
		add(textEndereco);
		add(labelNumero);
		add(textNumero);
		add(labelObs);
		add(textObs);
		add(buttonOK);
		// tamanho e posicao
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		setModal(true);
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new ModalTela();
			}
		});

	}

}