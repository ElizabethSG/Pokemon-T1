package com.t1.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="pokemon_teams")
public class PokemonEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="pkm_id")
	private Long id;
	
	@Column(name="pkm_name")
	private String pkmName;
	
	@OneToMany(mappedBy = "pkmType")
	@JoinColumn(name = "pkm_type_id")
	private List<PokemonTypeEntity> types;

	@ManyToOne
	@JoinColumn(name = "pkm_team")
	private UserEntity user;

}