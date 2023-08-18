public class Main {
        public static void main(String[]args) {
              ContaCorrente c1 = new ContaCorrente(); // Cria objeto cahamdo c1 do tipo ContaCorrente
                c1.cadastrar(123,"ana",789);
                c1.depositar(1000);
            System.out.println("saldo:  " + c1.ConsultarSaldo() );
            c1.sacar(500);
            System.out.println("saldo" + c1.ConsultarSaldo() );
        }
}