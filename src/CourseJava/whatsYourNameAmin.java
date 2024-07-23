package CourseJava;

import javax.swing.JOptionPane;

public class whatsYourNameAmin {
	public static void main(String[] args) {
		/*
		 * Neste problema eu irei fazer uma brincadeira com o nome da minha pretendente,
		 * ela não gosta do nome YASMIN, então eu irei criar um programa que solicite
		 * dela o seu primeiro nome e então retire, se houver, as letras "Y" e "S" e
		 * depois imprima "Olá, AMIN! Como vai?".
		 */
		String entradaNome = JOptionPane.showInputDialog("What's your name?: ");
		String nome = entradaNome.toLowerCase();
		String tiraY = nome.replace("y", "");
		String tiraS = tiraY.replace("s", "");
		String primeiraLetraMaiúscula = tiraS.substring(0, 1).toUpperCase();
		String restante = tiraS.substring(1);
		String nomeQueElaGosta = primeiraLetraMaiúscula + restante;

		JOptionPane.showMessageDialog(null, "Hello " + nomeQueElaGosta + "! How are you?");
	}
}
