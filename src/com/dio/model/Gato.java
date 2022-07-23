package com.dio.model;

import java.util.Objects;

public class Gato {
private String nome;
private String cor;
private Integer idade;
/**
 * @param nome
 * @param cor
 * @param idade
 */
public Gato(String nome, String cor, Integer idade) {
	this.nome = nome;
	this.cor = cor;
	this.idade = idade;
}
@Override
public String toString() {
	return "Gato [nome=" + nome + ", cor=" + cor + ", idade=" + idade + "]";
}
@Override
public int hashCode() {
	return Objects.hash(cor, idade, nome);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Gato other = (Gato) obj;
	return Objects.equals(cor, other.cor) && Objects.equals(idade, other.idade) && Objects.equals(nome, other.nome);
}
/**
 * @param cor
 * @param idade
 * @param nome
 */
public Gato(String cor, Integer idade, String nome) {
	super();
	this.cor = cor;
	this.idade = idade;
	this.nome = nome;
}
public Gato() {
	// TODO Auto-generated constructor stub
}
}

