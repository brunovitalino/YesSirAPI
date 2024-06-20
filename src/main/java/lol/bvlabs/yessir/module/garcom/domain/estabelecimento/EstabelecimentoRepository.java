package lol.bvlabs.yessir.module.garcom.domain.estabelecimento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstabelecimentoRepository extends JpaRepository<Estabelecimento, Long> {
	
	Estabelecimento getByNome(String nome);
	
	Page<Estabelecimento> findByNome(Pageable paginacao, String nome);

}
