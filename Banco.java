import java.util.ArrayList;

class Banco {
    
    private ArrayList<FichaBancaria> fichario;   
    int numeroUltimaConta;
    
    public Banco() {
        this.fichario = new ArrayList<FichaBancaria>();
        this.numeroUltimaConta = 100;
    }
    
    public int numeroContaCliente(String cpf) {
        for (FichaBancaria f : this.fichario) {
            if (f.getCPF().equals(cpf)) {
                return f.getNumeroConta();
            }
        }
        return -1;
    }
    
    public void deposite(int numeroConta, double valor) throws Exception {
        for (FichaBancaria f : this.fichario) {
            if (f.getNumeroConta() == numeroConta) {
                f.credite(valor);
                return;
            }
        }
        throw new Exception("Conta inexistente " + numeroConta);
    }
    
    public void saque(int numeroConta, double valor) throws Exception {
        for (FichaBancaria f : this.fichario) {
            if (f.getNumeroConta() == numeroConta) {
                if (f.getSaldo() >= valor) {
                    f.debite(valor);
                    return;
                } else {	 	  	    	    	 	
                    throw new Exception("Saldo insuficiente");
                }
            }
        }
        throw new Exception("Conta inexistente " + numeroConta);
    }
    
    public int abreConta(String nome, String cpf) {
        this.numeroUltimaConta++;
        FichaBancaria f = new FichaBancaria(this.numeroUltimaConta);
        f.setNome(nome);
        f.setCPF(cpf);
        this.fichario.add(f);
        return this.numeroUltimaConta;
    }
    
    public double saldo(int numeroConta) {
        
        
        return 123;
    }
    
}