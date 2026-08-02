package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Professor2 {
    private String nome;
    private String especialidade;
    private Seminario[] seminario;

    public Professor2(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }


    public Professor2(String nome, String especialidade, Seminario[] seminario) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminario = seminario;
    }

    public void newimprime(){
        System.out.println(" -------Professores do Seminario ------- ");
        System.out.println(this.nome);
        System.out.println(this.especialidade);
        if(seminario == null){
            return;
        }   else{
            for(Seminario seminarios : this.seminario){
                System.out.println(" ------- Titulo do Seminario  ------- ");
                System.out.println(seminarios.getTitulo());
                System.out.println(" ------- Local do Seminario ------- ");
                System.out.println(seminarios.getLocal().getEndereco());
                if(seminarios.getAluno() == null) continue;
                System.out.println(" ------- Alunos do Seminario ------- ");
                for(Aluno alunos : seminarios.getAluno()){
                    System.out.println("Aluno: " + alunos.getNome() + " Idade: " + alunos.getIdade());}
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }
}
