public class MundoDosSentidos {
    
    public static void main(String[] args) {
        
        Banco b = new Banco();
        
        b.abreConta("Joaozinho", "123456");
        b.abreConta("Mariazinho", "789123");
        
        
        Banco b2 = new Banco();
        b2.abreConta("Luizinho", "0000000");
        try {
            int nc = b2.numeroContaCliente("0000000");
            b2.deposite(nc, 50);
            System.out.println(b2.saldo(nc));
        } catch (Exception exp) {
            System.out.println(exp.getMessage());
        }
        
    }   
    
    
    
}