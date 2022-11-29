package BancoJava.ContaBancaria.ContaBancaria;

public class ContaBancaria {
    private int numero;
    private int digito;
    private String nome;
    private String cpf;
    private double saldo;

    //construtor
    public ContaBancaria (int numero, int digito, String nome, String cpf, double saldo) {
        this.numero = numero;
        this.digito = digito;
        this.nome = nome; 
        this.cpf = cpf;
        this.saldo = saldo;    
    }

    //getters e setters
    public int getNumero() {return this.numero;}
    public int getDigito() {return this.digito;}
    public String getNome() {return this.nome;}
    public String getCpf() {return this.cpf;}
    public double getSaldo(){return this.saldo;}

    public void setNumero(int numero) {this.numero = numero;}
    public void setDigito(int digito) {this.digito = digito;}
    public void setNome(String nome) {this.nome = nome;}
    public void setCpf(String cpf) {this.cpf = cpf;}
   
    //métodos especificos da classe conta bancaria
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public String exibirDados() {
        return "Conta: "+numero+ "-"+digito+"- "+nome+ " ("+
        cpf+") - Saldo: "+String.format("%.2f",saldo); 
    }

    public boolean sacar(double valor) {
        if (valor <= this.saldo) {
            saldo -= valor;
            return true;
        } else  {
            return false;
        }
    }    
}
