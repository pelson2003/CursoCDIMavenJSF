package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity // Diz que essa classe vai ser controlada pelo Hibernate
@Table(name="aluno") // Informa qual a table ser� utilizada

public class Aluno	 {
	
	private Long id;
	private String descricao;
	private Sala sala;
	
	@Id // Marca esta vari�vel como sendo campo prim�rio no Hibernate
	@GeneratedValue //Gerar o sequencial automaticamente
	@Column (name="id") // Diz qual a coluna do banco de dados que tem essa chave
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	@Column (name="descricao")
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	// Teremos v�rios Alunos por Sala 
	// No caso da sala, temos uma sala para v�rios alunos @OnetoMany
	@ManyToOne
	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	

}
