import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        int parametroUm;
        int parametroDois;
        do{
            System.out.println("Digite o primeiro parâmetro");
            parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            parametroDois = terminal.nextInt();
            
            try {
                //chamando o método contendo a lógica de contagem
                if(parametroDois > parametroUm) contar(parametroUm, parametroDois);
                else throw new Exception("O segundo parâmetro deve ser maior que o primeiro.");
            }catch (Exception exception) {
                //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
                System.out.println(exception.getMessage());
            }
        }while(!(parametroDois > parametroUm));
        terminal.close();
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;

		//realizar o for para imprimir os números com base na variável contagem
        System.out.println("A diferença entre os dois números é: "+contagem);
        for(int i = 1; i <= contagem; i++){
            System.out.println(i);
        }
	}
}