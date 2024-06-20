package lol.bvlabs.yessir.module.garcom.domain.estabelecimento;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "estabelecimentos")
@Entity(name = "Estabelecimento")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Estabelecimento {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;

	public Estabelecimento(DadosCadastroEstabelecimento dadosEstabelecimento) {
		this.nome = dadosEstabelecimento.nome();
	}
}
