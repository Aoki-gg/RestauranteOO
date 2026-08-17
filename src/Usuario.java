public class Usuario{
    private String cpf;
    private String nome;
    private String telefone;
    private String email;
    private float creditos;
    
    // Construtor do objeto

    Operacoes operacoes = new Operacoes();

    public Usuario(String nome, String telefone, String email, float saldo, String cpf){
        this.nome= nome;
        this.telefone= telefone;
        this.email = email;
        this.creditos = saldo;
        this.cpf = cpf;
    }

    // Getters e Setters 
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return this.email;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getTelefone(){
        return this.telefone;
    }

    public String getCpf(){
        return this.cpf;
    }

    // Metodos do objeto

    public void addCredito(float creditos){
        this.creditos += creditos;
        this.operacoes.registrarOperacao("Deposito", this.creditos);
    }

    public float exibirCredito() {
        this.operacoes.registrarOperacao("Exibir credito", this.creditos);
        return this.creditos;
    }

    public void consumirRefeicao(float creditos) {
        this.creditos -= creditos;
        this.operacoes.registrarOperacao("Refeicao", this.creditos);
    }

    public String toString(){
        String str = "";
        str += "Nome: "+ this.nome ;
        str += " CPF: " + this.cpf;
        str += " Telefone: "+ this.telefone ;
        str += " Email: "+ this.email ;
        str += " Creditos: "+ this.creditos;

        return str;
    }
}
