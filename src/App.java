public class App {
    public static void main(String[] Args){
        
        // Instanciação e inicialização do objeto

        Usuario usuario1 = new Usuario("Maria", 
        "41854875977", 
        "maria@gmail.com", 0, "99999999999");

        // Teste dos métodos do objeto usuario e o historico de operações

        System.out.println(usuario1.toString());

        usuario1.addCredito(100);
        usuario1.consumirRefeicao(50);
        usuario1.exibirCredito();

        usuario1.operacoes.getExtrato();

        usuario1.setEmail("teste@gmail.com");
        usuario1.setNome("teste");
        usuario1.setTelefone("123456789");

        System.out.println(usuario1.toString());
    }
}
