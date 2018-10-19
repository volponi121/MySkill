package br.com.myskills;

import javax.swing.JOptionPane;

public class Perguntas extends ArvoreElementos {

	public static Integer contador = 1;
	Integer quit = 1;

	Perguntas() {
		String str[] = { "Sim", "N�o" };
		JOptionPane.showMessageDialog(null, "Pense em um Animal");

		if (getARVORE() == null) {
			setARVORE(new TipoNo("O animal que voc� pensou vive na �gua?", contador));
			getARVORE().sim = new TipoNo("Tubarao", ++contador);

		}

		while (quit == 1) {

			int resp = JOptionPane.showOptionDialog(null, "Qual animal voc� pensou" + getARVORE().valor, "",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, str, str[0]);

			if (resp == 0) {

				pergunta(getARVORE().sim);
			} else {

				pergunta(getARVORE().nao);
			}

			Integer sair = JOptionPane.showOptionDialog(null, "Deseja sair do jogo?", "Confirme", JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, str, str[0]);

			if (sair == 0) {
				quit = 0;
			}
		}

	}

	private void AnimalNovo(TipoNo no) {

		++contador;
		String animal = JOptionPane.showInputDialog(null, "Qual o animal que voc� pensou?");

		
		String carac = JOptionPane.showInputDialog("Um(a) " + animal + "______ mas um(a) " + no.valor + "n�o.");
		++contador;
		colocarValores(no, carac, animal);

	}

	private void pergunta(TipoNo no) {
		String str[] = { "Sim", "N�o" };

		int sim = JOptionPane.showOptionDialog(null, "O animal que voc� pensou �: " + no.valor, "Confirme",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, str, str[0]);

		if (sim == 0) {

			if (no.sim == null)
				JOptionPane.showMessageDialog(null, "Acertei!");
			else {
				pergunta(no.sim);
			}

		} else {
			if (no.nao == null)
				AnimalNovo(no);
			else {
				pergunta(no.nao);
			}
		}

	}

}
