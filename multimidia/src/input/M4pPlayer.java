package input;
import java.util.Scanner;

public class M4pPlayer implements Dispositivo{
	private Scanner entrada;
	private String status;
	private String nomeMusica;
	
	public M4pPlayer() {
	entrada = new Scanner(System.in);
	}
	@Override
	public String lerEntrada() {
	// TODO Auto-generated method stub
	return entrada.next();
	}
	
	public String getstatus() {
		return status;	
	}
	
	public void play () {
		this.status = "play";
	}
	
	public void pause () {
		this.status = "pause";
	}
	
	public void stop () {
		this.status = "stop";
	}
	
	public void voltar () {
		this.status = "voltar";
	}
	
	public void avancar () {
		this.status= "avancar";
	}
	
	public String getnomeMusica() {
		return nomeMusica;
	}
}	

