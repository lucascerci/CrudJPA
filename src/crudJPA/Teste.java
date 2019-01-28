package crudJPA;

import java.util.List;

public class Teste {

	public static void main(String[] args) {
		
//		Aluno a1 = new Aluno();
//		a1.setNome("Lucas Pacheco");
//		a1.setIdade(18);
//		a1.setMatricula("123456789");
//		
//		Aluno a2 = new Aluno();
//		a2.setNome("Fabiula Pacheco");
//		a2.setIdade(33);
//		a2.setMatricula("1234567");
//		
//		Aluno a3 = new Aluno();
//		a3.setNome("Vilson Fernandes");
//		a3.setIdade(40);
//		a3.setMatricula("12345678");
		AlunoController con = new AlunoController();
		
		
		List <Aluno> alunos = con.Listar();
		
		for (int i = 0; i < alunos.size(); i++) {
			System.out.println("Nome: " + alunos.get(i).getNome() + " - Idade: " +alunos.get(i).getIdade() + " - Matricula: " + alunos.get(i).getMatricula());
		}
		
		
	}

}
