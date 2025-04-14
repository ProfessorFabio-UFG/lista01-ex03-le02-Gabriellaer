import java.util.ArrayList;
import java.util.Scanner;

public class MainCadastroV1 {
	public static void main(String[] args) {
		ArrayList<Moradores> mora = new ArrayList<Moradores>();
		Moradores m;
		Scanner input = new Scanner(System.in);
		String sexo;
		String bloco;
		String nome;
		String data;
		int cpf;
		int celular;
		int apartamento;
		int code;
		int sai = 0;
		int i;
		
		while(sai != -1) {
			m = new Moradores(null, null, null, null, 0, 0, 0, 0);
			System.out.println("Nome:");
			nome = input.next();
			System.out.println("Data de nascimento(usar 00/00/00):");
			data = input.next();
			System.out.println("Sexo:");
			sexo = input.next();
			System.out.println("Bloco: ");
			bloco = input.next();
			System.out.println("CPF:");
			cpf = input.nextInt();
			System.out.println("Celular:");
			celular = input.nextInt();
			System.out.println("N do Apartamento:");
			apartamento = input.nextInt();
			System.out.println("Codigo de acesso:");
			code = input.nextInt();
			
			m.setApartamento(apartamento);
			m.setBloco(bloco);
			m.setCelular(celular);
			m.setCode(code);
			m.setCpf(cpf);
			m.setData(data);
			m.setNome(nome);
			m.setSexo(sexo);
			
			mora.add(m);
			Moradores.cod_sq++;
			System.out.println("Deseja continuar NAO(-1) ou SIM(0): ");
			sai = input.nextInt();		
		}
		
		System.out.println("\nTotal de Moradores: " + Moradores.cod_sq + " Lista de Moradores: ");
		for(i = 0; i < mora.size(); i++) {
			System.out.println(mora.toString());
		}
	}
}
