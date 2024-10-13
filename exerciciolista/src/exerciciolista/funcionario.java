package exerciciolista;

public class funcionario {

private int ID;
private String nome;
private double salario;

public funcionario() {
	
	
}

public funcionario(int iD, String nome, double salario) {
    ID = iD;
	this.nome = nome;
	this.salario = salario;



}

public int getID() {
	return ID;
}

public void setID(int iD) {
	ID = iD;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public double getSalario() {
	return salario;
}

public void setSalario(double salario) {
	this.salario = salario;
}

public void incrementarsalario(double porcentagem) {
	salario = salario + salario * porcentagem / 100.0;
}
 @Override
public String toString() {
	 return ID + ", " + nome + ", "+ String.format("%.2f", salario);
 }
}
