class FichaBancaria {
    
    private String nome;
    private String cpf;
    private int numeroConta;
    private double saldo;
    
    public FichaBancaria() {
        this.saldo = 0;
    }
    
    public FichaBancaria(int numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
    
    public String getCPF() {
        return this.cpf;
    }
    
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    
    public int getNumeroConta() {	 	  	    	    	 	
        return this.numeroConta;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public void credite(double valor) {
        this.saldo += valor;
    }
    
    
    public void debite(double valor) {
        this.saldo -= valor;
    }
}