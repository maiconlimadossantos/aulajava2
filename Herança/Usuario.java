public class Usuario {
    private String nome;
    private String cpf;
    public Usuario(String nome,String cpf){
        this.nome=nome;
        this.cpf=cpf;
    }
    public String getnome(){
        return nome;
    }
    public void setnome(String nome){
        this.nome=nome;
    }
    public String gecpf(){
        return cpf;
    }
    public void setcpf(String cpf){
        this.cpf=cpf;
    }
    public String exibirDados(){
        return "O nome é" + this.nome+ "\no cpf"+this.cpf;
    }

}
