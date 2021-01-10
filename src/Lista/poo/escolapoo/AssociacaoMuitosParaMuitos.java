package Lista.poo.escolapoo;

import Lista.poo.escola.Disciplina;
import Lista.poo.escola.Professor;

public class AssociacaoMuitosParaMuitos {
    public static void main(String[] args) {

        Disciplina disciplina1 = new Disciplina();
        disciplina1.setNome("Matematica");
        disciplina1.setCargaHoraria(70);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setNome("Português");
        disciplina2.setCargaHoraria(80);

        Professor professor1 = new Professor();
        professor1.setNome("Marcelo");
        professor1.setMatricula(123456);
        professor1.setFormacaoAcademica("Mestre");
        professor1.setSalario(50);

        Professor professor2 = new Professor();
        professor2.setNome("Julia");
        professor2.setMatricula(987654);
        professor2.setFormacaoAcademica("Mestre");
        professor2.setSalario(50);

        //Disciplinas e Professores

        professor1.adicionarDisciplina(disciplina2);
        disciplina2.adicionarProfessor(professor1);

        professor2.adicionarDisciplina(disciplina2);
        disciplina2.adicionarProfessor(professor2);

        //Listando as disciplinas do professor1
        System.out.println("\nDisciplinas de "+professor1.getNome());
        for (int i = 0; i < professor1.quantidadeDisciplinas(); i++) {
            Disciplina disciplina = professor1.getDisciplinas(i);
            System.out.println(disciplina.getNome());
        }
        
        //Listar os professores da disciplinas
        System.out.println("\nProfessores de "+disciplina2.getNome());
        for (int i = 0; i < disciplina2.quantidadeProfessores(); i++) {
            Professor professor = disciplina2.getProfessor(i);
            System.out.println(professor.getNome());
        }
    }
}
