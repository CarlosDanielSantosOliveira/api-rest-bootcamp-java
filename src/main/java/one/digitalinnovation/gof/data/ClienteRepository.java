package one.digitalinnovation.gof.data;

import one.digitalinnovation.gof.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
