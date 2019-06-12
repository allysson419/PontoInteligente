package com.kazale.pontointeligente.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.kazale.pontointeligente.api.entities.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	
	/**
	 * metodo de consulta que faz select, nao precisa de transação, e com isso aumenta 
	 * a performance
	 */
	
	@Transactional(readOnly = true)
	Empresa findByCnpj(String cnpj);

}
