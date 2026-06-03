public class Data {
    private int mes;
    private int dia;
    private int ano;

    public Data(int mes, int dia, int ano) {
        this.mes = mes;
        this.dia = dia;
        this.ano = ano;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void displayData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
    
}
/*(Deitel Java 3.15)Crie uma classe em Java chamada Data que inclui três informações
como variáveis de instância – mês (int), dia (int) e ano (int). A classe deve ter métodos get e
set para cada variável e um construtor que inicializa as variáveis e assume que os valores
fornecidos são corretos. Forneça um método displayData que exibe o dia, o mês e o ano
separados por barras normais.  */