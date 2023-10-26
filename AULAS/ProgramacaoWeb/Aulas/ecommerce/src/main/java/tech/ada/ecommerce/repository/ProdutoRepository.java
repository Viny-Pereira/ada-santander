package tech.ada.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tech.ada.ecommerce.model.Produto;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
//    @Override
//    Optional<Produto> findById(Long id);

//    @Query("SELECT p FROM Produto p WHERE p.id = :id")
//    Optional<Produto> findById(@Param("id") Long id);
//
//    @Query(value = "SELECT id FROM Produto WHERE id=:id ", nativeQuery = true)
//    Optional<Produto> findById(@Param("id") Long id);
//
//    Optional<Produto> findBySKU(String SKU);

    @Query("SELECT p FROM Produto p WHERE p.nome ILIKE concat('%', :nome, '%') ORDER BY p.nome")
    List<Produto> findByNomeCustom(@Param("nome") String nome);

    @Query("UPDATE Produto p SET p.quantidadeEstoque = :qtd WHERE p.id = :id")
    void atualizarEstoque(@Param("qtd") int qtd, @Param("id") Long id);


/*
    List<Produto> findByPrecoBetween(Double preco1, Double preco2);

    Page<Produto> findByPrecoBetween(Double preco1, Double preco2, Pageable pageable);
    @Override
    Page<Produto> findAll(Pageable pageable);

    @Override
    List<Produto> findAll(Sort sort);

    List<Produto> findByPrecoBetween(Double preco1, Double preco2, Sort sort);
*/

}
